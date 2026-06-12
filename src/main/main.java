/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import FigurasGeometricas.FigGeo;
import circulo.Circulo;
/**
 *
 * @author Student
 */
public class main {
    public static void main(String[] args ){
        Circulo c1 = new Circulo(2);
        c1.calcularPerimetro();
        c1.calcularArea();
        System.out.println(c1.getRadio());
        System.out.println(c1.getDiametro());
        System.out.println(c1.getPerimetro());
        System.out.println(c1.getArea());
        
        
    }
}
