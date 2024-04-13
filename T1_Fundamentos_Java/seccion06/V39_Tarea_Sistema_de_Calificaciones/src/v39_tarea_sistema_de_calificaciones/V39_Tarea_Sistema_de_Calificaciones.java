/*
    El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
    El usuario proporcionará un valor entre 0 y 10.

    Si está entre 9 y 10: imprimir una A
    Si está entre 8 y menor a 9: imprimir una B
    Si está entre 7 y menor a 8: imprimir una C
    Si está entre 6 y menor a 7: imprimir una D
    Si está entre 0 y menor a 6: imprimir una F
    cualquier otro valor debe imprimir: Valor desconocido

    Por ejemplo:
    Proporciona un valor entre 0 y 10:
    A
    Puedes utilizar el IDE de tu preferencia para codificar la solución y después 
    pegar tu solución en esta herramienta.

    Preguntas de esta tarea
    ¿Cuál es el código del requerimiento solicitado?
 */
package v39_tarea_sistema_de_calificaciones;

import java.util.Scanner;

public class V39_Tarea_Sistema_de_Calificaciones {

    public static void main(String[] args) {

        Scanner inputNota = new Scanner(System.in);

        System.out.println("Ingrese una nota");
        double nota = Double.parseDouble(inputNota.nextLine());
        String notaLetra = "Valor desconocido";

        
        if (nota >= 9 && nota <= 10) {
            notaLetra = "A";
        } else if( nota >=8 && nota < 9 ){
            notaLetra = "B";
        } else if( nota >=7 && nota < 8 ){
            notaLetra = "C";
        } else if( nota >=6 && nota < 7 ){
            notaLetra = "D";
        } else if( nota >=0 && nota < 6 ){
            notaLetra = "F";
        }
        
        System.out.println("Nota= " + notaLetra);
    }

}
