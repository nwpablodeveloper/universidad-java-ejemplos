package com.gm.mundopc;

public class Monitor {
    
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tidMonitor=").append(idMonitor);
        sb.append("\n\tMarca=").append(marca);
        sb.append("\n\tTamaño=").append(tamanio);
        return sb.toString();
    }
    
}
