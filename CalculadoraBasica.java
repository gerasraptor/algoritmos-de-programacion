/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;


public class CalculadoraBasica {
   public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Menu de Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double num2 = scanner.nextDouble();

                if (opcion == 1) {
                    System.out.println("Resultado: " + (num1 + num2));
                }

                if (opcion == 2) {
                    System.out.println("Resultado: " + (num1 - num2));
                }

                if (opcion == 3) {
                    System.out.println("Resultado: " + (num1 * num2));
                }

                if (opcion == 4) {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                }
            }

            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida.");
            }
        }
        scanner.close();
    }
}
