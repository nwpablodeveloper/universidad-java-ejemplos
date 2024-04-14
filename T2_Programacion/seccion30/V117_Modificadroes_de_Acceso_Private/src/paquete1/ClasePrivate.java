package paquete1;

/*
    Si no tiene modificadro es una clase DEFAULT, la misma solo puede ser 
    accedida desde el mismo paquete
*/
class ClasePrivate {
    
    /*
        La ausencia del modificador indica que es de tipo DEFAULT o PACKAGE
    */
    private String atributoPrivate = "Valor Atributo Private";
    
    
    /*
        La ausencia del modificador indica que es de tipo DEFAULT
    */
    private ClasePrivate(){
        System.out.println("Contructor Private");
    }
    
    /*
        Necesitamos de un 2do constructor que sea public con 1 minimo argumento
        para poder llamar a nuestro constructor Privado
    */
    public ClasePrivate(String arg){
        this();
        System.out.println("Constructor publico " + arg);
    }
    
    private void metodoPrivate(){
        System.out.println("Método Private");
    }

    public String getAtributoPrivate() {
        return this.atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
    
}
