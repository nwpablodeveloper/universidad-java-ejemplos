package test;

import static manejoarchivos.ManejoArchivos.escribirArchivo;
import static manejoarchivos.ManejoArchivos.crearArchivo;
import static manejoarchivos.ManejoArchivos.anexarInformacion;

public class TestManejoArchivos {
    public static void main(String[] args) {
        
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        
        String dir = "d:\\cursos\\java\\T2_Programacion\\seccion42\\V153_Manejos_de_Archivos_Parte_4\\archivoscreados\\";
        nombreArchivo = dir + "paraEscribir.txt";
        crearArchivo(nombreArchivo);
        
        escribirArchivo(nombreArchivo, "escribi el archivo");
        escribirArchivo(nombreArchivo, "Pise lo escrito");
        
        anexarInformacion(nombreArchivo, "Anexe texto");
        anexarInformacion(nombreArchivo, "Anexe mas contenido");
        
    }
}
