<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="myTags" tagdir="/WEB-INF/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>�x�ȥ\��</title>
</head>
<body style="background-color:powderblue;">
<myTags:Header/>
<form action="./Insert">

<h4 style="color:deeppink;">ID Card:<input type="text" name="myID" ><br></h4>
<h4 style="color:red;">Save Money:<input type="text" name="myMoney" ><br></h4>
<input type="submit" name="submit" value="�s�W���"><br> 

</form>

<%@ include file ="NewInput_Footer.jsp"%><br>
<a href="./Home.jsp">�^����</a>
</body>
</html>