package paquete1;

/*
    Si no tiene modificadro es una clase DEFAULT, la misma solo puede ser 
    accedida desde el mismo paquete
*/
class ClaseDefault {
    
    /*
        La ausencia del modificador indica que es de tipo DEFAULT o PACKAGE
    */
    String atributoDefault = "Valor Atributo default o Package";
    
    
    /*
        La ausencia del modificador indica que es de tipo DEFAULT
    */
    ClaseDefault(){
        System.out.println("Contructor Default o Package");
    }
    
    void metodoDefault(){
        System.out.println("Método Default o Package");
    }
    
}
