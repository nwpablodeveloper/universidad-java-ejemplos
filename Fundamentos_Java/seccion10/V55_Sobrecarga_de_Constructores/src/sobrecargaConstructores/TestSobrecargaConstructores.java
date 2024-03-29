package sobrecargaConstructores;

public class TestSobrecargaConstructores {
    public static void main(String[] args) {
        
        /*
            Como ya existe un 2do constructor con Argumentos nos vemos obligados
            a tener que declarar un consutructor vacio en la su respectiva clase
            si es que queremos hacer uso de una instancia de un Objeto de forma
            vacia
        */
        // Obligatorio declarar el constructor vacio en la clase por que existe otro
        SobrecargaConstructores calculo = new SobrecargaConstructores();
        calculo.a = 30;
        calculo.b = 17;
        System.out.println("Sumar = " +calculo.sumarConRetorno());
        
        
        System.out.println("");
        
        // Otro constructor con parametros
        SobrecargaConstructores calculo2 = new SobrecargaConstructores(20, 30);
        System.out.println("Sumar = " + calculo2.sumarConRetorno());
        
        
    }
}
