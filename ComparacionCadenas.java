/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacioncadenas;
import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        // Comparación de longitud
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen diferente longitud.");
        }

        // Comparación de contenido
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de ambas cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }

        scanner.close();
    }
}
