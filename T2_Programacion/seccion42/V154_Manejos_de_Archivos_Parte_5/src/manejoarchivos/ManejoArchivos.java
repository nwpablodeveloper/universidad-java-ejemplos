package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            // Abrimos un nuevo archivo con el nombre que le indicamos
            PrintWriter salida = new PrintWriter(archivo);

            // Cerramos el flujo que se abrio
            salida.close(); // Aca es donde se crea el archivo en el HDD
            System.out.println("Archivo creado");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al guardar el archivo");
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            // Abrimos un nuevo archivo con el nombre que le indicamos
            PrintWriter salida = new PrintWriter(archivo);

            // Escribir archivos
            salida.println(contenido);

            // Cerramos el flujo que se abrio
            salida.close(); // Aca es donde se crea el archivo en el HDD
            System.out.println("Se sobreescribio el archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al guardar el archivo");
            ex.printStackTrace(System.out);
        }

    }

    public static void anexarInformacion(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            // Abrimos un nuevo archivo con el nombre que le indicamos
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));

            // Escribir archivos
            salida.println(contenido);

            // Cerramos el flujo que se abrio
            salida.close(); // Aca es donde se crea el archivo en el HDD
            System.out.println("Se anexo info al archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al guardar el archivo");
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            ex.printStackTrace(System.out);
        }

    }

    public static void leerArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {

            // Leer lineas completas del archivo
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            // Leer linea
            String lectura = entrada.readLine();
            
            // Leer linea por linea
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            // Cerrar la apertura del flujo de datos
            entrada.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
