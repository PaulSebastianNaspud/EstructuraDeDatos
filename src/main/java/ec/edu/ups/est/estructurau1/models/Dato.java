/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.models;

/**
 *
 * @author pablo
 */
public abstract class Dato<T> {
    protected T objetoDato;

    public Dato(T objetoDato) {
        this.objetoDato = objetoDato;
    }

    // public abstract Dato<T> ordenarBurbuja(boolean ascendentemente);
    public abstract Dato<T> ordenarBurbuja(boolean ascendentemente, boolean info);

    public abstract Dato<T> ordenarSeleccion(boolean ascendentemente);

    public abstract Dato<T> ordenarInsercion(boolean ascendentemente);

    @Override
    public String toString() {
        return objetoDato.toString();
    }

}