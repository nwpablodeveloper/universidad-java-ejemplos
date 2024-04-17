package test;

import java.util.ArrayList;
import java.util.List;

public class TestColecciones {

    public static void main(String[] args) {

        List miLista = new ArrayList();

        /*
            Se puede cargar de forma dinámica y mantiene el orden en el que fue 
            cargado
         */
        miLista.add("martes");
        miLista.add("lunes");
        miLista.add("jueves");
        miLista.add("miercoles");
        miLista.add("miercoles");
        miLista.add("miercoles");
        miLista.add("miercoles");

        // Interar con forEach
        for (Object elemetno : miLista) {
            System.out.println("elemetno: " + elemetno);
        }

        System.out.println("");
        
        // Interar con función flecha
        miLista.forEach(elemento -> {
            System.out.println("elemento:  " + elemento);
        });

    }
}
