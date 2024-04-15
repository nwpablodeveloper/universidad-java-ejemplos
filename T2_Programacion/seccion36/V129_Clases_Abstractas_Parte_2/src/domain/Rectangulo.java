package domain;

public class Rectangulo extends FiguraGeometrica{
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    /*
        En este caso estamos implementando el método ya que en la clase Padre
        no se implemento nada en el mimso metodo
    */
    @Override
    public void dibujar(){
        // Imprimir nombre de la clase
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
