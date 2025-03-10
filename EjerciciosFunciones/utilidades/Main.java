package EjerciciosFunciones.utilidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ejercicio 5");
        Saludador.saludar();

        System.out.print("Introduce un número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce otro número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(num1 +" + "+ num2 +" = " +Calculadora.addUp(num1, num2));

        scanner.close();
    }
}
