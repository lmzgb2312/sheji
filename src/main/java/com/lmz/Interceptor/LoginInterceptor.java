package com.lmz.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         System.out.println("进入了拦截器");
        //获取请求的RUi:去除http:localhost:8000这部分剩下的
        String uri = request.getRequestURI();
        System.err.println(uri);
        //UTL:除了login.jsp是可以公开访问的，其他的URL都进行拦截控制
        if (uri.indexOf("/login") >= 0) {
            return true;
        }
        //获取session
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("userName");
      System.err.println("userName:"+session.getAttribute("userName"));
        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
        if (obj!=null) {
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg", "您还没有登录，请先登录！");
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        return false;
        
    

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        // TODO Auto-generated method stub

    }

}
