package proyecto;

public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        System.out.println("El consutructor vacio se ejecuto");
        System.out.println("");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        return this.alto * this.ancho * this.profundo;
    }
    
}
