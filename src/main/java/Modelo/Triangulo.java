package Modelo;

/**
 *
 * @author CAHR MASTER RACE
 */
public class Triangulo extends Poligono{
    // atributos
    private double lado1;
    private double lado2;
    private double lado3;
    
    // constructor

    public Triangulo(double lado1, double lado2, double lado3, int numeroDeLados) {
        super(numeroDeLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // getters y lo demas

    public double getLado1() {return lado1;}
    public void setLado1(double lado1) {this.lado1 = lado1;}
    public double getLado2() {return lado2;}
    public void setLado2(double lado2) {this.lado2 = lado2;}
    public double getLado3() {return lado3;}
    public void setLado3(double lado3) {this.lado3 = lado3;}
    
    @Override
    public double area(){
        double x = (perimetro() / 2);
        return (Math.sqrt(x *(x - lado1) * (x - lado2) * (x -  lado3)));
    }
    
    @Override
    public double perimetro(){
        return (lado1 + lado2 + lado3);
    }
}
