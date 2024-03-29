package v11.ejercicios.concatenacion;

public class V11EjerciciosConcatenacion {

    public static void main(String[] args) {

        // Unir variables con el operador +
        var usuario = "Pablo";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

        // No es recomendable usar nombres tan cortos en el nombre de las variables
        var i = 3;
        var j = 5;

        /* 
            Se ejecuta de Izquierda a derecha
            y se van a realizar primeros los calculos
            si en caso contrario primero hay un string, el resto solo
            se concatena sin realizar ningun calculo
         */
        System.out.println(i + j); // Se suma
        System.out.println(i + j + usuario); // 1ro se suma

        // Java lo reconoce como contexto de cadena
        System.out.println(usuario + i + j);

        /*
            Podemos modificar la prioridad con los parentesis
            primero se va a ejecutar lo que hay en tre parentesis
         */
        System.out.println(usuario + (i + j));
    }
}
