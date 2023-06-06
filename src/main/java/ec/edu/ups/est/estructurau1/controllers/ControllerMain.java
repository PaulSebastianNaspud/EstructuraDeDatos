/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.controllers;

import ec.edu.ups.est.estructurau1.models.Dato;
import ec.edu.ups.est.estructurau1.models.ModeloCadenaChars;
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
                    
                    String cadenaCaracteres = vista.pedirCadenaCaracteres();
                    // Instancia de [dato] como ModeloCadenaChars
                   dato = new ModeloCadenaChars(cadenaCaracteres);
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
    private void ejecutarMetodoOrdenamiento() {
        boolean ascendentemente = false;

        while (true) {
            int opcionMetodo = vista.mostrarMenuMetodos();

            switch (opcionMetodo) {
                case 1:
                    System.out.println("Entra al metodo burbuja ");
                    ascendentemente = seleccionarOrden();
                    
                    Dato result = dato.ordenarBurbuja(ascendentemente);
                    System.out.println(result);
                       System.out.println("Fin al metodo burbuja ");
                    return;
                case 2:
                    ascendentemente = seleccionarOrden();
                    dato.ordenarSeleccion(ascendentemente);
                    return;
                case 3:
                    ascendentemente = seleccionarOrden();
                    dato.ordenarInsercion(ascendentemente);
                    return;
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
            vista.mostrarMensaje("Seleccione el orden:");
            vista.mostrarMensaje("1. Ascendente");
            vista.mostrarMensaje("2. Descendente");
            opcionOrden = vista.mostrarMensajeRespuestaInt("Ingrese una opción: ");
        }
        
        ascendentemente = (opcionOrden == 1);
        return ascendentemente;
    }
}
