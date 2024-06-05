package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws IOException {

        // Indicamos el tipo de respuesta al navegador
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        // vnd significa: Vender Specific

        // Para uso mas profesional de Excel usar la libreria poi.apache.org
        
        // No guardar Cache en el navegador 
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        // Desplegar información
        PrintWriter out = response.getWriter();
        out.println("\tValores\tNombres");
        out.println("\t5");
        out.println("\t9");
        out.println("Total\t=SUMA(b2:b3)");
        out.close();
    }

}
