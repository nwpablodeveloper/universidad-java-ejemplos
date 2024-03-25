package Operadores_Condicionales;

public class Operador_Condicional_OR {
    public static void main(String[] args) {
        
        // El padre puede asistir al juego de su hijo ?
        
        var vacaciones = false;
        var diaDescanso = true;
        
        // Con que se cumpla 1 sola condición ya devuelve TRUE
        if( vacaciones || diaDescanso ) {
            System.out.println("Puede asistir al juego");
        } else {
            System.out.println("NO puede ir");
        }
        
    }
}
