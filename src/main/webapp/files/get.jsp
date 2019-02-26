<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>


<body>
<table>
 <c:forEach items="${get}" var="g" varStatus="status">
   <c:if test="${(status.count-1)%3==0}"   var="test" scope="page">
   <tr>
   </c:if>
       <td><input type="checkbox" id="_name" name="_name" value="${g.empid}"><span>${g.empname }</span></td>   
 </c:forEach>
</table>
</body>
</html>