package test;

import datos.Conexion;
import datos.*;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            
            // Conexion a la db
            conexion = Conexion.getConnection();

            if (conexion.getAutoCommit() == true) {
                conexion.setAutoCommit(false);
            }
            
            // Cracion del Objeto declarandolo con su Interface
            UsuarioDAO usuarioDaoJDBC = new UsuarioDaoJDBC(conexion);

            // Cración del objeto usuario
            UsuarioDTO usuario1 = new UsuarioDTO();
            usuario1.setUssername("nwpablo");
            usuario1.setPassword("123456");
            
            // Preprarando para insertar
            usuarioDaoJDBC.insertar(usuario1);

            // Cración para actualizar un Objecto de tipo Usuario
            usuario1 = new UsuarioDTO(5, "sophi", "987654321");
            
            // Prparando para actualizar
            usuarioDaoJDBC.actualizar(usuario1);
            
            List<UsuarioDTO> usuarios = usuarioDaoJDBC.seleccionar();
            
            // Mostrar la lsita de usuarios de la db
            usuarios.forEach( usuario -> { 
                System.out.println(usuario);
            });
            
            
            // Ejectuar todas las querys preparaciones
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
