package Encapsulacion;

public class Calculadora {

    // Método Sumar
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método Restar
    public double restar(double a, double b) {
        return a - b;
    }

    // Método Multiplicar
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método Dividir con validación de cero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0; // Retorna 0 si hay error
        }
        return a / b;
    }
}