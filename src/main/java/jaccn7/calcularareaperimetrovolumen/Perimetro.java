/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaccn7.calcularareaperimetrovolumen;

/**
 *
 * @author JaccN7
 */
public class Perimetro {
    
    int ladoA;
    int ladoB;
    int perimetro;
    
    public Perimetro(){}
    
    public Perimetro(int ladoA, int ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        System.out.println("Se tienen las sigueintes medidas:\n *Lado A: " + ladoA + "\n *Lado B: " + ladoB);
    }
    
    public int calcularPerimetro(){
        perimetro = ladoA * ladoB;
        return perimetro;
    }
    
}
