package EjerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ejercicio 4 - Introduce 5 números ");
        
        int[] arrayNumeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " +(i+1) +": ");
            arrayNumeros[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Array normal: ");
        for(int item: arrayNumeros) {
            System.out.print(item + " - ");
        }
        System.out.println("");


        for (int i = 0; i < 5/2; i++) {
            int storedNumber = arrayNumeros[i];
            arrayNumeros[i] = arrayNumeros[arrayNumeros.length-1-i];
            arrayNumeros[arrayNumeros.length-1-i] = storedNumber;
        }

        System.out.print("Array invertido: ");
        for(int item: arrayNumeros) {
            System.out.print(item + " - ");
        }
        scanner.close();
    }
}