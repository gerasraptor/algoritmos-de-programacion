/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirelementos;

/**
 *
 * @author 52449
 */
import java.util.Scanner;
import java.util.Arrays;

public class InvertirElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[5 - i];
            numeros[5 - i] = temp;
        }

        System.out.println(Arrays.toString(numeros));
    }
}