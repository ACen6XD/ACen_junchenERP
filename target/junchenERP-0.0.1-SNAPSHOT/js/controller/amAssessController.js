 //amAssess控制层 
app.controller('amAssessController' ,function($scope,$controller ,$filter  ,amAssessService,amAssessmouldService,loginService ){	
	
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
	
	//查询实体 
	$scope.findOne=function(id){				
		amAssessService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=amAssessService.update( $scope.entity ); //修改  
		}else{
			serviceObject=amAssessService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		amAssessService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
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
	$scope.mouldsList = [];
	//进入页面后查询所有模板
	$scope.findMoulds = function(){
		amAssessmouldService.findAll().success(
			function(result){
				$scope.mouldsList = result;
			}
		);
	}
	//点击新建后触发事件
	$scope.createNewOne = function(){
		$scope.entity = {assess:{},assessPoints:[]};//用于存储要新增的数据
		$scope.mould = {assessmouldRules:[]};//用于存储模板的基本信息和细则信息
		
		loginService.findLoginStaff.success(
			function(result){
				$scope.entity.assess.assessStaff = result;//设置自评人
		});
		
		var date = new Date();
		$scope.entity.assess.assessStaffdate = $filter('date')(date,'yyyy-MM-dd');//设置自评时间
		
		$scope.entity.assess.assessEnable = '1';//设置状态为完成自评
	}
	
	//模板选择发生变化后，相对应的考核表也发生改变
	$scope.$watch("entity.assessMould.assessmouldId",function(newValue,oldValue){
		amAssessmouldService.findOne(newValue).success(
			function(result){
				$scope.mould = result;
		});
	});
	//输入自评分数后，检测是否合理
	$scope.checkPoint = function(){
		alert("11");
	}
});	
