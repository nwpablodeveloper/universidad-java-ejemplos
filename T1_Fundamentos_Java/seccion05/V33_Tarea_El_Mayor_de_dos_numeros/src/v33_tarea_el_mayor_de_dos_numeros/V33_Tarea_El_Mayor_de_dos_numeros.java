/*
    Solicitar al usuario dos valores:

    numero1 (int)
    numero2 (int)

    Se debe imprimir el mayor de los dos números (la salida debe ser identica a 
    la que sigue):

    Proporciona el numero1:
    Proporciona el numero2:
    El numero mayor es:
    <numeroMayor>
    Puedes utilizar el IDE de tu preferencia para codificar la solución y después 
    pegar tu solución en esta herramienta.

    Preguntas de esta tarea
    ¿Cuál es el código del requerimiento solicitado?
*/

package v33_tarea_el_mayor_de_dos_numeros;

import java.util.Scanner;

public class V33_Tarea_El_Mayor_de_dos_numeros {

    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Ingrese el 1er numero");
        int num1 = Integer.parseInt(numeros.nextLine());
        
        System.out.println("Ingrese el 2do numero");
        int num2 = Integer.parseInt(numeros.nextLine());
        
        var resultado = ( num1 == num2 ) ? "Son iguales" :
                        ( num1 > num2 ) ? num1 :
                        num2;
        
        System.out.println("El numero mayor es: " + resultado);
    }
    
}
