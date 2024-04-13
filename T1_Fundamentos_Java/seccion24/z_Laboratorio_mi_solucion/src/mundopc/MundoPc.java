package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("Samsung", 20);
        Raton raton1 = new Raton("USB", "Noga");
        Teclado teclado1 = new Teclado("Bluetooth", "WD");
        
        Monitor monitor2 = new Monitor("KEEP", 27);
        Raton raton2 = new Raton("USB", "Forgeon");
        Teclado teclado2 = new Teclado("Bluetooth", "Genius");
        
        Computadora compu1 = new Computadora("básica", monitor1, teclado1, raton1);
        Computadora compu2 = new Computadora("Escritorio", monitor2, teclado2, raton2);
        Computadora compu3 = new Computadora("Notebook", monitor1, teclado2, raton1);
        
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compu1);
        orden1.agregarComputadora(compu2);
        orden1.agregarComputadora(compu3);
        orden1.agregarComputadora(compu3);
        
        orden1.mostrarOrden();
    }
}
