package Encapsulacion;

public class Main {

    public static void main(String[] args) {
        
        // --- EJERCICIO 1: CLASE PERSONA ---
        System.out.println("EJERCICIO 1: PERSONAS");
        
        // Crear 3 objetos de la clase Persona usando el constructor
        Persona p1 = new Persona("Juan", "Perez", 25);
        Persona p2 = new Persona("Maria", "Lopez", 30);
        Persona p3 = new Persona("Carlos", "Gomez", 22);
        
        // Mostrar los datos de cada objeto en la consola
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        
        System.out.println("=");
        System.out.println(); // Salto de línea para separar el siguiente ejercicio
        
    }
}