/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.ups.est.estructurau1;

import ec.edu.ups.est.estructurau1.controllers.ControllerMain;
import ec.edu.ups.est.estructurau1.views.Vista;

/**
 *
 * @author pablo
 */
public class EstructuraU1 {

    public static void main(String[] args) {
       Vista vista = new Vista();
        ControllerMain controlador = new ControllerMain( vista);
        controlador.iniciar();
    }
}
