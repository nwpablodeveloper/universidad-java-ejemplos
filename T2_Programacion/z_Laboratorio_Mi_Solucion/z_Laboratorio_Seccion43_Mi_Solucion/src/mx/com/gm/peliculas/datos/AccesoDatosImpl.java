package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements IAccesoDatos{
    
    private List<Pelicula> listaPeliculas = new ArrayList<>();
    
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx{
    
        File archivo = new File(nombreRecurso);
        return archivo.exists();
        
    }
    
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx{
        
        File archivo = new File(nombreRecurso);
        List<Pelicula> lista = new ArrayList<>();
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            
            String lectura = entrada.readLine();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
