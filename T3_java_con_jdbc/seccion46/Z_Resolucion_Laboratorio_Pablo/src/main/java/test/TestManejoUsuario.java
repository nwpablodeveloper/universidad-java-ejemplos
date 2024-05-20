package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //usuarioDAO.insertarUsuario(new Usuario("nwpablo", "123456"));

        List<Usuario> usuarios = usuarioDAO.listarUsuarios();
        
        usuarios.forEach( usuario -> {
            System.out.println("usuario = " + usuario);
        } );
        
        

    }
}
