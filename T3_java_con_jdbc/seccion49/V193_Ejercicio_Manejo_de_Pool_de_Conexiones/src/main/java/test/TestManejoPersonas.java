package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            
            // Conexión a la DB
            conexion = Conexion.getConnection();
            if( conexion.getAutoCommit() ){
                conexion.setAutoCommit(false);
            }
            
            // Cracion del Objeto declarandolo con su Interface
            PersonaDAO personaDAO = new PersonaDaoJDBC(conexion);
            
            // Cración objeto Persona
            PersonaDTO persona1 = new PersonaDTO();
            persona1.setNombre("Pablo");
            persona1.setApellido("Veiga");
            persona1.setEmail("pablo@gmail.com");
            persona1.setTelefono("613826756");
            
            // Preparando para insertar el objecto creado
            personaDAO.insertar(persona1);
            
            // Cración para actualizar un objeto Persona
            persona1 = new PersonaDTO();
            persona1.setIdPersona(5);
            persona1.setNombre("Pablo Andres");
            persona1.setApellido("Veiga");
            
            // Preparar para actualizar
            personaDAO.actualizar(persona1);
            
            // Traer la lista de Personas de la DB
            List<PersonaDTO> personas = personaDAO.seleccionar();
            
            // Mostrar lista de personas
            personas.forEach( persona -> {
                System.out.println(persona);
            });
            
            // Ejecutar todas las querys preparadas
            conexion.commit();
            System.out.println("Se realizo un commit de la transacción");
            
            
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al RollBack");
                conexion.rollback();
            } catch (SQLException ex1) {
                System.out.println("Error en el RollBack");
                ex1.printStackTrace(System.out);
            }
        }

    }
}
