package EjerciciosStrings;

import java.util.Scanner;

public class EjerciciosStrings1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 1 - Introduce una palabra: ");
        int vocals = 0;

        String word = scanner.nextLine().toLowerCase();
        for(char letter : word.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vocals++;
            }
        }

        System.out.println("En la palabra hay " +vocals +" vocales.");

        scanner.close();
    }
}