/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Users;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operations.CommonOperations;

public class Login extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String un=request.getParameter("un");
        String pw=request.getParameter("pw");
        
        String fn=request.getParameter("fn");
        String ln=request.getParameter("ln");
        
        if(un.isEmpty() || pw.isEmpty()) {
        
        response.sendRedirect("index.jsp");
        return;
        }
     
        pw = Encryption.MD5(pw);
        
        Users user=new Users();
        CommonOperations co=new CommonOperations();
        user.setUNAME(un);
        user.setUPASSWORD(pw);
        
        user.setFNAME(fn);
        user.setLNAME(ln);
        
        user=co.getLoginDetails(user);
        if(user.isValid()){
            HttpSession session=request.getSession();
            session.setAttribute("currentsession", user);
            response.sendRedirect("userhome.jsp?id="+user.getUID()+"&uname="+user.getUNAME()+"&fname="+user.getFNAME()+" "+"&lname="+user.getLNAME());
        }else{
            response.sendRedirect("index.jsp");           
        }
    }
}
