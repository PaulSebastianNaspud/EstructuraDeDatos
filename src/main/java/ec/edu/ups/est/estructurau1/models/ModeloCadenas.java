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

public class ModeloCadenas extends Dato<String[]> {

    public ModeloCadenas(String[] objetoDato) {
        super(objetoDato);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String[] arregloCadenas = objetoDato;

        for (int i = 0; i < arregloCadenas.length; i++) {
            sb.append(arregloCadenas[i]);

            if (i < arregloCadenas.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public Dato<String[]> ordenarBurbuja(boolean ascendentemente, boolean info) {

        String[] arregloCadenas = Arrays.copyOf(objetoDato, objetoDato.length);
        ;
        int n = arregloCadenas.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascendentemente) {
                    if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) {
                        // Intercambiar las cadenas
                        String temp = arregloCadenas[j];
                        arregloCadenas[j] = arregloCadenas[j + 1];
                        arregloCadenas[j + 1] = temp;
                    }
                } else {
                    if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) < 0) {
                        // Intercambiar las cadenas
                        String temp = arregloCadenas[j];
                        arregloCadenas[j] = arregloCadenas[j + 1];
                        arregloCadenas[j + 1] = temp;
                    }
                }
            }

        }

        return new ModeloCadenas(arregloCadenas);

        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public Dato<String[]> ordenarSeleccion(boolean ascendentemente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dato<String[]> ordenarInsercion(boolean ascendentemente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}