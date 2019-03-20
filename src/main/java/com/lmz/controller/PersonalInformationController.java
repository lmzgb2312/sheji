package com.lmz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmz.service.PersonalInformationService;
import com.lmz.vo.PersonalInformation;

@Controller
@RequestMapping("/person")
public class PersonalInformationController {
    
    
    @Autowired
    private PersonalInformationService personalInformationService;
    
    
    
    @RequestMapping("/query/{studentId}")
    public String queryOne(@PathVariable("studentId") String studentId,Map<String,Object> map){
        
       PersonalInformation record = personalInformationService.queryOne(studentId);
        
        map.put("result", record);
        
        return "listgerenxinxi";
    }

}
