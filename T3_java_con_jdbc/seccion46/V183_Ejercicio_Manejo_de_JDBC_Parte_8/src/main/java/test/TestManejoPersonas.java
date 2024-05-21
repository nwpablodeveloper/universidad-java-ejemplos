package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDAO = new PersonaDAO();

        // Insertando un nuevo objeto en la DB
        
        personaDAO.insertar(
                new Persona(
                        "pablo", 
                        "veiga", 
                        "veiga@gmail.com", 
                        "613826756"));
        
        for (int i = 0; i < 100; i++) {

            personaDAO.insertar(
                    new Persona(
                            "pablo " + i,
                            "veiga " + i,
                            "veiga" + i + "@gmail.com",
                            "613826756 " + i));
        }

        // Editar registro
        personaDAO.actualizar(
                new Persona(
                        3, 
                        "romina", 
                        "diaz", 
                        "romi@gmail.com", 
                        "654654"));

        
        List<Persona> personas = personaDAO.seleccionar();

        personas.forEach(persona -> {
            System.out.println(persona);
        });

    }
}
