package test;

import datos.UsuarioDAO;
import domain.Usuario;

public class TestManejoUsuario {
    public static void main(String[] args) {
        
        UsuarioDAO usuario = new UsuarioDAO();
        
        usuario.insertarUsuario( new Usuario("nwpablo", "123456") );
        
    }
}
