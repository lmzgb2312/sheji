<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>东北林业大学实验室预约管理平台</title>
<link rel="stylesheet" rev="stylesheet" href="../css/style.css" type="text/css" media="all" />
<script src="<%=request.getContextPath() %>/js/layDate-v5.0.9/laydate/laydate.js"></script>
 <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.min.js"></script>
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


function link(){

//     document.getElementById("fom").action="../course/save";
//     document.getElementById("fom").submit();
   //  alert('保存成功！');
	if(fom.labDetailName.value=="" || fom.labDetailTeacher.value=="" || fom.labDetailInstruction.value=="" ){
		
		alert("请将信息填写完整")
		
		
	}else{
		 $.ajax({
		        //几个参数需要注意一下
		            type: "POST",//方法类型
		            dataType: "text",//预期服务器返回的数据类型
		            url: "../detail/save" ,//url
		            data: $('#fom').serialize(),
		            success : function(result) {
		                if (result=="0") {
		                  alert("保存成功")
		                  location.reload();
		                } else {
		                  alert("该实验室已存在，请重新输入")
		                }
		            },
		            error : function(e) {
		                alert("系统异常");
		            }
		        });
	
	}
   
}

// //时间选择器
// laydate.render({
//   elem: '#labStartTime'
//   ,type: 'datetime'
// });

// //时间选择器
// laydate.render({
//   elem: '#labEndTime'
//   ,type: 'datetime'
// });


</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>

<body class="ContentBody">
  <form action="" method="post"  name="fom" id="fom"  >
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >实验室添加</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr><td align="left">
		<input type="button" name="Submit" value="保存" class="button" onclick="link();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/>
		</td></tr>

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>实验室添加</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					  <tr>
					    <td nowrap align="right" width="13%" >实验室名称:</td>
					    <td width="41%"><input name="labDetailName" id="labDetailName" class="text" style="width:250px" type="text" size="40" />
				        <span class="red"> *</span></td>
					    </tr>
					   <tr>
					    <td nowrap align="right">负责人:</td>
					    <td><input name="labDetailTeacher" id="labDetailTeacher" class="text" style="width:154px" />
					    <span class="red"> *</span></td>
					  </tr>
					  <tr>
					    <td nowrap align="right" height="120px">实验室说明:</td>
					    <td colspan="3"><textarea id="labDetailInstruction" name="labDetailInstruction"   rows="5" cols="80"></textarea></td>
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
			<input type="button"  name="Submit" value="保存" class="button" onclick="link();"/>　
			
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
