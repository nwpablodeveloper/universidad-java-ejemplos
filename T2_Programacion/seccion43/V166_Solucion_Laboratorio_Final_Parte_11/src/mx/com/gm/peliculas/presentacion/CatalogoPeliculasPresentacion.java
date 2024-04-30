package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.negocio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while( opcion != 0){
            System.out.println("Elige una opción: \n"
                    + "1. Iniciar Catalogo de peliculas\n"
                    + "2. Agregar Pélicula\n"
                    + "3. Listar péliculas\n"
                    + "4. Buscar pélicula\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
        }
        
    }
}
