<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Delete</title>
<style type="text/css">
<%@include file="Login.css" %>
</style>
</head>
<body>
<div id="main-holder">
<h1>Delete</h1>
<form action="DeleteStudentController" method="post" id="login-form">
 <table style="with: 100%" border="1">
    <tr>
     <td>Id</td>
     <td><input type="text" name="id" class="login-form-field" /></td>
     </tr>
   </table>
    <input type="submit" value="Delete" id="login-form-submit"/>
</form>
</div>
</body>
</html>