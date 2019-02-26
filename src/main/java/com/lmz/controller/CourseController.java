package com.lmz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmz.service.CourseService;
import com.lmz.vo.CourseArrangement;
import com.lmz.vo.CourseArrangementExample;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/save")
	public String save(CourseArrangement record){
		
		System.out.println("进入增加方法");
		courseService.save(record);
		return "redirect:/course/get/1";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id){
		
		System.out.println("进入删除方法");
		courseService.delete(id);
		return "redirect:/course/get/1";
	}
	
	@RequestMapping("/update")
	public void update(CourseArrangement record,CourseArrangementExample example){
		
		System.out.println("进入修改方法");
		courseService.update(record, example);
	}
	
	
	@RequestMapping("/get/{page}")
	//@ResponseBody
	public String get(@PathVariable("page") Integer page,Map<String,Object> map,CourseArrangementExample example){
		System.out.println("进入了get方法");
		PageHelper.startPage(page,5);
		
		List<CourseArrangement> list = courseService.get(example);
		PageInfo<CourseArrangement> pageInfo = new PageInfo<CourseArrangement>(list);
		map.put("pageInfo", pageInfo);
		
		return "listrenwu";
		
	}
	
	
	
	

}
