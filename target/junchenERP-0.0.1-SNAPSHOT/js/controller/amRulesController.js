 //amRules控制层 
app.controller('amRulesController' ,function($scope,$controller,$filter ,amRulesService,loginService,uploadService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		amRulesService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//复选框全选反选
	$scope.selectAllCheckBox = function(master,list){
		if(master == true){//如果当前是全选状态，因此点击后会变成全不选，所以要清空选择数据
			$scope.selectIds=[];
		}else{//反之，当前是全不选，点击后要选择所有数据
			for(var i=0;i<list.length;i++){	
				$scope.selectIds.push(list[i].rulesId);								
            }
		}
	}
	
	//分页
	$scope.findPage=function(page,rows){			
		amRulesService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		amRulesService.findOne(id).success(
			function(response){
				$scope.entity= response;	
			}
		);				
		$scope.newRulesFile = {};
	}
	
	//点击新建按钮后，生成一个空的实体，同时将当前时间和当前登入的用户赋值到新实体上
	$scope.creatNewOne = function(){
		$scope.entity = {};//新建一个空的实体
		var today = new Date();//获取系统当前时间
		$scope.entity.rulesDatetime = $filter('date')(today,"yyyy-MM-dd HH:mm");
		$scope.entity.rulesEnable = '1';
		loginService.findLoginStaff().success(
				function(result){
					$scope.entity.rulesStaff = result;
				}
		);
		$scope.newRulesFile = {};
	}
	/**
	 * 上传文件相关
	 */
	//点击相机图片选择文件列表
	$scope.selectFile = function(){
		$("#selectRulesInputFile").click();
	}
	//选择好之后，显示出要上传的文件信息
	$("#selectRulesInputFile").on("change",function(e){
		var selectFile = e.currentTarget.files[0];//此次要上传的文件
		$scope.$apply(function(){
			$scope.newRulesFile = selectFile;//新遍历列表赋值给老遍历列表里
		})
	});
	//上传文档文件
	$scope.uploadRule = function(){
		uploadService.upload(selectRulesInputFile,2).success(
			function(result){
				if(result.success){
					alert("上传成功，请立即保存！");
					$scope.entity.rulesURL = result.msg;
					console.log("上传成功");
				}else{
					slert(result.msg);
				}
		});
	}
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.rulesId!=null){//如果有ID
			serviceObject=amRulesService.update( $scope.entity ); //修改  
		}else{
			serviceObject=amRulesService.add( $scope.entity  );//增加 
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
		alert("确定要删除这些记录吗？")
		amRulesService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					alert("删除成功！");
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		amRulesService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//找到发表过规章制度的员工的id
	$scope.staffList = [];
	$scope.findStaff = function(){
		amRulesService.findStaff().success(
			function(result){
				$scope.staffList = result;
			}
		);
	}
	
	
});	
