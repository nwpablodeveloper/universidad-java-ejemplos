package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final int maxComputadoras = 3;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[this.maxComputadoras];
    }
    
    public void agregarComputadora(Computadora compu){
        if( this.contadorComputadoras >= this.maxComputadoras  ){
            System.out.println("Maximo de computadores lleno");
        }else{
            
        this.computadoras[this.contadorComputadoras++] = compu;
        }
            
    }

    public void mostrarOrden(){
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("compu = " + this.computadoras[i]);
        }
    }
    
    
}
