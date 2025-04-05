/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciaaritmetica;

import java.util.Scanner;
public class SecuenciaAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero, diferencia, numeroMaximo, actual;

        System.out.print("Ingrese el primer numero de la secuencia: ");
        primerNumero = scanner.nextInt();

        System.out.print("Ingrese la diferencia entre los numeros: ");
        diferencia = scanner.nextInt();

        System.out.print("Ingrese el numero maximo hasta donde quiere llegar: ");
        numeroMaximo = scanner.nextInt();

        actual = primerNumero;

        do {
            System.out.println(actual);
            actual = actual + diferencia;
        } while (actual <= numeroMaximo);

        scanner.close();
    }
}
