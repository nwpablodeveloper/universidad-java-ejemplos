package domain;

public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        sb.append(" direccion: ").append(super.toString());
        return sb.toString();
    }
    
    
    
}
