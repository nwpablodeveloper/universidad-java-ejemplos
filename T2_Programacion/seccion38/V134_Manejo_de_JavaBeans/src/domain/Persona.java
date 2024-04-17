package domain;

import java.io.Serializable;

// JavaBeans tienen que implementar Serializable
public class Persona implements Serializable {

    // JavaBeans tiene que tener sus atributos private
    private String nombre;
    private String apellido;

    /* 
        JavaBeans tiene que tener 1 constructor PUBLIC vacio
        con el fin de definir solo el Objeto haciendo referencia al espacio 
        en memoria. 
    */
    public Persona() {
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // JavaBeans nos obliga a tener un método get y set por cada atributo privado
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Opcionales

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
}
