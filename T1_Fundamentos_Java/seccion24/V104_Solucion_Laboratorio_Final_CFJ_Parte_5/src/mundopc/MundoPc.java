package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPc {

    public static void main(String[] args) {

        Monitor maonitorHP = new Monitor("HP", 23);
        Teclado tecladoHP = new Teclado("Bluetooth", "hp");
        Raton ratonHP = new Raton("Usb", "Noganet");

        Monitor monitorGamer = new Monitor("gamer", 34);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratongGamer = new Raton("Usb", "Gamer");

        Computadora computadoraHP = new Computadora(
                "Computadora HP",
                maonitorHP,
                tecladoHP,
                ratonHP);

        Computadora computadoraGamer = new Computadora(
                "Computadora gamer",
                monitorGamer, 
                tecladoGamer, 
                ratongGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
