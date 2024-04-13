package domain;

public class Empleado extends Persona{
    
    private double sueldo;
    private int idEmpleado;
    private static int contadorEmpleados;
    
    public Empleado(String nombre,  double sueldo){
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("sueldo=").append(sueldo);
        sb.append(", idEmpleado=").append(idEmpleado);
        sb.append(", \n ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}
