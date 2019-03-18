package com.lmz.controller;

import java.util.ArrayList;
import java.util.Arrays;
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
import com.lmz.service.LabDetailService;
import com.lmz.service.LaboratoryService;
import com.lmz.vo.LabDetail;
import com.lmz.vo.LabDetailExample;
import com.lmz.vo.LabExtendInfo;
import com.lmz.vo.LabExtendInfoExample;
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
    @ResponseBody
    public String update(LaboratoryArrangement record) {

        System.out.println("进入修改方法");
        return labService.update(record).toString();
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
    
    
    @RequestMapping("/queryOne/{id}")
    public String queryOne(@PathVariable("id") Integer id,Map<String, Object> map){
        System.out.println("进入了queryOne方法");
        LaboratoryArrangement record = null;
        record = labService.queryOne(id);
        map.put("record", record);
        
        return "editrenwu2";
    }
    
    
    @RequestMapping("/queryInfo/{id}")
    public String queryInfo(@PathVariable("id") Integer id ,Map<String, Object> map){
        System.out.println("进入了queryOne方法");
//        Integer page = 1;
//        PageHelper.startPage(page, 5);
        LaboratoryArrangement record1 = labService.queryOne(id);
        List<LabExtendInfo> record = labService.queryInfo(id);
//        PageInfo<LabExtendInfo> pageInfo = new PageInfo<LabExtendInfo>(list);
        map.put("record", record);
        map.put("record1", record1);
        
        
        if(record.size()==0){
            return "listrenwumingxi3";
        }
            return "listrenwumingxi2";
        
        
    }

    
    
    @RequestMapping(value="/deleteAmounts",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteAmounts(@RequestParam("array") String array){
        System.out.println(array);
       String[] arr = array.split(",");
       System.out.println(Arrays.toString(arr));
       for(int i = 0 ; i<arr.length ; i++){
           labService.delete(Integer.parseInt(arr[i]));
       }
       return "删除成功";
    }
    
    
    @RequestMapping("/getPageOne/{page}")
    //@ResponseBody
    public String getPageOne(@PathVariable("page") Integer page, Map<String, Object> map, LaboratoryArrangementExample example,
                             @RequestParam("labName") String labName) {
      
        System.out.println("进入了getPageOne方法");
        PageHelper.startPage(page, 5);
        example.createCriteria().andLabNameEqualTo(labName);
        List<LaboratoryArrangement> list = labService.get(example);
        PageInfo<LaboratoryArrangement> pageInfo = new PageInfo<LaboratoryArrangement>(list);
        map.put("pageInfo", pageInfo);

        return "listrenwu4";

    }
    
    
    @RequestMapping("/getExtendAll/{page}")
    //@ResponseBody
    public String getExtendAll(@PathVariable("page") Integer page,Map<String, Object> map,LabExtendInfoExample example) {
      
        System.out.println("进入了getExtendAll方法");
        PageHelper.startPage(page, 5);
        List<LabExtendInfo> list = labService.getExtendAll(example);
        PageInfo<LabExtendInfo> pageInfo = new PageInfo<LabExtendInfo>(list);
        map.put("pageInfo", pageInfo);

        return "listxiangmuxinxi";

    }
    
    
    @RequestMapping("/getExtendOne/{page}")
    //@ResponseBody
    public String getExtendOne(@PathVariable("page") Integer page, @RequestParam("_labExtendName") String labExtendName,Map<String, Object> map,LabExtendInfoExample example) {
      
        System.out.println("进入了getExtendAll方法");
        PageHelper.startPage(page, 5);
        if(labExtendName!=null){
            example.createCriteria().andLabExtendNameEqualTo(labExtendName) ;
        }
        List<LabExtendInfo> list = labService.getExtendAll(example);
        PageInfo<LabExtendInfo> pageInfo = new PageInfo<LabExtendInfo>(list);
        map.put("pageInfo", pageInfo);

        return "listxiangmuxinxi";

    }
}
