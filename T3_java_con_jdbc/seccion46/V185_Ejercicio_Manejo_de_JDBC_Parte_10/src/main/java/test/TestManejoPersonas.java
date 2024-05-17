package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDAO = new PersonaDAO();

        // Insertando un nuevo objeto en la DB
        // Cargan la DB con un FOR 
        
        for (int i = 1; i <= 20; i++) {

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

        // Eliminar registro
        personaDAO.eliminar( new Persona(10));
        
        // Imprimir la tabla
        List<Persona> personas = personaDAO.seleccionar();

        personas.forEach(persona -> {
            System.out.println(persona);
        });
        
        // VACIAR LA TABLA
        personaDAO.vaciarTabla();

    }
}
