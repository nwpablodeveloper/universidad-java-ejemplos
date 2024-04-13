package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", "Veiga");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 nombre: " + persona1.nombre);
        System.out.println("persona1 apellido: " + persona1.apellido);
        
    }
}

// Java solo permito tener 1 clase general, por archivo con acceso público
class Persona {

    String nombre;
    String apellido;

    Persona( String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
