<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统 by www.eyingda.com</title>
<link rel="stylesheet" rev="stylesheet" href="../css/style.css" type="text/css" media="all" />


<script language="JavaScript" type="text/javascript">
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

<body class="ContentBody">

  <form action="update.do" method="post" name="form"  >
<input type="hidden" name="companyID" value="<c:out value="${company.companyID }"></c:out>"> 
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >客户基本信息录入</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr><td align="left">
		<input type="submit" name="Submit" value="保存" class="button" onclick="alert('保存成功！');"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/>
		</td></tr>
				<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>客户信息</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
<%-- 					   <c:forEach items="${company }" var="l"> --%>
					 
					  <tr>
					    <td nowrap align="right" width="15%">公司名称:</td>
					    <td width="35%"><input name='companyName' type="text" class="text" style="width:154px" value="<c:out value="${company.companyName }"></c:out>" />
				        <span class="red">*</span></td>
					    <td width="16%" align="right" nowrap="nowrap">联系人:</td>
					    <td width="34%"><input class="text" name='linkMan' style="width:154px" value="<c:out value="${company.linkman }"></c:out>"></td>
					  </tr>
					    
					    
					  <tr>
					    <td nowrap="nowrap" align="right">联系电话:</td>
					    <td><input class="text" name='tel' style="width:154px" value="<c:out value="${company.tel }"></c:out>"/></td>
					    <td align="right">联系地址:</td>
					    <td><input class="text" name='address' style="width:154px" value='<c:out value="${company.address }"></c:out>'/></td>
					  </tr>
					 
					  <tr>
					    <td align="right">公司背景:</td>
					    <td colspan="3"><textarea name="descript" cols="100" rows="8" ><c:out value="${company.descript }"></c:out></textarea></td>
					    </tr>
<%-- 					    </c:forEach> --%>
					  </table>
			  <br />
				</fieldset>			</TD>
			
		</TR>
		

		
		
		
		</TABLE>
	
	
	 </td>
  </tr>
  
  
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="submit" name="Submit" value="保存" class="button" onclick="alert('保存成功！');"/>　
			
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