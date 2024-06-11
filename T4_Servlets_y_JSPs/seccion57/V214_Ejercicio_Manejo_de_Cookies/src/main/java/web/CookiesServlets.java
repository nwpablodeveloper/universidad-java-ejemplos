package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlets")
public class CookiesServlets extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        response.setContentType("text/html,charset-UTF-8");
        PrintWriter out = response.getWriter();

        // Si visita por primera vez hacemos lo siguiente
        boolean nuevoUsuario = true;

        // Obtener el arreglo de Cookies
        Cookie[] cookies = request.getCookies();

        // Buscar si ya existe una Cookie creada con aterioridad
        if (cookies != null) {
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("visitanteRecurrente") && cooky.getValue().equals("si")) {
                    // si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }

        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primeraaaaaa vez";
        } else {
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }

        out.println(mensaje);
        out.close();

    }

}
