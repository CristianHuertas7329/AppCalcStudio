package Modelo;

/**
 *
 * @author cahr913
 */


public abstract class Poligono {
    // atributos
    private int numeroDeLados;
    
    
    // constructor 
    public Poligono(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }
    
    //get and setters
    public int getNumeroDeLados() {return numeroDeLados;}
    public void setNumeroDeLados(int numeroDeLados) {this.numeroDeLados = numeroDeLados;}
    
    // metodos abstractors para implementar en subclases
    public abstract double area();
    public abstract double perimetro();
    
    
    
    
    
}
