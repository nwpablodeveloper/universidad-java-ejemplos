package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        // Variables locales
        int a = 10;
        int b = 2;
        
        /*
            Para usar otros metodos estando dentro de un método estatico
            támbien tienen que ser estaticos
        */
        otroMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 = " + aritmetica1.a);
        System.out.println("aritmetica1 = " + aritmetica1.b);
        
        System.out.println("");
        Aritmetica aritmetica2 = new Aritmetica(a,  b);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        
    }
    
    // Las variables a y b que estan dentro del metodo "main" no entran aca
    public static void otroMetodo(){
        // a = 20; 
        int a = 20; // tenemos que volver a declarar la variable 
        System.out.println("Otro Metodo");
    }
}
