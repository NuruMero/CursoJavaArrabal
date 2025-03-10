package EjerciciosStrings;

import java.util.Scanner;

public class EjerciciosStrings4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 4 - Introduce una palabra/frase: ");
        String word = scanner.nextLine();

        System.out.print("Introduce una letra a modificar: ");
        String letterChanged = scanner.nextLine();

        System.out.print("Introduce por qué letra cambiarla: ");
        String letterChanger = scanner.nextLine();

        word = word.replaceAll(letterChanged, letterChanger);

        System.out.println("Frase modificada: " +word);
        scanner.close();
    }
}