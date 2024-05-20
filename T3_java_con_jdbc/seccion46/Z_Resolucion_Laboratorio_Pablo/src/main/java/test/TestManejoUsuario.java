package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //usuarioDAO.insertarUsuario(new Usuario("nwpablo", "123456"));
        usuarioDAO.editarUsuario(new Usuario(4, "Sophi", "2015"));
        List<Usuario> usuarios = usuarioDAO.listarUsuarios();
        
        usuarios.forEach( usuario -> {
            System.out.println("usuario = " + usuario);
        } );
        
        

    }
}
