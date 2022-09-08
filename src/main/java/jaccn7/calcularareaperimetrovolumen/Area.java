/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaccn7.calcularareaperimetrovolumen;

/**
 *
 * @author JaccN7
 */
public class Area {
    
    int base;
    int altura;
    int area;
    
    public Area(){}
    
    public Area(int base, int altura){
        this.base = base;
        this.altura = altura;
        System.out.println("Se tienen las sigueintes medidas del Area: \n *Base: " + base + "\n *Altura: " + altura);
    }
    
    public int calcularArea(int base, int altura){
        area = base * altura;
        return area;
    }
    
}
