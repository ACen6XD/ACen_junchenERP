//amAddressbook服务层
app.service('amAddressbookService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../amAddressbook/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../amAddressbook/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../amAddressbook/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../amAddressbook/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../amAddressbook/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../amAddressbook/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../amAddressbook/search.do?page='+page+"&rows="+rows, searchEntity);
	}   
	//查找公司下拉列表
	this.findCompany = function(){
		return $http.get('../amAddressbook/findCompany.do');
	}
	
});
