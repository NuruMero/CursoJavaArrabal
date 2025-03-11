package EjerciciosClases.EjerciciosClases3;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " +calc.sumar(5, 3));
        // System.out.println("Resta: " + calc.restar(5,3)); // Error, es privado
        System.out.println("Multiplicación: " +calc.multiplicar(5,3));
    }
}
