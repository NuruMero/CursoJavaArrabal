package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 7 - Introduce un número: ");

        int number = Integer.parseInt(scanner.nextLine());
        int num2 = number;
        int digits = 1;

        while (num2 >= 10) {
            num2 /= 10;
            digits++;
        }

        // Alternativa por String
        var numberString = Integer.toString(number);
        int digitsString = numberString.length();

        System.out.println("El número " +number +" tiene " +digits +" dígitos.");
        System.out.println("El número " +number +" tiene " +digitsString +" dígitos.");

        scanner.close();
    }
}
