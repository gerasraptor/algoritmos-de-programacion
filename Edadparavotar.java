/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadparavotar;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Edadparavotar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Usted es elegible para votar.");
        } else {
            System.out.println("Usted no es elegible para votar.");
        }
        
        scanner.close();
    }
}