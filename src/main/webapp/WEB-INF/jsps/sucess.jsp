<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<h1>    </h1>
<div class="container">

<nav class="navbar navbar-expand-sm bg-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="login">LOGIN</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="showEmployees">Show Employees </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="employeeRegistration">Employee Registration</a>
    </li>
  </ul>
</nav>


  <h2> Congratulations..u have entered valid email and password</h2>
 
       
  <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>UNAME</th>
        <th>email</th>
        <th>password</th>
        <th>salary</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${employee.employeeId}</td>
        <td>${employee.employeeName}</td>
        <td>${employee.emailId}</td>
        <td>${employee.password}</td>
        <td>${employee.salary}</td>
      </tr>
      
    </tbody>
  </table>
  
  
  




</body>
</html>