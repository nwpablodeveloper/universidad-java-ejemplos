package paquete1;

public class TestModificadorProtected {

    public static void main(String[] args) {

        /*
            Podesmo crear un objeto usando el constructor protected porque 
            estamos dentro del mismo paquete
         */
        Clase1 clase1 = new Clase1();

        /*
            Podemos acceder a los método protected porque estamos en el mismo
            paquete
         */
        clase1.metodoProtected();

    }
}
