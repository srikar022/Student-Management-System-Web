<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Admin Operations</title>
<style type="text/css">
<%@include file="Login.css" %>
</style>
</head>
<body>
 <div align="left">
<a href="Add.jsp" style="color:white">Add
     New Student</a>
     </div>
     
<div id="main-holder">
<table border="1">
 <thead>
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Date of Birth</th>
                                <th>Contact Number</th>
                              <th>Operations</th>
                            </tr>
                        </thead>
                        
                         <tbody>
                          
                            <c:forEach var="user" items="${StudentList}">
                                <tr>
                                    <td>
                                        <c:out value="${user.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.name}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.dateOfBirth}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.contactNumber}" />
                                    </td>
                                    
                                    <td><a href="Edit.jsp">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="Delete.jsp">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>
</table>
</div>
&nbsp;&nbsp;&nbsp;<a href="Index.jsp" style="color:white">Logout</a>
</body>
</html>