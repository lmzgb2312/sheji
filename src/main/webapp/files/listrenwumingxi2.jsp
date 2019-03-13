<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
          <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>实验室预约</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.tabfont01 {	
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}
.font051 {font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}
.font201 {font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="../../css/css.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.min.js"></script>
<script type="text/JavaScript">

</script>
<link href="../../css/style.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}

function link(){
    document.getElementById("fom").action="xiangmu.htm";
   document.getElementById("fom").submit();
}

</SCRIPT>

<body>
<form name="fom" id="fom" method="post" action="">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
 
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="../../images/nav04.gif">
          
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="679" align="left"><a href="#" onclick="sousuo()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a></td>	
		  </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
	         
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

	              <tr class="CTitle" >
                    	<td height="22" colspan="7" align="center" style="font-size:16px">实验室详情</td>
                  </tr>
                  <tr>
				    <td width="10%" height="20" align="center" bgcolor="#FFFFFF">实验室名称</td>
                    <td width="10%" align="center" bgcolor="#FFFFFF">任课老师</td>
                     <td width="15%" height="20" align="center" bgcolor="#FFFFFF">开始时间</td>
                      <td width="15%" height="20" align="center" bgcolor="#FFFFFF">结束时间</td>
                       <td width="10%" height="20" align="center" bgcolor="#FFFFFF">允许人数</td>
                        <td width="10%" height="20" align="center" bgcolor="#FFFFFF">当前人数</td>
                          <td width="30%" height="20" align="center" bgcolor="#FFFFFF">说明</td>
                    </tr>
             <c:forEach items="${record}" var="b">
					<tr>
				    <td height="10" align="center" bgcolor="#FFFFFF">${b.labExtendName}</td>
                    <td height="10" align="center" bgcolor="#FFFFFF">${b.labExtendTeacher}</td>
                    <td height="15" align="center" bgcolor="#FFFFFF">${b.labExtendStartTime}</td>
                    <td height="15" align="center" bgcolor="#FFFFFF">${b.labExtendEndTime}</td>
                    <td height="10" align="center" bgcolor="#FFFFFF">${b.labExtendAmount}</td>
                    <td height="10" align="center" bgcolor="#FFFFFF">${b.labExtendCurrent}</td>
                    <td height="30" align="center" bgcolor="#FFFFFF">${record1.labInstruction}</td>
                    </tr>
              </c:forEach>
                
                </table></td>
              </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
<!--           <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08"> -->
<!--               <tr> -->
<%--               <td width="50%">共 <span class="right-text09">${pageInfo.total}</span> 条记录 | 共 <span class="right-text09">${pageInfo.pages}</span> 页 | 第 <span class="right-text09">${pageInfo.pageNum}</span> 页</td> --%>
<%--                 <td width="49%" align="right">[<a href="${pageInfo.firstPage }" class="right-font08">首页</a> | <a href="${pageInfo.prePage }" class="right-font08">上一页</a> | <a href="${pageInfo.nextPage }" class="right-font08">下一页</a> | <a href="${pageInfo.lastPage }" class="right-font08">末页</a>] </td> --%>
<!--                 <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0"> -->
<!--                     <tr> -->
<!--                       <td width="1%"><input name="textfield3" type="text" class="right-textfield03" size="1" /></td> -->
<!--                       <td width="87%"><input name="Submit23222" type="submit" class="right-button06" value=" " /> -->
<!--                       </td> -->
<!--                     </tr> -->
<!--                 </table></td> -->
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
