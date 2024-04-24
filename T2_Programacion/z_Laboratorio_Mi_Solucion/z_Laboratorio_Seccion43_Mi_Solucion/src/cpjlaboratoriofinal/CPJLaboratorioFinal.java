package cpjlaboratoriofinal;

import java.util.Scanner;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        String menu = "INGRESE UNA OPCION: ";
        menu += "\n1. Iniciar Catalogo de peliculas";
        menu += "\n2. Agregar Pelicula";
        menu += "\n3. Listar Pelicula";
        menu += "\n4. Buscar Pelicula";
        menu += "\n0. Salir Pelicula";

        int opcion;

        do {
            System.out.println(menu);

            opcion = Integer.parseInt(consola.nextLine());
            System.out.println("Su eleccion fue: " + opcion);

        } while (opcion <= -1 || opcion > 4);
        
        switch (opcion) {
            case 2:
                
                break;
            default:
                throw new AssertionError();
        }

    }
}
