package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        String contenido = "Este es un ejemplo de escritura en un archivo.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))) {
            writer.write(contenido);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
