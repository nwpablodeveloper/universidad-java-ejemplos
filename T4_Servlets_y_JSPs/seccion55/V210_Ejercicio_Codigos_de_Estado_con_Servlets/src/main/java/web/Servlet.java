package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
        
        PrintWriter out = response.getWriter();

        // Simulación de valores correctos
        String usuarioOk = "Juan";
        String passwordOk = "123456";
                

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        if ( usuarioOk.equals(usuario) && passwordOk.equals(password)  ) {
            out.print("<h1>Datos Correctos");
            out.print("<br>");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        } else {
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
        
    }

}
