<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="myTags" tagdir="/WEB-INF/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>修改交易資料</title>
</head>
<body style="background-color:powderblue;">
<myTags:Header02/>
	<form action="./Update">
		
 		<h4 style="color:mediumblue;">Transaction NO.:  <input  type="text" name="myNO"> <br> </h4>
		<h4 style="color:deepskyblue;">ID Card:  <input  type="text" name="myID"> <br> </h4>
		<h4 style="color:royalblue;">Save Money:<input type="text"	name="myMoney"> <br></h4>
			 <input type="submit" name="submit"	value="修改資料">
	</form>
	<%@ include file ="NewUpdate_Footer.jsp"%><br>
	<a href="./Home.jsp">回首頁</a>
</body>
</html>