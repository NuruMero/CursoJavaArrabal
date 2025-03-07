package Ejercicios_Java_básico;

import java.util.Scanner;

public class EjerciciosJavaBásico9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 9 - Introduce V o F: ");
        boolean valid = false;

        while (!valid) {
            String letra = scanner.nextLine();
        
            switch (letra) {
                case "V":
                    System.out.println("Verdadero");
                    valid = true;
                    break;
                case "F":
                    System.out.println("Falso");
                    valid = true;
                    break;
                default:
                    System.out.println("Valor no reconocido. Introdúcelo otra vez.");
                    break;
            }
        }

        scanner.close();
    }
}
