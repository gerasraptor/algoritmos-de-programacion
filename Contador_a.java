/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador_a;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Contador_a {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        int contador = 0, i = 0;
        
        System.out.print("Ingrese una palabra: ");
        palabra = scanner.nextLine().toLowerCase();
        
        while (i < palabra.length()) {
            if (palabra.charAt(i) == 'a') {
                contador++;
            }
            i++;
        }
        
        System.out.println("La letra 'a' aparece " + contador + " veces.");
        
        scanner.close();
    }
}
 