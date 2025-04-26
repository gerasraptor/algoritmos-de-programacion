/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoordenamiento;

/**
 *
 * @author 52449
 */
import java.util.Scanner;
import java.util.Arrays;

public class MetodoOrdenamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos que desea agregar al arreglo:");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingrese cada numero para llenar el arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo ordenado en orden ascendente: " + Arrays.toString(arreglo));
    }
}