/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.InvModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operations.CommonOperations;


public class Inventory extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
//    int categoryId = Integer.parseInt(request.getParameter("category"));
// 
//    request.setAttribute("ct", categoryId);
 
//    listCategory(request, response);

       
       
       String ct=request.getParameter("ct");
       String in=request.getParameter("in");
       String id=request.getParameter("id");
       String ip=request.getParameter("ip");
       String is=request.getParameter("is");
       
       
       if(ct.isEmpty() || in.isEmpty() || id.isEmpty() || 
               ip.isEmpty() || is.isEmpty()) {
        
        response.sendRedirect("ListServlet");
        return;
        }
       
       int nct = Integer.parseInt(ct);
       
        InvModel inv =new InvModel();
        inv.setCategoryId(nct);
        inv.setItemName(in);
        inv.setItemDesc(id);
        inv.setItemPrice(ip);
        inv.setItemStock(is);
        inv.setValid(false);
        
        CommonOperations commonOperations=new CommonOperations();
        inv=commonOperations.invMgt(inv);
        
        
        
        
        
        
        if(inv.isValid()){
            HttpSession session=request.getSession();
            session.setAttribute("currentsession", inv);
            response.sendRedirect("./ListServlet");
        }else{
            response.sendRedirect("failure.jsp");
           
        }
    }
    
    
    
}