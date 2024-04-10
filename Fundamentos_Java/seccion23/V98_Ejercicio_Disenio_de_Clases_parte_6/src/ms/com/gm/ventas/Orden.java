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

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProcutos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden $ " + totalOrden);
        System.out.println("Prodúctos de la Orden");
        for (int i = 0; i < this.contadorProcutos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}
