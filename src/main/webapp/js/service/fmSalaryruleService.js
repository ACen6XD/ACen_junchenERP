//fmSalaryrule服务层
app.service('fmSalaryruleService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../fmSalaryrule/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../fmSalaryrule/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../fmSalaryrule/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../fmSalaryrule/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../fmSalaryrule/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../fmSalaryrule/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../fmSalaryrule/search.do?page='+page+"&rows="+rows, searchEntity);
	}    
	
	//再编辑页面进行查询
	this.findSalaryRules = function(searchEntity){
		return $http.post('../fmSalaryrule/findSalaryRules.do',searchEntity);
	}
	
});
