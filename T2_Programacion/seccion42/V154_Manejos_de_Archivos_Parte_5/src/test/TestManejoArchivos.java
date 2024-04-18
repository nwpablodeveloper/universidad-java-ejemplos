package test;

import static manejoarchivos.ManejoArchivos.escribirArchivo;
import static manejoarchivos.ManejoArchivos.crearArchivo;
import static manejoarchivos.ManejoArchivos.anexarInformacion;
import static manejoarchivos.ManejoArchivos.leerArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        
        String dir = "d:\\cursos\\java\\T2_Programacion\\seccion42\\V154_Manejos_de_Archivos_Parte_5\\archivoscreados\\";
        nombreArchivo = dir + "paraEscribir.txt";
        crearArchivo(nombreArchivo);
        
        escribirArchivo(nombreArchivo, "escribi el archivo");
        escribirArchivo(nombreArchivo, "Pise lo escrito");
        
        anexarInformacion(nombreArchivo, "Anexe texto");
        anexarInformacion(nombreArchivo, "Anexe mas contenido");
        
        leerArchivo(nombreArchivo);
        
    }
}
