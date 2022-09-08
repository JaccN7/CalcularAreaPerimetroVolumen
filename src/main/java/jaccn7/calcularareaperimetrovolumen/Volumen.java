/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaccn7.calcularareaperimetrovolumen;

/**
 *
 * @author JaccN7
 */
public class Volumen {
    
    int altura;
    int ancho;
    int largo;
    int volumen;
    
    public Volumen(){}
    
    public Volumen(int altura, int ancho, int largo){
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        System.out.println("Se tienen las siguientes medidas del volumen:\n Altura: " + altura + "\n *Ancho: " + ancho + "\n *Largo: " + largo);
    }
    
    public int calcularVolumen(int altura, int ancho, int largo){
        volumen = altura * ancho * largo;
        return volumen;
    }
    
}
