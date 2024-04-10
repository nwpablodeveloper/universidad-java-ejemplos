package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;
import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {

        Producto cafe = new Producto("Capppuccino", 2.7);
        Producto plato1 = new Producto("Milanesa", 8);
        Producto plato2 = new Producto("Pizza", 13.20);
        Producto postre1 = new Producto("Helado", 2);
        Producto bebida1 = new Producto("Agua", 0.8);
        Producto bebida2 = new Producto("Gaseosa", 1);
        Producto rapidos1 = new Producto("Pancho", 3.3);
        Producto snack1 = new Producto("Papas", 4.20);
        Producto rapidos2 = new Producto("Hamburguesa", 7.60);

        // Generador de Ordenes
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        
        System.out.println("Orden 1");
        orden1.agregarProducto(bebida1);
        orden1.agregarProducto(bebida2);
        orden1.agregarProducto(plato2);
        orden1.mostrarOrden();
        System.out.println("Total: " + orden1.calcularTotal());

        System.out.println("\nOrden 2");
        orden2.agregarProducto(cafe);
        orden2.agregarProducto(snack1);
        orden2.agregarProducto(rapidos1);
        orden2.mostrarOrden();
        System.out.println("Total: " + orden2.calcularTotal());
        
    }
}
