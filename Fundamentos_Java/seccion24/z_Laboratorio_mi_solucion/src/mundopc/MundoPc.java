package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("Samsung", 20);
        Raton raton1 = new Raton("USB", "Noga");
        Teclado teclado1 = new Teclado("Bluetooth", "WD");
        
        Monitor monitor2 = new Monitor("KEEP", 27);
        Raton raton2 = new Raton("USB", "Forgeon");
        Teclado teclado2 = new Teclado("Bluetooth", "Genius");
        
        Computadora compu1 = new Computadora("básica", monitor1, teclado1, raton1);
        System.out.println(compu1);
        
        System.out.println("");
        
        Computadora compu2 = new Computadora("Escritorio", monitor2, teclado2, raton2);
        System.out.println("compu2 = " + compu2);
        
        

        
    }
}
