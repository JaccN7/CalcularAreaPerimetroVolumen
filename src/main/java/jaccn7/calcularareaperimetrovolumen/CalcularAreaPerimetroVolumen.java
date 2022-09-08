/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jaccn7.calcularareaperimetrovolumen;

import java.util.Scanner;

/**
 *
 * @author JaccN7
 */
public class CalcularAreaPerimetroVolumen {

    public static void main(String[] args) {
        int opcion, a, b, c;
        System.out.println("Calcular Area, Perimetro o Volumen");
        System.out.println("Ingrese el numero de la operación a realizar:");
        System.out.println("1.- Area\n2.- Perimetro\n3.- Volumen");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        while( opcion != 1 && opcion != 2 && opcion != 3 ){
            System.out.println("La opcion elegida es: " + opcion + ", la cual no corresponde a una opcion valida.\n" );
            System.out.println("Por favor ingrese una opcion valida: \n");
            opcion = scanner.nextInt();
        }
        
        System.out.println("Para realizar un calulo debe ingresar un numero entero.");
        switch (opcion) {
            case 1:
                System.out.println("Se calculara el area.\nIngrese la base");
                a = scanner.nextInt();
                System.out.println("Ingrese la altura: ");
                b = scanner.nextInt();
                Area area = new Area(a,b);
                System.out.println("El area es: " + area.calcularArea(b, a));
                break;
            case 2:
                System.out.println("");
                Perimetro perimetro = new Perimetro();
                System.out.println("El perimetro es: " + perimetro);
                break;
            case 3:
                System.out.println("");
                Volumen volumen = new Volumen();
                System.out.println("El volumen es: " + volumen);
                break;
            default:
                System.out.println("No se pudo realizar la operación");
        }
    }
}
