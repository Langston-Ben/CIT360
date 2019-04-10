<%-- 
    Document   : category
    Created on : Mar 23, 2019, 9:30:09 AM
    Author     : benjaminlangston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category Management</title>
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

        </style>



    </head>
    <body>
    <center>
        <h3>Shop Stop</h3>
        <h1>Category Management Page</h1>

        <h1></h1>
    </center>

    <form method="post" action="<%=request.getContextPath()%>/CategoryControl">
        <fieldset>
            <input type="text" name="ct"/> Category <br>
            
            <p><input type="submit" value="Add Category"/></p>
            <input type=button onClick="parent.location='userhome.jsp'" 
                   value='Return'>
        </fieldset>
    </form>




</body>
</html>



