package v37_sentencia_de_control_switch_en_java;

import java.util.Scanner;

public class V37_Sentencia_de_control_Switch_en_java {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        var numero = Integer.parseInt(num.nextLine() );
        
        var numeroTexto = "Valor desconocido";
        
        switch ( numero ) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "No se encontro el numero";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
    
}
