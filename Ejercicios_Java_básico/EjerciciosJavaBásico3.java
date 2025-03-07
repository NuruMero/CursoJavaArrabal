package Ejercicios_Java_básico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EjerciciosJavaBásico3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Ejercicio 3 - Introduce tres números - Primer número: ");
        numbers.add(Integer.parseInt(scanner.nextLine()));
        System.out.print("Segundo número: ");
        numbers.add(Integer.parseInt(scanner.nextLine()));
        System.out.print("Tercer número: ");
        numbers.add(Integer.parseInt(scanner.nextLine()));

        System.out.println("El número más alto es: " +Collections.max(numbers));
        scanner.close();
    }
}
