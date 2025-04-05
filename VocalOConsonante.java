/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalnovocal;


import java.util.Scanner;

public class VocalOConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingrese letras para verificar si son vocales o consonantes (espacio para salir):");
        
        do {
            System.out.print("Ingrese una letra: ");
            letra = scanner.next().toLowerCase().charAt(0);
            
            if (letra == ' ') {
                break;
            } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("Es una vocal.");
            } else if (Character.isLetter(letra)) {
                System.out.println("Es una consonante.");
            } else {
                System.out.println("Entrada no valida.");
            }
        } while (true);
        
        scanner.close();
    }
}
