<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>Add New Employee</h1>
<hr>
<form action="addEmployee" method="post">
    <label> Employee Id:</label>
    <input type="number" name="empId" required/>
    <br>
    <label>Employee Name:</label>
    <input type="text" name="empName" size="15"/>
    <br>
    <label>Employee Salary:</label>
    <input type="number" name="empSalary" size="15"/>
    <br>
    <label>Employee Department</label>
    <select name="empDept">
   <option value="IT">IT</option>
   <option value="HR">HR</option>
   <option value="ADMIN">ADMIN</option> 
   <option value="ACCOUNTS">ACCOUNTS</option>
    </select>
    <input type="submit" value="AddEmployee"/>
    
</form>
</body>
</html>