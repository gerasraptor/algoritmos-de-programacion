/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informacionpeliculas;

import java.util.Scanner;

public class InformacionPeliculas {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int opcion;
        
        System.out.println("Seleccione una opcion para obtener informacion:");
        System.out.println("1. Avengers: Endgame");
        System.out.println("2. Interestellar");
        System.out.println("3. Breaking Bad");
        System.out.println("4. Invincible");
        System.out.println("5. Avengers: Infinity War");
        System.out.print("Opcion: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero valido.");
            scanner.next();
        }
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1 -> System.out.println("Avengers: Endgame es una pelicula de superheroes de 2019 producida por Marvel Studios.");
            case 2 -> System.out.println("Interestellar es una pelicula de ciencia ficcion dirigida por Christopher Nolan en 2014.");
            case 3 -> System.out.println("Breaking Bad es una serie de television dramatica creada por Vince Gilligan en 2008.");
            case 4 -> System.out.println("Invincible es una serie animada de superheroes basada en el comic de Robert Kirkman.");
            case 5 -> System.out.println("Avengers: Infinity War es una pelicula de 2018 donde los Vengadores enfrentan a Thanos.");
            default -> System.out.println("Opcion invalida.");
        }
        
        scanner.close();
    }
}  

