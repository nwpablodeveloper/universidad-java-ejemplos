package test;

import datos.Conexion;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoUsuarios {

    public static void main(String[] args) {

        Connection conexion = null;
        UsuarioDaoJDBC usuarioJDBC = new UsuarioDaoJDBC();
        
        try {
            conexion = Conexion.getConnection();
            
            if( conexion.getAutoCommit() == true ){
                conexion.setAutoCommit(false);
            }

            // Insertar usuario
            UsuarioDTO usuario1 = new UsuarioDTO();
            usuario1.setUssername("nwpablo");
            usuario1.setPassword("123456");
            usuarioJDBC.insertar(usuario1);
            
            // Actualizar UsuarioDTO
            usuario1 = new UsuarioDTO(5, "sophi", "987654321");
            usuarioJDBC.actualizar(usuario1);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            try {
                System.out.println("Entramos en modo RollBack: ");
                conexion.rollback();
                ex.printStackTrace(System.out);
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
                System.out.println("");
            }
        }

    }
}
