package mx.com.gm.ventas;

public class Orden {

    private int idOrdden;
    private Producto productos[] = new Producto[10];
    private static int contadorProducto;
    private static int contadorOrdenes;

    public Orden() {
        this.idOrdden = Orden.contadorOrdenes++;
    }

    public void agregarProducto(Producto producto) {
        this.productos[Orden.contadorProducto] = producto;
        Orden.contadorProducto++;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            if (this.productos[i] != null) {
                total += this.productos[i].getPrecio();
            }
        }
         return total;
    }

    public void mostrarOrden() {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null) {
                System.out.println(this.productos[i]);
            }
        }
    }

}
