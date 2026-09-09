package Modelo;
public class Trapecio extends Poligono{
    //Atr9ibutos
    private double baseMenor;
    private double baseMayor;
    private double altura;
    private double lado1;
    private double lado2;

    // contructor
    public Trapecio(double baseMenor, double baseMayor, double altura, double lado1, double lado2, int numeroDeLados) {
        super(numeroDeLados);
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // getters y setters
    public double getBaseMenor() {return baseMenor;}
    public void setBaseMenor(double baseMenor) {this.baseMenor = baseMenor;}
    
    public double getBaseMayor() {return baseMayor;}
    public void setBaseMayor(double baseMayor) {this.baseMayor = baseMayor;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getLado1() {return lado1;}
    public void setLado1(double lado1) {this.lado1 = lado1;}

    public double getLado2() {return lado2;}
    public void setLado2(double lado2) {this.lado2 = lado2;}
    
    // metodos abstractos
    @Override
    public double area(){
        return ((baseMayor + baseMenor) / 2 * altura);
    }

     @Override
     public double perimetro(){
         return (baseMayor + baseMenor + lado1 + lado2);
     }
     
     
    
}
