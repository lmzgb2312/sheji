<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>东北林业大学实验室预约管理平台</title>
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
<script type="text/JavaScript">

</script>
<link href="../../css/style.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.min.js"></script>
</head>
<SCRIPT language=JavaScript>




$(function(){

	
	
	
	$("#btn").click(function(){
	    document.getElementById("fom").action="../../course/getExtendOne/1";
		document.getElementById("fom").submit();
	})
	
	
	
	  $("#_btn").click(function(){
	        /**获取下面选中的checkbox*/
	        var checkedbox = $("input[id^='box_']:checked");
	        if(checkedbox.length == 0){
	            alert("请选择要删除的实验室！！！");
	        }else{
	            if(confirm("你确定要删除吗？？？")){
	                   /**
	                                                  如下面，如果调用map方法，
	                                                   会把函数里面的返回值作为jquery对象--res返回
	                                                  注意，这里的res.toArray()等同于res.toArray().join(",");
	                                                它默认就是这样做的呢，这个需要记住嘛
	                   */
	               var res = checkedbox.map(function(){
	                     return this.value;
	                 });
	                     var array=new Array()
	                     array=res.toArray().join(",");
	                     $.ajax({
	                              url: '../../course/deleteAmounts',
	                              type: 'post',
	                              data: {'array':array},
	                            //  traditional:true,//用传统方式序列化数据
	                              success:function(result){
	                                    alert(result)
	                                    location.reload();
	                              }

	                })                                 
	              
	          }
	        }
	    });
})


function yuyue(){
		 $.ajax({
	        url: '../../reservation/save',
	        type: 'post',
	        data: {studentId:2015211162,
	        	   labId:$("#labId").val(),
	        	   labName:$("#labName").val(),
	        	   labTeacher:$("#labTeacher").val(),
	        	   labMax:$("#labMax").val(),
	        	   labCurrent:$("#labCurrent").val(),
	        	   startTime:$("#startTime").val(),
	        	   endTime:$("#endTime").val(),
	        	   studentName:111
	        },
	        success:function(result){
	              if(result == 0){
	            	  alert("预约成功")
	            	  location.reload();
	              }else if(result == 1){
	            	  alert("你已经预约过该实验室")
	            	  location.reload();
	              }else if(result == 2){
	            	  alert("该实验室预约人数已满")
	            	  location.reload();
	              }
	        }

	    })                                 
		
}


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
    document.getElementById("fom").action="../../course/getName";
   document.getElementById("fom").submit();
}

</SCRIPT>

<body>
<form name="fom" id="fom" method="post" action="">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" background="../../images/nav04.gif">
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
<!-- 			  <td width="21"><img src="../../images/ico07.gif" width="20" height="18" /></td> -->
<!-- 			  <td width="538">查看内容：按实验室名称： -->
<!--                  <input name="_labExtendName" id="_labExtendName" class="text" style="width:154px" /> -->
<!-- <input name="Submit4" type="button" class="right-button02" id="btn" value="查 询" /></td> -->
<!-- 			   <td width="144" align="left"><a href="#" onclick="sousuo()"> -->
<!-- 			     <input name="Submit3" type="button" class="right-button07" value="高级搜索" /> -->
<!-- 			   </a></td>	 -->
		    </tr>
          </table></td>
        </tr>
    </table></td></tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
<!--           	 <tr> -->
<!--                <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span> -->
<!-- 	              <input name="_btn" type="button" class="right-button08" id="_btn" value="删除所选实验室" /> -->
<!-- 	              <input name="Submit2" type="button" class="right-button08" value="添加预约实验室" onclick="link();"/></td> -->
<!--           	 </tr> -->
              <tr>
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="7" align="center" style="font-size:16px">实验室详细列表</td>
                  </tr>
                <tr>
				    <td width="10%" height="20" align="center" bgcolor="#FFFFFF">实验室名称</td>
                    <td width="10%" align="center" bgcolor="#FFFFFF">任课老师</td>
                     <td width="25%" height="20" align="center" bgcolor="#FFFFFF">开始时间</td>
                      <td width="25%" height="20" align="center" bgcolor="#FFFFFF">结束时间</td>
                       <td width="10%" height="20" align="center" bgcolor="#FFFFFF">允许人数</td>
                        <td width="10%" height="20" align="center" bgcolor="#FFFFFF">当前人数</td>
                            <td width="30%" height="20" align="center" bgcolor="#FFFFFF">操作</td>
                    </tr>
                 	<tr>
				    <td height="10" align="center" bgcolor="#FFFFFF">${list[0].labExtendName}</td>
                    <td height="10" align="center" bgcolor="#FFFFFF">${list[0].labExtendTeacher}</td>
                    <td height="25" align="center" bgcolor="#FFFFFF">${list[0].labExtendStartTime}</td>
                    <td height="25" align="center" bgcolor="#FFFFFF">${list[0].labExtendEndTime}</td>
                    <td height="10" align="center" bgcolor="#FFFFFF">${list[0].labExtendAmount}</td>
                    <td height="10" align="center" bgcolor="#FFFFFF">${list[0].labExtendCurrent}</td>
            <input name="labId" id="labId" type="hidden" style="width:154px" value="${list[0].id}"/>
            <input name="labName" id="labName" type="hidden" style="width:154px" value="${list[0].labExtendName}"/>
            <input name="labTeacher" id="labTeacher" type="hidden" style="width:154px" value="${list[0].labExtendTeacher}"/>
            <input name="startTime" id="startTime" type="hidden" style="width:154px" value="${list[0].labExtendStartTime}"/>
            <input name="endTime" id="endTime" type="hidden" style="width:154px" value="${list[0].labExtendEndTime}"/>
            <input name="labMax" id="labMax" type="hidden" style="width:154px" value="${list[0].labExtendAmount}"/>
            <input name="labCurrent" id="labCurrent" type="hidden" style="width:154px" value="${list[0].labExtendCurrent}"/>
                       <td height="30" align="center" bgcolor="#FFFFFF">
                      <a href="javascript:void(0)" onClick="yuyue()" >预约</a>
				    </td>
                    </tr>
                    
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">

          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>