//amLogbook服务层
app.service('amLogbookService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../amLogbook/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../amLogbook/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../amLogbook/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../amLogbook/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../amLogbook/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../amLogbook/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../amLogbook/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
	
	//加载姓名搜索下拉框
	this.findStaffList = function(){
		return $http.get('../amLogbook/findStaffList.do');
	}
});
