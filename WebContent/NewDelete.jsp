<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="myTags" tagdir="/WEB-INF/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>�R��������</title>
</head>
<body style="background-color:powderblue;">
<myTags:Header03/>
	<form action="./Delete">
		
 		<h4 style="color:saddlebrown;">Transaction NO.:  <input  type="text" name="myNO"> <br> </h4>
			 <input type="submit" name="submit"	value="�R�����">
	</form>
	<%@ include file ="NewDelete._Footer.jsp"%><br>
	<a href="./Home.jsp">�^����</a>
</body>
</html>