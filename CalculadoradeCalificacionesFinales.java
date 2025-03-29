/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradecalificacionesfinales;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class CalculadoradeCalificacionesFinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
        double parciales, proyecto, examenFinal, notaFinal;
        
        
        parciales = obtenerCalificacion(scanner, "Parciales");
        proyecto = obtenerCalificacion(scanner, "Proyecto");
        examenFinal = obtenerCalificacion(scanner, "Examen Final");
        
        notaFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
        System.out.printf("\nLa calificacion final es: %.2f\n", notaFinal);
        
        scanner.close();
    }
    
        private static double obtenerCalificacion(Scanner scanner, String tipoNota) {
        double calificacion;
        do {
            System.out.print("Ingrese la calificacion de " + tipoNota + " (0-100): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un numero valido.");
                scanner.next(); 
            }
            calificacion = scanner.nextDouble();
            
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("Error: La calificacion debe estar entre 0 y 100.");
            }
        } while (calificacion < 0 || calificacion > 100);
        
        return calificacion;
    }
}   // TODO code application logic here
 
