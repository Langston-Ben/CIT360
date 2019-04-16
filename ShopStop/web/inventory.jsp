<%@page import="java.lang.Integer"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="bean.CategoryModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>Inventory Management</title>
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
        <h1>Inventory Management Page</h1>

        <h1></h1>
    </div>
    
  
   <!-- 
 
    <select id ="category" name="categories">
   
    <c:forEach items="${listCategory}" var="category">
        <option value="${category.key}">${category.value}</option>        
    </c:forEach>
</select>
-->

    <form method="post" action="<%=request.getContextPath()%>/Inventory">
        <fieldset>
            <div class="forms">
            <select id="category" name="ct" type="number"> Select a Category
                <label for ="categoryId">Category</label>
                <option value="">--Please Choose a Category--</option>

                <% Map<Integer, String> listCategory = (HashMap<Integer, String>) request.getAttribute("listCategory");
                    for (Entry<Integer, String> category : listCategory.entrySet()) {
                %>


                <option value="<%=category.getKey()%>">
                    <%=category.getValue()%>

                </option>

                <%
                    }
                %>

    </select><br>
  <!--     <input type="text" name="ct"/> Category <br> -->
            <input type="text" name="in"/> Item Name <br>
            <input type="text" name="id"/> Item Description <br>
            <input type="text" name="ip"/> Item Price <br>
            <input type="text" name="is"/> Item Stock <br>
            <p><input type="submit" value="Add Inventory"/></p>
            
            <input type=button onClick="parent.location='userhome.jsp?id=22&uname=blangston&fname=Ben%20&lname=Langston'" 
                   value='Return'>
            </div>
        </fieldset>
    </form>




</body>
</html>