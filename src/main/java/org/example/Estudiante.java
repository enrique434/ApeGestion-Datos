package org.example;

public class Estudiante {
    private String cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private float[] notas;


    public Estudiante(String cedula, String nombre, String apellido, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = new float[7];

    }


    public Boolean agregarNota(float nota) {
        if (nota < 0 || nota > 10) return false; // Validación básica

        int posicionLibre = -1;
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] == 0) { // Asumimos que 0 representa una posición vacía
                posicionLibre = i;
                break;
            }
        }

        if (posicionLibre != -1) {
            this.notas[posicionLibre] = nota;
            return true;
        }
        return false; // No hay espacio disponible
    }


    public Boolean modificarNota(int indice,float nota) {
        if (nota < 0 || nota > 10) return false;
        indice = indice - 1;
        if (indice < 1 || indice > this.notas.length){
            System.out.println("indice fuera del rango");
            return false;
        }else{

        this.notas[indice] = nota;
        return true;}
    }

    public Boolean eliminarNotas(int indice){
        indice = indice - 1;
        if (indice < 1 || indice > this.notas.length) {
            System.out.println("indice fuera del rango");
            return false;
        }
        else {
            this.notas[indice] = 0;
            return true;
        }
    }

    public float calcularPromedio(){
        float suma = 0;
        for (int i = 0; i < this.notas.length; i++) {
                suma += this.notas[i];
        }
        suma = suma/this.notas.length;
        System.out.println(suma);
        return  suma ;


    }

    public void mostrarDatos(){
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("FechaNacimiento: " + this.fechaNacimiento);
        imprimeNotas();
    }

    public void imprimeNotas(){
        for (int i = 0; i < this.notas.length; i++) {
            System.out.println(this.notas[i]);
        }
    }

    public void buscarEstudiante(String cedula){
        for (int i = 0; i < this.notas.length; i++) {
            if (this.cedula.equals(cedula)) {

            }
        }
    }



    

}
