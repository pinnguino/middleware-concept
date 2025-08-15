package org.mobydigital.middleware.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mobydigital.middleware.login.models.Usuario;
import org.mobydigital.middleware.login.mediator.MediatorLogin;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MediatorLogin m = new MediatorLogin();

        // Obtener los parámetros del formulario
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Configurar el tipo de contenido de la respuesta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        // Lógica de validación
        Usuario u = m.notificarLogin(email, password);
        if (u != null) {
            // Login exitoso
            out.println("<h2>¡Acceso concedido, " + u.getNombre() + "!</h2>");
            out.println("</body></html>");
        } else {
            // Login fallido
            out.println("<h2>Error: Usuario o contraseña incorrectos.</h2>");
        }
        out.println("</body></html>");
        out.close();
    }
}