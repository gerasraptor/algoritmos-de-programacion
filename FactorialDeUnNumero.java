/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialdeunnumero;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        BigInteger factorial = BigInteger.ONE;

        System.out.print("Ingrese un numero entero positivo: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Error: El numero debe ser positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}