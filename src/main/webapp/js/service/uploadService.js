app.service("uploadService",function($http){
	//上传单个文件
	this.upload = function(file,index){
		var url = "";
		if(index == 1)
			url = "../uploadImg.do";
		else
			url = "../uploadWord.do";
		var formData = new FormData();//定义文件上传的内容
		formData.append('file',file.files[0]);//文件上传框的name
		return $http({
			method:"post",
			url:url,
			data:formData,
			headers:{'Content-Type':undefined},
			transformRequest: angular.identity
		})
	}
	
	//上传多个文件
	this.uploadImgs = function(uploadFiles){
		var formData = new FormData();//定义文件上传的内容
		for (var i=0; i<uploadFiles.length; i++) {
	        formData.append('files',uploadFiles[i]);//文件上传框的name
	      }
		return $http({
			method:"post",
			url:"../uploadImgs.do",
			data:formData,
			headers:{'Content-Type':undefined},
			transformRequest: angular.identity
		})
	}
	
})