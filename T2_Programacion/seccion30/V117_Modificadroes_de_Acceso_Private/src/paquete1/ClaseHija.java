package paquete1;

import paquete1.ClasePrivate;

public class ClaseHija extends ClasePrivate{
    
    public ClaseHija(){
        // super();
        /*
            La unica menera de crear un Objeto de una Clase Private es llamando
            a sus constructores que sean Públicos ( minimo tienen que tener 1 )
            para que el mismo pueda llamar a sus propios constructores Privados
        */
        super("Llamando constructor público");
        
        /*
            Ya no tenemos accesos a sus atributos y métodos privates
        */
        // this.atributoPrivate = "Modificando el atributo Private de la clase padre";
        // System.out.println("Atributo private hija: " + this.atributoPrivate);
        // this.metodoPrivate(); // Tenemso acceso al método protected de la clase padre
    }
    
    
}
