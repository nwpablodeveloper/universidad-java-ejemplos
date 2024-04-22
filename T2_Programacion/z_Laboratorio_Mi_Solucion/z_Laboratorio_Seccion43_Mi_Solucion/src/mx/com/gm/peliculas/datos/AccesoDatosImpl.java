package mx.com.gm.peliculas.datos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos{
    
    private List<Pelicula> listaPeliculas = new ArrayList<>();
    
    @Override
    public void crear(String nombreArchivo){
        File archivo = new File(nombreArchivo);
    }
    
    @Override
    public boolean existe(String nombreArchivo){
        return false;
    }
    
    @Override
    public List<Pelicula> listar(String nombre){
        return this.listaPeliculas;
    }
    
    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar){
        
    }
    
    @Override
    public String buscar(String nombreArchivo, String buscar){
        return "Nombre";
    }
    
    @Override
    public void borrar(String nombreArchivo){
        
    }
    
}
