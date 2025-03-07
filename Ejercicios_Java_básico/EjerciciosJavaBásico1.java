package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.print("Ejercicio 1 - Introduce un número: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        scanner.close();
    }
}
