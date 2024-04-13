package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        
        // Asigngo un valor a una variable
        var x = 10;
        System.out.println("x = " + x);
        
        // Envio la variable como parametro para cambiar su valor
        int nuevoValor = cambiarValor(x);
        System.out.println("nuevoValor = " + nuevoValor);
        
        System.out.println("x sigue valiendo: " + x);
        
    }
    
    public static int cambiarValor(int arg1){
        /*
            Recibo el valor de la variable como parametro y procedo a cambiar
            su valor, pero en verdad se esta haciendo una nueva copia en un
            nuevo espacio en memoria en el Stack
        */
        int cambiar = arg1 = 54;
        return cambiar;
    }
}
