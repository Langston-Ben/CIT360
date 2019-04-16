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
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>Inventory Management</title>
  <!--      <style>

            h1 {
                font-weight: bold;    
                color: aqua;
            }

            body {
                    
                background-color: darkslategray;
                width: 80%;
                border: solid black;
                border-width: 1em;  
                margin-left: auto;
                margin-right: auto;
            }
            
            form {
                
                margin-left: auto;
                margin-right: auto;
                background-color: gray;
            }

            center {
                background-color: gray; 
                padding: 2em;
                
            }
        </style> -->
        
        
        
    </head>
    <body>
        <div class="top">
        <center>
            <h3>The User Account for <%=un%> has been authenticated</h3>
        <h1>Welcome To Shop Stop Inventory Management</h1>
        
        <h1><%=fn + ln%>
            </div>
            
        </center>
        
        <form method="post" action="<%=request.getContextPath()%>/category.jsp">
            <fieldset>
                <legend>Select One Of The Following Options</legend> 
                <div class="forms">
                <p>Category Management</p>
                <p><input type="submit" value="Categories"/></p>
                </div>
            </fieldset>
        </form><br><br>
            
            <form method="get" action="<%=request.getContextPath()%>/ListServlet">
            <fieldset>
                <legend></legend> 
                <div class="forms">
                <p>Inventory Management</p>
                <p><input type="submit" value="Inventory"/></p>
                </div>
            </fieldset>
        </form><br><br>
        
            <form method="get" action="<%=request.getContextPath()%>/reports.jsp">
            <fieldset>
                <legend></legend> 
                <div class="forms">
                <p>Reports  and Account Management</p>
                <p><input type="submit" value="Reports"/></p>
                </div>
            </fieldset>
        </form><br><br>
        
        
        
    </body>
</html>

