package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);

        persona1.nombre = "Pablo";
        persona1.apellido = "Veiga";
        System.out.println("persona1 nombre = " + persona1.nombre);

        System.out.println("persona1 null = " + persona1);
        usoReturn(persona1);

    }

    public static Persona cambiarValor(Persona persona) {
        persona.nombre = "Juan";
        return persona;
    }

    public static void usoReturn(Persona persona) {

        if (persona != null) {
            /* 
                El return da por finalizado el Scope que se encuentra y te 
                manda de regreso a la linea de codigo donde se hizo el llamado
                de este metodo
             */
            persona = null;
            return;
            // int a = 23;  esta linea ya no se ejecuta por que estan despues del return
        }
        /*
             En caso de no retornar nada en compilador agrega el return de 
             forma automatica para que regrese la ejecución de código
             al punto que fue llamado el método o función que nos encontrabamos
        */
        return; // No es necesario ponerlo
    }
}
