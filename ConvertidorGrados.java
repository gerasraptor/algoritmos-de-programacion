/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidorgrados;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class ConvertidorGrados {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, resultado;
        int opcion;
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        celsius = scanner.nextDouble();
        
        System.out.println("Seleccione la conversion:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.print("Opcion: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar una opcion valida.");
            scanner.next();
        }
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                resultado = (celsius * 9/5) + 32;
                System.out.printf("Temperatura en Fahrenheit: %.2f\n", resultado);
                break;
            case 2:
                resultado = celsius + 273.15;
                System.out.printf("Temperatura en Kelvin: %.2f\n", resultado);
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        
        scanner.close();
    }
}
    /**
     * @param args the command line arguments
     */
