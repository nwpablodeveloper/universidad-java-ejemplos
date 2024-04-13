package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        
        imprimirNumeros(4,5,7,8,9);
        imprimirNumeros(5,4);
        
        // Cuando se envian se dice PARAMETROS
        recibirVariosArgumentos("Pablo", 35, 8,35,35);
    }
    // Al recibir en el método se llaman argumentos
    // El argumento variable debe ser el ultimo en la firma del método
    public static void recibirVariosArgumentos(String nombre, int edad, int... numeros){
        System.out.println("\nNombre: " + nombre + " de " + edad + " años");
        imprimirNumeros(numeros);
    }
    
    public static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }
    }
}
