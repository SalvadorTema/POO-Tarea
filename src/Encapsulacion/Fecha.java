package Encapsulacion;

public class Fecha {
    // Atributos: día, mes y año
    private int dia;
    private int mes;
    private int ano;

    // Constructor
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método esValida() para rangos básicos
    public boolean esValida() {
        // Verifica día (1-31) y mes (1-12)
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12);
    }

    // Método para imprimir la fecha
    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}