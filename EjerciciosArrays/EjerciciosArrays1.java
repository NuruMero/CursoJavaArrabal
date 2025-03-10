package EjerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ejercicio 1 - Introduce 5 números ");
        
        int[] arrayNumeros = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " +(i+1) +": ");
            arrayNumeros[i] = Integer.parseInt(scanner.nextLine());
            sum += arrayNumeros[i];
        }

        System.out.println("Suma del array: " +sum);
        scanner.close();
    }
}