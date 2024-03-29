package v38_ejercicio_calculo_estacion_con_switch;

import java.util.Scanner;

public class V38_Ejercicio_Calculo_Estacion_con_Switch {
    public static void main(String[] args) {
        
        Scanner inputMes = new Scanner(System.in);
        
        System.out.println("Igrese el número de mes");
        var mes = Integer.parseInt(inputMes.nextLine());
        
        var estacion = "Estación desconocida";
        
        switch( mes ){
            case 1:
            case 2:
            case 12:
                estacion = "Estación de Invieron";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Estacion Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Estacion Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Estacion Otoño";
                break;
                
        }
        System.out.println("estacion = " + estacion);
    }
    
}
