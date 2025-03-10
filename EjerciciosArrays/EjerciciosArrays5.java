package EjerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ejercicio 5 - Introduce 5 números ");
        
        int[] arrayNumeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " +(i+1) +": ");
            arrayNumeros[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Introduce un número a buscar: ");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        int timesInArray = 0;

        for (int item: arrayNumeros) {
            if (item == searchNumber) {
                timesInArray++;
            }
        }

        System.out.println("Veces que aparece el número en el array: " +timesInArray);
        scanner.close();
    }
}