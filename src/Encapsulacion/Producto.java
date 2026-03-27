package Encapsulacion;

public class Producto {
    // Atributos
    private String codigo;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para aplicar descuento 
    public void aplicarDescuento(double porcentaje) {
        double descuento = this.precio * (porcentaje / 100);
        this.precio -= descuento;
    }

    // Método para mostrar los datos
    public void mostrar() {
        System.out.println(codigo + " " + nombre + " " + precio);
    }
}