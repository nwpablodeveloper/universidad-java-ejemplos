package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {
    
    private static final String SQL_INSERT = "INSERT INTO usuarios"
            + "(usuario, password)"
            + "VALUES(?,?)";

    private static final String SQL_SELECT = "SELECT"
            + "id_usuario"
            + "usuario"
            + "password"
            + "WHERE usuarios";
    
    public void insertarUsuario(Usuario usuario){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar el usuario");
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
                ex.printStackTrace(System.out);
            }
        }
        
    }
    
    public List<Usuario> listarUsuarios(){
        
        List<Usuario> usuarios = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        Usuario usuario = null;
        
        
        return usuarios;
        
    }
    
}
