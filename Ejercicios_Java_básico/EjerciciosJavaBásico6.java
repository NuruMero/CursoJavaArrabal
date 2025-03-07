package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 6 - Introduce un número: ");

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("TABLA DE MULTIPLICAR DEL " +number);
        for (int i = 1; i<=10; i++) {
            System.out.println(number +" * " +i +" = " +number*i);
        }
        
        scanner.close();
    }
}
