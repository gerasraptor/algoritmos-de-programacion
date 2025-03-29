/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciodescuento;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class PRECIODESCUENTO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioOriginal, precioFinal, descuento;
        
        System.out.print("Ingrese el precio original del producto: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        precioOriginal = scanner.nextDouble();
        
        if (precioOriginal <= 100) {
            descuento = 0;
        } else if (precioOriginal <= 200) {
            descuento = 0.10;
        } else if (precioOriginal <= 500) {
            descuento = 0.20;
        } else {
            descuento = 0.25;
        }
        
        precioFinal = precioOriginal - (precioOriginal * descuento);
        
        System.out.printf("El precio final despues del descuento es: %.2f\n", precioFinal);
        
        scanner.close();
    }
}

        // TODO code application logic here
   
