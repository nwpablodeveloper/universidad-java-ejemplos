package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super(); // Accediendo al constructor Protected de la clase padre
        this.atributoProtected = "Modificando el atributo protected de la clase padre";
        System.out.println("Atributo Protected hija: " + this.atributoProtected);
        this.metodoProtected(); // Tenemso acceso al método protected de la clase padre
    }
    
    
}
