package variables.en.java;

public class VariablesEnJava {
    
    // El metodo main nos va a permitir ejecutar nustro programa
    public static void main(String[] args) {
       
        // Recomendamos notación CamelCase
        // Usamos el operador de asignación para darle un valor
        int miVariableEntera = 10;
        
        // Imprimir variable
        System.out.println("mi Variable Entera = " + miVariableEntera);
        
        // Podemos sobreescribir en la misma variable
        miVariableEntera = 20;
        System.out.println("miVariableEntera = " + miVariableEntera);
        
        
        // VARIABLES DE TIPO STRING
        
        String miVariableCadena = "Hola";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println("miVariableCadena = " + miVariableCadena);
    }
}
