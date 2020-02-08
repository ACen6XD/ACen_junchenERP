app.controller("loginController",function($scope,$controller,loginService){
	$scope.findLoginStaff = function(){
		loginService.findLoginStaff().success(
				function(result){
					$scope.loginStaff = result;
				}
		)
	}
	

})