app.service("baseDictService",function($http){
	this.findDict = function(typeCode){
		return $http.get("../sysBasedict/findDict.do?typeCode="+typeCode);
	}
});