 //amLogbook控制层 
app.controller('amLogbookController' ,function($scope,$controller,$sce ,$filter,amLogbookService,loginService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
	$scope.loginStaff = {};
	$scope.findLoginStaff = function(){
		loginService.findLoginStaff().success(
				function(result){
					$scope.loginStaff = result;
				}
		);		
	}
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		amLogbookService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		amLogbookService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		amLogbookService.findOne(id).success(
			function(response){
				editor.html(response.logbookContent);
				$scope.entity= response;	
				
			}
		);				
	}
	
	//查询查看的实体 
	$scope.findCheckOne=function(id){				
		amLogbookService.findOne(id).success(
			function(response){
				$scope.contentBody =$sce.trustAsHtml(response.logbookContent);
				$scope.entity= response;	
			}
		);				
	}
	//查询审批的实体 
	$scope.findApproverOne=function(id){				
		amLogbookService.findOne(id).success(
			function(response){
				$scope.entity= response;	
				$scope.entity.logbookApprover = $scope.loginStaff;//自动添加审批人
				var today = new Date();//获取系统当前时间
				$scope.entity.logbookApproverdate = $filter('date')(today,"yyyy/MM/dd HH:mm");//自动添加审批日期
			}
		);				
	}
	
	
	//保存 
	$scope.save=function(){
		if($scope.entity.logbookTitle==null || $scope.entity.logbookDate==null || $scope.entity.logbookTitle=="" || $scope.entity.logbookDate==""){
			alert("请确认输入标题和日期！");
		}else{
			var serviceObject;//服务层对象  				
			if($scope.entity.logbookId!=null){//如果有ID
				var content = editor.html();
				$scope.entity.logbookContent =content;
				serviceObject=amLogbookService.update( $scope.entity ); //修改  
			}else{
				var content = editor.html();
				$scope.entity.logbookContent =content;
				serviceObject=amLogbookService.add( $scope.entity  );//增加 
			}				
			serviceObject.success(
					function(response){
						if(response.success){
							alert(response.msg);
							$scope.reloadList();//重新加载
						}else{
							alert(response.message);
						}
					}		
			);							
		}
	}
	
	//审批
	$scope.approver = function(){
		if($scope.entity.logbookApprovermsg==null || $scope.entity.logbookApprovermsg=="" ){
			alert("请确认输入审批信息！");
		}else{
			$scope.entity.logbookEnable = '2';//更新这条日志记录为2
			amLogbookService.update($scope.entity).success(function(result){
				if(result.success){
					alert("审批成功！");
					$scope.reloadList();//重新加载
				}else{
					alert("审批失败！");
				}
			});
		}
	}
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框	
		if(confirm("是否确认删除？")){
			amLogbookService.dele( $scope.selectIds ).success(
					function(response){
						if(response.success){
							alert("删除成功！");
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
		amLogbookService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
    //点击新建按钮触发事件
	$scope.creatNewOne = function(){
		$scope.entity = {}; 
		$scope.entity.logbookEnable='1';
		editor.html("");
		$scope.entity.logbookStaff = $scope.loginStaff;
		
	}
	
	//进入页面加载姓名查找下拉框里的数据
	$scope.findStaffList = function(){
		amLogbookService.findStaffList().success(
			function(result){
				$scope.staffList = result;
			}
		);
	}
	
	//复选框全选反选
	$scope.selectAllCheckBox = function(master,list){
		if(master == true){//如果当前是全选状态，因此点击后会变成全不选，所以要清空选择数据
			$scope.selectIds=[];
		}else{//反之，当前是全不选，点击后要选择所有数据
			for(var i=0;i<list.length;i++){
            	$scope.selectIds.push(list[i].logbookId);
            }
		}
	}
	
});	
