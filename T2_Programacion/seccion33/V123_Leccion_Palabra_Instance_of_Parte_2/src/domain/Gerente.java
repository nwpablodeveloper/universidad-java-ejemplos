package domain;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nDpto: " + this.departamento;
    }

    public String getDepartamento() {
        System.out.println("Accedi a getDepartamento");
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
