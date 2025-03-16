/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masacorporal;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Masacorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        // Solicitar la altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        // Calcular el Índice de Masa Corporal (IMC)
        double imc = peso / (altura * altura);
        
        // Mostrar el resultado
        System.out.println("Su Indice de Masa Corporal (IMC) es: " + imc);
        
        // Cerrar el Scanner
        scanner.close();// TODO code application logic here
    }
    
}
