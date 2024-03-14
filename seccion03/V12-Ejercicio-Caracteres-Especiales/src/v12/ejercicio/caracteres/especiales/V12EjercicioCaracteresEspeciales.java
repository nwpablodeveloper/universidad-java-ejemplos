package v12.ejercicio.caracteres.especiales;

public class V12EjercicioCaracteresEspeciales {

    public static void main(String[] args) {

        var nombre = "Pablo";
        
        // Usamos el caracter de escape alt+92 \

        // Caracter de salto de linea
        System.out.println("Nueva Linea: \n " + nombre);

        // Caracter de Tabulador
        System.out.println("Tabulador: \t " + nombre);

        // Carecter de retroceso ( en este ejemplo esta borrando el espacio)
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceder 2 lugares: \b\b " + nombre);  

        // Comillas simples no necesita el caracter de escape
        System.out.println("comilla simplre: \'" + nombre + "\'");
        System.out.println("comilla simplre: '" + nombre + "'");
        
        // Comillas dobles
        System.out.println("Comillas dobles: \"" + nombre + "\"");
        
    }
}
