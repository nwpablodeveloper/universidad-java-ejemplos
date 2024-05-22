package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            
            conexion = Conexion.getConnection();
            
            if( conexion.getAutoCommit() ){
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            
            Persona persona1 = new Persona();
            persona1.setNombre("Pablo");
            persona1.setApellido("Veiga");
            persona1.setEmail("pablo@gmail.com");
            persona1.setTelefono("613826756");
            
            personaDAO.insertar(persona1);
            
            persona1 = new Persona();
            persona1.setIdPersona(9);
            persona1.setNombre("Pablo Andres");
            persona1.setApellido("Veiga");
            
            personaDAO.actualizar(persona1);
            
            
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
