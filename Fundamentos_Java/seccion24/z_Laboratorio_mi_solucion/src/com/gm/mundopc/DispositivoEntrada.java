package com.gm.mundopc;

public class DispositivoEntrada {
    
    protected String tipoEntrada;
    protected String marca;
    
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\ttipoEntrada=").append(tipoEntrada);
        sb.append("\n\tmarca=").append(marca);
        return sb.toString();
    }
    
}
