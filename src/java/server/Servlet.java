/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pojo.RegistroAlumnos;

/**
 *
 * @author Belteton
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
private Vector<RegistroAlumnos> registro = new Vector<>();
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
        response.setContentType("text/html;charset=UTF-8");

            RegistroAlumnos alumno = new RegistroAlumnos(request.getParameter("inputCarnet"),
                request.getParameter("inputName"),
                request.getParameter("inputLast"),
                request.getParameter("inputEmail"),
                request.getParameter("inputTele"),
                request.getParameter("inputAddress"));
  
        registro.add(alumno);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    
    protected void mostrarTabla(PrintWriter out, Vector<RegistroAlumnos> alumnos){
        
        out.println("<section class='container - 2'>");
        out.println("<div class=\"card\" style=\" display: none;\" id=\"registroAlumnos\"> ");
        out.println("<div class=\"card-body\">");
        out.println("<table border=\"1\" class=\"table table-hover\">");  
        out.println("<thead>");  
        out.println("<tr><!-- Fila -->");  
        out.println("<th>Semestre</th>");  
        out.println(" <th>Nombre</th>");  
        out.println("<th>Apellido</th><!-- Encabezado -->");  
        out.println("<th>Carnet</th><!-- Encabezado -->");
        out.println("<th>Email</th><!-- Encabezado -->");
        out.println("<th>Telefono</th><!-- Encabezado -->");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        
        for(RegistroAlumnos alumno:alumnos){
            out.println("<tr>");
                out.println(String.format("<td>%s</td>", alumno.getNombre()));
                out.println(String.format("<td>%s</td>", alumno.getApellidos()));
                out.println(String.format("<td>%s</td>", alumno.getNoCarne()));
                out.println(String.format("<td>%s</td>", alumno.getDireccion()));
                out.println(String.format("<td>%s</td>", alumno.getTelefono()));
                out.println(String.format("<td>%s</td>", alumno.getCorreo()));
            out.println("</tr>");
        }
       
        out.println("</tbody>");
        out.println("</table>");
        out.println("</div>");
        out.println("</div>");
        out.println("</section>");
        out.flush();
        out.close();
       
          
  
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
