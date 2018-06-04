<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="myTags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>查詢交易明細</title>
</head>
<body style="background-color:powderblue;">
<myTags:Header04/>
<hr color=gray>
<%

	String result =(String)session.getAttribute("MyResponsemessage");
	
	System.out.println(result);
	String replace = result.replace("[","");
	System.out.println(replace);
	String replace1 = replace.replace("]","");
	System.out.println(replace1);
	List<String> myList = new ArrayList<String>(Arrays.asList(replace1.split(",")));
	
	for (String user : myList) {
				out.println(user);
				%><p><%
				}
%>
<br>
<a href="./Home.jsp">回首頁</a>
</body>
</html>