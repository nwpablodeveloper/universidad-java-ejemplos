package accesodatos;

public interface IAccesoDatos {
    /*
        Las interfaces dectectan automaticamente a todas las variables
        como constantes. ( public final static ).
        Estamos obligados a asignarles un valor.
    */
    int MAX_REGISTROS = 10;
    
    /*
        Cualquier métdo que declaremos va a ser de modificador público y 
        abstracto
    */
    
    /* 
        método abstratoc ( ver con Ctrl. y mouse arriba )
        public abstract void...
    */
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
