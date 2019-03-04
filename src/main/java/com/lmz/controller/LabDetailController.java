package com.lmz.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmz.service.LabDetailService;
import com.lmz.vo.LabDetail;
import com.lmz.vo.LabDetailExample;

@Controller
@RequestMapping("/detail")
public class LabDetailController {
    
    @Autowired
    private LabDetailService labDetailService;
    
    @RequestMapping("/save")
    @ResponseBody
    public String save(LabDetail record,Map<String, Integer> map) {
       
        System.out.println("进入增加方法");
        Integer i = labDetailService.save(record);
        System.out.println(i);
        return i.toString();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {

        System.out.println("进入删除方法");
        labDetailService.delete(id);
        return "redirect:/detail/get/1";
    }

    @RequestMapping("/update")
    //@ResponseBody
    public String update(LabDetail record,RedirectAttributes attr) {

        System.out.println("进入修改方法");
        
        Integer i = labDetailService.update(record);
        System.out.println(i);
        Integer id = record.getLabDetailId();
      
       return "redirect:/detail/queryOne/"+id+"";
    }

    @RequestMapping("/get/{page}")
    // @ResponseBody
    public String get(@PathVariable("page") Integer page, Map<String, Object> map, LabDetailExample example) {
      
        System.out.println("进入了get方法");
        PageHelper.startPage(page, 5);
        List<LabDetail> list = labDetailService.get(example);
        PageInfo<LabDetail> pageInfo = new PageInfo<LabDetail>(list);
        map.put("pageInfo", pageInfo);

        return "listrenwu2";

    }
    
    @RequestMapping("/getPageOne/{page}")
    //@ResponseBody
    public String getPageOne(@PathVariable("page") Integer page, Map<String, Object> map, LabDetailExample example,
                             @RequestParam("labDetailName") String labDetailName) {
      
        System.out.println("进入了getPageOne方法");
        PageHelper.startPage(page, 5);
        example.createCriteria().andLabDetailNameEqualTo(labDetailName);
        List<LabDetail> list = labDetailService.get(example);
        PageInfo<LabDetail> pageInfo = new PageInfo<LabDetail>(list);
        map.put("pageInfo", pageInfo);

        return "listrenwu3";

    }
    
    @RequestMapping("/queryOne/{id}")
    public String queryOne(@PathVariable("id") Integer id,Map<String, Object> map){
        System.out.println("进入了queryOne方法");
        LabDetail record = null;
        record = labDetailService.queryOne(id);
        map.put("record", record);
        
        return "editrenwu";
    }
    
    @RequestMapping("/queryDetail/{id}")
    public String queryDetail(@PathVariable("id") Integer id,Map<String, Object> map){
        System.out.println("进入了queryDetail方法");
        LabDetail record = null;
        record = labDetailService.queryOne(id);
        map.put("record", record);
        
        return "listrenwumingxi";
    }
    
    @RequestMapping(value="/deleteAmounts",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteAmounts(@RequestParam("array") String array){
        System.out.println(array);
       String[] arr = array.split(",");
       System.out.println(Arrays.toString(arr));
       for(int i = 0 ; i<arr.length ; i++){
           labDetailService.delete(Integer.parseInt(arr[i]));
       }
       return "删除成功";
    }


}
