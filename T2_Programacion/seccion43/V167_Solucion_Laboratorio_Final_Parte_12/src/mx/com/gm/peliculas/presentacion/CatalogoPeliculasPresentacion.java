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
            
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la pelicula");
                    catalogo.agregarPelicula(scanner.nextLine());
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Nombre a buscar? ");
                    catalogo.buscarPelicula(scanner.nextLine());
                    break;
                case 0:
                        System.out.println("Gracias por usar este software");
                     break;
                default:
                    System.out.println("Opción no valida");
                    break;
                    
            }
        }
        
    }
}
