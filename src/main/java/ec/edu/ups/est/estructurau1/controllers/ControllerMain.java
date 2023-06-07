/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.controllers;

import ec.edu.ups.est.estructurau1.models.Dato;
import ec.edu.ups.est.estructurau1.models.ModeloCadenas;
import ec.edu.ups.est.estructurau1.models.ModeloCadenaSinEspacios;
import ec.edu.ups.est.estructurau1.models.ModeloNumeros;
import ec.edu.ups.est.estructurau1.views.Vista;

/**
 *
 * @author pablo
 */
public class ControllerMain {

    private final Vista vista;
    private Dato dato;

    public ControllerMain(Vista vista) {

        this.vista = vista;
    }

    public void iniciar() {
        int opcionPrincipal = -1;

        while (opcionPrincipal != 0) {
            opcionPrincipal = vista.mostrarMenuPrincipal();

            // Instancia de [dato] segun la opcion escogida
            switch (opcionPrincipal) {
                case 1:
                    int[] arregloNumeros = vista.pedirArregloNumeros();
                    // Instancia de [dato] como Modelonumeros
                    dato = new ModeloNumeros(arregloNumeros);
                    ejecutarMetodoOrdenamiento();
                    break;
                case 2:

                    String cadenaSinEspacios = vista.pedirCadenaSinEspacios();
                    // Instancia de [dato] como ModeloCadenaSinEspacios
                    dato = new ModeloCadenaSinEspacios(cadenaSinEspacios);
                    ejecutarMetodoOrdenamiento();
                    break;
                case 3:

                    String[] cadenaCaracteres = vista.pedirArregloCadenas();
                    // Instancia de [dato] como ModeloCadenaChars
                    dato = new ModeloCadenas(cadenaCaracteres);
                    ejecutarMetodoOrdenamiento();
                    break;
                case 0:
                    vista.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida");
                    break;
            }
        }
    }

    // Metodo que indica el tipo de ordenamiento esogido por el usuario
    private <T> void ejecutarMetodoOrdenamiento() {
        boolean ascendentemente = false;

        while (true) {

            int opcionMetodo = vista.mostrarMenuMetodos();

            switch (opcionMetodo) {
                case 1:

                    ascendentemente = seleccionarOrden();
                    boolean pasos = seleccionarSiNo("Desea imprimir los pasos:");

                    vista.mostrarMensaje("Dato: " + dato);
                    Dato<T> result = dato.ordenarBurbuja(ascendentemente, pasos);
                    vista.mostrarMensaje("* Ordenado por el metodo Burbuja de manera "
                            + (ascendentemente ? "ascendente" : "descendente"));
                    vista.mostrarMensaje("Resltado: " + result.toString());

                    break;
                case 2:
                    vista.mostrarMensaje("Dato: " + dato);
                    ascendentemente = seleccionarOrden();
                    Dato<T> resultSelec = dato.ordenarSeleccion(ascendentemente);
                    vista.mostrarMensaje("* Ordenado por el metodo Seleccion");
                    vista.mostrarMensaje("Resltado: " + resultSelec.toString());

                    break;
                case 3:
                    vista.mostrarMensaje("Dato: " + dato);
                    ascendentemente = seleccionarOrden();
                    Dato<T> resultInse = dato.ordenarInsercion(ascendentemente);
                    vista.mostrarMensaje("* Ordenado por el metodo Insercion");
                    vista.mostrarMensaje("Resltado: " + resultInse.toString());
                    break;
                case 4:
                    return;
                case 0:
                    iniciar();
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida");
                    break;
            }

        }
    }

    // Metodo que me devuelve si el usuario quiere que se ordene de manera
    // ascendente o descendentemente.
    private boolean seleccionarOrden() {
        int opcionOrden = -1;
        boolean ascendentemente = false;

        while (opcionOrden != 1 && opcionOrden != 2) {
            vista.mostrarMensaje("");
            vista.mostrarMensaje("Seleccione el orden:", 1);
            vista.mostrarMensaje("1. Ascendente", 2);
            vista.mostrarMensaje("2. Descendente", 2);
            opcionOrden = vista.mostrarMensajeRespuestaInt("Ingrese una opción: ");
        }

        ascendentemente = (opcionOrden == 1);
        return ascendentemente;
    }

    /// Metodo que me devuelve si el usuario una respuesta de Si o No en tipo
    /// boolean
    private boolean seleccionarSiNo(String message) {
        int opcion = -1;

        while (opcion != 1 && opcion != 2) {
            vista.mostrarMensaje("");
            vista.mostrarMensaje(message, 1);
            vista.mostrarMensaje("1. Si", 2);
            vista.mostrarMensaje("2. No", 2);
            opcion = vista.mostrarMensajeRespuestaInt("Ingrese una opción: ");

            if ((opcion != 1 && opcion != 2)) {
                vista.mostrarMensaje("Opción no valida.", 2);
            }
        }

        return (opcion == 1);
    }
}
