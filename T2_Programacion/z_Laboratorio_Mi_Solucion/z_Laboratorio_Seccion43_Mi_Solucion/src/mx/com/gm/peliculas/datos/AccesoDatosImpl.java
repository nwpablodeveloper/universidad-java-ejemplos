package mx.com.gm.peliculas.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public class AccesoDatosImpl implements IAccesoDatos{
    
    private List<Pelicula> listaPeliculas = new ArrayList<>();
    
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx{
    
        File archivo = new File(nombreRecurso);
        
        return true;
        
    }
    
}
