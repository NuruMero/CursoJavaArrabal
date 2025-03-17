package EjerciciosArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjercicioArchivos4 {
    public static void main(String[] args) {
        Path path = Paths.get("MiDirectorio");
        try {
            Files.createDirectory(path);
            System.out.println("Directorio creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
