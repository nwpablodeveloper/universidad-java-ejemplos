package domain;

public class Gerente extends Empleado{

    private String departamento;
    
    public Gerente(String nombre, double sueldo){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nDpto: " + this.departamento;
    }
}
