/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordigitos;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Contadordigitos {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        
        int temp = Math.abs(numero);
        do {
            temp /= 10;
            contador++;
        } while (temp > 0);
        
        System.out.println("El numero tiene " + contador + " digitos.");
        scanner.close();
    }
}
