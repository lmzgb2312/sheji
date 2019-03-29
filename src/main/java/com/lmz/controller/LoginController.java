package com.lmz.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmz.service.LoginService;
import com.lmz.vo.LoginPermissions;

@Controller
@RequestMapping("/login")
public class LoginController {
    
    
    @Autowired
    private LoginService loginService;
    
    @RequestMapping("/log")
    @ResponseBody
    public Integer login(@RequestParam("userName") String userName,@RequestParam("password") String password,HttpSession session){
        System.out.println("进入登录方法");
       if(session.getAttribute("userName")!=null) {
           return 4;
       }
        List<LoginPermissions> list = loginService.getOne(userName);
        if(list.size() == 0){
            return 1;
        }else if(list.get(0).getPassword().equals(password)){
            session.setAttribute("userName", list.get(0).getUsername());
            session.setAttribute("password", list.get(0).getPassword());
            session.setAttribute("personName",list.get(0).getPersonName());
            session.setAttribute("personRight", list.get(0).getPersonRight());
            return 2;
        }
        return 3;
    }
    
    @RequestMapping("/out")
    public String out(HttpServletRequest request,HttpServletResponse response){
        
         System.out.println("进入了退出方法");
         HttpSession session = request.getSession();
         System.out.println(session.getAttribute("userName"));
         session.removeAttribute("userName");
     
        return "redirect:../login.jsp";
        
    }

}
