package v31_ejercicio_precedencia_de_operadores;

public class V31_Ejercicio_Precedencia_de_Operadores {

    public static void main(String[] args) {
        
        var x = 5;
        var y = 10;
        
        var z = ++x + y--;
        // var z = ++5 + 10--;
        // var z = 6 + 10--;
        // var z = 16;
        // var y = 9;
        
        var resultado = 4 + 5 * 6 / 3;
        // var resultado = 4 + 10;
        // var resultado = 14;
        
        resultado = ( 4 + 5 ) * 6 / 3;
        // resultado = ( 4 + 5 ) * 6 / 3;
        // resultado =  9 * 6 / 3;
        // resultado =  18;
        
    }

}
