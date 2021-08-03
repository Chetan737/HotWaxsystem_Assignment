<%-- 
    Document   : display_name
    Created on : 5 May, 2020, 1:33:28 PM
    Author     : haris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display name</title>
    </head>
    <body>
    <center>
        <h1>Hello <% out.print(request.getParameter("name")); %> </h1>
    </center>
    
    </body>
</html>
