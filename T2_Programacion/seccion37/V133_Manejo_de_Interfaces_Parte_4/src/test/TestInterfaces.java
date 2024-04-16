package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        
        /*
            Podemos crear variables de tipo Interfaces y luego hacer referencia
            a una clase que implemente la misma Interfaces
        */
        IAccesoDatos datos = new ImplementacionMySql();
        
        // Polimorfismo       
        imprimir(datos);
        
        System.out.println("");
        
        // Polimorfismo
        datos = new ImplementacionOracle();
        imprimir(datos);
        
    }
    // Usamos polimorfismo
    public static void imprimir(IAccesoDatos datos){
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
    }
}
