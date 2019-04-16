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
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>Category Management</title>
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
        <h3>Shop Stop</h3>
        <h1>Category Management Page</h1>

        <h1></h1>
    </div>

    <form method="post" action="<%=request.getContextPath()%>/CategoryControl">
        <fieldset>
            
            <div class="forms">
            <input type="text" name="ct"/> Category <br>
            
            <p><input type="submit" value="Add Category"/></p>
            <input type=button onClick="parent.location='userhome.jsp?id=22&uname=blangston&fname=Ben%20&lname=Langston'" 
                   value='Return'>
            </div>
        </fieldset>
    </form>




</body>
</html>



