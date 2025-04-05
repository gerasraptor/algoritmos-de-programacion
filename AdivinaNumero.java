/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero;

/**
 *
 * @author 52449
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("Adivina el numero entre 1 y 100");
        
        do {
            System.out.print("Ingrese su suposicion: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero valido.");
                scanner.next();
            }
            intento = scanner.nextInt();
            
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("Felicidades! Has adivinado el numero.");
            }
        } while (intento != numeroAleatorio);
        
        scanner.close();
    }
}

