<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>刪除儲值金額成功</title>
</head>
<body style="background-color:powderblue;">

<%

	String result =(String)session.getAttribute("MyResponsemessage");
	System.out.println(result);
	if(result!=null)
	{
		out.print(result);
	}
	else
	{
		out.print("陌生人");
	}
	
%>
<br/>
<a href="./NewDelete.jsp">刪除下一筆交易</a>
<br/>
<a href="./Home.jsp">回首頁</a>
</body>
</html>