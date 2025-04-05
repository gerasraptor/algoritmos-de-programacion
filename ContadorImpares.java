/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorimpares;

import java.util.Scanner;

public class ContadorImpares {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 1;

        System.out.print("Ingrese un numero entero positivo: ");
        numero = scanner.nextInt();

        do {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        } while (contador <= numero);

        scanner.close();
    }
}
 