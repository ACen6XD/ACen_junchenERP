package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpFmSalary;
import com.junchen.back.pojogroup.Salary;
import com.junchen.back.service.FmSalaryService;
import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * fmSalarycontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/fmSalary")
public class FmSalaryController {

	@Autowired
	private FmSalaryService fmSalaryService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpFmSalary> findAll(){			
		return fmSalaryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return fmSalaryService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param fmSalary
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Salary fmSalary){
		try {
			fmSalaryService.add(fmSalary);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param fmSalary
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  Salary fmSalary){
		try {
			fmSalaryService.update(fmSalary);
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
	public  Salary findOne(Long id){
		return fmSalaryService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			fmSalaryService.delete(ids);
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
	public PageResult search(@RequestBody  ErpFmSalary fmSalary, int page, int rows  ){
		return fmSalaryService.findPage(fmSalary, page, rows);		
	}
	@RequestMapping("/findStaffList")
	public List<ErpFmSalary> findStaffList(){
		return fmSalaryService.findStaffList();
	}
	
	
}
