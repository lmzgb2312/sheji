<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>东北林业大学实验室预约管理平台</title>
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


function link(){

    document.getElementById("fom").action="../course/save";
   document.getElementById("fom").submit();
    alert('保存成功！');
}



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
					    <td width="41%"><input name="libname" class="text" style="width:250px" type="text" size="40" />
				        <span class="red"> *</span></td>
<!-- 					    <td align="right" width="19%">预计学时:</td> -->
<!-- 					    <td width="27%"><input name="courseHour" id="Input22" class="text" style="width:154px" /></td> -->
					    </tr>
<!-- 					  <tr> -->
<!-- 					    <td nowrap align="right">课程开始及结束时间:</td> -->
<!-- 					    <td><input name="startTime" id="" class="text" style="width:154px" /></td> -->
<!-- 					    <td align="right">开课专业:</td> -->
<!-- 					    <td><input name="profession" id="major" class="text" style="width:154px" /></td> -->
<!-- 					  </tr> -->
					   <tr>
					    <td nowrap align="right">负责人:</td>
					    <td><input name="libteacher" id="libteacher" class="text" style="width:154px" /></td>
<!-- 					    <td align="right">开课学期:</td> -->
<!-- 					    <td><select name="semester" > -->
<!--                           <option  selected="selected">==请选择==</option> -->
<!--                           <option selected="selected">1</option> -->
<!--                           <option>2</option>                          -->
<!--                           <option>3</option> -->
<!--                           <option>4</option> -->
<!--                           <option>5</option> -->
<!--                           <option>6</option> -->
<!--                           <option>7</option> -->
<!--                           <option>8</option> -->
<!--                         </select></td> -->
					  </tr>
					  <tr>
					    <td nowrap align="right" height="120px">实验室说明:</td>
					    <td colspan="3"><textarea id="textarea" name="libinstruction" rows="5" cols="80"></textarea></td>
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
			<input type="button" name="Submit" value="保存" class="button" onclick="link();"/>　
			
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
