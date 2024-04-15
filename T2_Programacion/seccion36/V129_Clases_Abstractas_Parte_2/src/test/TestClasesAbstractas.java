package test;

import domain.*;

public class TestClasesAbstractas {

    public static void main(String[] args) {
        
        // No se puede instanciar un Objeto de una clase Abstracta
        //FiguraGeometrica figura = new FiguraGeometrica("Triangulo") ;
        
        /*
            Uso polimorfismo haciendo referencia a un tipo Padre para hacer
            el uso de un tipo hijo.
            Aca aplica el UpCasting
        */
        FiguraGeometrica figura = new Rectangulo("Rectangulito");
        figura.dibujar();
        
    }
    
}
