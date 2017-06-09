<%@page import="com.techm.dao.JobDetailsImpl"%>
<%@page import="com.techm.dao.JobDetails"%>
<%@page import="com.techm.beans.budy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="UpdateServlet">
		<%
			HttpSession session1=request.getSession(); 
		String name1=request.getParameter("name");
		session1.setAttribute("name1", name1);
		JobDetails b=new JobDetailsImpl();
		budy k=b.getbuddy(name1);
		%>

		<%
			if (k.getStatus().equalsIgnoreCase("new")){
		%>
		<select name="status">
			<option value="Selected">select</option>
			<option value="Not Selected">reject</option>
			<option value="In process">In process</option>
		</select>
		<%
			}
		%>
		<%
		{
		%>
		<select name="status">
			<option value="Selected">select</option>
			<option value="Not Selected">reject</option>
			<option value="In process">In process</option>
		</select>
		<%
			}
		%>
		<input type="submit" />
	</form>
</body>
</html>