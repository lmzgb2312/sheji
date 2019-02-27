package com.lmz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmz.service.LaboratoryService;
import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;


@Controller
@RequestMapping("/course")
public class LaboratoryController {
	
	@Autowired
	private LaboratoryService labService;
	
	@RequestMapping("/save")
	public String save(LaboratoryArrangement record){
		
		System.out.println("进入增加方法");
		labService.save(record);
		return "addrenwu";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id){
		
		System.out.println("进入删除方法");
		labService.delete(id);
		return "redirect:/course/get/1";
	}
	
	@RequestMapping("/update")
	public void update(LaboratoryArrangement record,LaboratoryArrangementExample example){
		
		System.out.println("进入修改方法");
		labService.update(record, example);
	}
	
	
	@RequestMapping("/get/{page}")
	//@ResponseBody
	public String get(@PathVariable("page") Integer page,Map<String,Object> map,LaboratoryArrangementExample example){
		System.out.println("进入了get方法");
		PageHelper.startPage(page,5);
		
		List<LaboratoryArrangement> list = labService.get(example);
		PageInfo<LaboratoryArrangement> pageInfo = new PageInfo<LaboratoryArrangement>(list);
		map.put("pageInfo", pageInfo);
		
		return "listrenwu";
		
	}
	
	
	
	

}
