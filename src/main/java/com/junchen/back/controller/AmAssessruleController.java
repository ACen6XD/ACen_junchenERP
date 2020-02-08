package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmAssessrule;
import com.junchen.back.service.AmAssessruleService;

import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amAssessrulecontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amAssessrule")
public class AmAssessruleController {

	@Autowired
	private AmAssessruleService amAssessruleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmAssessrule> findAll(){			
		return amAssessruleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return amAssessruleService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amAssessrule
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpAmAssessrule amAssessrule){
		try {
			amAssessruleService.add(amAssessrule);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amAssessrule
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpAmAssessrule amAssessrule){
		try {
			amAssessruleService.update(amAssessrule);
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
	public  ErpAmAssessrule findOne(Long id){
		return amAssessruleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amAssessruleService.delete(ids);
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
	public PageResult search(@RequestBody  ErpAmAssessrule amAssessrule, int page, int rows  ){
		return amAssessruleService.findPage(amAssessrule, page, rows);		
	}
	
}
