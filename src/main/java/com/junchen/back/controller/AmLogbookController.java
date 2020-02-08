package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmLogbook;
import com.junchen.back.service.AmLogbookService;

import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amLogbookcontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amLogbook")
public class AmLogbookController {

	@Autowired
	private AmLogbookService amLogbookService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmLogbook> findAll(){			
		return amLogbookService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return amLogbookService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amLogbook
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpAmLogbook amLogbook){
		try {
			amLogbookService.add(amLogbook);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amLogbook
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpAmLogbook amLogbook){
		try {
			amLogbookService.update(amLogbook);
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
	public  ErpAmLogbook findOne(Long id){
		return amLogbookService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amLogbookService.delete(ids);
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
	public PageResult search(@RequestBody  ErpAmLogbook amLogbook, int page, int rows  ){
		return amLogbookService.findPage(amLogbook, page, rows);		
	}
	
	/**
	 * 加载按姓名搜索下拉框中的数据
	 * @return
	 */
	@RequestMapping("/findStaffList")
	public List<ErpAmLogbook> findStaffList(){
		return amLogbookService.findStaffList();
	}
	
}
