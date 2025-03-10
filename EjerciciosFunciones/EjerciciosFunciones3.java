package EjerciciosFunciones;

import java.util.Scanner;

public class EjerciciosFunciones3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 3 - Introduce un número: ");
        int number = Integer.parseInt(scanner.nextLine());

        int numberx2 = duplicar(number);
        System.out.println("El doble de ese número es: " +numberx2);

        scanner.close();
    }

    public static int duplicar(int num) {
        return num*2;
    }
}
