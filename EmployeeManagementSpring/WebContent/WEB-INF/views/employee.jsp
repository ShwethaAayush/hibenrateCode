<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="employees">Employees</a>  
<a href="addEmployee">AddEmployee</a> 
<a href="#">Logout</a>
<br>
<br>
 ${error}
<table id="employees" >
<thead>
<tr>
<th>Employee Id</th>
<th>Name</th>
<th>DOJ</th>
<th>Bonus</th>
<th>Salary</th>
<th>ManagerName</th>
<th>JobName</th>
<th>DepartmentName</th>
<th>LocationName</th>
</tr>
</thead>
<tbody>
<c:forEach items="${EmployeeList}" var="e" >
<tr>
<td>${e.empid}</td>
<td>${e.ename}</td>
<td>${e.doj}</td>
<td>${e.bonus}</td>
<td>${e.salary}</td>
<td>${e.manager.ename}</td>
<td>${e.job.jname}</td>
<td>${e.department.dcode}</td>
<td>${e.department.lname}</td>
<td><a href="edit/${e.empid }"> Edit </a></td>
<td><a href="delete/${e.empid}"> Delete </a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>