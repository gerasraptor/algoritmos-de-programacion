/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionfechas;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConversionFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una fecha en formato YYYY-MM-DD: ");
        String fechaEntrada = scanner.nextLine();

        try {
            LocalDate fecha = LocalDate.parse(fechaEntrada);

            LocalDate unaSemanaDespues = fecha.plusWeeks(1);
            LocalDate unMesAntes = fecha.minusMonths(1);

            System.out.println("Fecha original:     " + fecha);
            System.out.println("Una semana despues: " + unaSemanaDespues);
            System.out.println("Un mes antes:       " + unMesAntes);

        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha invalido. Usa el formato YYYY-MM-DD.");
        }

        scanner.close();
    }
}

