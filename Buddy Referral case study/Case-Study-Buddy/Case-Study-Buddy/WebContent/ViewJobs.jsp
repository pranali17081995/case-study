<%@page import="com.techm.beans.Job"%>
<%@page import="java.util.List"%>
<%@page import="com.techm.dao.JobDetailsImpl"%>
<%@page import="com.techm.dao.JobDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<%
JobDetails jd = new JobDetailsImpl();
List<Job> aList = jd.display();
for(Job j:aList){
%> 
<tr>
<td><%=j.getJcode() %></td>
<td><%=j.getSkill() %></td>
<td><%=j.getYoe()%></td>
<td><%=j.getLocation() %></td>
<td><%=j.getSname() %></td>
<td><%=j.getSmail() %></td>

</tr>
	
<%}

%>
</table>

</body>
</html>