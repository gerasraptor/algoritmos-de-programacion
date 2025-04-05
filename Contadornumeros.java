/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadornumeros;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Contadornumeros {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad, numero, mayores = 0, menores = 0, iguales = 0;
        
        System.out.print("Ingrese la cantidad de numeros a ingresar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        cantidad = scanner.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un numero: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero valido.");
                scanner.next();
            }
            numero = scanner.nextInt();
            
            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }
        
        System.out.println("Numeros mayores que 0: " + mayores);
        System.out.println("Numeros menores que 0: " + menores);
        System.out.println("Numeros iguales a 0: " + iguales);
        
        scanner.close();
    }
}