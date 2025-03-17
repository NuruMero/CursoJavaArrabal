package EjerciciosArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjercicioArchivos3 {
    public static void main(String[] args) {
        Path path = Paths.get("archivo.txt");
        try {
            List<String> lineas = Files.readAllLines(path);
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
