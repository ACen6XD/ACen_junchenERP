 //amStaff控制层 
app.controller('amStaffController' ,function($scope,$controller,$filter,amStaffService,uploadService,baseDictService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		amStaffService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		amStaffService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.repeatHealhFiles = [];
	$scope.repeatContractFiles = [];
	
	$scope.findOne=function(id){	
		$scope.newRepeatHealhFiles=[];
		$scope.newRepeatContractFiles=[];
		
		amStaffService.findOne(id).success(
			function(response){
				$scope.loginStaff= response;
				if(response.staffHealth != ""&&response.staffHealth != null)
					$scope.repeatHealhFiles = response.staffHealth.split(',');//用于接受已经存在的健康报告图片列表
				if(response.staffContract != ""&&response.staffContract != null)
					$scope.repeatContractFiles = response.staffContract.split(',');//用于接受已经存在的合同报告图片列表
			}
		);
		
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.loginStaff.staffId!=null){//如果有ID
			serviceObject=amStaffService.update( $scope.loginStaff); //修改  
		}else{
			
			serviceObject=amStaffService.add( $scope.loginStaff  );//增加 
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
		amStaffService.dele( $scope.selectIds ).success(
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
		amStaffService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
	//离职
	$scope.quit = function(){	
		if(confirm('是否确认该员工离职？')){
			$scope.loginStaff.staffEnable = '0';
			var today = new Date();
			$scope.loginStaff.staffOutdate = $filter('date')(today,"yyyy-MM-dd HH:mm");
			amStaffService.update($scope.loginStaff).success(
					function(response){
						if(response.success){
							alert(response.msg);//显示反馈信息
							$scope.reloadList();//刷新列表					
						}
					}			
			);
			
		}
	}
	
	//查找离职名单
	$scope.findQuitList = function(){
		$scope.quitList = [];
		amStaffService.findQuitList().success(
			function(result){
				$scope.quitList = result;
		});
	}
	
	
	/**
	 * 个人信息修改
	 */

	//通过controller上传照片
	$scope.uploadStaffPhoto = function(){
		uploadService.upload(selectPhotoInputFiles,1).success(
				function(result){
					if(result.success){
						alert("照片上传成功！请立即保存！");
						$scope.loginStaff.staffPhoto = result.msg;						
						console.log("上传成功");
					}else{
						alert(result.msg);
					}
				});
	}
	
	//点击选择文件按钮时，实则点击隐藏的file
	$scope.selectFile = function(index){
		if(index == 1){
			$("#selectHealthInputFiles").click();			
		}else if(index == 2){
			$("#selectContractInputFiles").click();
		}else{
			$("#selectPhotoInputFiles").click();
		}
	}
	
//	$scope.newRepeatHealhFiles = [];//定义一个新的空数组用于存储新上传的数据列表。
	//监听隐藏的file控件，每当前端发生改变时，自动获取当前的数据并push更新到已经存在的列表中
	$("#selectHealthInputFiles").on("change",function(e){
		var selectFiles = e.currentTarget.files;//此次要上传的文件
		var newRepeatFiles = $scope.newRepeatHealhFiles;//获取老的遍历列表
		for(var i = 0;i < selectFiles.length;i++){
			newRepeatFiles.push(selectFiles[i]);//把这次要上传的文件push到遍历列表中
		}
		$scope.$apply(function(){
			$scope.newRepeatHealhFiles = newRepeatFiles;//新遍历列表赋值给老遍历列表里
		})
	});
	
	//监听隐藏的file控件，每当前端发生改变时，自动获取当前的数据并push更新到已经存在的列表中
	$("#selectContractInputFiles").on("change",function(e){
		var selectFiles = e.currentTarget.files;//此次要上传的文件
		var newRepeatFiles = $scope.newRepeatContractFiles;//获取老的遍历列表
		for(var i = 0;i < selectFiles.length;i++){
			newRepeatFiles.push(selectFiles[i]);//把这次要上传的文件push到遍历列表中
		}
		$scope.$apply(function(){
			$scope.newRepeatContractFiles = newRepeatFiles;//新遍历列表赋值给老遍历列表里
		})
	});
	
	//点击删除按钮删除添加的内容
	$scope.delRepeatFiles = function(index,fileIndex){
		if(index == 1){
			$scope.repeatHealhFiles.splice(fileIndex,1);			
		}else if(index == 2){
			$scope.newRepeatHealhFiles.splice(fileIndex,1);			
		}else if(index == 3){
			$scope.repeatContractFiles.splice(fileIndex,1);
		}else{
			$scope.newRepeatContractFiles.splice(fileIndex,1);	
		}
	}
	
	//通过controller上传健康报告
	$scope.uploadStaffHealthOrContract = function(index){
		if(index == 1){
			uploadService.uploadImgs($scope.newRepeatHealhFiles).success(
					function(result){
						if(result.success){
							var oldFiles = "";
							for(var i=0; i<$scope.repeatHealhFiles.length; i++) {
								if(i == 0){
									oldFiles += $scope.repeatHealhFiles[i];//文件上传框的name								
								}else{
									oldFiles += ','+$scope.repeatHealhFiles[i];
								}
						      }
							if(oldFiles != ""){
								if(result.msg != "" ){
									$scope.loginStaff.staffHealth = (oldFiles+','+result.msg);										
								}else{
									$scope.loginStaff.staffHealth = (oldFiles);									
								}
							}else{
								if(result.msg != "" ){
									$scope.loginStaff.staffHealth = result.msg;										
								}else{
									$scope.loginStaff.staffHealth = null;									
								}															
							}
							alert("健康证明上传成功，请立即保存！");
							console.log("上传成功");
						}else{
							alert(result.msg);
						}
					}
			);			
		}else{
			uploadService.uploadImgs($scope.newRepeatContractFiles).success(
					function(result){
						if(result.success){
							var oldFiles = "";
							for(var i=0; i<$scope.repeatContractFiles.length; i++) {
								if(i == 0){
									oldFiles += $scope.repeatContractFiles[i];//文件上传框的name								
								}else{
									oldFiles += ','+$scope.repeatContractFiles[i];
								}
							}
							if(oldFiles != ""){
								if(result.msg != "" ){
									$scope.loginStaff.staffContract = (oldFiles+','+result.msg);										
								}else{
									$scope.loginStaff.staffContract = (oldFiles);									
								}
							}else{
								if(result.msg != "" ){
									$scope.loginStaff.staffContract = result.msg;										
								}else{
									$scope.loginStaff.staffContract = null;									
								}															
							}
							alert("详细合同上传成功，请立即保存！")
							console.log("上传成功");
						}else{
							alert(result.msg);
						}
					}
			);
		}
	}
	
	//加载下拉框
	$scope.staffTypeList = [];
	$scope.staffDepartmentList = [];
	$scope.staffTittleList = [];
	$scope.staffEduList = [];
	$scope.findDict = function(){
		baseDictService.findDict("002").success(function(result){
			$scope.staffTypeList = result;
		});
		baseDictService.findDict("003").success(function(result){
			$scope.staffDepartmentList = result;
		});
		baseDictService.findDict("004").success(function(result){
			$scope.staffTittleList = result;
		});
		baseDictService.findDict("005").success(function(result){
			$scope.staffEduList = result;
		});
	};
	
	$scope.createNewOne = function(){
		//清空循环列表
		$scope.newRepeatHealhFiles=[];
		$scope.newRepeatContractFiles=[];
		$scope.repeatHealhFiles = [];
		$scope.repeatContractFiles = [];
		//清空页面实体
		$scope.loginStaff = {};
		$scope.loginStaff.staffEnable = '1';
		var today = new Date();//获取系统当前时间
		$scope.loginStaff.staffIndate = $filter('date')(today,"yyyy-MM-dd HH:mm");
	}
	
});	
