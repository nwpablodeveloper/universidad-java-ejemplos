package v21_ejercicio_conversion_de_tipos_primitivos_en_java_parte_1;

import java.util.Scanner;

public class V21_Ejercicio_Conversion_de_Tipos_Primitivos_en_Java_Parte_1 {
    public static void main(String[] args) {
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        var consola = new Scanner(System.in);
        System.out.println("Indica tu edad");
        edad = Integer.parseInt(consola.nextLine());
        
    }
}
