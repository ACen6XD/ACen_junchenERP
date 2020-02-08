 //amAssess控制层 
app.controller('amAssessController' ,function($scope,$controller ,$filter,baseDictService  ,amAssessService,amAssessmouldService,loginService ){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		amAssessService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		amAssessService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框	
		if(confirm('是否确认删除考核记录'+ $scope.selectIds +'？')){
			amAssessService.dele( $scope.selectIds ).success(
					function(response){
						if(response.success){
							$scope.reloadList();//刷新列表
							$scope.selectIds=[];
						}						
					}		
			);						
		}
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		amAssessService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查找下拉列表
	$scope.typeList = [];
	$scope.findDict = function(){
		baseDictService.findDict('006').success(
				function(result){
					$scope.typeList = result;
				}
		)
	}
	
	
	
	$scope.mouldsList = [];
	$scope.loginStaff = {};
	//进入页面后查询所有模板以及查询当前登入用户
	$scope.findMoulds = function(){
		amAssessmouldService.findAll().success(
			function(result){
				$scope.mouldsList = result;
			}
		);
	}
	$scope.findLoginStaff = function(){
		loginService.findLoginStaff().success(
			function(result){
				$scope.loginStaff = result;
		});		
	}
	
	//点击新建后触发事件
	$scope.createNewOne = function(){
		
		$scope.entity = {assess:{},assessPoints:[]};//用于存储要新增的数据
		
		$scope.entity.assess.assessStaff = $scope.loginStaff;
		
		var date = new Date();
		$scope.entity.assess.assessStaffdate = $filter('date')(date,'yyyy-MM-dd');//设置自评时间
		
		$scope.entity.assess.assessEnable = '1';//设置状态为完成自评
	}
	
	//模板选择发生变化后，相对应的考核表也发生改变
	$scope.$watch("mouldSelect",function(newValue,oldValue){
		amAssessmouldService.findOne(newValue).success(
			function(result){
				$scope.entity.assess.assessMould = result.assessmould;
				for(var i = 0;i < result.assessmouldRules.length;i++){//根据选择的模板编号遍历模板细则
					$scope.entity.assessPoints[i] = {};
					$scope.entity.assessPoints[i].assesspointRule = result.assessmouldRules[i];//将每一条模板细则复制到新的模板分数循环列表中	
				}
		});
	});
	
	
	//查询实体 
	$scope.findOne=function(id){
		$scope.entity = {assess:{},assessPoints:[]};//用于存储要新增的数据
		amAssessService.findOne(id).success(
			function(response){
				$scope.entity.assess = response.assess;	
				$scope.entity.assessPoints = response.assessPoints;
				var date2 = new Date();
				$scope.entity.assess.assessBoss = $scope.loginStaff;
				$scope.entity.assess.assessBossdate = $filter('date')(date2,'yyyy-MM-dd');//设置自评时间
				$scope.entity.assess.assessEnable = '2';//设置状态为完成审评
			}
		);
	}

	
	//保存 
	$scope.save=function(){		
		var serviceObject;//服务层对象  				
		if($scope.entity.assess.assessId!=null){//如果有ID
			var assessBosspoints = 0;
			for(var i = 0;i < $scope.entity.assessPoints.length;i++){
				assessBosspoints += $scope.entity.assessPoints[i].assesspointBosspoint-0;//获取自评总分
			}
			if(window.confirm('确认添加后不可修改！当前审评总分为'+ assessBosspoints + '/' + $scope.entity.assess.assessMould.assessmouldTotal + '分，确认添加吗？')){
				$scope.entity.assess.assessBosspoints = assessBosspoints;//设置员工审评总分
				serviceObject=amAssessService.update( $scope.entity ); //修改  			
			}else{
				return;
			}
			
		}else{//进行新增
			if($scope.entity.assess.assessName ==null || $scope.entity.assess.assessName.length==0){
				alert("请输入考核主题！");
				return;
			}
			if($scope.entity.assess.assessMould.assessmouldId ==null){
				alert("请选择考核模板！");
				return;
			}
			var assessStaffpoints = 0;
			for(var i = 0;i < $scope.entity.assessPoints.length;i++){
				assessStaffpoints += $scope.entity.assessPoints[i].assesspointStaffpoint-0;//获取自评总分
			}
				if(window.confirm('确认添加后不可修改！当前自评总分为'+ assessStaffpoints + '/' + $scope.entity.assess.assessMould.assessmouldTotal + '分，确认添加吗？')){
					$scope.entity.assess.assessStaffpoints = assessStaffpoints;//设置员工自评总分
					serviceObject = amAssessService.add( $scope.entity );//增加 				
				}else{
					return;
				}
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
					alert(response.msg);
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.msg);
				}
			}		
		);				
	}
	
	//复选框全选反选
	$scope.selectAllCheckBox = function(master,list){
		if(master == true){//如果当前是全选状态，因此点击后会变成全不选，所以要清空选择数据
			$scope.selectIds=[];
		}else{//反之，当前是全不选，点击后要选择所有数据
			for(var i=0;i<list.length;i++){
            	$scope.selectIds.push(list[i].assessId);
            }
		}
	}

});	
