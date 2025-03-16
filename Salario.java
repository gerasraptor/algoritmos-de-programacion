/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el salario bruto mensual
        System.out.print("Ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();
        
        // Solicitar el porcentaje de impuestos
        System.out.print("Ingrese el porcentaje de impuestos: ");
        double porcentajeImpuestos = scanner.nextDouble();
        
        // Solicitar las deducciones adicionales
        System.out.print("Ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();
        
        // Calcular el impuesto
        double impuesto = (salarioBruto * porcentajeImpuestos) / 100;
        
        // Calcular el salario neto
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
        
        // Mostrar el resultado
        System.out.println("El salario neto es: " + salarioNeto);
        
        // Cerrar el Scanner
        scanner.close();// TODO code application logic here
    }
    
}
