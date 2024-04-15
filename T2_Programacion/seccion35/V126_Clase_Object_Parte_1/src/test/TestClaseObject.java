package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Pablo", 1500);
        Empleado empleado2 = new Empleado("Pablo", 1500);
        
        /*
            Preguntar si los 2 objetos tienen la misma referencia en
            memoria
        */
        
        if ( empleado1 == empleado2 ) {
            System.out.println("Tienen la misma ref. en memoria");
        }else{
            System.out.println("Tienen Disitinta ref. en memoria");
        }
        
    }
}
