package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

public class ManejoUsuarios {

    public static void main(String[] args) {

        UsuarioJDBC usuario = new UsuarioJDBC();
        List<Usuario> usuarios = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            usuario.insertar(new Usuario("nwpablo " + i, "100."+i));
        }
       
        usuario.actualizar(new Usuario(4, "nwsophi", "2015"));
        usuario.eliminar(new Usuario(8));
        
        usuarios = usuario.seleccionar();
        usuarios.forEach(user -> {
            System.out.println("user = " + user);
        });
        
        
        usuario.vaciarTabla();

    }
}
