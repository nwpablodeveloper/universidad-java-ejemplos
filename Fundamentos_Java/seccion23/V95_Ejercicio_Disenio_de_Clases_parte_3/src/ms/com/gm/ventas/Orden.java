package ms.com.gm.ventas;

public class Orden {

    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProcutos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProcutos == Orden.MAX_PRODUCTOS) 
            System.out.println("Superado el limite de prodúctos para la orden");
        
        this.productos[this.contadorProcutos++] = producto;
    }

}
