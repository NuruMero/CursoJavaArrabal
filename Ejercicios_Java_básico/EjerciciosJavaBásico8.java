package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 8 - Introduce un número: ");

        int number = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println("El número es primo: " +isPrime);
        scanner.close();
    }
}
