package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // Leer los parametros recibidos
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El usuario es: " + usuario );
        out.print("</br>");
        out.print("El password es: " + password);
        out.print("</body>");
        out.print("</html>");
        
    }
    
}
