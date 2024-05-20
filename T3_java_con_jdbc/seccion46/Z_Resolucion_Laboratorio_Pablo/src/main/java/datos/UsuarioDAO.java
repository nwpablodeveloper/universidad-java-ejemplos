package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    
    private static final String SQL_INSERT = "INSERT INTO usuarios"
            + "(usuario, password)"
            + "VALUES(?,?)";

    private static final String SQL_SELECT = "SELECT "
            + "id_usuario, "
            + "usuario, "
            + "password "
            + "FROM usuarios";
    
    private static final String SQL_UPDATE = "UPDATE usuarios SET "
            + "usuario = ?, "
            + "password = ? "
            + "WHERE id_usuario = ?";
    
    private static final String SQL_DELETE = "DELETE FROM usuarios "
            + "WHERE id_usuario = ?";
    
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
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while ( res.next() ) {                
                int idUsuario = res.getInt("id_usuario");
                String usuario = res.getString("usuario");
                String password = res.getString("password");
                
                usuarios.add(new Usuario(idUsuario, usuario, password));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al listar los usuarios");
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                System.out.println("Error al cerrar las conexiones");
                ex.printStackTrace(System.out);
            }
        }
        
        return usuarios;
        
    }
    
    public void editarUsuario(Usuario usuario){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al conectarse para editar el usuario: ");
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
            } catch (SQLException ex) {
                System.out.println("Error al cerrar las conexiones en editar usuario");
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public void  eliminar(Usuario usuario){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareCall(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.execute();
            
        } catch (SQLException ex) {
            System.out.println("Error al conectarse para eliminar el usuario");
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(stmt);
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion de eliminar usuario");
                ex.printStackTrace(System.out);
            }
        }
    }
    
}
