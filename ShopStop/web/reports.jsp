<%-- 
    Document   : reports
    Created on : Mar 30, 2019, 7:48:45 PM
    Author     : benjaminlangston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports</title>
        
        <style>

            fieldset {
                font-weight: bold;      
            }

            form {
                padding: 2em 2em 2em 2em;    
                background-color: gray;
                width: 40%;
                border: solid black;
                border-width: 1em;           
            }

        </style>
    </head>
    <body>
        <form action="<%=request.getContextPath()%>/InventoryReport"  method="get">
        <p><input type="submit"/> Inventory Report</p>
        <input type=button onClick="parent.location='userhome.jsp'" 
                   value='Return'>
  
        </form>
        
        <form action="<%=request.getContextPath()%>/UserReport"  method="get">
        <p><input type="submit"/> User Report</p>
        <input type=button onClick="parent.location='userhome.jsp'" 
                   value='Return'>
  
        </form>
        
        <form action="<%=request.getContextPath()%>/OnlineStoreController"  method="get">
        <p><input type="submit"/> Online Store items</p>
        <input type=button onClick="parent.location='userhome.jsp'" 
                   value='Return'>
  
        </form>
        
    </body>
</html>
