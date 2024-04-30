package mx.com.gm.peliculas.negocio;

import java.util.List;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = this.datos.existe(NOMBRE_RECURSO);
            this.datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al agregar la pelicula");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            System.out.println("peliculas = " + peliculas);
            //for(Pelicula pelicula: peliculas){
              //  System.out.println("Pelicula: " + pelicula);
            //}
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al listar las peliculase");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            System.out.println("Resultado: " + resultado);
            
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula:");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            }else{
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar el catalogo de peliculs: ");
            ex.printStackTrace(System.out);
        }
        
    }

}
