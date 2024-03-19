package v20_tipos_primitivos_tipo_boolean;

public class V20_Tipos_Primitivos_tipo_boolean {
    public static void main(String[] args) {
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es false");
        }
        
        var edad = 17;
        // var esAdulto = edad >= 18;
        //System.out.println("esAdulto = " + esAdulto);
        
        //if( esAdulto ){
        if( edad >=18 ){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        
    }
}
