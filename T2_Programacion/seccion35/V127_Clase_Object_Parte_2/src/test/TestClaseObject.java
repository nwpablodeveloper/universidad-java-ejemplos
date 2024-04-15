package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Pablo", 1500);
        Empleado empleado2 = new Empleado("Pablo", 1500);
        
        if ( empleado1 == empleado2 ) {
            System.out.println("Tienen la misma ref. en memoria");
        }else{
            System.out.println("Tienen Disitinta ref. en memoria");
        }
        
        /*
            Preguntamos por el contenido de los 2 Objetos para saber si
            son iguales, para ello necesitamos crear el método equals con el 
            IDE en la clase a comparar
        */
        if(empleado1.equals(empleado2)){
            System.out.println("Son iguales en contenido");
        } else {
            System.out.println("No son iguales");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El hashCode es igual");
        } else {
            System.out.println("El hashCode es Distinto");
            
        }
    }
}
