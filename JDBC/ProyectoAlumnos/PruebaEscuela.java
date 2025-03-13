package JDBC.ProyectoAlumnos;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaEscuela {
    // java -cp ".;mysql-connector-j-9.2.0.jar" PruebaEscuela.java
    private static Connection conn;
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Obtener la conexión utilizando el método getConexion() de ConexionMySQL
        conn = ConexionEscuela.getConexion();
        int option = 0;

        if (conn != null) {
            try {
                // Hacer algo con la conexión (por ejemplo, una consulta)
                System.out.println("""
                        MANEJO DE BASE DE DATOS DE ALUMNOS
                        =====O0O========()========O0O=====""");
                read();

                // Aquí iría la lógica para trabajar con la base de datos
                while (option != 5) {
                    System.out.println("""
                            
                            ///// MENU PRINCIPAL /////
                            1.- Consultar datos (READ)
                            2.- Insertar datos (CREATE)
                            3.- Actualizar datos (UPDATE)
                            4.- Eliminar datos (DELETE)
                            5.- Salir""");
                    
                    option = scanInteger("Elige una opción");

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
                            option = 1;
                            break;
                    }
                }

                conn.close(); // Cerrar la conexión cuando ya no sea necesaria
            } catch (Exception e) {
                System.out.println("Error al interactuar con la base de datos: " +e.getMessage());
                option = 1;
            }
        }
    }

    public static String scanString(String message) {
        boolean correctDataType = false;
        while (!correctDataType) {
            try {
                System.out.print(message +": ");
                String response = sc.nextLine();
                correctDataType = true;
                return response;
            } catch (Exception e) {
                System.out.println("Dato de tipo incorrecto. Necesita ser una cadena.");
            }
        }
        return null;
    }

    public static int scanInteger(String message) {
        boolean correctDataType = false;
        while (!correctDataType) {
            try {
                System.out.print(message +": ");
                int response = Integer.parseInt(sc.nextLine());
                correctDataType = true;
                return response;
            } catch (Exception e) {
                System.out.println("Dato de tipo incorrecto. Necesita ser un número entero.");
            }
        }
        return 0;
    }
    
    public static void read() {
        try {
            String sql = "SELECT * FROM alumnos"; // Consulta SQL
            Statement stmt = conn.createStatement(); // Crear un Statement para ejecutar la consulta
            ResultSet rs = stmt.executeQuery(sql); // Ejecutar la consulta

            while (rs.next()) { // Iterar sobre los resultados
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");

                // Imprimir los resultados
                System.out.println("ID: " +id +", Nombre: " +nombre +", Edad: " +edad);
            }
        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }

    public static void create() {
        try {
            // Insertar un nuevo registro
            String sql = "INSERT INTO alumnos (nombre, edad) VALUES (?, ?)"; // Consulta SQL con parámetros
            PreparedStatement pstmt = conn.prepareStatement(sql); // Preparar la sentencia

            // Asignar valores a los parámetros
            pstmt.setString(1, scanString("Nombre"));

            pstmt.setInt(2, scanInteger("Edad"));

            int filasAfectadas = pstmt.executeUpdate(); // Ejecutar la inserción
            System.out.println("Filas insertadas: " +filasAfectadas);
        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }

    public static void update() {
        try {
            // Actualizar un registro
            String sql = "UPDATE alumnos SET edad = ? WHERE id = ?"; // Consulta SQL con parámetros
            PreparedStatement pstmt = conn.prepareStatement(sql); // Preparar la sentencia

            // Tomar los datos
            int id = scanInteger("ID del usuario a modificar");

            int edad = scanInteger("Edad");

            // Asignar valores a los parámetros
            pstmt.setInt(1, edad);
            pstmt.setInt(2, id);

            int filasAfectadas = pstmt.executeUpdate(); // Ejecutar la actualización
            System.out.println("Filas modificadas: " +filasAfectadas);
        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }

    public static void delete() {
        try {
            // Eliminar un registro
            String sql = "DELETE FROM alumnos WHERE id = ?"; // Consulta SQL con parámetros
            PreparedStatement pstmt = conn.prepareStatement(sql); // Preparar la sentencia

            // Pedir información
            int id = scanInteger("ID del usuario a eliminar");    

            // Asignar valor al parámetro
            pstmt.setInt(1, id); // Eliminar el registro con ID a elegir

            int filasAfectadas = pstmt.executeUpdate(); // Ejecutar la eliminación
            System.out.println("Filas eliminadas: " +filasAfectadas);
        } catch(Exception e) {
            System.out.println("Error de base de datos: " +e.getMessage());
        }
    }
}
