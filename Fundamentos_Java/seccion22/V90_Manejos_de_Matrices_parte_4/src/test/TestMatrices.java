package test;

public class TestMatrices {

    public static void main(String[] args) {

        /*
            Sintaxis simplificada
         */
        String frutas[][] = {
            {"Naranja", "Limon","Mandarina"},
            {"Frutillas", "Ciruelas"}
        };

        for (int rows = 0; rows < frutas.length; rows++) {
            for (int cols = 0; cols < frutas[rows].length; cols++) {
                System.out.println("fruta["+rows+"]["+cols+"] = " + frutas[rows][cols]);
            }
        }
            
    }
}
