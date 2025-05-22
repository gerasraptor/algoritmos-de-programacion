/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaredad;

import java.util.Scanner;

public class VerificarEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (puedeVotar(edad)) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }

        scanner.close();
    }

    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }
}
