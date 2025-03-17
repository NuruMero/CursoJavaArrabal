package Archivos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirConPrintWriter {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("salida.txt")) {
            writer.println("Escribiendo con PrintWriter.");
            writer.println("Numero: " +123);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
