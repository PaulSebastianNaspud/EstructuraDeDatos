/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.models;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class ModeloNumeros extends Dato<int[]> {

    public ModeloNumeros(int[] objetoDato) {
        super(objetoDato);

    }

    @Override
    public String toString() {
        return Arrays.toString(this.objetoDato);
    }

    /// Implementación del algoritmo de ordenamiento Burbuja para arreglo de
    /// números
    @Override
    public Dato<int[]> ordenarBurbuja(boolean ascendentemente, boolean info) {

        // Se asigna la referencia del arreglo objetoDato a arregloNumeros.
        // Esto significa que arregloNumeros y objetoDato apuntan a la misma
        // ubicación de memoria. Cualquier modificación realizada en uno de los
        // arreglos también se reflejará en el otro, ya que ambos apuntan al mismo
        // conjunto de datos.
        // int[] arregloNumeros = objetoDato;

        // Se utiliza el método Arrays.copyOf para crear una copia del arreglo
        // objetoDato. Esto significa que se crea un nuevo arreglo en memoria con
        // el mismo tamaño y contenido que objetoDato. Cualquier modificación
        // realizada en arregloNumeros no afectará a objetoDato ni viceversa.
        // Es decir, se crea una copia independiente del arreglo original.
        int[] arregloNumeros = Arrays.copyOf(objetoDato, objetoDato.length);

        int n = arregloNumeros.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascendentemente) {
                    if (arregloNumeros[j] > arregloNumeros[j + 1]) {
                        // Intercambiar los elementos
                        int temp = arregloNumeros[j];
                        arregloNumeros[j] = arregloNumeros[j + 1];
                        arregloNumeros[j + 1] = temp;
                    }
                    if (info) {
                        System.out.println(Arrays.toString(arregloNumeros));
                    }
                } else {
                    if (arregloNumeros[j] < arregloNumeros[j + 1]) {
                        // Intercambiar los elementos
                        int temp = arregloNumeros[j];
                        arregloNumeros[j] = arregloNumeros[j + 1];
                        arregloNumeros[j + 1] = temp;
                    }
                    // Utilizando un operador ternario y una expresión lambda
                    if (info) {
                        Arrays.stream(arregloNumeros).forEach(System.out::println);
                    }
                }
            }
        }

        return new ModeloNumeros(arregloNumeros);
    }

    @Override
    public Dato<int[]> ordenarSeleccion(boolean ascendentemente) {
        int[] arregloNumeros = Arrays.copyOf(objetoDato, objetoDato.length);

        int n = arregloNumeros.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (ascendentemente) {
                    if (arregloNumeros[j] < arregloNumeros[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                } else {
                    if (arregloNumeros[j] > arregloNumeros[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                }
            }
            // Intercambiar el elemento mínimo con el elemento en la posición i
            int temp = arregloNumeros[indiceMinimo];
            arregloNumeros[indiceMinimo] = arregloNumeros[i];
            arregloNumeros[i] = temp;
        }
        return new ModeloNumeros(arregloNumeros);

    }

    @Override
    public Dato<int[]> ordenarInsercion(boolean ascendentemente) {
        int[] arregloNumeros = Arrays.copyOf(objetoDato, objetoDato.length);

        int n = arregloNumeros.length;
        for (int i = 1; i < n; i++) {
            int valorActual = arregloNumeros[i];
            int j = i - 1;
            if (ascendentemente) {
                while (j >= 0 && arregloNumeros[j] > valorActual) {
                    arregloNumeros[j + 1] = arregloNumeros[j];
                    j--;
                }
            } else {
                while (j >= 0 && arregloNumeros[j] < valorActual) {
                    arregloNumeros[j + 1] = arregloNumeros[j];
                    j--;
                }
            }
            arregloNumeros[j + 1] = valorActual;
        }
        return new ModeloNumeros(arregloNumeros);
    }

}
