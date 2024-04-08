package test;

public class TestArreglos {
    public static void main(String[] args) {
        
        /*
            Los arreglos en Java son declarados como un objeto y no puden ser
            modificados sus valores de forma dinamica. Los mismo se definenen
            poniendo unos corchetes al principio de su nombre o al final
        */
        
        String []nombres = new String[5];
        int edades[] = new int[5];
        
        edades[0] = 8;
        edades[1] = 35;
        edades[2] = 36;
        edades[3] = 12;
        edades[4] = 25;
        
        System.out.println("edades = " + edades[3]);
    }
}
