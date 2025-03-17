package Archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CrearDirectorio {
    public static void main(String[] args) {
        Path path = Paths.get("nuevo_directorio");
        try {
            Files.createDirectory(path);
            System.out.println("Directorio creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
