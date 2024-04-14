package paquete2;

/*
    Esta clase no tiene acceso a la ClaseDefault que tienen modificadores
    de tipo DEFAULT por que la misma se encuentra en otro paquete
*/

import paquete1.ClaseDefault;

public class ClaseHija extends ClaseDefault{
    
    public ClaseHija(){
        super(); // Accediendo al constructor Protected de la clase padre
        this.atributoDefault = "Modificando el atributo protected de la clase padre";
        System.out.println("Atributo Protected hija: " + this.atributoDefault);
        this.metodoDefault();// Tenemso acceso al método protected de la clase padre
    }
    
    
}
