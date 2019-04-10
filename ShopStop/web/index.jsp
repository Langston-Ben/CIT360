<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Stop Shop Inventory Management</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>

            fieldset {
                font-weight: bold;      
            }

            form {
                padding: 2em 2em 2em 2em;    
                background-color: gray;
                width: 50%;
                border: solid black;
                border-width: 1em;   
                margin-left: auto;
                margin-right: auto;
            }
            
            body {
                background-color: darkslategray;
   
            }
            
            .top {
                text-align: center;
                font-family: fantasy;
                font-weight: 900;
                color: red;
            }

        </style>

    </head>
    <body>
        <div class="top">
        <h1>Welcome to ShopStop Inventory Control</h1>
        <h2>Please Sign In or Create An Account</h2></div>
        <form method="post" action="<%=request.getContextPath()%>/Login">

            <fieldset>
                <legend>Enter Your Account Credentials</legend>  
                <input type="text" name="un"/> Username <br>
                <input type="text" name="pw"/> Password
                <p><input type="submit" value="Login"/></p>
            </fieldset>

        </form>
            <form method="post" action="<%=request.getContextPath()%>/Register">
            <fieldset>
                <legend>Create an Account</legend>
                
                <input type="text" name="fn"/> First Name <br>
                <input type="text" name="ln"/> Last Name <br>
                <input type="text" name="un"/> Username <br>
                <input type="text" name="pw"/> Password
                <p><input type="submit" value="Register"/></p>
            </fieldset>
  
            </form>
      
    </body>
</html>



<!-- 



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Stop Account Management</title>
    </head>
    <body>
    <center>
        <table>
            <tr>
                <td>Login</td>
                <td>Registration</td>
            </tr>
            <tr>
                <td>
                    <table bgcolor="yellow">
                        <form method="post" action="<%=request.getContextPath()%>/Login">
                            <tr>
                                <td>User Name </td>
                                <td><input type="text" name="un"></td>
                            </tr>
                            <tr>
                                <td>Password </td>
                                <td><input type="text" name="pw"></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="login"></td>
                            </tr>
                        </form>
                    </table>
                </td>
                <td>
                    <table bgcolor="red">
                        <form method="post" action="<%=request.getContextPath()%>/Register">
                            <tr>
                                <td>User Name </td>
                                <td><input type="text" name="un"></td>
                            </tr>
                            <tr>
                                <td>Password </td>
                                <td><input type="text" name="pw"></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Register"></td>
                            </tr>
                        </form>
                    </table>
                </td>
            </tr>
        </table>
    </center>       
</body>
</html>

-->