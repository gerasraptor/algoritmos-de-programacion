/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaelementos;

/**
 *
 * @author 52449
 */
import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);
    }
}