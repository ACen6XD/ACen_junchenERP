package com.junchen.back.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.junchen.back.myentity.Result;
import com.junchen.back.pojo.ErpSysUser;
import com.junchen.back.utils.UUIDUtils;

@RestController
public class UploadController {
	
	//引入文件的绝对存储路径
	@Value("${FILE_REAL_URL}")
	private String FILE_REAL_URL;
	
	//引入文件虚拟路径
	@Value("${FILE_VIRTUAL_URL}")
	private String FILE_VIRTUAL_URL;
	
	/**
	 * 上传多个图片格式文件
	 * @param files
	 * @return
	 */
	@RequestMapping("/uploadImgs")
	public Result uploadImgs(@RequestParam(value="files") MultipartFile[] files){
		String msg = "";//用于存储多个文件的地址
		for (MultipartFile file : files) {//遍历要上传的文件集合
			Result result = uploadImg(file);//新建一个对象用于返回
			if(result.isSuccess()){//上传成功
				if(msg.length() == 0&&"".equals(msg)){
					msg += result.getMsg();
				}else{
					msg += (","+result.getMsg());					
				}
			}else{//上传失败
				return new Result(false,result.getMsg());
			}
		}
		return new Result(true,msg);
	}
	
	/**
	 * 上传多个文档格式文件
	 * @param files
	 * @return
	 */
	@RequestMapping("/uploadWords")
	public Result uploadWords(@RequestParam(value="files") MultipartFile[] files){
		String msg = "";//用于存储多个文件的地址
		for (MultipartFile file : files) {//遍历要上传的文件集合
			Result result = uploadWord(file);//新建一个对象用于返回
			if(result.isSuccess()){//上传成功
				if(msg.length() == 0&&"".equals(msg)){
					msg += result.getMsg();
				}else{
					msg += (","+result.getMsg());					
				}
			}else{//上传失败
				return new Result(false,result.getMsg());
			}
		}
		return new Result(true,msg);
	}
	
	
	/**
	 * 上传单个图片格式文件
	 * @param file
	 * @return
	 */
	@RequestMapping("/uploadImg")
	public Result uploadImg(MultipartFile file){
		String fileName = file.getOriginalFilename();
		String fileType = fileName.substring(fileName.indexOf('.')+1);
		if(!"jpg".equalsIgnoreCase(fileType)&&!"jpeg".equalsIgnoreCase(fileType)&&!"pdf".equalsIgnoreCase(fileType)){
			return new Result(false,"上传文件仅支持jpg和pdf格式的图片，请重新上传");
		}else
			return upload(file);
	}
	/**
	 * 上传单个文档格式文件
	 * @param file
	 * @return
	 */
	@RequestMapping("/uploadWord")
	public Result uploadWord(MultipartFile file){
		String fileName = file.getOriginalFilename();
		String fileType = fileName.substring(fileName.indexOf('.')+1);
		if(!"doc".equalsIgnoreCase(fileType)&&!"docx".equalsIgnoreCase(fileType)){
			return new Result(false,"上传文件仅支持doc或docx格式的文档，请重新上传");
		}else
			return upload(file);
	}
	
	
	/**
	 * 文件格式正确之后，上传文件
	 * @return
	 */
	public Result upload(MultipartFile file){
		try {
			//获取文件的全名
			String fileName = file.getOriginalFilename();
			String newFileName = UUIDUtils.getUUIDFileName(fileName);
			//从shiro的session中取当前登入用户
			Subject subject = SecurityUtils.getSubject();
			//获取身份信息用于存放上传文件
			ErpSysUser loginUser = (ErpSysUser) subject.getPrincipal();
			//获取当前时间轴用于存放上传文件
			SimpleDateFormat df = new SimpleDateFormat("MM" + File.separator +"dd"+ File.separator +"HH" + File.separator +"mm"+ File.separator +"SS"); 
			String fileAddress = df.format(new Date());
			//生成存储文件的路径
			File newFile = new File(FILE_REAL_URL + File.separator + loginUser.getUser_staffid() + File.separator +fileAddress +File.separator + newFileName);
			//如果父文件夹不存在
			if(!newFile.getParentFile().exists()){
				//就新建该文件夹
				newFile.getParentFile().mkdirs();
			}
			//写入到磁盘中
			file.transferTo(newFile);
			String url = FILE_VIRTUAL_URL + "/" + loginUser.getUser_staffid() + "/" + fileAddress + "/" + newFileName;
			return new Result(true,url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false,"上传失败！");
		}
	}
	
}
