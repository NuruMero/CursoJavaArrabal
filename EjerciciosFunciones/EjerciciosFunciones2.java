package EjerciciosFunciones;

import java.util.Scanner;

public class EjerciciosFunciones2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ejercicio 2 - Introduce un nombre: ");
        String name = scanner.nextLine();

        System.out.print("Introduce una edad: ");
        int age = Integer.parseInt(scanner.nextLine());

        imprimirDatos(name, age);

        scanner.close();
    }

    public static void imprimirDatos(String name, int age) {
        System.out.println("Nombre: " +name +", Edad: " +age);
    }
}
