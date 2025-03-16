/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearecta;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Arearecta {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la base del rectángulo
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        
        // Solicitar la altura del rectángulo
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        
        // Calcular el área del rectángulo
        double area = base * altura;
        
        // Mostrar el resultado
        System.out.println("El área del rectangulo es: " + area);
        
        // Cerrar el Scanner
        scanner.close();
    }
}
