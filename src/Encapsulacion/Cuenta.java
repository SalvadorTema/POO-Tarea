package Encapsulacion;

public class Cuenta {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método depositar
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    // Método retirar 
    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente para retirar: " + monto);
        }
    }

    // Mostrar saldo final
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo final: " + saldo);
    }
}