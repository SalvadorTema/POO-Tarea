package Encapsulacion;

public class Persona {
    // Atributos privados
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor con parámetros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método mostrar() para imprimir los datos
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad);
    }

    // Métodos Getter y Setter (Fundamentales para la Encapsulación)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}