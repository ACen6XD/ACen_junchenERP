package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmAssess;
import com.junchen.back.pojogroup.Assess;
import com.junchen.back.service.AmAssessService;
import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amAssesscontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amAssess")
public class AmAssessController {

	@Autowired
	private AmAssessService amAssessService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmAssess> findAll(){			
		return amAssessService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return amAssessService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amAssess
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Assess amAssess){
		try {
			amAssessService.add(amAssess);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amAssess
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  Assess amAssess){
		try {
			amAssessService.update(amAssess);
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
	public  Assess findOne(Long id){
		return amAssessService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amAssessService.delete(ids);
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
	public PageResult search(@RequestBody  ErpAmAssess amAssess, int page, int rows  ){
		return amAssessService.findPage(amAssess, page, rows);		
	}
	
}
