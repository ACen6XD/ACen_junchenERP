app.service("loginService",function($http){
	this.findLoginStaff = function(){
		return $http.get("../amStaff/findLoginStaff.do");
	}
})