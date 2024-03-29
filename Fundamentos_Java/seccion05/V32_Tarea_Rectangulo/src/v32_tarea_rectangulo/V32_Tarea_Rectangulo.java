/*
    En el siguiente ejercicio se solicita calcular el área y el perímetro de 
    un Rectángulo, para ello deberemos crear las siguientes variables:

    alto (int)
    ancho (int)

    El usuario debe proporcionar los valores de largo y ancho, y después se 
    debe imprimir el resultado en el siguiente formato(no usar acentos y 
    respetar los espacios, mayúsculas, minúsculas y saltos de línea):

    Proporciona el alto:
    Proporciona el ancho:
    Area: <area>
    Perimetro: <perimetro>
    Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

    Área: alto * ancho

    Perímetro: (alto + ancho) * 2

    Puedes utilizar el IDE de tu preferencia para codificar la solución y 
    después pegar tu solución en esta herramienta.

    Preguntas de esta tarea
    ¿Cuál es el código del requerimiento solicitado?
 */
package v32_tarea_rectangulo;

import java.util.Scanner;

public class V32_Tarea_Rectangulo {
    
    public static void main(String[] args) {
        
        Scanner areaRectangulo = new Scanner(System.in);
        
        System.out.println("Ingres el alto del rectangulos");
        int alto = Integer.parseInt(areaRectangulo.nextLine());
        
        System.out.println("Ingrese el ancho del rectangulos");
        int ancho = Integer.parseInt(areaRectangulo.nextLine());
        
        int area = ancho * alto;
        System.out.println("area = " + area);
        
        int perimetro = (ancho + alto) * 2;
        System.out.println("perimetro = " + perimetro);
        
    }
    
}
