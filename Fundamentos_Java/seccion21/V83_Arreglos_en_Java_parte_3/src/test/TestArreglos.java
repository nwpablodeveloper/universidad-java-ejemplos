package test;

public class TestArreglos {
    public static void main(String[] args) {
        
        /*
            Para modificar un elemento del arreglo primero debemos conocer su
            indice
        */
        
        int edades[] = new int[5];
        
        edades[0] = 8;
        edades[1] = 35;
        edades[2] = 36;
        
        /* 
            Declarar un valor fuera del limite de sus indices nos va a dar
            un error en tiempo de ejecución
        */
        
        //edades[25] = 33;
        
        // Imprimir todos los valores de un arreglo
        
        System.out.println("Usando ciclo FOR");
        for(int i = 0; i < edades.length; i++ ){
            System.out.println("Edad: " + edades[i]);
        }
        
        System.out.println("\nUsando ciclo WHILE");
        
        int i = 0;
        while (i < edades.length) {
            System.out.println("Edad: " + edades[i]);
            i++;
        }
        
        System.out.println("\nUsando ciclo DO-WHILE");
        
        i = 0;
        do{
            System.out.println("Edad: " + edades[i]);
            i++;
        }while(i < edades.length);
        
    }
}
