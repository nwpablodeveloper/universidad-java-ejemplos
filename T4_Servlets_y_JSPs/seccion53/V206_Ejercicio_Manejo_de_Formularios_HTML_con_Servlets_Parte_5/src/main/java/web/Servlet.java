package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html,charset-UTF-8");
        PrintWriter out = response.getWriter();
        System.out.println("out = " + out);

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentario");

        out.print("<html>");

        out.print("<head>");
        out.print("<title>Resultados Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet</h1>");
        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>Usuario</td>");
        out.print("<td>" + usuario + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>Password</td>");
        out.print("<td>" + password + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>Tecnologias</td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" | ");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>Genero</td>");
        out.print("<td>" + genero + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>Ocupación</td>");
        out.print("<td>" + ocupacion + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>Música favorita</td>");
        out.print("<td>");
        if (musica != null) {
            for (String m : musica) {
                out.print(m);
                out.print(" | ");
            }
        } else {
            out.print("No especifica");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>Comentarios</td>");
        out.print("<td>" + comentario + "</td>");
        out.print("</tr>");

        out.print("</table>");
        out.print("</body>");
        out.print("</html>");

    }

}
