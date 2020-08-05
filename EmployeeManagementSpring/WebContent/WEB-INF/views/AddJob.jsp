<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Job</h1>
<div>
<c:url var="addAction" value="/AddJob"></c:url>
<form:form action="${addAction}" method="post" commandName="job">

<label for="jcode">Enter Job Id</label>
<form:input path="jcode" readonly="true" disabled="true" type="text" id="jcode" name="jcode" placeholder="enter job id(format-J001)" />
<br>
<label for="jname">Enter Job Name</label>
<form:input path="jname" type="text" id="jname" name="jname" placeholder="enter job name" />
<br>
<input type="submit" value="AddJob">

</form:form>
</div>
</body>
</html>