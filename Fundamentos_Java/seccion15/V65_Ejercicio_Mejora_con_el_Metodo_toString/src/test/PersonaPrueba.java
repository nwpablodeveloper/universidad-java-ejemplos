package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Pablo", 1500, true);
        
        /*
            En este caso el objeto no nos va a mostrar la dirección de memoria
            a la que apunta porque tenemos declaro un metodo toString en la 
            clase del mismo
        */
        System.out.println("persona1 = " + persona1);
        
        
        
    }
}
