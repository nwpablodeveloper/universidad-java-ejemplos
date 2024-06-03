package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletHeaders")
public class ServletHeaders extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        response.setContentType("text/html,charset-UTF-8");
        PrintWriter out = response.getWriter();
        
        String metodoHttp = request.getMethod();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<H1>Headers HTTP</H1>");
        out.print("<b>Método HTTP:</b> " + metodoHttp);
        
        String uri = request.getRequestURI();
        out.print("<br><b>Uri solicitada:</b> " + uri);
        
        String id = request.getRequestId();
        out.print("<br><b>id:</b> " + id);
        
        // Imprimir todos los headers
        Enumeration cabeceros= request.getHeaderNames();
        while( cabeceros.hasMoreElements() ){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<br><b>" + nombreCabecero + ": </b>");
            out.print(request.getHeader(nombreCabecero));
        }
        
        out.print("</body>");
        out.print("</html>");
        
        
    }
    
}
