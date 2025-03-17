package EjerciciosArchivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioArchivos2 {
    public static void main(String[] args) {
        String contenido = "Escribir con FileWriter y BufferedWriter.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))) {
            writer.write(contenido);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
