<%-- 
    Document   : usrReport
    Created on : Apr 3, 2019, 4:59:05 PM
    Author     : benjaminlangston
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="bean.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>User Report</title>
        <!--       <style>
       
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


        <table>
            <div class="top">
                <h2>List of Users</h2>
            </div>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>Remove</th>

            </tr>

            <%
// retrieve your list from the request, with casting 
                ArrayList<Users> ulist = (ArrayList<Users>) request.getAttribute("uReport");

// print the information about every category of the list
                for (Users users : ulist) {
                    //  out.println(invModel.getInvId());
                    //  out.println(invModel.getCategoryId());
                    //  out.println(invModel.getItemName());
                    //  out.println(invModel.getItemDesc());
                    //  out.println(invModel.getItemPrice());
                    //  out.println(invModel.getItemStock());

            %>



            <tr>

                <td><%=users.getFNAME()%></td>
                <td><%=users.getLNAME()%></td>
                <td><%=users.getUNAME()%></td>
                
            
                <td>
                   
                    <form action="<%=request.getContextPath()%>/UserMGT" method="post"
                          class="forms2"/>
                
                    <input type="hidden" id="userName"
                           name="userName" value="<%=users.getUID()%>"/>
                   
                        <input type="submit" value="Delete"/>
          
                        </form></td>


            </tr>
            <%
                }
            %>
        
    </table>
    <br><br>
<div class="forms2">
    <input type=button onClick="parent.location = 'reports.jsp'" 
           value='Return'><br><br>
</div>
    <form action="<%=request.getContextPath()%>/FileSaver"  method="post" class="forms3">
        
            <p><input type="submit"/><br><br> Save a Copy</p>
        </div>
    </form>

</body>
</html>
