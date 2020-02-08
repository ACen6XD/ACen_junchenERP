package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpSysBasedict;
import com.junchen.back.service.SysBasedictService;

import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * sysBasedictcontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sysBasedict")
public class SysBasedictController {

	@Autowired
	private SysBasedictService sysBasedictService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpSysBasedict> findAll(){			
		return sysBasedictService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sysBasedictService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param sysBasedict
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpSysBasedict sysBasedict){
		try {
			sysBasedictService.add(sysBasedict);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sysBasedict
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpSysBasedict sysBasedict){
		try {
			sysBasedictService.update(sysBasedict);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public  ErpSysBasedict findOne(String id){
		return sysBasedictService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			sysBasedictService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody  ErpSysBasedict sysBasedict, int page, int rows  ){
		return sysBasedictService.findPage(sysBasedict, page, rows);		
	}
	
	/**
	 * 根据类别代码查找出具体类别
	 * @param typeCode
	 * @return
	 */
	@RequestMapping("/findDict")
	public List<ErpSysBasedict> findDict(String typeCode){
		return sysBasedictService.findDict(typeCode);
	}
	
}
