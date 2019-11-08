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
@WebServlet(name = "habitat_servlet", urlPatterns = {"/habitat_servlet"})
public class habitat_servlet extends HttpServlet {

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
        modelo.habitat_DAO habitat=new modelo.habitat_DAO();
            switch(request.getParameter("boton")){
                case "Crear":
                    try {
                        habitat.Insertar(request.getParameter("nombre"),request.getParameter("clima"),Integer.parseInt(request.getParameter("vegetacion")),Integer.parseInt(request.getParameter("continente")));
                    op="ok";
                    } catch (Exception e) {
                        op="error";
                    }
                    response.sendRedirect("habitats/crear.jsp");
                    break;
                case "Eliminar":
                    try {
                        int id=Integer.parseInt(request.getParameter("id"));                     
                    habitat.Eliminar(id);
                    op="ok";
                    } catch (Exception e) {
                        op="error";
                    }
                    response.sendRedirect("habitats/borrar.jsp");
                    break;
                case "Actualizar":
                    try { 
                    habitat.Actualizar(Integer.parseInt(request.getParameter("id")),request.getParameter("nombre_cientifico"),request.getParameter("descripcion"),Integer.parseInt(request.getParameter("empleado")));
                    op="ok";
                    } catch (Exception e) {
                        op="error";
                    }
                    response.sendRedirect("habitats/actualizar.jsp");
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
