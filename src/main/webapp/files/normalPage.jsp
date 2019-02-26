<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/JavaScript" src="../js/jquery-1.9.1.min.js"></script>
<script  type="text/javascript">

$(function(){
	$("#_btn").click(function(){
		//alert("ok")
		var v=$("#cp").val();
		var z=/^[1-9][0-9]*$/;
		if(z.test(v)){
			if(v<=${pageInfo.pageAll} && v>=1){
				window.open("${pageInfo.action}?currentPage="+v,"_self")
			}else{
				alert("请输入正确页码")
				return
			}
			
		}else{
			alert("请输入正确页码")
			return
		}
		
		
	})	
})


</script>
  <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                       <input type="hidden"    name="long" value="${pageInfo.pageAll }"></input> 
                       <input type="hidden"    name="long1" value="${pageInfo.currentPage}"></input>            
                <td width="50%">共 <span class="right-text09" >${pageInfo.pageAll }</span> 页 | 共 <span class="right-text09">${pageInfo.recordAll }</span> 条 |第 <span class="right-text09">${pageInfo.currentPage}</span> 页</td>
                
                <td width="49%" align="right">[<a href="${pageinfo.action }?currentPage=1" class="right-font08">首页</a> | 
                <c:if test="${pageInfo.currentPage>1 }">
                <a href="${pageinfo.action }?currentPage=${pageInfo.pageAll-1 }" class="right-font08">上一页</a> | 
                </c:if>
                 <c:if test="${pageInfo.pageAll>pageInfo.currentPage }">
                <a href="${pageinfo.action }?currentPage=${pageInfo.currentPage+1 }" class="right-font08">下一页</a> | 
                 </c:if>
                <a href="${pageinfo.action }?currentPage=${pageInfo.pageAll }" class="right-font08">末页</a>] 转至：</td>
                <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                
                    <tr>
                      <td width="1%"><input name="currentPage" type="text" class="right-textfield03" size="1" id="cp"/></td>
                      
                      <td width="87%"><input name="Submit23222" type="button" class="right-button06" value=" "     id="_btn"/></td>
                     
                    </tr>
                    
                </table></td>
              </tr>
          </table></td>
        </tr>
      </table>