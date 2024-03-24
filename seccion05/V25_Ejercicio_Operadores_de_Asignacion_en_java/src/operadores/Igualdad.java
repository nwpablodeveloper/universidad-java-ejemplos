package operadores;

public class Igualdad {

    public static void main(String[] args) {
        
        int a = 3, b = 2;
        int c = a + 5 - b;
        
        System.out.println("c = " + c);
        
        // Si primero nos encontramos con un string el resto es todo string
        var d = "" + a + b;
        System.out.println("d = " + d);
        
        //  Los parentesis tienen prioridad de ejecución
        var e = a + 8 - b * 10 / ( a - b );
        System.out.println("e = " + e);
        
    }
    
}
