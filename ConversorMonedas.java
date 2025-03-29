/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormonedas;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class ConversorMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesos, resultado;
        int opcion;
        
        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        pesos = scanner.nextDouble();
        
        System.out.println("Seleccione la moneda a convertir:");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opcion: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar una opcion valida.");
            scanner.next();
        }
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                resultado = pesos * 0.059; 
                System.out.printf("Cantidad en Dolares (USD): %.2f\n", resultado);
                break;
            case 2:
                resultado = pesos * 0.054; 
                System.out.printf("Cantidad en Euros (EUR): %.2f\n", resultado);
                break;
            case 3:
                resultado = pesos * 2.13;
                System.out.printf("Cantidad en Bath (THB): %.2f\n", resultado);
                break;
            case 4:
                resultado = pesos * 8.67;
                System.out.printf("Cantidad en Yen (JPY): %.2f\n", resultado);
                break;
            case 5:
                resultado = pesos * 77.42;
                System.out.printf("Cantidad en Won (KRW): %.2f\n", resultado);
                break;
            case 6:
                resultado = pesos * 0.089;
                System.out.printf("Cantidad en Dolar Australiano (AUD): %.2f\n", resultado);
                break;
            case 7:
                resultado = pesos * 0.22;
                System.out.printf("Cantidad en Sol (PEN): %.2f\n", resultado);
                break;
            case 8:
                resultado = pesos * 0.081;
                System.out.printf("Cantidad en Dolar Canadiense (CAD): %.2f\n", resultado);
                break;
            case 9:
                resultado = pesos * 2.14;
                System.out.printf("Cantidad en Bolivar (VES): %.2f\n", resultado);
                break;
            case 10:
                resultado = pesos * 51.37;
                System.out.printf("Cantidad en Peso Argentino (ARS): %.2f\n", resultado);
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        
        scanner.close();
    }
} // TODO code application logic here

