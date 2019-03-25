package com.lmz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmz.service.LabReservationService;
import com.lmz.service.LaboratoryService;
import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LabExtendInfoExample;
import com.lmz.vo.LabReservation;

@Controller
@RequestMapping("/reservation")
public class LabReservationController {
    
    
    @Autowired
    private LabReservationService labReservationService;
    
    @Autowired
    private LaboratoryService laboratoryService;
    
    @RequestMapping("/save")
    @ResponseBody
    public Integer save(LabReservation record){
     
        System.out.println("进入了save方法");
        return labReservationService.save(record);
    }
    
    
    @RequestMapping("/delete/{labId}")
    public String delete(@PathVariable("labId") Integer labId){
        System.out.println("进入删除方法");
        labReservationService.delete("2015211163", labId);
        return "redirect:/reservation/get/1";
    }
    
    @RequestMapping("/get/{page}")
  //  @ResponseBody
    public String get(@PathVariable("page") Integer page,Map<String,Object> map){
        
        PageHelper.startPage(page, 5);
        List<LabReservation> list = labReservationService.get("2015211163");
        PageInfo<LabReservation> pageInfo = new PageInfo<LabReservation>(list);
        map.put("pageInfo", pageInfo);
        return "listxiangmuxinxi3";
    }
    
    @RequestMapping("/getOne/{id}")
    //  @ResponseBody
      public String getOne(@PathVariable("id") Integer id,Map<String,Object> map){
        LabExtendInfoExample example =new LabExtendInfoExample(); 
        example.createCriteria().andIdEqualTo(id);
        List<LabExtendInfo> list =  laboratoryService.get1(example);
         
          map.put("list", list);
          return "listxiangmuxinxi2";
      }
    
    @RequestMapping("/getByLabNameAndSId/{page}")
    //  @ResponseBody
      public String getByLabNameAndSId(@PathVariable("page") Integer page,@RequestParam("labName") String labName,Map<String,Object> map){
     
        PageHelper.startPage(page, 5);
        List<LabReservation> list = labReservationService.getByLabNameAndSId(labName, "2015211163");
        PageInfo<LabReservation> pageInfo = new PageInfo<LabReservation>(list);
        map.put("pageInfo", pageInfo);
        return "listxiangmuxinxi3";
      }

}
