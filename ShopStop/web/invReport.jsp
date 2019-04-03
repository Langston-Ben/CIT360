<%-- 
    Document   : invReport
    Created on : Apr 2, 2019, 7:28:26 AM
    Author     : benjaminlangston
--%>

<%@page import="bean.InvModel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <table border="1" cellpadding="5">
            <caption><h2>List of Inventory</h2></caption>
            <tr>
                <th>ID</th>
                <th>Category</th>
                <th>Name</th>
                <th>Desc</th>
                <th>Price</th>
                <th>Stock</th>
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
                </tr>
            <%
        }
        %>
        </table>
    </div>
        
       
       
    </body>
</html>
