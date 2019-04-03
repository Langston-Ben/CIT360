<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String id=request.getParameter("id");
String un=request.getParameter("uname");
String fn=request.getParameter("fname");
String ln=request.getParameter("lname");
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
            <h3>The User Account for <%=un%> has been authenticated</h3>
        <h1>Welcome To Shop Stop Inventory Management</h1>
        
        <h1><%=fn + ln%>
        </center>
        
        <form method="post" action="<%=request.getContextPath()%>/category.jsp">
            <fieldset>
                <legend>Select One Of The Following Options</legend> 
                <p>Category Management</p>
                <p><input type="submit" value="Categories"/></p>
            </fieldset>
        </form>
            
            <form method="get" action="<%=request.getContextPath()%>/ListServlet">
            <fieldset>
                <legend></legend> 
                <p>Inventory Management</p>
                <p><input type="submit" value="Inventory"/></p>
            </fieldset>
        </form>
        
            <form method="get" action="<%=request.getContextPath()%>/reports.jsp">
            <fieldset>
                <legend></legend> 
                <p>Report Management</p>
                <p><input type="submit" value="Reports"/></p>
            </fieldset>
        </form>
        
        
        
    </body>
</html>

