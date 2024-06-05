package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        // Tipo de respuesta
        response.setContentType("text/htaml;charset-UTF-8");

        response.setHeader("refresh", "1");

        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora Actualizada: ' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);

        PrintWriter out = response.getWriter();

        out.print(horaConFormato);
        out.close();
    }

}
