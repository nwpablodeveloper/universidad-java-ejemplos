package domain.metodoFinal;

public class Empleado extends Persona {

    /* 
        No se puede sobreescribir el metodo por que en la clase padre 
        se declaro como FINAL
     */
    @Override 
    public void imprimir() {
        System.out.println("Imprimir desde clase hija");
    }

}
