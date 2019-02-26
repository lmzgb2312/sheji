<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统 by www.eyingda.com</title>
<link rel="stylesheet" rev="stylesheet" href="../css/style.css" type="text/css" media="all" />


<script language="JavaScript" >
function tishi()
{
  var a=confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
  if(a!=true)return false;
  window.open("冲突页.htm","","depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}

function check()
{
document.getElementById("aa").style.display="";
}	




</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script type="text/javascript">

$(function(){
  	
	//alert("ok")	
 	$("#get_").click(function(){
 			$("#div1").fadeIn()
		
 	})
 	$("#_close").click(function(){
 			$("#div1").fadeOut()
		
 	})
	$("#div2").load("GetServlet",function(){
		$("input[name='_name']").click(function(){
			var v=[];
			var vv=[];
			var v1=$("input:checked")
			v1.each(function(){
				v.push($(this).next().html())
				vv.push($(this).val())
			})
			//alert(vv)
				$("#get_").val(v.join(","))	
				$("#hh").val(vv.join(","))
			//	alert($("#hh").val())
				
				
		})
	
	}) 
})


function send(){
	if($("#_title").val()!=""  && $("get_").val()!="" && $("_content").val()!=""){
		document.getElementById("form").submit();
		alert("发送成功")
	}else{
		alert("请将信息填写完整")
	}
}
</script>

<body class="ContentBody">

  <form action="message.do" method="post"  name="form" id="form">
  
<div class="MainDiv">


<div id="div1" style="display:none;position:absolute;left:175px;top:175px;background-color:blue;width:250px;height:250px">
<div style="float:right;">
    <input type="button" id="_close" value="关闭"></input>
</div>
<div id="div2" style="clear:both">

</div>

</div>
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >新建信息</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr><td align="left">
		<input type="button" name="Submit" value="发送" class="button" onclick="send();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/>
		</td></tr>
		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>新建信息</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					    
					    
					  <tr>
					    <td nowrap align="right" width="11%">消息标题:</td>
					    <td width="27%"><input name='txt3' type="text" class="text" style="width:154px" value="" id="_title"/></td>
				        	
					    <td align="right" width="25%">&nbsp;</td>
					    <td width="37%">&nbsp;</td>
					    </tr>
					    
					    
					    
					  <tr>
					    <td width="11%" align="right" nowrap >接收者:</td>
					    <input type="hidden" name="hh" id="hh" value="">
					    <td colspan="3"><input name='txt32' type="text" class="text" style="width:450px;" size="20" value="" id="get_"/>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="select1" id="select1">
							<option selected="selected">==选择==</option>
							<option>低级</option>
							<option>中级</option>
							<option>高级</option>
						</select></td>
					    </tr>
					  
					  <tr>
					    <td  width="11%" nowrap align="right">信息内容:</td>
					    <td colspan="3"><textarea name="textarea" cols="100" rows="20" id="_content"></textarea></td>
					    </tr>
					  </table>
			  <br />
				</fieldset>			</TD>
			
		</TR>
		
		

		
		
		
		</TABLE>
	
	
	 </td>
  </tr>
  
  
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="button" name="Submit" value="发送" class="button" onclick="send();" id="_send1"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
		</TR>
		</TABLE>
	
	
	 </td>
  </tr>
  
  
  
  </table>

</div>
</form>
</body>
</html>