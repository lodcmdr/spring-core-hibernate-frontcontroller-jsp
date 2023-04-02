<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>Delete</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
 
<nav class="navbar navbar-expand-sm bg-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="login.jsp">Login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="showAll.jsp">show all</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 3</a>
    </li>
  </ul>
</nav>
${message}
  <h2>!!!!!Are you sure you want to delete this employee from database?????</h2>
  <form action="DeleteEmployee" method="post">
    <div class="form-group">
      <label >EmployeeId:</label>
      <input type="text" class="form-control"  name="employeeId" value="${employee.employeeId}" readonly>
    </div>
    <div class="form-group">
      <label>EmployeeName:</label>
      <input type="text" class="form-control"  name="employeeName" value="${employee.employeeName}">
    </div>
    
     <div class="form-group">
      <label>Salary:</label>
      <input type="text" class="form-control"  name="salary"value="${employee.salary}">
    </div>
    
     <div class="form-group">
      <label >EmailId:</label>
      <input type="Email" class="form-control" name="emailId"value="${employee.emailId}">
    </div>
    
     <div class="form-group">
      <label>Password:</label>
      <input type="password" class="form-control"  name="password"value="${employee.password}">
    </div>
    
    <button type="submit" class="btn btn-danger">Delete</button>
  </form>
</div>

</body>
</html>