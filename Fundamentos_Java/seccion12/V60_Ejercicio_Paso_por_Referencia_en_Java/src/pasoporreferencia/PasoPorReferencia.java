package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        // Los atributos tienen que tener el modificadr PUBLIC para poder ser
        // accedidos ya que la clase de Persona se encuentra en otro paquete
        System.out.println("Dclaramos un objeto de tipo Persona llamado persona1");
        persona1.nombre = "Pablo";
        persona1.apellido = "Veiga";
        persona1.deplegarInformación();
        
        // Pasamos la variable como parametro al metodo
        cambiaValor(persona1);
        
        persona1.deplegarInformación();
        
    }
    
    public static void cambiaValor(Persona persona){
        /*
            Si bien podemos crear una nueva variable dentro de este metodo
            La copia de la misma sigue haciendo referencia a la enviada por
            argumento
        */
        System.out.println("");
        System.out.println("Cambiamos el valor de la variable persona1 ");
        persona.nombre = "Juancito";
    }
}
