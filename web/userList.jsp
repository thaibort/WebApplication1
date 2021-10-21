<%-- 
    Document   : userForm
    Created on : Oct 19, 2021, 8:25:36 PM
    Author     : thaibort
--%>

<%@page import="java.util.List"%>
<%@page import="user.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user form</title>
    </head>
    <body>
        <h1>danh sach user</h1>
        <%
            List<user> list = request.getAttribute("data")
        %>
    </body>
</html>
