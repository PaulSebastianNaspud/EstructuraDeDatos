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
        return Arrays.toString(this.objetoDato); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    // Implementación del algoritmo de ordenamiento Burbuja para arreglo de números
    @Override
    public Dato<int[]> ordenarBurbuja(boolean ascendentemente) {
        
        int[] arregloNumeros = objetoDato;
        int n = arregloNumeros.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascendentemente) {
                    if (arregloNumeros[j] > arregloNumeros[j + 1]) {
                        // Intercambiar los elementos
                        int temp = arregloNumeros[j];
                        arregloNumeros[j] = arregloNumeros[j + 1];
                        arregloNumeros[j + 1] = temp;
                    }
                    System.out.println(Arrays.toString(arregloNumeros));
                            
                } else {
                    if (arregloNumeros[j] < arregloNumeros[j + 1]) {
                        // Intercambiar los elementos
                        int temp = arregloNumeros[j];
                        arregloNumeros[j] = arregloNumeros[j + 1];
                        arregloNumeros[j + 1] = temp;
                    }
                }
            }
        }
        
        return new ModeloNumeros(arregloNumeros);
    }
    
    

    @Override
    public int[] ordenarSeleccion(boolean ascendentemente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int[] ordenarInsercion(boolean ascendentemente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
