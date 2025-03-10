package EjerciciosStringsYArrays;

import java.util.Scanner;

public class EjerciciosStringsYArrays3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 3 - Introduce una palabra: ");

        String word = scanner.nextLine();
        boolean palindrome = true;

        for(int i = 0; i<word.length()/2; i++) {
            if (!(word.toLowerCase().charAt(i) == word.toLowerCase().charAt(word.length()-1-i))) {
                palindrome = false;
            }
        }

        System.out.println("La palabra es un palíndromo: " +palindrome);
        scanner.close();
    }
}