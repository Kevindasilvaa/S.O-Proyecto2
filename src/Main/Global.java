/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import EDD.Cola;
import EDD.ListaDoble;
import Personaje.Personaje;
import Threads.Administrador;
import Threads.IA;
import Ventanas.Interfaz;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Kevin
 */
public class Global {
    private static Administrador administrador = new Administrador();
    private static IA ia = new IA();
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
    private static Semaphore mutex1 = new Semaphore(0);
    private static Semaphore mutex2 = new Semaphore(0);
    private static Semaphore mutex3 = new Semaphore(1);
    
    //Velocidad de simulacion
    private static double simSpeed = 1000;
    private static double duracionSimulacion = 10000;
    private static double nextSim = 4000;
    
    //Contador de id's de los personajes
    private static int contador_id = 0;
    
    //Contador de los ganadores de Nickelodeon
    private static int contador_ganadoresNK = 0;
    //Contador de los ganadores de Cartoon Network
    private static int contador_ganadoresCN = 0;
    
    //Interfaz
    private static Interfaz interfaz = new Interfaz();
    
    //Peleadores
    private static Personaje peleadorNickelodeon;
    private static Personaje peleadorCN;
    
    private static int cantidadCiclos = 0;

    public static Administrador getAdministrador() {
        return administrador;
    }

    public static void setAdministrador(Administrador administrador) {
        Global.administrador = administrador;
    }

    public static IA getIa() {
        return ia;
    }

    public static void setIa(IA ia) {
        Global.ia = ia;
    }

    public static ListaDoble getPersonajes_cn() {
        return personajes_cn;
    }

    public static void setPersonajes_cn(ListaDoble personajes_cn) {
        Global.personajes_cn = personajes_cn;
    }

    public static ListaDoble getPersonajes_nk() {
        return personajes_nk;
    }

    public static void setPersonajes_nk(ListaDoble personajes_nk) {
        Global.personajes_nk = personajes_nk;
    }

    public static Cola getPrioridad_1_cn() {
        return prioridad_1_cn;
    }

    public static void setPrioridad_1_cn(Cola prioridad_1_cn) {
        Global.prioridad_1_cn = prioridad_1_cn;
    }

    public static Cola getPrioridad_2_cn() {
        return prioridad_2_cn;
    }

    public static void setPrioridad_2_cn(Cola prioridad_2_cn) {
        Global.prioridad_2_cn = prioridad_2_cn;
    }

    public static Cola getPrioridad_3_cn() {
        return prioridad_3_cn;
    }

    public static void setPrioridad_3_cn(Cola prioridad_3_cn) {
        Global.prioridad_3_cn = prioridad_3_cn;
    }

    public static Cola getRefuerzos_cn() {
        return refuerzos_cn;
    }

    public static void setRefuerzos_cn(Cola refuerzos_cn) {
        Global.refuerzos_cn = refuerzos_cn;
    }

    public static Cola getPrioridad_1_nk() {
        return prioridad_1_nk;
    }

    public static void setPrioridad_1_nk(Cola prioridad_1_nk) {
        Global.prioridad_1_nk = prioridad_1_nk;
    }

    public static Cola getPrioridad_2_nk() {
        return prioridad_2_nk;
    }

    public static void setPrioridad_2_nk(Cola prioridad_2_nk) {
        Global.prioridad_2_nk = prioridad_2_nk;
    }

    public static Cola getPrioridad_3_nk() {
        return prioridad_3_nk;
    }

    public static void setPrioridad_3_nk(Cola prioridad_3_nk) {
        Global.prioridad_3_nk = prioridad_3_nk;
    }

    public static Cola getRefuerzos_nk() {
        return refuerzos_nk;
    }

    public static void setRefuerzos_nk(Cola refuerzos_nk) {
        Global.refuerzos_nk = refuerzos_nk;
    }

    public static Cola getVictorias_nk() {
        return victorias_nk;
    }

    public static void setVictorias_nk(Cola victorias_nk) {
        Global.victorias_nk = victorias_nk;
    }

    public static Cola getVictorias_cn() {
        return victorias_cn;
    }

    public static void setVictorias_cn(Cola victorias_cn) {
        Global.victorias_cn = victorias_cn;
    }

    public static Semaphore getMutex1() {
        return mutex1;
    }

    public static void setMutex1(Semaphore mutex1) {
        Global.mutex1 = mutex1;
    }

    public static Semaphore getMutex2() {
        return mutex2;
    }

    public static void setMutex2(Semaphore mutex2) {
        Global.mutex2 = mutex2;
    }

    public static Semaphore getMutex3() {
        return mutex3;
    }

    public static void setMutex3(Semaphore mutex3) {
        Global.mutex3 = mutex3;
    }

    public static double getSimSpeed() {
        return simSpeed;
    }

    public static void setSimSpeed(double simSpeed) {
        Global.simSpeed = simSpeed;
    }

    public static double getDuracionSimulacion() {
        return duracionSimulacion;
    }

    public static void setDuracionSimulacion(double duracionSimulacion) {
        Global.duracionSimulacion = duracionSimulacion;
    }

    public static double getNextSim() {
        return nextSim;
    }

    public static void setNextSim(double nextSim) {
        Global.nextSim = nextSim;
    }

    public static int getContador_id() {
        return contador_id;
    }

    public static void setContador_id(int contador_id) {
        Global.contador_id = contador_id;
    }
    
    public static int getContador_ganadoresNK() {
        return contador_ganadoresNK;
    }

    public static void setContador_ganadoresNK(int contador_ganadoresNK) {
        Global.contador_ganadoresNK = contador_ganadoresNK;
    }

    public static int getContador_ganadoresCN() {
        return contador_ganadoresCN;
    }

    public static void setContador_ganadoresCN(int contador_ganadoresCN) {
        Global.contador_ganadoresCN = contador_ganadoresCN;
    }

    public static Interfaz getInterfaz() {
        return interfaz;
    }

    public static void setInterfaz(Interfaz interfaz) {
        Global.interfaz = interfaz;
    }

    public static Personaje getPeleadorNickelodeon() {
        return peleadorNickelodeon;
    }

    public static void setPeleadorNickelodeon(Personaje peleadorNickelodeon) {
        Global.peleadorNickelodeon = peleadorNickelodeon;
    }

    public static Personaje getPeleadorCN() {
        return peleadorCN;
    }

    public static void setPeleadorCN(Personaje peleadorCN) {
        Global.peleadorCN = peleadorCN;
    }

    public static int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public static void setCantidadCiclos(int cantidadCiclos) {
        Global.cantidadCiclos = cantidadCiclos;
    }

}