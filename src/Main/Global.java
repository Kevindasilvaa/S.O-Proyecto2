/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import EDD.Cola;
import EDD.ListaDoble;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Kevin
 */
public class Global {
    //Listas de personajes
    private static ListaDoble personajes_cn = new ListaDoble();
    private static ListaDoble personajes_nk = new ListaDoble();
    
    //colas de cartoon network
    private static Cola prioridad_1_cn = new Cola();
    private static Cola prioridad_2_cn = new Cola();
    private static Cola prioridad_3_cn = new Cola();
    private static Cola refuerzos_cn = new Cola();
    
    //colas de nickelodeon
    private static Cola prioridad_1_nk = new Cola();
    private static Cola prioridad_2_nk = new Cola();
    private static Cola prioridad_3_nk = new Cola();
    private static Cola refuerzos_nk = new Cola();
    
    //colas de victorias
    private static Cola victorias_nk = new Cola();
    private static Cola victorias_cn = new Cola();
    
    //Semaforos de sincornización
    private static Semaphore mutex1 = new Semaphore(1);
    
    //Velocidad de simulacion
    private double simSpeed = 1000;
    private double simLoad = 2000;
    private double nextSim = 4000;
}
