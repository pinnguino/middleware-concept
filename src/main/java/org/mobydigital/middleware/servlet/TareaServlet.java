package org.mobydigital.middleware.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mobydigital.middleware.calendar.TareaGoogle;
import org.mobydigital.middleware.mediator.MediatorCalendar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/tareas")
public class TareaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;encoding=UTF-8");
        PrintWriter out = resp.getWriter();

        MediatorCalendar m = new MediatorCalendar();

        List<TareaGoogle> sinHacer = m.listarSinHacer();

        out.println("<!DOCTYPE html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Calendario Usuario</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Tarea</h1>");
        if(sinHacer.isEmpty()) {
            out.println("         <h3>No tienes tareas pendientes.</h3>");
        }
        else {
            // Agregar notificacion tareas repetidas
            out.println("<h3>Tienes tareas pendientes:</h3>");
            for(TareaGoogle t : sinHacer) {
                try{
                    out.println("<h4> - " + t.getMediador().notify(t, "notificarEvento") + "</h4>");
                }catch (IllegalAccessException evento){
                    evento.printStackTrace();
                }
            }
        }
        out.println("     </body>");
        out.println("</html>");
    }
}
