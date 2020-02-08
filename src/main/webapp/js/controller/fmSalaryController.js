 //fmSalary控制层 
app.controller('fmSalaryController' ,function($scope,$controller ,$filter  ,fmSalaryService,loginService,baseDictService,amStaffService,fmSalaryruleService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		fmSalaryService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		fmSalaryService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//找到登入用户
	$scope.loginStaff = {};
	$scope.findLoginStaff = function(){
		loginService.findLoginStaff().success(
				function(result){
					$scope.loginStaff = result;
				}
		);
	}
	//加载部门下拉列表
	$scope.depList = [];
	$scope.findDict = function(){
		baseDictService.findDict('003').success(function(result){
			$scope.depList = result;
		});
	}
	//加载制作人列表
	$scope.findStaffList = function(){
		fmSalaryService.findStaffList().success(function(result){
			$scope.staffList = result;
		});
	}
	
	//点击新建实体后
	$scope.entity = {salary:{},salaryRules:[]};
	$scope.createNewOne = function(){
		//新数据默认数据更新（制作人，制作日期，数据状态）
		$scope.entity = {salary:{},salaryRules:[]};
		$scope.entity.salary.salaryStaff = $scope.loginStaff;
		var date = new Date();
		$scope.entity.salary.salaryDate = $filter('date')(date,'yyyy-MM-dd HH:mm');
		$scope.entity.salary.salaryEnable = '1';
		$scope.showFlag = 0;
		//调取所有职员列表
		amStaffService.findAll().success(
			function(result){
				for(var i = 0;i < result.length;i++){
					$scope.entity.salaryRules[i] = {};
					$scope.entity.salaryRules[i].salaryruleStaffname = result[i].staffName;
					$scope.entity.salaryRules[i].salaryruleStaffdep = result[i].staffDepartment.dictItemName;
					$scope.entity.salaryRules[i].salaryruleBase = 0;
					$scope.entity.salaryRules[i].salaryruleSocial = 0;
					$scope.entity.salaryRules[i].salaryruleOld = 0;
					$scope.entity.salaryRules[i].salaryruleLose=0;
		        	$scope.entity.salaryRules[i].salaryruleMedical=0;
					$scope.entity.salaryRules[i].salaryruleInjure=0;
		        	$scope.entity.salaryRules[i].salaryruleBaby=0 ; 
		        	$scope.entity.salaryRules[i].salaryruleFund=0;
		        	$scope.entity.salaryRules[i].salaryruleJob=0; 
		        	$scope.entity.salaryRules[i].salaryruleLife=0 ; 
		        	$scope.entity.salaryRules[i].salaryruleReward=0 ;  
		        	$scope.entity.salaryRules[i].salaryruleAge=0 ; 
		        	$scope.entity.salaryRules[i].salaryruleOther=0;
				}
			}
		);
	}
	
	//查询实体 
	$scope.showFlag = 0;
	$scope.findOne=function(id,flag){	
		$scope.showFlag = flag;
		fmSalaryService.findOne(id).success(
			function(response){
				$scope.entity= response;					
				if(flag==1){//如果是审批，额外属性初始化
					$scope.entity.salary.salaryBoss = $scope.loginStaff;
					var date = new Date();
					$scope.entity.salary.salaryBossdate = $filter('date')(date,'yyyy-MM-dd HH:mm');
					$scope.entity.salary.salaryEnable = '2';
				}
			}
		);
	}
	
	//再编辑页面进行查询
	$scope.searchRules = {rule:{},rulesList:[]};
	$scope.findSalaryRules = function(){
		$scope.searchRules.rulesList = [];//用于存储数据进行查询
		for(var i =0;i < $scope.entity.salaryRules.length;i++){
			$scope.searchRules.rulesList[i] = {};
			$scope.searchRules.rulesList[i] = $scope.entity.salaryRules[i];
		}
		fmSalaryruleService.findSalaryRules($scope.searchRules).success(
			function(result){
				$scope.entity.salaryRules = result;
		});
	}
	
	
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		var total = 0;//总计
		if($scope.entity.salary.salaryName == null || $scope.entity.salary.salaryName.length==0){
			alert('输入标题！');
			return;
		}
		for(var i = 0;i < $scope.entity.salaryRules.length;i++){//遍历员工工资细则
			$scope.entity.salaryRules[i].salaryruleTotal = $scope.entity.salaryRules[i].salaryruleBase-0 + $scope.entity.salaryRules[i].salaryruleSocial-0
			+ $scope.entity.salaryRules[i].salaryruleOld-0 + $scope.entity.salaryRules[i].salaryruleLose-0
			+ $scope.entity.salaryRules[i].salaryruleMedical-0 + $scope.entity.salaryRules[i].salaryruleInjure-0
			+ $scope.entity.salaryRules[i].salaryruleBaby-0 + $scope.entity.salaryRules[i].salaryruleFund-0
			+$scope.entity.salaryRules[i].salaryruleJob-0+ $scope.entity.salaryRules[i].salaryruleLife-0 + 
			$scope.entity.salaryRules[i].salaryruleReward-0 +  $scope.entity.salaryRules[i].salaryruleAge-0 
			+ $scope.entity.salaryRules[i].salaryruleOther-0;
			total += $scope.entity.salaryRules[i].salaryruleTotal-0;
		}
		if($scope.entity.salary.salaryId!=null){//如果有ID
			serviceObject=fmSalaryService.update( $scope.entity ); //修改 
		}else{
			serviceObject=fmSalaryService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
		        	alert("编辑成功！薪资总计"+ total +"元");
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框
		if(confirm("是否确认删除薪资表"+ $scope.selectIds +"?")){
			fmSalaryService.dele( $scope.selectIds ).success(
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
		fmSalaryService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	//复选框全选反选
	$scope.selectAllCheckBox = function(master,list){
		if(master == true){//如果当前是全选状态，因此点击后会变成全不选，所以要清空选择数据
			$scope.selectIds=[];
		}else{//反之，当前是全不选，点击后要选择所有数据
			for(var i=0;i<list.length;i++){
            	$scope.selectIds.push(list[i].salaryId);
            }
		}
	}
});	
