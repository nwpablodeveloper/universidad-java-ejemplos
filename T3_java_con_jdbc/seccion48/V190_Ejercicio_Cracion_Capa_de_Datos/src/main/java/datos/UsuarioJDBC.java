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

    private Connection conexionTransaccion;

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

    public UsuarioJDBC() {
    }

    public UsuarioJDBC(Connection conexionTransaccion) {
        this.conexionTransaccion = conexionTransaccion;
    }

    public List<Usuario> seleccionar() throws SQLException {

        List<Usuario> usuarios = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = this.conexionTransaccion != null
                    ? this.conexionTransaccion
                    : getConnection();

            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("usuario");
                String password = rs.getString("password");

                usuarios.add(new Usuario(idUsuario, username, password));
            }

            
        } finally {
            try {
                close(rs);
                close(stmt);
                if (this.conexionTransaccion == null) {
                    close(conn);
                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccion != null
                    ? this.conexionTransaccion
                    : getConnection();

            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUssername());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();

            
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccion == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccion != null
                    ? this.conexionTransaccion
                    : getConnection();
            
            stmt = conn.prepareStatement(SQL_UPDATE);

            System.out.println("usuario = " + usuario);

            stmt.setString(1, usuario.getUssername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            registros = stmt.executeUpdate();

            
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccion == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                System.out.println("Error al actualizar");
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int eliminar(Usuario usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccion != null
                    ? this.conexionTransaccion
                    : getConnection();
            
            stmt = conn.prepareStatement(SQL_ELIMINAR);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();

            
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccion == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return rows;
    }

    public void vaciarTabla() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = this.conexionTransaccion != null
                    ? this.conexionTransaccion
                    : getConnection();
            
            stmt = conn.prepareStatement("TRUNCATE TABLE usuarios");
            stmt.execute();
            
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccion == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                System.out.println("Error CLOSE: ");
                ex.printStackTrace(System.out);
            }
        }

    }
}
