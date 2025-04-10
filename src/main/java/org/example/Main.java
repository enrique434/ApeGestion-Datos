package org.example;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiantes = new Estudiante("1234324","emily","gaibor","24/08/2005");

        estudiantes.agregarNota(2);

        estudiantes.imprimeNotas();
        estudiantes.modificarNota(2,10);
        System.out.println("-----------------");
        estudiantes.imprimeNotas();

        System.out.println("-----------------");
        estudiantes.calcularPromedio();
    }
}