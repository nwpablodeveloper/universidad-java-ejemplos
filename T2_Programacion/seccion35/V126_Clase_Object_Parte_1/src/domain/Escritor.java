package domain;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura1){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura1;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nTipo de escritura: " + this.tipoEscritura;
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}';
    }

    
    
    
}
