<%-- 
    Document   : p6
    Created on : 11 Mar, 2025, 8:35:35 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int num1=Integer.parseInt(request.getParameter("n1"));
            int num2=Integer.parseInt(request.getParameter("n2"));
            int res=num1+num2;
            
            %>
            <h1>Addition is : <%=res%></h1>
    </body>
</html>
