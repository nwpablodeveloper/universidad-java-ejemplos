package test;

import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {

        Dias dia1 = Dias.LUNES;
        System.out.println("dia 1 = " + dia1 + "\n");
        
        indicarDiaSemana(Dias.LUNES);
        indicarDiaSemana(Dias.JUEVES);
        indicarDiaSemana(Dias.MIERCOLES);
    }

    private static void indicarDiaSemana(Dias dia) {
        switch (dia) {
            case LUNES:
                System.out.println(dia + ": Primer dia");
                break;
            case MARTES:
                System.out.println(dia + ": Segundo dia");
                break;
            case MIERCOLES:
                System.out.println(dia + ": Tercer dia");
                break;
            default:
                System.out.println(dia + ": no se encontro");
        }
    }
}
