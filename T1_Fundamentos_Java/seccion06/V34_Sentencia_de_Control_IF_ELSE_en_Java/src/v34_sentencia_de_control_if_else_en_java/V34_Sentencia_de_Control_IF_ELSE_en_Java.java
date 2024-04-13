package v34_sentencia_de_control_if_else_en_java;

public class V34_Sentencia_de_Control_IF_ELSE_en_Java {
    public static void main(String[] args) {
        
        var condicion = true;
        
        // Definición
        //if( condicion == true ) {
        
        // Ejemplo 1 unicamente si se cumple sin llaves ( opcional )
        if ( condicion )
            System.out.println("Es verdadero");
        
        // Ej. 2 usando llaves
        if ( condicion ) {
            System.out.println("Es verdadero");
        }
        
        // If - Else
        if( condicion ) {
            System.out.println("Es verdadero");
        } else {
            System.out.println("Condicion falso");
        }
        
    }
}
