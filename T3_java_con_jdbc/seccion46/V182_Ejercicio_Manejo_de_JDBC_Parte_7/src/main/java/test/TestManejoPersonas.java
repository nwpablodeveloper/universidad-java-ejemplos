package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.ArrayList;
import java.util.List;


public class TestManejoPersonas {
    public static void main(String[] args) {
    
        PersonaDAO personaDAO = new PersonaDAO();
        
        // Insertando un nuevo objeto en la DB
        personaDAO.insertar(new Persona("pablo", "veiga", "veiga@gmail.com", "613826756"));
        
        List<Persona> personas = personaDAO.seleccionar();
        
        personas.forEach( persona -> {
            System.out.println(persona);
        });
        
    }
}
