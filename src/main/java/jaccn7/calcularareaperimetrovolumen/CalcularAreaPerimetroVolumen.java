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
        while (opcion != 1 && opcion != 2 && opcion != 3) {
            System.out.println("La opcion elegida es: " + opcion + ", la cual no corresponde a una opcion valida.\n");
            System.out.println("Por favor ingrese una opcion valida: \n");
            opcion = scanner.nextInt();
        }

        System.out.println("Este ejercicio considera el calculo para figuras geometricas cuadradas o rectangulares. Para realizar un calculo debe ingresar numeros enteros.");
        switch (opcion) {
            case 1 -> {
                System.out.println("Se calculara el area.");
                System.out.println("Area: Medida de la superficie. Multiplicar la base por la altura");
                System.out.println("Ingrese la base: ");
                a = scanner.nextInt();
                System.out.println("Ingrese la altura: ");
                b = scanner.nextInt();
                Area area = new Area(a, b);
                System.out.println("El area es: " + area.calcularArea());
            }
            case 2 -> {
                System.out.println("Se calculara el perimetro.");
                System.out.println("Perimetro: Equivale al contorno de la forma. Suma de las medidas de los lados");
                System.out.println("Ingrese el valor del lado A: ");
                a = scanner.nextInt();
                System.out.println("Ingrese el valor del lado B: ");
                b = scanner.nextInt();
                Perimetro perimetro = new Perimetro(a, b);
                System.out.println("El perimetro es: " + perimetro.calcularPerimetro());
            }
            case 3 -> {
                System.out.println("Se calculara el Volumen");
                System.out.println("Volumen: Corresponde al espacio que la forma ocupa. Multiplicación de la altura por el ancho y por el largo");
                System.out.println("Ingrese la altura: ");
                a = scanner.nextInt();
                System.out.println("Ingrese el ancho: ");
                b = scanner.nextInt();
                System.out.println("Ingrese el largo: ");
                c = scanner.nextInt();
                Volumen volumen = new Volumen(a, b, c);
                System.out.println("El volumen es: " + volumen.calcularVolumen());
            }
            default -> System.out.println("No se pudo realizar la operación");
        }
    }


}
