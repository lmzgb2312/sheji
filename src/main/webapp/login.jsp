<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta content="always" name="referrer">
<title>东北林业大学实验室预约管理平台</title>
<link href="css/login.css" type="text/css"  rel="stylesheet" />
 <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script>
function m(){
	if(fom.userName.value == "" || fom.password.value == ""){
		
		alert("用户名或密码不能为空")
		
		
	}else{
		 $.ajax({
		        //几个参数需要注意一下
		            type: "POST",//方法类型
// 		            dataType: "text",//预期服务器返回的数据类型
		            url: "login/log" ,//url
		            data: {
		            	userName:$("input[name='userName']").val(),
		            	password:$("input[name='password']").val()
		            },
		            success : function(result) {
		                if (result=="2") {
		                  alert("登录成功")
		                  window.open("index.html");
		                } else if(result == "1"){
		                  alert("该账号不存在")
		                }else if(result == "3"){
		                	alert("用户名或密码错误")
		                }else if(result == 4){
		                	alert("请不要重复登录")
		                }
		            },
		            error : function(e) {
		            	console.log();
		                alert("系统异常");
		            }
		        });
	
	}
}
$(function()
{
	windowSize();
	scrollBanner();
})
$(window).resize(function()
{
	windowSize();
});
function windowSize()
{
	if($(window).height() < 640)
	{
		$('#footer').css('position','static');
	}
	else
	{
		$('#footer').css('position','fixed');
	}
}

//轮播
var iNow = 1;
var scrollTimer = null;
function scrollBanner()
{
	clearInterval(scrollTimer);
	scrollTimer = setInterval(auto,4000);
	function auto()
	{
		if(iNow == $('.banner li').length)
		{
			iNow = 0;
		}
		scrollRun(iNow);
		iNow ++;
	}
	
	function scrollRun(index)
	{
		$('.banner li').fadeOut(1000);
		$('.banner li').eq(index).fadeIn(1000);
	}
}

$(function(){
	
})
</script>
</head>
<body>
<!-- <div id="header"> -->
<!-- 	<a class="fl" href="#"><img width="50" height="50" src="images/log.jpg" /></a> -->
<!-- </div> -->

<form action="" name="fom" id="fom" method="post">
<div id="wrap">
	<div class="fl">
    	<ul class="banner">
        	<li class="active"><img src="images/b11.jpg" /></li>
        	<li><img src="images/b22.jpg" /></li>
        	<li><img src="images/b33.jpg" /></li>
        	<li><img src="images/b44.jpg" /></li>
        </ul>
    </div>
    	<div class="fl">
<!--     	<ul class="banner"> -->
<!--         	<li class="active"><img src="images/b1.png" /></li> -->
<!--         	<li><img src="images/b2.png" /></li> -->
<!--         	<li><img src="images/b3.png" /></li> -->
<!--         </ul> -->
    </div>
    <div class="login fr">
    	<div class="login_1"><img src="images/log.jpg" />实验室预约管理平台</div>
        <div class="login_2">
        	<div class="login_3">
                <input class="username" type="text" placeholder="用户名" id="userName" name="userName"/>
                <input type="password" id="password" placeholder="密码" name="password"/>
<!--                 <input class="yzm fl" type="text" placeholder="验证码" /> -->
<!--                 <div class="yzm_img fl"><img src="images/yzm.png" /></div> -->
<!--                 <a class="hyz fl" href="#">换一张</a> -->
                <div class="clear"></div>
                <div class="login_4">
<!--                     <label> -->
<!--                         <input type="checkbox" /> -->
<!--                         <span>记住账户</span> -->
<!--                     </label> -->
                    <a href="#" class="fr">忘记密码</a>
                </div>
            </div>
            <!-- <a href="html/index.html" class="login_5">登&nbsp;&nbsp;&nbsp;&nbsp;录</a> -->
        </div>
<!--         <a href="javascript:;" class="login_7" onclick="window.open('index.html')">登　　录</a> -->
        <a href="javascript:;" class="login_7" onclick="m();">登　　录</a>
<!--         <input type="button" class="login_7" value="登录" onclick="login()"> -->
    </div>
</div>
</form>
<!-- <div id="footer"> -->
<!-- 	<div class="footer_2">东北林业大学实践教学信息管理平台</div> -->
<!-- </div> -->
</body>
</html>
