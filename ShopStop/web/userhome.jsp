<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String id=request.getParameter("id");
String un=request.getParameter("uname");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory Management</title>
        <style>

            h1 {
                font-weight: bold;    
                color: aqua;
            }

            body {
                    
                background-color: gray;
                width: 80%;
                border: solid black;
                border-width: 1em;           
            }

        </style>
        
        
        
    </head>
    <body>
        <center>
        <h1>Welcome <%=un%></h1>
        <h1>Your ID is <%=id%></h1>
        </center>
    </body>
</html>