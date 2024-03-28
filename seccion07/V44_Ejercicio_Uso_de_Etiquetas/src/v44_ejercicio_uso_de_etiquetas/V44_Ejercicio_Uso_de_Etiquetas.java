package v44_ejercicio_uso_de_etiquetas;

public class V44_Ejercicio_Uso_de_Etiquetas {

    public static void main(String[] args) {

        inicio:
        for ( int j = 0; j < 3; j++ ) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + "-> Es Par");
                    continue inicio;
                }
            }
        }
    }

}
