/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorpalabraingenieria;

import java.util.Scanner;

public class ContadorPalabraIngenieria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un texto largo:");
        String texto = scanner.nextLine();

       
        texto = texto.toLowerCase();

       
        String palabraClave = "ingenieria";
        int contador = 0;
        int indice = 0;

        while ((indice = texto.indexOf(palabraClave, indice)) != -1) {
            contador++;
            indice += palabraClave.length();
        }

        System.out.println("La palabra \"ingenieria\" aparece " + contador + " veces.");

        scanner.close();
    }
}
