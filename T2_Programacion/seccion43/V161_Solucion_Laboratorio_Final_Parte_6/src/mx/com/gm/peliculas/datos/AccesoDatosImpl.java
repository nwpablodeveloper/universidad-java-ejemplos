package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List<Pelicula> listaPeliculas = new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while( linea != null ){
                var pelicula = new Pelicula(linea);
                listaPeliculas.add(pelicula);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar las peliculas");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar las peliculas");
        }
        return listaPeliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecuros, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreRecuros);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito info en el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Error al escribir el archivo");
        }
        
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while( linea != null ){
                if(buscar != null && buscar.equals(linea)){
                    resultado = "Pelicula " + linea + "Encontrada en el indice: "+ indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Error al buscar ");
        } catch (IOException ex) {
            throw new LecturaDatosEx("Error al buscar ");
        }
        
            
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
    }

}