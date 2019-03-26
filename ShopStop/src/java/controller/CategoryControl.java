/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.CategoryModel;
import bean.InvModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operations.CommonOperations;

/**
 *
 * @author benjaminlangston
 */

    
public class CategoryControl extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       String ct=request.getParameter("ct");
       
       
       
        CategoryModel cat =new CategoryModel();
        cat.setCategoryName(ct);
        
        
        CommonOperations commonOperations=new CommonOperations();
        cat=commonOperations.categoryMgt(cat);
        
        
//        if(inv.isValid()){
            HttpSession session=request.getSession();
            session.setAttribute("currentsession", cat);
            response.sendRedirect("category.jsp");
//        }else{
//            response.sendRedirect("failure.jsp");
           
        }
    
}
