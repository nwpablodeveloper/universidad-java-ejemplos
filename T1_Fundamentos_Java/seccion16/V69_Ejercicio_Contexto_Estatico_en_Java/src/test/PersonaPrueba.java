package test;

import domain.Persona;

public class PersonaPrueba {

    private int numeros;

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo");
        Persona persona2 = new Persona("Romina");

        imprimir(persona1);
        imprimir(persona2);

        // No puedo hacer uso del THIS dentro de métodos Static
        // this.numeros = 20;
        // Va a ser necesario crear un Método especial para ello
        
    }

    public static void imprimir(Persona objecto) {
        System.out.println("objecto = " + objecto);
    }
    
    // De un contexto dinamico podes ir a un Static
    public int getNumeros(){
        imprimir(new Persona("Pepito"));
        return this.numeros ;
    } 
    
}
