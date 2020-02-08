app.service("myInfoService",function($http){
	this.findLoginStaff = function(){
		return $http.get("../amStaff/findLoginStaff.do");
	}
	this.update = function(entity){
		return $http.post("../amStaff/update.do",entity);
	}
})
