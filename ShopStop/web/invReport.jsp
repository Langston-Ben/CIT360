<%-- 
    Document   : invReport
    Created on : Apr 2, 2019, 7:28:26 AM
    Author     : benjaminlangston
--%>

<%@page import="bean.Users"%>
<%@page import="bean.InvModel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory Report</title>
        <style>

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
            
        </style>
    </head>
    <body>
        <div align="center">
            <table border="1" cellpadding="7">
            <caption><h2>List of Inventory</h2></caption>
            <tr>
                <th>ID</th>
                <th>Category</th>
                <th>Name</th>
                <th>Desc</th>
                <th>Price</th>
                <th>Stock</th>
                <th></th>
            </tr>
            
            <%  
// retrieve your list from the request, with casting 
ArrayList<InvModel> list = (ArrayList<InvModel>) request.getAttribute("iReport");

// print the information about every category of the list
for(InvModel invModel : list) {
  //  out.println(invModel.getInvId());
  //  out.println(invModel.getCategoryId());
  //  out.println(invModel.getItemName());
  //  out.println(invModel.getItemDesc());
  //  out.println(invModel.getItemPrice());
  //  out.println(invModel.getItemStock());

%>
        
  
                
                <tr>
                    <td><%=invModel.getInvId()%></td>
                    <td><%=invModel.getCategoryId()%></td>
                    <td><%=invModel.getItemName()%></td>
                    <td><%=invModel.getItemDesc()%></td>
                    <td><%=invModel.getItemPrice()%></td>
                    <td><%=invModel.getItemStock()%></td>
                    <td><form action="<%=request.getContextPath()%>/ItemMGT" method="post"/>
     
                    <input type="hidden" id="fname"
                              name="fname" value="<%=invModel.getInvId()%>"/>
                    <input type="submit" value="Delete"/>
                        </form></td>
                </tr>
            <%
        }
        %>
        </table>
        <br><br><input type=button onClick="parent.location='reports.jsp'" 
               value='Return'>
      
        <form action="<%=request.getContextPath()%>/FileSaver"  method="post">
            
        <p><input type="submit"/> Save a Copy</p>
        
        </form>
        
        
    </div>
        
       
       
    </body>
</html>
