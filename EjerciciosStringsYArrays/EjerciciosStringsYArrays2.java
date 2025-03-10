package EjerciciosStringsYArrays;

import java.util.Scanner;

public class EjerciciosStringsYArrays2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 2 - Introduce una palabra: ");

        String word = scanner.nextLine();
        String reverseWord = "";
        for(int i = 0; i<word.length(); i++) {
            reverseWord += (Character.toString(word.charAt(word.length()-1-i)));
        }

        System.out.println("La palabra invertida es: " +reverseWord);
        scanner.close();
    }
}