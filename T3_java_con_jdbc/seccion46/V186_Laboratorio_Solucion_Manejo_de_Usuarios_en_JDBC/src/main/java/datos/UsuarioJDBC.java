package datos;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioJDBC {
    
 private static final String SQL_SELECT = "SELECT "
            + "id_usuario, "
            + "usuario, "
            + "password "
            + "FROM usuarios";
 
    private static final String SQL_INSERT = "INSERT INTO usuarios "
            + "(usuario, password) "
            + "VALUES(?,?)";

    private static final String SQL_UPDATE = "UPDATE usuarios SET "
            + "usuario = ?, "
            + "password = ? "
            + "WHERE id_usuario = ?";

    private static final String SQL_ELIMINAR = "DELETE FROM usuarios "
            + "WHERE id_usuario = ?";
    

    public List<Usuario> seleccionar() {

        List<Usuario> usuarios = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("usuario");
                String password = rs.getString("password");


                usuarios.add(new Usuario(idUsuario, username, password));
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return usuarios;
    }

    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUssername());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al Insertar");
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int actualizar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            System.out.println("usuario = " + usuario);

            stmt.setString(1, usuario.getUssername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el usuario: ");
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(stmt);
            } catch (SQLException ex) {
                System.out.println("Error al actualizar");
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }
    
    public int eliminar(Usuario usuario){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0 ;
        
        try {
            
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_ELIMINAR);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al ELIMINAR: ");
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return rows;
    }
    
    public void vaciarTabla(){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement("TRUNCATE TABLE usuarios");
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("TRUNCATE TABLE ERROR: ");
            ex.printStackTrace(System.out);
        } finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                System.out.println("Error CLOSE: ");
                ex.printStackTrace(System.out);
            }
        }
        
    }    
}
