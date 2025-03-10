package EjerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ejercicio 3 - Introduce 5 números ");
        
        int[] arrayNumeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " +(i+1) +": ");
            arrayNumeros[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Introduce otro número: ");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        boolean foundSearch = false;

        for (int number : arrayNumeros) {
            if (number == searchNumber) {
                foundSearch = true;
                break;
            }
        }

        System.out.println("¿El número se encuentra en el array?: " +foundSearch);
        scanner.close();
    }
}