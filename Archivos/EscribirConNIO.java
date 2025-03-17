package Archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscribirConNIO {
    public static void main(String[] args) {
        String contenido = "Este es un ejemplo con java.nio.file.";
        Path path = Paths.get("salida.txt");
        try {
            Files.write(path, contenido.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
