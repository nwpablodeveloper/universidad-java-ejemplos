package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.ArrayList;
import java.util.List;


public class TestManejoPersonas {
    public static void main(String[] args) {
    
        PersonaDAO personaDAO = new PersonaDAO();
        
        List<Persona> personas = personaDAO.seleccionar();
        
        personas.forEach( persona -> {
            System.out.println(persona);
        });
        
    }
}
