package JDBC.ProyectoAlumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionEscuela {
    public static Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String usuario = "root"; // Por defecto el usuario es 'root'
        String contraseña = ""; // Por defecto, no hay contraseña para el 'root' en XAMPP
        Connection conn = null;
    
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection(url, usuario, contraseña);

            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }

        return conn;
    }
}