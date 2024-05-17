package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT "
            + "id_persona, "
            + "nombre, "
            + "apellido, "
            + "email, "
            + "telefono "
            + "FROM test.personas";

    private static final String SQL_INSERT = "INSERT INTO personas"
            + "(nombre, apellido, email, telefono) "
            + "VALUES(?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE personas SET "
            + "nombre = ?, "
            + "apellido = ?, "
            + "email = ?, "
            + "telefono = ? "
            + "WHERE id_persona = ?";

    private static final String SQL_ELIMINAR = "DELETE FROM personas "
            + "WHERE id_persona = ?";
    

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

    public int actualizar(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

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
                System.out.println("Error al actualizar");
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }
    
    public int eliminar(Persona persona){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0 ;
        
        try {
            
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_ELIMINAR);
            stmt.setInt(1, persona.getIdPersona());
            stmt.executeUpdate();
            
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
        
        return registros;
    }
    
    public void vaciarTabla(){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement("TRUNCATE TABLE personas");
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
