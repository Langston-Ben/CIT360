
<%@page import="org.quickconnectionfamily.java.JSONOutputStream"%>
<%@page import="java.io.FileReader"%>
<%@page import="org.quickconnectionfamily.java.JSONParser"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="bean.OnlineStore"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Store Info</title>
    </head>
    <body>
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
                font-weight: 900;
            }

        </style>
    </head>
    <body>
        <div align="center">
            <table border="1" cellpadding="5">
            <caption><h2>Online Store</h2></caption>
            <tr>
                <th></th>
        
                <th>Item</th>
              
               
            </tr>
           
            <%  
// retrieve your list from the request, with casting 
//request.getAttribute("getInfo");
//FileReader tt = new FileReader("getInfo");
// JSONParser jo = new JSONParser(tt);



Map<String, String> iResult = (HashMap<String, String>) request.getAttribute("iResult");

   
 //   OnlineStore u = new OnlineStore();

 for (Entry<String, String> onlineStore : iResult.entrySet()) {
     
 
            %>              

                <tr>
                        <td><%=onlineStore.getKey()%></td>
                        <td><%=onlineStore.getValue()%></td>
                        
                      

                   
                </tr>
            <%
        }
        %>
        </table>
        <br><br><input type=button onClick="parent.location='reports.jsp'" 
                       value='Return'><br><br>
      
        <form action="<%=request.getContextPath()%>/FileSaver"  method="post">
            
        <p><input type="submit"/> Save a Copy</p>
        
        </form>
        
        
    </div>
        
       
       
    </body>
</html>
