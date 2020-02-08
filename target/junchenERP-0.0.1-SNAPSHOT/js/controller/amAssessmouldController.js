 //amAssessmould控制层 
app.controller('amAssessmouldController' ,function($scope,$controller,$filter   ,amAssessmouldService,loginService,baseDictService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		amAssessmouldService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		amAssessmouldService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	
	
	 
	//批量删除 
	$scope.dele=function(){			
		if(confirm('是否确认删除模板'+ $scope.selectIds +' ？')){

			//获取选中的复选框			
			amAssessmouldService.dele( $scope.selectIds ).success(
					function(response){
						if(response.success){
							alert(response.msg);
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
		amAssessmouldService.search(page,rows,$scope.searchEntity).success(
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
	
	$scope.entity = {assessmould:{},assessmouldRules:[]};
	
	$scope.creatNewOne = function(){//点击新建之后触发事件
		$scope.entity = {assessmould:{},assessmouldRules:[]};
		loginService.findLoginStaff().success(
			function(result){
				$scope.entity.assessmould.assessmouldStaff = result;
			}
		)
		var date = new Date();
		$scope.entity.assessmould.assessmouldMakedate = $filter('date')(date,"yyyy-MM-dd");
		$scope.entity.assessmould.assessmouldTotal = 0;
	}
	
	//点击后增加添加页表格行
	$scope.addTableRow = function(){
		$scope.entity.assessmouldRules.push({});
	}
	//点击后删除页面表格行
	$scope.deleTableRow = function(index){
		$scope.entity.assessmouldRules.splice(index,1);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		amAssessmouldService.findOne(id).success(
			function(response){
				$scope.entity.assessmould = response.assessmould;	
				$scope.entity.assessmouldRules = response.assessmouldRules;
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  	
		$scope.entity.assessmould.assessmouldTotal = 0;
		for(var i = 0;i < $scope.entity.assessmouldRules.length;i ++){
			$scope.entity.assessmould.assessmouldTotal += 	($scope.entity.assessmouldRules[i].assessrulePoint-0);		
		}
		if($scope.entity.assessmould.assessmouldId!=null){//如果有ID
			serviceObject=amAssessmouldService.update( $scope.entity ); //修改  
		}else{
			$scope.entity.assessmould.assessmouldEnable = '1';
			serviceObject=amAssessmouldService.add( $scope.entity  );//增加 
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
            	$scope.selectIds.push(list[i].assessmouldId);
            }
		}
	}
});	
