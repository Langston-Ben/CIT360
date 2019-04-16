<%-- 
    Document   : testg
    Created on : Apr 6, 2019, 9:09:48 PM
    Author     : benjaminlangston
--%>

<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.HashMap"%>
<%@page import="bean.OnlineStore"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>Online Store</title>
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
                font-weight: 900;
                margin-left: auto;
                margin-right: auto;
            }
            
            table {
                
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
        <div align="center">
            <table border="1" cellpadding="5">
                <caption><h2>List of Inventory</h2></caption>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>On hand</th>

                </tr>
                <%Map<String, OnlineStore> online
                            = (HashMap<String, OnlineStore>) request.getAttribute("online");

                    for (Entry<String, OnlineStore> entry : online.entrySet()) {
                        OnlineStore student = entry.getValue();

                %> 

                <tr>
                    <td><%=student.getStoreItemName()%></td>
                    <td><%=student.getStoreItemDesc()%></td>
                    <td><%=student.getStoreItemPrice()%></td>
                    <td><%=student.getStoreItemStock()%></td>

                </tr>

                <% 
               
                }

                %>
            </table>
            <br><br><input type=button onClick="parent.location='reports.jsp'" 
                           value='Return'><br><br>
        </div>
    </body>
</html>
