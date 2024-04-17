package test;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado ;
        
        try {
            // Ejecución
            resultado = 10 / 0;
            
            /*
                Si hay error en la ejcución va a llamar el Catch
            */
            
            // Declaramos una variable de tipo Expeption ( Clase existente de Java )
        } catch (Exception error) {
            // Llamamos al método para que nos muestre la pila de errores
            System.out.println("Ocurrio un error:\n");
            error.printStackTrace(System.out);
        }
    }
}
