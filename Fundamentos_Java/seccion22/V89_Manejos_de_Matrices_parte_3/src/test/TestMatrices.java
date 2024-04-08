package test;

public class TestMatrices {
    public static void main(String[] args) {
        
        /*
            Declaración de una matriz con 3 filas y 2 columnas para almecenar
            elementos de tipo enteros
        */
        int edades[][] = new int[3][2];

        edades[0][0] = 23;
        edades[0][1] = 4;
        
        edades[1][0] = 27;
        edades[1][1] = 17;
        
        edades[2][0] = 71;
        edades[2][1] = 17;
        
        for (int fila = 0; fila < edades.length; fila++) {
            for (int columna = 0; columna < edades[fila].length; columna++) {
                System.out.println("Edada["+ fila +"]["+columna+"] = " + edades[fila][columna]);
            }
        }
    }
}

