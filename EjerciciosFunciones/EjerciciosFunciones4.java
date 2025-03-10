package EjerciciosFunciones;

import java.util.Scanner;

public class EjerciciosFunciones4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 4 - Introduce un número: ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isEven = esPar(number);
        System.out.println("¿El número es par?: " +isEven);

        scanner.close();
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
