/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.views;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Vista {

    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Arreglo de números");
        System.out.println("2. String sin espacios");
        System.out.println("3. Arreglo de cadenas de texto");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    /// Muestra un mensaje como nivel 1
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /// Muestra un mensaje como nivel 2
    public void mostrarMensaje(String mensaje, int nivel) {
        StringBuilder tabs = new StringBuilder(); // Crear un StringBuilder para almacenar las tabulaciones

        for (int i = 0; i < nivel; i++) {
            tabs.append("\t"); // Agregar una tabulación al StringBuilder en cada iteración
        }
        System.out.println(tabs.toString() + mensaje); // Imprimir las tabulaciones seguidas del mensaje
    }

    /// Metodo quemuestra al usuario un mensaje y espera una respuesta del mismo
    /// respuesta uqe debera ser si o si un numero.
    public int mostrarMensajeRespuestaInt(String mensaje) {
        System.out.println("\t" + mensaje); // Mostrar el mensaje al usuario

        while (true) { // Bucle para solicitar entrada hasta que se proporcione un número entero válido
            try {
                int opcion = scanner.nextInt(); // Intentar leer un número entero
                scanner.nextLine(); // Consumir el salto de línea pendiente

                return opcion; // Devolver el número entero ingresado
            } catch (InputMismatchException e) { // Capturar la excepción si se proporciona una entrada no válida
                System.out.println("Entrada inválida. Por favor, ingrese un número entero válido.");
                scanner.nextLine(); // Limpiar el búfer de entrada para evitar un bucle infinito
            }
        }
    }

    public int[] pedirArregloNumeros() {

        System.out.print("Ingrese los números separados por espacios: ");
        String input = scanner.nextLine();

        String[] numerosString = input.split(" ");
        int[] numeros = new int[numerosString.length];

        for (int i = 0; i < numerosString.length; i++) {
            if (!numerosString[i].isEmpty()) { // Verifica si la cadena no está vacía
                numeros[i] = Integer.parseInt(numerosString[i]);
            }
        }

        return numeros;
    }

    public String pedirCadenaSinEspacios() {
        System.out.print("Ingrese una cadena sin espacios: ");
        return scanner.nextLine();
    }

    public String[] pedirArregloCadenas() {
        System.out.println("Ingrese las cadenas de caracteres (separadas por comas):");
        String input = scanner.nextLine();

        // Dividir la cadena de entrada en un arreglo de cadenas
        String[] arregloCadenas = input.split(",");

        // Eliminar espacios en blanco al principio y al final de cada cadena
        for (int i = 0; i < arregloCadenas.length; i++) {
            arregloCadenas[i] = arregloCadenas[i].trim();
        }

        return arregloCadenas;
    }

    public int mostrarMenuMetodos() {
        System.out.println();
        System.out.println("===== MENU MÉTODOS =====");
        System.out.println("1. Burbuja");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("0. Regresar");
        System.out.print("Ingrese una opción para el método: ");

        return scanner.nextInt();
    }
}
