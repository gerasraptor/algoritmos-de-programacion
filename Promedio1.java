/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio1;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Promedio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los tres números al usuario
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer numero: ");
        double num3 = scanner.nextDouble();
        
        // Calcular el promedio
        double promedio = (num1 + num2 + num3) / 3;
        
        // Mostrar el resultado
        System.out.println("El promedio de los tres numeros es: " + promedio);
        
        // Cerrar el Scanner
        scanner.close();// TODO code application logic here
    }
    
}
