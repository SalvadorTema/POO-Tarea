package Encapsulacion;

public class Libro {
    // Atributos 
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor que inicializa los 3 atributos
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método exacto: esLargo()
    public boolean esLargo() {
        return this.paginas > 300;
    }

    // Método para poder ver los datos en consola
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Pags: " + paginas);
   
    }
}