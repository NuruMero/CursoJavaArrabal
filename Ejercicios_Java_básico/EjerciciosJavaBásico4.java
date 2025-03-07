package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 4 - Introduce un número: ");

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum +=i;
        }

        System.out.println("Resultado de suma de los primeros " +number +" números naturales: " +sum);
        scanner.close();
    }
}
