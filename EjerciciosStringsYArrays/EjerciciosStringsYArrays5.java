package EjerciciosStringsYArrays;

import java.util.Scanner;

public class EjerciciosStringsYArrays5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 5 - Introduce una palabra: ");
        String word = scanner.nextLine();

        System.out.print("Introduce otra palabra: ");
        String word2 = scanner.nextLine();

        String concatWords = word.concat(word2);

        System.out.println("Palabras concatenadas: " +concatWords);
        System.out.println("Longitud: " +concatWords.length());
        scanner.close();
    }
}