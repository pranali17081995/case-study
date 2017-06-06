<%@page import="com.techm.beans.Job"%>
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
<form action="SpocModifyServlet">
<%
int j_code=Integer.parseInt(request.getParameter("jcode"));
JobDetails jd=new JobDetailsImpl();
Job j=jd.getJob(j_code);
 %>

 <table border="1">
<tr>
 <td><input type="text" name="jcode"><%=j.getJcode()%></td>
 <td><input type="text" name="skill"><%=j.getSkill()%></td>
 <td><input type="text" name="yoe"><%=j.getYoe()%></td>
 <td><input type="text" name="location"><%=j.getLocation()%></td>
 <td><input type="text" name="sname"><%=j.getSname()%></td>
 <td><input type="text" name="smail"><%=j.getSmail()%></td>
 
 </tr>

</table>
<input type="submit" value="Submit">
 </form>
</body>
</html>