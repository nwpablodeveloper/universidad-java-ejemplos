package v43_ejercicio_palabra_break_continue;

public class V43_Ejercicio_Palabra_Break_Continue {
    public static void main(String[] args) {
        
        System.out.println("BREAK");
        for(int contador = 1 ; contador < 10 ; contador++){
            if(contador % 2 == 0){
                System.out.println(contador + " => Es par ");
                System.out.println("Fin del ciclo con break");
                break;
            }
        }
        
        System.out.println("");
        System.out.println("CONTINUE");
        
        for(int contador = 1 ; contador < 10 ; contador++){
            if(contador % 2 != 0){
                continue;
            }
            System.out.println("contador = " + contador);
        }
        
        
    }
    
}
