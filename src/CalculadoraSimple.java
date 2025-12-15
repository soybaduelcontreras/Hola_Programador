import java.util.Scanner; /* Importa la clase Scanner: java.util es un paquete fundamental en Java que contiene clases e interfaces de utilidad esenciales para tareas comunes,
                            como Colecciones (ArrayList, HashMap, Set, List), manejo de Fecha y Hora (Date, Calendar), utilidades de cadenas (StringTokenizer) y generación de números aleatorios,
                            siendo indispensable para organizar y manipular datos de manera eficiente en casi cualquier programa Java. */

public class CalculadoraSimple {

    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario

        Scanner scanner = new Scanner(System.in); /* System.in en Java sirve para representar el flujo de entrada estándar, que por defecto es el teclado,
                                                    permitiendo que un programa lea datos introducidos por el usuario */

        double numero1, numero2, resultado = 0; /* double: En Java es un tipo de dato primitivo para almacenar números decimales (punto flotante) con alta precisión (doble precisión),
                                                           usando 64 bits, ideal para cálculos científicos y mediciones donde la exactitud es crucial,
                                                           ofreciendo más rango y precisión que el tipo float (32 bits) y siendo la opción por defecto para decimales grandes. */

        char operador; /* char: En Java, char es un tipo de dato primitivo para almacenar un único carácter (letra, número, símbolo) usando Unicode (UTF-16),
                               ocupando 16 bits, y siempre se declara entre comillas simples (ej. 'a').
                               Internamente, Java lo trata como un número entero (su valor Unicode/ASCII),
                               permitiendo operaciones aritméticas, y se puede convertir a String usando String.valueOf(char) o Character.toString(char). */

        boolean salir = false; /* boolean: En Java, boolean es un tipo de dato primitivo fundamental que solo puede almacenar dos valores: true (verdadero) o false (falso),
                                          crucial para la lógica de control de flujo (como if, while), representando condiciones de "sí/no" o "encendido/apagado" mediante operadores relacionales (<, ==)
                                          y lógicos (&&, ||) para tomar decisiones en el código. */

        /* while: El bucle while en Java es una estructura de control que ejecuta repetidamente un bloque de código mientras una condición booleana especificada sea true (verdadera).
                  Su sintaxis es while (condición) { // código a repetir }, evaluando la condición al principio, lo que significa que puede no ejecutarse nunca si la condición es falsa desde el inicio.
                  Es crucial incluir una instrucción dentro del bucle que eventualmente haga que la condición sea falsa para evitar bucles infinitos.
                  while (...): Esta es la sintaxis para un bucle "mientras" [2]. El código dentro del bucle se repetirá siempre que la condición entre paréntesis sea verdadera.
                  - !: El signo de exclamación es el operador lógico "NO" (negación). Invierte el valor de verdad de lo que le sigue.
                  - salir: Esta es una variable (probablemente de tipo booleano, es decir, que solo puede ser true o false).
                  - !salir se lee como "NO salir" o "mientras salir sea falso". */

        while (!salir) {
            System.out.println(" Selecciona la Operacion");
            System.out.println("+ : Suma");
            System.out.println("- : Resta");
            System.out.println("* : Multiplicación");
            System.out.println("/ : División");
            System.out.println("S : Salir");
            System.out.print("Elija una operación: ");

            // Leer el operador como un solo carácter
            operador = scanner.next().charAt(0);  /* charAt(0): En Java, Indica obtener el carácter que se encuentra en la primera posición de una cadena de texto (String),
                                                                ya que el conteo de índices en las cadenas siempre comienza en 0. Es un método fundamental para extraer un carácter específico por su ubicación numérica. */

            /* En Java, == es el operador de igualdad que se usa para comparar si dos valores son idénticos, devolviendo true si son iguales y false si no lo son;
                           funciona perfectamente para tipos primitivos (números, caracteres, booleanos) comparando su contenido*/

            /* En Java, || (doble barra vertical) es el operador lógico OR (o), que se usa para combinar condiciones booleanas y devuelve true (verdadero) si al menos una de las condiciones conectadas es verdadera;
                            solo devuelve false si todas las condiciones son falsas, y aplica "cortocircuito" (no evalúa más si ya encontró un true). */
            if (operador == 'S' || operador == 's') {
                salir = true;
                System.out.println("¡Hasta luego!");
                continue; // Vuelve al inicio del bucle
            }
             /* Solicitar numeros para operacion.*/
            System.out.print("Ingrese el primer número: ");
            numero1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            numero2 = scanner.nextDouble();

            /* case: Se utiliza dentro de una sentencia switch para definir un valor específico con el que se comparará una variable o expresión.
                     Si el valor de la variable coincide con el valor especificado en un case, se ejecuta el bloque de código asociado a ese case.*/
            switch (operador) {

                case '+':
                    resultado = numero1 + numero2;
                    System.out.printf("Resultado: %.1f %c %.1f = %.1f%n ", numero1, operador, numero2, resultado); /* "Resultado: %.1f %c %.1f = %.1f%n": La cadena de formato.
                                                                                                                     - %.1f: Especificador para un número de punto flotante (float o double), que muestra exactamente un dígito después del punto decimal.
                                                                                                                     -%c: Especificador para un carácter (char).
                                                                                                                     -%n: Especificador para un salto de línea independiente de la plataforma, preferido sobre \n en Java para mayor portabilidad.
                                                                                                                     -num1, operator, num2, result: Las variables cuyos valores se insertan en la cadena de formato en el orden especificado. */
                    break; /* break: solo rompe el bucle más interno. */

                case '-':
                    resultado = numero1 - numero2;
                    System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", numero1, operador, numero2, resultado);
                    break;

                case '*':
                    resultado = numero1 * numero2;
                    System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", numero1, operador, numero2, resultado);
                    break;

                case '/':
                    // Condicional cualdo se divide entre 0.
                    if (numero2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", numero1, operador, numero2, resultado);
                    }

                    break;
                default:
                    System.out.println("Error: Operador inválido. Use +, -, *, /.");
            }
            System.out.println("\n.................................................................\n");
        }
        scanner.close();
    }

}
