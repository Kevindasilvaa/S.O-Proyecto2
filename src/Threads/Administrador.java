/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import EDD.Cola;
import EDD.NodoCola;
import Main.Funciones;
import Main.Global;
import Personaje.Personaje;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin
 */
public class Administrador extends Thread{
    
    @Override
    public void run() {
        while (true) {
            try {
                Global.getMutex1().acquire();//pedimos permiso para entrar al Area Compartida
                if (Global.getCantidadCiclos() == 2) {
                    //random sera un número pseudorandom de tipo double mayor o igual a 0.0 y menor que 1.0.
                    double random = Math.random();
                    if (random < 0.8) {
                        this.creacionPersonajes(); //creamos un personaje para cada empresa
                    }
                    Global.setCantidadCiclos(0);//reiniciamos las cantidad de ciclos
                }
                //trabaja en las colas 2 y 3 de ambas empresas. Aumentando el contador de cada personaje
                //y cambiandolo de cola en caso de que su contador sea igual a 8
                this.gestionDeColas();
                
                Personaje nickelodeonPeleador = null;
                Personaje cartoonNetworkPeleador = null;

                //asignamos el peleador de nickelodeon
                if (!Global.getPrioridad_1_nk().isEmpty()) {
                    nickelodeonPeleador = Global.getPrioridad_1_nk().getHead().getElement();
                } else if (!Global.getPrioridad_2_nk().isEmpty()) {
                    nickelodeonPeleador = Global.getPrioridad_2_nk().getHead().getElement();
                } else if (!Global.getPrioridad_3_nk().isEmpty()) {
                    nickelodeonPeleador = Global.getPrioridad_3_nk().getHead().getElement();
                }
                //asignamos el peleador de cartoon network
                if (!Global.getPrioridad_1_cn().isEmpty()) {
                    cartoonNetworkPeleador = Global.getPrioridad_1_cn().getHead().getElement();
                } else if (!Global.getPrioridad_2_cn().isEmpty()) {
                    cartoonNetworkPeleador = Global.getPrioridad_2_cn().getHead().getElement();
                } else if (!Global.getPrioridad_3_cn().isEmpty()) {
                    cartoonNetworkPeleador = Global.getPrioridad_3_cn().getHead().getElement();
                }
                
                //Revisa para sacar de las colas de refuerzo y meter en la cola de prioridad 1
                double random = Math.random();
                if ((random < 0.40)) {
                    if (!Global.getRefuerzos_nk().isEmpty()) {
                        NodoCola personaje = Global.getRefuerzos_nk().despachar();//eliminamos al primero en entrar de los refuerzos 
                        Global.getPrioridad_1_nk().encolar(personaje.getElement());//lo anadimos a la cola 1
                    }

                    if (!Global.getRefuerzos_cn().isEmpty()) {
                        NodoCola personaje = Global.getRefuerzos_cn().despachar();//eliminamos al primero en entrar de los refuerzos 
                        Global.getPrioridad_1_cn().encolar(personaje.getElement());//lo anadimos a la cola 1
                    }
                }
                
                //Actualizar todas las colas en la interfaz
                Global.getInterfaz().ActualizarColaCN_1();
                Global.getInterfaz().ActualizarColaCN_2();
                Global.getInterfaz().ActualizarColaCN_3();
                Global.getInterfaz().ActualizarColaCN_Refuerzos();
                Global.getInterfaz().ActualizarColaNK_1();
                Global.getInterfaz().ActualizarColaNK_2();
                Global.getInterfaz().ActualizarColaNK_3();
                Global.getInterfaz().ActualizarColaNK_Refuerzos();
                
                //Pone en el buffer al peleador que le toca para que el AI lo tome
                Global.setPeleadorNickelodeon(nickelodeonPeleador);
                Global.setPeleadorCN(cartoonNetworkPeleador);
                System.out.println(nickelodeonPeleador + " vs " + cartoonNetworkPeleador);
                
                //aumenatmos el contador de ciclos
                Global.setCantidadCiclos(Global.getCantidadCiclos() + 1);
                
                Global.getMutex1().release();//avisamos la salida del Area Compartida  
            } catch (InterruptedException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                    
    }
    
    //este metodo creara un personaje para cada empresa y actualizara las colas de la interfaz
    public void creacionPersonajes(){
        Funciones func = new Funciones();
        func.crearPersonajeNickelodeon();
        func.crearPersonajeCN();
    }
    
    //este metodo aumenta el contador de los personajes en las colas 2 y 3 de ambas empresas. 
    //Tambien los cambia de cola en caso de que su contador sea igual a 8
    public void gestionDeColas(){
        //primero nickelodeon cola 3
        NodoCola pointer = Global.getPrioridad_3_nk().getHead();
        while (pointer != null) {
            if(pointer.getElement().getContador() == 8){
                Global.getPrioridad_3_nk().eliminar(pointer.getElement());//eliminamos al personaje de la cola 3
                Global.getPrioridad_2_nk().encolar(pointer.getElement());//lo encolamos en la cola 2
                pointer.getElement().setContador(0);//reiniciamos su contador
            }else{
                pointer.getElement().setContador(pointer.getElement().getContador() + 1);//aumentamos su contador
            }
            pointer = pointer.getNext();
        }
        
        //ahora nickelodeon cola 2
        pointer = Global.getPrioridad_2_nk().getHead();
        while (pointer != null) {
            if(pointer.getElement().getContador() == 8){
                Global.getPrioridad_2_nk().eliminar(pointer.getElement());//eliminamos al personaje de la cola 2
                Global.getPrioridad_1_nk().encolar(pointer.getElement());//lo encolamos en la cola 1
                pointer.getElement().setContador(0);//reiniciamos su contador
            }else{
                pointer.getElement().setContador(pointer.getElement().getContador() + 1);//aumentamos su contador
            }
            pointer = pointer.getNext();
        }
        
        //ahora cartoon network cola 3
        pointer = Global.getPrioridad_3_cn().getHead();
        while (pointer != null) {
            if(pointer.getElement().getContador() == 8){
                Global.getPrioridad_3_cn().eliminar(pointer.getElement());//eliminamos al personaje de la cola 3
                Global.getPrioridad_2_cn().encolar(pointer.getElement());//lo encolamos en la cola 2
                pointer.getElement().setContador(0);//reiniciamos su contador
            }else{
                pointer.getElement().setContador(pointer.getElement().getContador() + 1);//aumentamos su contador
            }
            pointer = pointer.getNext();
        }
        
        //ahora cartoon network cola 2
        pointer = Global.getPrioridad_2_cn().getHead();
        while (pointer != null) {
            if(pointer.getElement().getContador() == 8){
                Global.getPrioridad_2_cn().eliminar(pointer.getElement());//eliminamos al personaje de la cola 2
                Global.getPrioridad_1_cn().encolar(pointer.getElement());//lo encolamos en la cola 1
                pointer.getElement().setContador(0);//reiniciamos su contador
            }else{
                pointer.getElement().setContador(pointer.getElement().getContador() + 1);//aumentamos su contador
            }
            pointer = pointer.getNext();
        }
    }
}
