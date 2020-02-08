package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpFmSalaryrule;
import com.junchen.back.pojogroup.SalaryRule;
import com.junchen.back.service.FmSalaryruleService;
import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * fmSalaryrulecontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/fmSalaryrule")
public class FmSalaryruleController {

	@Autowired
	private FmSalaryruleService fmSalaryruleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpFmSalaryrule> findAll(){			
		return fmSalaryruleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return fmSalaryruleService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param fmSalaryrule
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpFmSalaryrule fmSalaryrule){
		try {
			fmSalaryruleService.add(fmSalaryrule);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param fmSalaryrule
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpFmSalaryrule fmSalaryrule){
		try {
			fmSalaryruleService.update(fmSalaryrule);
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
	public  ErpFmSalaryrule findOne(Long id){
		return fmSalaryruleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			fmSalaryruleService.delete(ids);
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
	public PageResult search(@RequestBody  ErpFmSalaryrule fmSalaryrule, int page, int rows  ){
		return fmSalaryruleService.findPage(fmSalaryrule, page, rows);		
	}
	
	/**
	 * 再编辑列表中进行查询
	 * @return
	 */
	@RequestMapping("/findSalaryRules")
	public List<ErpFmSalaryrule> findSalaryRules(@RequestBody SalaryRule searchEntity){
		System.out.println(searchEntity.getRule().getSalaryruleStaffdep()+"----"+searchEntity.getRule().getSalaryruleStaffname());
		return fmSalaryruleService.findSalaryRules(searchEntity.getRule(),searchEntity.getRulesList());
	}

	
	
}
