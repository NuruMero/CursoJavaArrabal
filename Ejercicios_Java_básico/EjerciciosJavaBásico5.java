package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 5 - Introduce un número: ");

        int number = Integer.parseInt(scanner.nextLine());
        int factor = number;

        if (number == 0) {
            System.out.println("La factorial de 0 es 1.");
        } else {
            for (int i = number-1; i > 0; i--) {
                factor *= i;
            }

            System.out.println("La factorial de " +number +" es " +factor);
        }
        scanner.close();
    }
}
