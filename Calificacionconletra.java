/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionconletra;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Calificacionconletra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calificacion;
        
        System.out.print("Ingrese la calificacion numerica (0-100): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        calificacion = scanner.nextInt();
        
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Error: La calificacion debe estar entre 0 y 100.");
        } else {
            char letra;
            if (calificacion >= 90) {
                letra = 'A';
            } else if (calificacion >= 80) {
                letra = 'B';
            } else if (calificacion >= 70) {
                letra = 'C';
            } else if (calificacion >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }
            
            System.out.println("La calificacion en letra es: " + letra);
        }
        
        scanner.close();
    }
}
