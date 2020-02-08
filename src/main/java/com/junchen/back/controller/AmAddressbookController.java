package com.junchen.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmAddressbook;
import com.junchen.back.service.AmAddressbookService;

import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amAddressbookcontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amAddressbook")
public class AmAddressbookController {

	@Autowired
	private AmAddressbookService amAddressbookService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmAddressbook> findAll(){			
		return amAddressbookService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return amAddressbookService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amAddressbook
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpAmAddressbook amAddressbook){
		try {
			amAddressbookService.add(amAddressbook);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amAddressbook
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpAmAddressbook amAddressbook){
		try {
			amAddressbookService.update(amAddressbook);
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
	public  ErpAmAddressbook findOne(Long id){
		return amAddressbookService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amAddressbookService.delete(ids);
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
	public PageResult search(@RequestBody  ErpAmAddressbook amAddressbook, int page, int rows  ){
		return amAddressbookService.findPage(amAddressbook, page, rows);		
	}
	
	@RequestMapping("/findCompany")
	public List<String> findCompany(){
		return amAddressbookService.findCompany();
	}
	
}
