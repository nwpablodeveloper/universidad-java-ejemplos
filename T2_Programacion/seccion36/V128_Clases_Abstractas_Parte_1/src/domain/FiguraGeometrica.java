package domain;

/*
    Clase abstracta por que tiene un método abstracto
    Si tenemos clases padre abstractas procederemos a trabajar con sus clases
    hijas
*/
public abstract class FiguraGeometrica {
    
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    // Implementación de un método Abstracto
    public abstract void dibujo();

    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
