package com.lmz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmz.service.LabDetailService;
import com.lmz.service.LaboratoryService;
import com.lmz.vo.LabDetail;
import com.lmz.vo.LabDetailExample;
import com.lmz.vo.LaboratoryArrangement;
import com.lmz.vo.LaboratoryArrangementExample;

@Controller
@RequestMapping("/course")
public class LaboratoryController {

    @Autowired
    private LaboratoryService labService;

    @Autowired
    private LabDetailService labDetailService;
    
    @RequestMapping("/save")
    @ResponseBody
    public String save(LaboratoryArrangement record,Map<String, Integer> map) {
       
        System.out.println("进入增加方法");
        Integer i = labService.save(record);
        System.out.println(i);
        return i.toString();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {

        System.out.println("进入删除方法");
        labService.delete(id);
        return "redirect:/course/get/1";
    }

    @RequestMapping("/update")
    public void update(LaboratoryArrangement record) {

        System.out.println("进入修改方法");
        labService.update(record);
    }

    @RequestMapping("/get/{page}")
    // @ResponseBody
    public String get(@PathVariable("page") Integer page, Map<String, Object> map, LaboratoryArrangementExample example) {

        System.out.println("进入了get方法");
        PageHelper.startPage(page, 5);

        List<LaboratoryArrangement> list = labService.get(example);
        PageInfo<LaboratoryArrangement> pageInfo = new PageInfo<LaboratoryArrangement>(list);
        map.put("pageInfo", pageInfo);

        return "listrenwu";

    }
    
    
    @RequestMapping("/getName")
    // @ResponseBody
    public String getName(Map<String, Object> map, LabDetailExample example) {

        System.out.println("进入了getName方法");
        List<LabDetail> list = labDetailService.get(example);
        List<String> listName = new ArrayList<>();
        for(int i=0 ;i<list.size();i++){
            String name = list.get(i).getLabDetailName();
            listName.add(i, name);
        }
        map.put("listName", listName);
        return "addrenwu";

    }

}
