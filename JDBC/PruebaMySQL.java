package JDBC;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaMySQL {
    // java -cp ".;mysql-connector-j-9.2.0.jar" PruebaMySQL.java
    public static Connection conn;
    public static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        // Obtener la conexión utilizando el método getConexion() de ConexionMySQL
        conn = ConexionMySQL.getConexion();
        int option = 0;

        if (conn != null) {
            try {
                // Hacer algo con la conexión (por ejemplo, una consulta)
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM pruebas";
                stmt.executeQuery(sql);

                // Aquí iría la lógica para trabajar con la base de datos
            } catch (SQLException e) {
                System.out.println("Error al interactuar con la base de datos: " +e.getMessage());
            }
        }

        while (option != 5) {
            System.out.print("""

                    MANEJO DE BASE DE DATOS
                    1.- Consultar datos (READ)
                    2.- Insertar datos (CREATE)
                    3.- Actualizar datos (UPDATE)
                    4.- Eliminar datos (DELETE)
                    5.- Salir
                    Elige una opción: """);
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Carácter incorrecto. Por favor pruebe otra vez.");
            }

            switch (option) {
                case 1:
                    read();
                    break;
                case 2:
                    create();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Objeto fuera de rango. Prueba otra vez.");
                    break;
            }
        }

        try {
            if (conn != null) {
                conn.close(); // Cerrar la conexión cuando ya no sea necesaria
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " +e.getMessage());
        }
    }
    
    public static void read() {
        try {
            String sql = "SELECT * FROM pruebas"; // Consulta SQL
            Statement stmt = conn.createStatement(); // Crear un Statement para ejecutar la consulta
            ResultSet rs = stmt.executeQuery(sql); // Ejecutar la consulta

            while (rs.next()) { // Iterar sobre los resultados
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int dinero = rs.getInt("dinero");

                // Imprimir los resultados
                System.out.println("ID: " +id +", Nombre: " +nombre +", Apellidos: " +apellidos +", Dinero: " +dinero);
            }
        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }

    public static void create() {
        try {
            // Insertar un nuevo registro
            String sql = "INSERT INTO pruebas (nombre, apellidos, dinero) VALUES (?, ?, ?)"; // Consulta SQL con parámetros
            PreparedStatement pstmt = conn.prepareStatement(sql); // Preparar la sentencia

            // Asignar valores a los parámetros
            System.out.print("Nombre: ");
            pstmt.setString(1, sc.nextLine());

            System.out.print("Apellido: ");
            pstmt.setString(2, sc.nextLine());

            System.out.print("Dinero: ");
            pstmt.setInt(3, Integer.parseInt(sc.nextLine()));

            int filasAfectadas = pstmt.executeUpdate(); // Ejecutar la inserción
            System.out.println("Filas insertadas: " +filasAfectadas);
        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }

    public static void update() {
        try {

        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }

    public static void delete() {
        try {

        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }
}
