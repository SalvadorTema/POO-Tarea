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
        System.out.println(); // Salto de línea 
   
        //  EJERCICIO 2: CLASE RECTÁNGULO 
        System.out.println("EJERCICIO 2: RECTÁNGULOS");

        // 1. Crear 2 objetos de la clase Rectangulo
        Rectangulo r1 = new Rectangulo(10.5, 5.0);
        Rectangulo r2 = new Rectangulo(7.2, 8.4);

        // 2. Mostrar áreas
        System.out.println("Área Rectángulo 1: " + r1.area());
        System.out.println("Área Rectángulo 2: " + r2.area());

        // 3. Comparar cuál tiene mayor área
        if (r1.area() > r2.area()) {
            System.out.println("El Rectángulo 1 tiene el área mayor.");
        } else if (r2.area() > r1.area()) {
            System.out.println("El Rectángulo 2 tiene el área mayor.");
        } else {
            System.out.println("Ambos rectángulos tienen la misma área.");
        }
        
        System.out.println("="); //Salto de línea 
        
     //  EJERCICIO 3: PRODUCTO 
        System.out.println("EJERCICIO 3: PRODUCTOS");

        // 1. Crear 2 productos
        Producto prod1 = new Producto("A101", "Laptop", 1500.0);
        Producto prod2 = new Producto("B202", "Celular", 800.0);

        // 2. Aplicar descuentos distintos
        prod1.aplicarDescuento(10); // 
        prod2.aplicarDescuento(20);

        // 3. Mostrar resultados
        prod1.mostrar();
        prod2.mostrar();

        System.out.println("=");//Salto de linea
        
     //  EJERCICIO 4: CUENTA 
        System.out.println("EJERCICIO 4: CUENTA BANCARIA");

        Cuenta miCuenta = new Cuenta("Alexander Tema", 500.0);

        miCuenta.depositar(200.0);  // Saldo: 700.0
        miCuenta.retirar(100.0);    // Saldo: 600.0
        miCuenta.retirar(800.0);    

        miCuenta.mostrarSaldo();    // Debe mostrar 600.0

        System.out.println("="); //Salto de linea
        
    }
}
