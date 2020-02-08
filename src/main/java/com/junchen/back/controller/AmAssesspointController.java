package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmAssesspoint;
import com.junchen.back.service.AmAssesspointService;

import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amAssesspointcontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amAssesspoint")
public class AmAssesspointController {

	@Autowired
	private AmAssesspointService amAssesspointService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmAssesspoint> findAll(){			
		return amAssesspointService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return amAssesspointService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amAssesspoint
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpAmAssesspoint amAssesspoint){
		try {
			amAssesspointService.add(amAssesspoint);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amAssesspoint
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpAmAssesspoint amAssesspoint){
		try {
			amAssesspointService.update(amAssesspoint);
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
	public  ErpAmAssesspoint findOne(Long id){
		return amAssesspointService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amAssesspointService.delete(ids);
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
	public PageResult search(@RequestBody  ErpAmAssesspoint amAssesspoint, int page, int rows  ){
		return amAssesspointService.findPage(amAssesspoint, page, rows);		
	}
	
}
