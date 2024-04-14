package paquete1;

import paquete1.ClasePrivate;
import paquete1.ClaseHija;

public class TestModificadorProtected {

    public static void main(String[] args) {

        /*
            Podemos acceder a una clase Default si es que estamos dentro
            del mismo paquete
        */
        ClasePrivate clase1 = new ClasePrivate("Creando objeto");
        
        /*
            No tenemos acceso a los metodos y atributos de la claase porque
            los mismo son de modicador Private
        */
        // clase1.atributoPrivate = "Cambiar contenido";
        // clase1.metodoPrivate;
        
        /*
            La única manera para modifcar los atributos privados de una clase
            es por medio de los Setters
        */
        clase1.setAtributoPrivate("atributo privado modificado con un set");
        System.out.println(clase1.getAtributoPrivate() );
    }

}
