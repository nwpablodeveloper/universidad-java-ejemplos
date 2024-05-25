package datos;

import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    
    public List<UsuarioDTO> seleccionar() throws SQLException;
    public int insertar() throws SQLException;
    public int actualizar() throws SQLException;
    public int eliminar() throws SQLException;
    public void vaciarTabla() throws SQLException;
    
    
}
