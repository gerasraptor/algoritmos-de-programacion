/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirnombres;

import java.util.Scanner;

public class ConvertirNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        while (true) {
            System.out.print("Ingresa un nombre en minusculas (o escribe 'salir' para terminar): ");
            entrada = scanner.nextLine();

        if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Programa finalizado.");
                break;
            }

            String nombreMayusculas = entrada.toUpperCase();
            System.out.println("Nombre en mayusculas: " + nombreMayusculas);
        }

        scanner.close();
    }
}
