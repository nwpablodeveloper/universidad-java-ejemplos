package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;

public interface IAccesoDatos {
    
    void crear(String nombreArchivo); 
    boolean existe(String nombreArchivo);
    List<Pelicula> listar(String nombre);
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);
    String buscar(String nombreArchivo, String buscar);
    void borrar(String nombreArchivo);

}
