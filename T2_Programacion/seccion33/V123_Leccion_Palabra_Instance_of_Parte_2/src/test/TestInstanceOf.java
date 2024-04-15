package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        
        Empleado objeto = new Empleado("Pablo", 1800.50);
        determinarTipo(objeto);
        
        System.out.println("");
        
        objeto = new Gerente("Javier", 2300.33, "Muebles");
        determinarTipo(objeto);
        
    }
    
    // Polimorfismo
    public static void determinarTipo(Empleado objeto){
        /* 
            Preguntamos de la menor gerarquia hacia la mayor
            Preguntamos si el objeto es de la clase Gerente ( hija )
        */
        if(objeto instanceof Gerente){
            System.out.println("Objeto Gerente:\n" + objeto.obtenerDetalles());
            
            // objeto.getDepartamento; NO PODEMOS ACCEDER Y NECESITAMOS CONVERTIR
            
            /* 
                Debemos forzar la conversión del tipo de dato para poder
                acceder a sus métodos de la clase Hija
            */
            ((Gerente) objeto).getDepartamento(); 
            System.out.println(((Gerente) objeto).getDepartamento());
            
        } else if( objeto instanceof Empleado){
            System.out.println("Objeto Empleado\n" + objeto.obtenerDetalles());
            
            /*
                Como es de la tipo Padre nos da acceso a sus métodos de forma
                directa
            */
            objeto.getNombre();
        } else if( objeto instanceof Object){
            System.out.println("La variable es del tipo Object");
            objeto.toString();
        }
    }
}