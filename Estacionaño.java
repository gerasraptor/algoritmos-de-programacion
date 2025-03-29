/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionaño;

/**
 *
 * @author 52449
 */
public static void main(String[] args) {
{
Scanner scanner = new Scanner(System.in);
        int mes;
        
        System.out.print("Ingrese un numero de mes (1-12): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        mes = scanner.nextInt();
        
        String estacion;
        switch (mes) {
            case 12: case 1: case 2:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otono";
                break;
            default:
                estacion = "Numero de mes invalido";
        }
        
        System.out.println("La estacion del ano es: " + estacion);
        
        scanner.close();
    }
}

 