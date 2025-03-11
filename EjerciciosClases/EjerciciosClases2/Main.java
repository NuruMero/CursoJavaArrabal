package EjerciciosClases.EjerciciosClases2;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Carlos"; // Correcto (es público)
        // p.edad = 25; // Error, es privado
        p.ciudad = "Madrid"; // Correcto, estamos en el mismo paquete

        System.out.println("Nombre: " +p.nombre);
        System.out.println("Ciudad: " +p.ciudad);
    }
}
