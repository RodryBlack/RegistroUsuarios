
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            String correo=request.getParameter("correo");
            String contrasena=request.getParameter("contrasena");
            
            Usuario us= new Usuario();
            
            us.setNombre(nombre);
            us.setApellido(apellido);
            us.setCorreo(correo);
            us.setContrasena(contrasena);
            //coloccar el objeto us como atgributo request
            request.setAttribute("usuario", us);
            //derivamos el control a salida.jsp incluye el objeto request
            request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

}
