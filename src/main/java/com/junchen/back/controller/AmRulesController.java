package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmRules;
import com.junchen.back.service.AmRulesService;

import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amRulescontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amRules")
public class AmRulesController {

	@Autowired
	private AmRulesService amRulesService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmRules> findAll(){			
		return amRulesService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){	
		
		return amRulesService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amRules
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpAmRules amRules){
		try {
			amRulesService.add(amRules);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amRules
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpAmRules amRules){
		try {
			amRulesService.update(amRules);
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
	public  ErpAmRules findOne(Long id){
		return amRulesService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amRulesService.delete(ids);
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
	public PageResult search(@RequestBody  ErpAmRules amRules, int page, int rows  ){
		return amRulesService.findPage(amRules, page, rows);		
	}
	
	/**
	 * 查找出发表过规章制度的员工的id
	 * @return
	 */
	@RequestMapping("/findByStaffId")
	public List<ErpAmRules> findByStaffId(){
		return amRulesService.findByStaffId();		
	}
	
	
	
}
