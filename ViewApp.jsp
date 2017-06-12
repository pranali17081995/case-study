<%@page import="com.techm.beans.budy"%>
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
<link href="StyleSheet.css" rel='stylesheet' type='text/CSS'>
<title>VIEW DETAILS</title>
</head>
<style>
h1 {
       color: white;
    text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}
img {
    display: inline-block;
}
table, td, tr {
    border: 1px solid black;
}

table {
    border-collapse: collapse;
    width: 100%;
}

td {
    height: 50px;
}
</style>
<body background="t2.jpg">
<form action="SpocPage.jsp" >
<h1 align="center">APPLIED JOB APPLICATIONS</h1>
<table bgcolor="BurlyWood " border="1" align="center">
<%JobDetails jd = new JobDetailsImpl();
List<budy> aList = jd.getdetails();
%>
<tr>

<td><b>JOB CODE</td><td><b>NAME</td><td><b>SKILL</td><td><b>EXP</td><td><b>LOCATION</td><td><b>MAIL</td><td><b>STATUS</td>
</tr>
<% 
for(budy j:aList){
%> 

<tr><td><%=j.getJ_code() %></td>
<td><%=j.getName() %></td>
<td><%=j.getSkill() %></td>
<td><%=j.getYoe()%></td>
<td><%=j.getLocation() %></td>
<td><%=j.getMail()%></td>
<td><%=j.getStatus() %></td>

</tr>
	
<%}

%>
</table>
<input type="submit" value="BACK">
</form>
</body>
</html>