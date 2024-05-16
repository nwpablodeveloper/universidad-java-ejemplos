package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT "
            + "id_persona, "
            + "nombre, "
            + "apellido, "
            + "email, "
            + "telefono "
            + "FROM test.personas";

    private static final String SQL_INSERT = "INSERT INTO personas(nombre, apellido, email, telefono) "
            + "VALUES(?,?,?,?)";

    private static final String SQL_EDITAR = "UPDATE personas SET "
            + "nombre = ?, "
            + "apellido = ?, "
            + "email = ?, "
            + "telefono = ? "
            + "WHERE id_persona = ?";

    private static final String SQL_ELIMINAR = "DELETE FROM persnas WEHRE id_persona = ?";

    public List<Persona> seleccionar() {

        List<Persona> personas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);

                personas.add(persona);
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

        return personas;
    }

    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            // Cada nro corresponde a la posición del signo de pregunta que esta en la query
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
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

    public Persona editar(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_EDITAR);

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(stmt);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return persona;
    }
    
    public void eliminar(int id_persona){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_ELIMINAR);
            stmt.setInt(1, id_persona);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    }
}
