package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", "Veiga");

        System.out.println("");
        System.out.println("Despues de pasar por los constructores");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 nombre: " + persona1.nombre);
        System.out.println("persona1 apellido: " + persona1.apellido);

    }
}

// Java solo permito tener 1 clase general, por archivo con acceso público
class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        /* 
            El THIS esta apuntando al objeto que se esta ejecuntando, el mismo 
            esta haciendo referencia a la clase actual que se encuentra.
            En este caso hace referencia a la clase/objeto Persona
         */
        System.out.println("Usando this: " + this);
        new Imprimir().imprimir(this);
        new Otra();
    }
}

class Imprimir {

    public void imprimir(Persona objetoRecibido) {
        System.out.println("objetoRecibido Imprimir = " + objetoRecibido);
        
        // Este this hace referencia a la clase/objeto Imprimir
        System.out.println("que imprime? = " + this);
    }

}

class Otra {
    
    public Otra(){
        System.out.println("Otra clase: " + this);
        new OtroObjeto();
        new OtroObjeto(this);
    }
    
    
}

class OtroObjeto{
    
    public OtroObjeto(){
        System.out.println("OtroObjeto this: " + this);
    }
    
    public OtroObjeto(Otra objetoRecibido){
        System.out.println("Otro dentro de OtroObjecto = " + objetoRecibido);
    }
}
