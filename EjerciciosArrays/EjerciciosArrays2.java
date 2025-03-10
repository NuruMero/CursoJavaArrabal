package EjerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ejercicio 2 - Introduce 5 números ");
        
        int[] arrayNumeros = new int[5];
        int max = 0;
        int min = 999999999;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " +(i+1) +": ");
            arrayNumeros[i] = Integer.parseInt(scanner.nextLine());
            if (arrayNumeros[i] > max) {
                max = arrayNumeros[i];
            }
            if (arrayNumeros[i] < min) {
                min = arrayNumeros[i];
            }
        }

        System.out.println("Número máximo del array: " +max);
        System.out.println("Número mínimo del array: " +min);
        scanner.close();
    }
}