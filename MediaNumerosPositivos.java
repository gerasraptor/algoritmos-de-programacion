/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medianumerospositivos;

import java.util.Scanner;

public class MediaNumerosPositivos {
  public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese numeros positivos (numero negativo para salir):");

        do {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los numeros positivos es: " + media);
        } else {
            System.out.println("No se ingresaron numeros positivos.");
        }

        scanner.close();
    }
}