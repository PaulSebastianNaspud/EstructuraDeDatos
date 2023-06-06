/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.views;

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
        System.out.println("3. Cadena de caracteres");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public int mostrarMensajeRespuestaInt(String mensaje) {
        System.out.println(mensaje);
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }

    public int[] pedirArregloNumeros() {
//        Scanner scanner = new Scanner(System.in);

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

    public String pedirCadenaCaracteres() {
        System.out.print("Ingrese una cadena de caracteres: ");
        return scanner.nextLine();
    }

    public int mostrarMenuMetodos() {
        System.out.println("===== MENU MÉTODOS =====");
        System.out.println("1. Burbuja");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("0. Regresar");
        System.out.print("Ingrese una opción para el método: ");
        return scanner.nextInt();
    }
}
