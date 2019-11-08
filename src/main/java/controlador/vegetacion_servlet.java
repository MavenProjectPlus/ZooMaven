/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Javier
 */
@WebServlet(name = "vegetacion_servlet", urlPatterns = {"/vegetacion_servlet"})
public class vegetacion_servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String op="";
        modelo.vegetacion_DAO vegetacion=new modelo.vegetacion_DAO();
            switch(request.getParameter("boton")){
                case "Crear":
                    try {
                        vegetacion.Insertar(request.getParameter("nombre"));
                    op="ok";
                    } catch (Exception e) {
                        op="error";
                    }
                    response.sendRedirect("vegetacion/crear.jsp");
                    break;
                case "Eliminar":
                    try {
                        int id=Integer.parseInt(request.getParameter("id"));                     
                    vegetacion.Eliminar(id);
                    op="ok";
                    } catch (Exception e) {
                        op="error";
                    }
                    response.sendRedirect("vegetacion/borrar.jsp");
                    break;
                case "Actualizar":
                    try { 
                    vegetacion.Actualizar(Integer.parseInt(request.getParameter("id")),request.getParameter("nombre"));
                    op="ok";
                    } catch (Exception e) {
                        op="error";
                    }
                    response.sendRedirect("vegetacion/actualizar.jsp");
                    break;
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
