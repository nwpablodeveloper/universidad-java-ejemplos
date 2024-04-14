package paquete1;

import paquete1.ClaseDefault;

public class ClaseHija extends ClaseDefault{
    
    public ClaseHija(){
        super(); // Accediendo al constructor Protected de la clase padre
        this.atributoDefault = "Modificando el atributo DEFAULT de la clase padre";
        System.out.println("Atributo Protected hija: " + this.atributoDefault);
        this.metodoDefault(); // Tenemso acceso al método protected de la clase padre
    }
    
    
}
