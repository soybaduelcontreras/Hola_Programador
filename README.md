import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos del teclado
        Scanner lectura = new Scanner(System.in);

        // Pedir nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = lectura.nextLine();

        // Pedir edad
        System.out.print("Introduce tu edad: ");
        int edad = lectura.nextInt();

        // Calcular año de nacimiento
        int anioActual = 2025;
        int anioNacimiento = anioActual - edad;

        // Imprimir el mensaje final
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. " +
                "¡Bienvenido a Java!, naciste en el año " + anioNacimiento);

        // Cerrar el scanner
        lectura.close();
    }
}
