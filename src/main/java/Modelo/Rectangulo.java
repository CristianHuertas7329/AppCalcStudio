/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cahr913
 */
public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;
    
    // contructor 
    public Rectangulo(double lado1, double lado2, int numeroDeLados) {
        super(numeroDeLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Getters y Setters
    public double getLado1() {return lado1;}
    public void setLado1(double lado1) {this.lado1 = lado1;}

    public double getLado2() {return lado2;}
    public void setLado2(double lado2) {this.lado2 = lado2;}
    
    // implementar metodos abstractos
    @Override
    public double area(){
        return (lado1 * lado2);        
    }
    
    @Override
    public double perimetro(){
        return (lado1 + lado2);        
    }
    
    
    
    
    
    
    
    
    
    
    
}
