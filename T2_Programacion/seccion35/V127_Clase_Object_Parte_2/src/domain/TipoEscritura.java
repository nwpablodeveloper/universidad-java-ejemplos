package domain;

public enum TipoEscritura {
    CLASICA("Escritura a mano"),
    MODERNA("Escritura digital");
    
    private final String tipoEscritura;
    
    private TipoEscritura(String descripcion){
        this.tipoEscritura = descripcion;
    }
    
    public String getTipoEscritura(){
        return this.tipoEscritura;
    }
    
}
