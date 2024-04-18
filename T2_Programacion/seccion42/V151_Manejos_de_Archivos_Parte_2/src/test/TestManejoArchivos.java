package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        
        String dir = "d:\\cursos\\java\\T2_Programacion\\seccion42\\V151_Manejos_de_Archivos_Parte_2\\archivoscreados\\";
        nombreArchivo = dir + "prueba1.txt";
        crearArchivo(nombreArchivo);
        
    }
}
