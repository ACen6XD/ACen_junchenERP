 //amAddressbook控制层 
app.controller('amAddressbookController' ,function($scope,$controller ,loginService  ,amAddressbookService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		amAddressbookService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		amAddressbookService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		amAddressbookService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.addressbookId!=null){//如果有ID
			serviceObject=amAddressbookService.update( $scope.entity ); //修改  
		}else{
			if($scope.entity.addressbookName==null || $scope.entity.addressbookGender==null){
				alert("请填写姓名和性别！");
			}else
				serviceObject=amAddressbookService.add( $scope.entity  );//增加 
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
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		if(window.confirm("是否确认删除这些数据?")){
			amAddressbookService.dele( $scope.selectIds ).success(
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
		amAddressbookService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
	//点击新建按钮时触发
	$scope.createNewOne = function(){
		$scope.entity = {};
		$scope.entity.addressbookEnable='1';
		loginService.findLoginStaff().success(
				function(result){
					$scope.entity.addressbookStaff = result;
				}
		);
	}
	
	//复选框全选反选
	$scope.selectAllCheckBox = function(master,list){
		if(master == true){//如果当前是全选状态，因此点击后会变成全不选，所以要清空选择数据
			$scope.selectIds=[];
		}else{//反之，当前是全不选，点击后要选择所有数据
			for(var i=0;i<list.length;i++){	
				$scope.selectIds.push(list[i].addressbookId);								
            }
		}
	}
	
	//进入页面自动加载查询列表中的公司列表
	$scope.findCompany = function(){
		amAddressbookService.findCompany().success(
			function(result){
				$scope.companyList = result;
		});
	}
});	
