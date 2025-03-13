CREATE DATABASE escuela;
USE escuela;

CREATE TABLE alumnos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT NOT NULL
);

INSERT INTO alumnos (nombre, edad) VALUES ('Juan Pérez', 20);
INSERT INTO alumnos (nombre, edad) VALUES ('María López', 20);
INSERT INTO alumnos (nombre, edad) VALUES ('Carlos Díaz', 19);