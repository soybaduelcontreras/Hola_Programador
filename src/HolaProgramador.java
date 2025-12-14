import java.util.Scanner; // Importa la clase Scanner: java.util es un paquete fundamental en Java que contiene clases e interfaces de utilidad esenciales para tareas comunes,
                          // como Colecciones (ArrayList, HashMap, Set, List), manejo de Fecha y Hora (Date, Calendar), utilidades de cadenas (StringTokenizer) y generación de números aleatorios,
                          // siendo indispensable para organizar y manipular datos de manera eficiente en casi cualquier programa Java.
import java.time.Year; // Importa la clase Year para obtener el año actual (Extra); import java.time.Year en Java sirve para usar la clase Year, que representa un año (como 2025) de forma inmutable y fácil de manipular,
                       // permitiendo obtener el año actual, sumar o restar años, y trabajar con años específicos de forma clara y moderna, reemplazando clases antiguas como java.util.Date y Calendar.


 public class HolaProgramador {

    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in); // System.in en Java sirve para representar el flujo de entrada estándar, que por defecto es el teclado,
                                                  // permitiendo que un programa lea datos introducidos por el usuario

        //  Se solicita el nombre del usuario
        System.out.print("Hola,Por favor, Introduce tu Nombre: ");
        String nombre = scanner.nextLine(); // nextLine() lee la línea completa de texto; scanner.nextLine() en Java lee y devuelve toda la línea de texto que el usuario introduce por consola,
                                            // incluyendo los espacios, hasta que presiona la tecla Enter (el carácter de nueva línea \n). Es ideal para capturar frases o textos de varias palabras,
                                            // a diferencia de next() que solo lee hasta el primer espacio, y es fundamental saber que consume el \n pendiente en el buffer,
                                            // lo que puede requerir un nextLine() extra después de usar nextInt() o nextDouble() para evitar saltos inesperados.

        // Se solicita edad de usuario.
        System.out.print("Bienvenido " + nombre + ". Por Favor, introduce tu edad: ");
        int edad = scanner.nextInt(); // nextInt() lee un número entero.

        // Se Calcular el año de nacimiento.
        // Se obtiene el año actual del sistema y se resta la edad para obtener la el año de nacimiento.

        int añoActual = Year.now().getValue(); //Year.now(): Para obtener el año actual en Java, la forma más recomendada a partir de Java 8 es utilizando las clases del paquete java.time.
                                               // Puedes usar el método estático Year.now() o LocalDate.now().getYear().
                                               // getValue(): En Java no es un método estándar único,
                                               //  sino un nombre de método comúnmente usado en varias clases para obtener el valor de un atributo o propiedad

        int añoNacimiento = añoActual - edad; // Se calcula en año de nacimiento del usuario.

        // se imprime los datos ingresados : nombre, edad y el calculo de año de nacimiento.
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. ¡Bienvenido a Java!");
        System.out.println("Naciste en el año  " + añoNacimiento + ".");

        // Siempre se debe cerra el escáner,De no cerrar Java no realizará la recolección de basura del objeto y se producirá una fuga de memoria en su programa.
        scanner.close();
    }

}
