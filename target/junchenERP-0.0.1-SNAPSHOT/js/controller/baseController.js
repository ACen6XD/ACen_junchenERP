app.controller("baseController",function($scope){
	
	$scope.searchEntity={};//初始化查询栏，使其不会null
	//封装刷新页面
	$scope.reloadList = function(){
		$scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);	    		
	}

	//分页控件配置 
	$scope.paginationConf = {
			 currentPage: 1,//当前页码
			 totalItems: 10,//记录总数
			 itemsPerPage: 10,//每页显示记录量
			 perPageOptions: [10, 20, 30, 40, 50],//下拉框，选择每页显示的数据量
			 onChange: function(){//更改页面时触发事件
			 	//每次点击改变页码时，访问一次控制层的方法
				$scope.reloadList();
				$scope.selectIds=[];
				$scope.master =false;
			 }
	}; 
	$scope.selectIds=[]//定义删除的id集合
	$scope.updateSelect = function($event,id){//每次复选框更新后，删除的数组增多
		//event代表当前input的源，加了target代表他本身，即可以使用它本身的属性
		if($event.target.checked){//加入checked表示是否被选中
			$scope.selectIds.push(id);					
		}else{//如果没有被选中
			var index = $scope.selectIds.indexOf(id);//查找当前id的再数组中位置
			$scope.selectIds.splice(index,1);//第一个参数表示移除的位置，第二个参数表示移除几个
		}
	};
	
	//将数据库中的json数据转成普通的string类型
	$scope.jsonToString = function(JSONString,key){
		//将json字符串转化为json对象
		var json = JSON.parse(JSONString);
		var value="";
		for(var i = 0;i<json.length;i++){
			if(i > 0){
				value += ",";
			}
			value += json[i][key];
		}
		return value;
	}
	

	//复选框全选反选
//	$scope.selectAllCheckBox = function(master,list){
//		if(master == true){//如果当前是全选状态，因此点击后会变成全不选，所以要清空选择数据
//			$scope.selectIds=[];
//		}else{//反之，当前是全不选，点击后要选择所有数据
//			for(var i=0;i<list.length;i++){
//            	$scope.selectIds.push(list[i].id);
//            }
//		}
//	}

	
});

