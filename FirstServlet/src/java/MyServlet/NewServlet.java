/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author benjaminlangston
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            response.setContentType("text/html");
            out.println("<html><head><style>body"
                    + "{background-color: red;font-weight: bold;}"
                    + "</style></head><body>");
            String fullName = request.getParameter("fullName");
            String car = request.getParameter("car");
            String grade = request.getParameter("grade");
            String os = request.getParameter("os");
            
            out.println("<h1>" + fullName + "'s Personal Information</h1>");
            
            out.println("<p>Full Name: " + fullName + "</p>");
            
            out.println("<p>Your Grade Level: " + grade + "</p");
            
            out.println("<p>Your Favorite Operating System is: " + os + "</p>");
            
            out.println("<p>Your Favorite Car is: " + car + "</p>");
            out.println("</body></html>");
            out.println("</head>");
            out.println("<body>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Not Available");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
