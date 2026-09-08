package Modelo;

public class Cuadrado extends Poligono{
    // Atributo
    private double lado;
    
    // Constructor
    public Cuadrado(double lado, int numeroDeLados) {
        super(numeroDeLados);
        this.lado = lado;
    }

    // Getters y setters
    public double getLado() {return lado;}
    public void setLado(double lado) {this.lado = lado;}
    
    // metodos Abstractos
    @Override
    public double area(){
        return (Math.pow(lado, 2));
    }
    
    @Override
    public double perimetro(){
        return (4 * (lado));
    }
}
