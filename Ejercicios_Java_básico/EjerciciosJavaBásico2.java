package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.print("Ejercicio 2 - Introduce un número: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) {
            System.out.println("El número es 0.");
        } else {
            if (number%2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        }

        scanner.close();
    }
}
