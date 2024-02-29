/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import EDD.NodoCola;
import Personaje.Personaje;
import Threads.Administrador;
import Threads.IA;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Global.getInterfaz().show();

        Funciones func = new Funciones();
        func.crearPersonajes();

        Administrador admi = new Administrador();     
        IA ia = new IA();
        admi.start();
        ia.start();
    }      
}