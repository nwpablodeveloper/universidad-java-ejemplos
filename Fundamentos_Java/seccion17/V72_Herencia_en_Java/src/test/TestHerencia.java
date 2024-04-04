package test;

import domain.Empleado;
import domain.Persona;

public class TestHerencia {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Pablo", 1799);
        System.out.println("empleado1 = " + empleado1);
        
        Empleado empleado2 = new Empleado("Pablo", 1799);
        System.out.println("empleado1 = " + empleado2);
       
        
    }
}
