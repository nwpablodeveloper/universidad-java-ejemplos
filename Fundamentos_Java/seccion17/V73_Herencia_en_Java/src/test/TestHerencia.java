package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        System.out.println("empleado1 = " + empleado1);
        System.out.println("");

        Cliente cliente1 = new Cliente(
                new Date(), true, "Pablo", 'H', 35, "Barcelona");
        System.out.println("cliente1 = " + cliente1);
        System.out.println("");
        
        Cliente cliente2 = new Cliente(
                new Date(), false, "romina", 'M', 35, "Barcelona");
        System.out.println("cliente2 = " + cliente2);
    }
}
