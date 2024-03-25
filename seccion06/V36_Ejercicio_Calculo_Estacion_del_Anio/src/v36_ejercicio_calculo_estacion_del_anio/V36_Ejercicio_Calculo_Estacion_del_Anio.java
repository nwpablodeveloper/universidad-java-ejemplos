package v36_ejercicio_calculo_estacion_del_anio;

import java.util.Scanner;

public class V36_Ejercicio_Calculo_Estacion_del_Anio {
    public static void main(String[] args) {
        
        Scanner inputMes = new Scanner(System.in);
        
        System.out.println("Igrese el numero de mes");
        var mes = Integer.parseInt(inputMes.nextLine());
        
        var estacion = "Estacion desconocida";
        
        if( mes == 1 || mes == 2 || mes == 12 ){
            estacion = "Invierno";
        } else if( mes == 3 || mes == 4 || mes == 5 ){
            estacion = "Primavera";
        } else if( mes == 6 || mes == 7 || mes == 8 ){
            estacion = "Verano";
        } else if( mes == 9 || mes == 10 || mes == 11 ){
            estacion = "Otoño";
        }
        
        System.out.println("estacion = " + estacion);
        
    }
}
