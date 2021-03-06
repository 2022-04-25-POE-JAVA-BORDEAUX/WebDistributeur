package com.poe.webdistributeur;

import distributeur.Distributeur;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class IndexServlet extends HttpServlet {

    Distributeur distributeur = new Distributeur();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        request.setAttribute("stock", distributeur.getStock());
        
        // Merci: Thomas DARRACQ
        request.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);


    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
}
