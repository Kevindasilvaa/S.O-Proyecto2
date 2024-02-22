/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import EDD.Cola;
import EDD.ListaDoble;
import Personaje.Personaje;
import Ventanas.Interfaz;
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
    private static Semaphore mutex1 = new Semaphore(0);
    private static Semaphore mutex2 = new Semaphore(0);
    
    //Velocidad de simulacion
    private double simSpeed = 1000;
    private static double duracionSimulacion = 10000;
    private double nextSim = 4000;
    
    //Contador de id's de los personajes
    private static int contador_id = 0;
    
    //Interfaz
    private static Interfaz interfaz = new Interfaz();
    
    //Peleadores
    private static Personaje peleadorNickelodeon;
    private static Personaje peleadorCN;
    
    private static int cantidadCiclos = 0;

    /**
     * @return the personajes_cn
     */
    public static ListaDoble getPersonajes_cn() {
        return personajes_cn;
    }

    /**
     * @param aPersonajes_cn the personajes_cn to set
     */
    public static void setPersonajes_cn(ListaDoble aPersonajes_cn) {
        personajes_cn = aPersonajes_cn;
    }

    /**
     * @return the personajes_nk
     */
    public static ListaDoble getPersonajes_nk() {
        return personajes_nk;
    }

    /**
     * @param aPersonajes_nk the personajes_nk to set
     */
    public static void setPersonajes_nk(ListaDoble aPersonajes_nk) {
        personajes_nk = aPersonajes_nk;
    }

    /**
     * @return the prioridad_1_cn
     */
    public static Cola getPrioridad_1_cn() {
        return prioridad_1_cn;
    }

    /**
     * @param aPrioridad_1_cn the prioridad_1_cn to set
     */
    public static void setPrioridad_1_cn(Cola aPrioridad_1_cn) {
        prioridad_1_cn = aPrioridad_1_cn;
    }

    /**
     * @return the prioridad_2_cn
     */
    public static Cola getPrioridad_2_cn() {
        return prioridad_2_cn;
    }

    /**
     * @param aPrioridad_2_cn the prioridad_2_cn to set
     */
    public static void setPrioridad_2_cn(Cola aPrioridad_2_cn) {
        prioridad_2_cn = aPrioridad_2_cn;
    }

    /**
     * @return the prioridad_3_cn
     */
    public static Cola getPrioridad_3_cn() {
        return prioridad_3_cn;
    }

    /**
     * @param aPrioridad_3_cn the prioridad_3_cn to set
     */
    public static void setPrioridad_3_cn(Cola aPrioridad_3_cn) {
        prioridad_3_cn = aPrioridad_3_cn;
    }

    /**
     * @return the refuerzos_cn
     */
    public static Cola getRefuerzos_cn() {
        return refuerzos_cn;
    }

    /**
     * @param aRefuerzos_cn the refuerzos_cn to set
     */
    public static void setRefuerzos_cn(Cola aRefuerzos_cn) {
        refuerzos_cn = aRefuerzos_cn;
    }

    /**
     * @return the prioridad_1_nk
     */
    public static Cola getPrioridad_1_nk() {
        return prioridad_1_nk;
    }

    /**
     * @param aPrioridad_1_nk the prioridad_1_nk to set
     */
    public static void setPrioridad_1_nk(Cola aPrioridad_1_nk) {
        prioridad_1_nk = aPrioridad_1_nk;
    }

    /**
     * @return the prioridad_2_nk
     */
    public static Cola getPrioridad_2_nk() {
        return prioridad_2_nk;
    }

    /**
     * @param aPrioridad_2_nk the prioridad_2_nk to set
     */
    public static void setPrioridad_2_nk(Cola aPrioridad_2_nk) {
        prioridad_2_nk = aPrioridad_2_nk;
    }

    /**
     * @return the prioridad_3_nk
     */
    public static Cola getPrioridad_3_nk() {
        return prioridad_3_nk;
    }

    /**
     * @param aPrioridad_3_nk the prioridad_3_nk to set
     */
    public static void setPrioridad_3_nk(Cola aPrioridad_3_nk) {
        prioridad_3_nk = aPrioridad_3_nk;
    }

    /**
     * @return the refuerzos_nk
     */
    public static Cola getRefuerzos_nk() {
        return refuerzos_nk;
    }

    /**
     * @param aRefuerzos_nk the refuerzos_nk to set
     */
    public static void setRefuerzos_nk(Cola aRefuerzos_nk) {
        refuerzos_nk = aRefuerzos_nk;
    }

    /**
     * @return the victorias_nk
     */
    public static Cola getVictorias_nk() {
        return victorias_nk;
    }

    /**
     * @param aVictorias_nk the victorias_nk to set
     */
    public static void setVictorias_nk(Cola aVictorias_nk) {
        victorias_nk = aVictorias_nk;
    }

    /**
     * @return the victorias_cn
     */
    public static Cola getVictorias_cn() {
        return victorias_cn;
    }

    /**
     * @param aVictorias_cn the victorias_cn to set
     */
    public static void setVictorias_cn(Cola aVictorias_cn) {
        victorias_cn = aVictorias_cn;
    }

    /**
     * @return the mutex1
     */
    public static Semaphore getMutex1() {
        return mutex1;
    }

    /**
     * @param aMutex1 the mutex1 to set
     */
    public static void setMutex1(Semaphore aMutex1) {
        mutex1 = aMutex1;
    }

    /**
     * @return the simSpeed
     */
    public double getSimSpeed() {
        return simSpeed;
    }

    /**
     * @param simSpeed the simSpeed to set
     */
    public void setSimSpeed(double simSpeed) {
        this.simSpeed = simSpeed;
    }

    /**
     * @return the nextSim
     */
    public double getNextSim() {
        return nextSim;
    }

    /**
     * @param nextSim the nextSim to set
     */
    public void setNextSim(double nextSim) {
        this.nextSim = nextSim;
    }

    /**
     * @return the contador_id
     */
    public static int getContador_id() {
        return contador_id;
    }

    /**
     * @param aContador_id the contador_id to set
     */
    public static void setContador_id(int aContador_id) {
        contador_id = aContador_id;
    }

    /**
     * @return the interfaz
     */
    public static Interfaz getInterfaz() {
        return interfaz;
    }

    /**
     * @param aInterfaz the interfaz to set
     */
    public static void setInterfaz(Interfaz aInterfaz) {
        interfaz = aInterfaz;
    }

    /**
     * @return the peleadorNickelodeon
     */
    public static Personaje getPeleadorNickelodeon() {
        return peleadorNickelodeon;
    }

    /**
     * @param aPeleadorNickelodeon the peleadorNickelodeon to set
     */
    public static void setPeleadorNickelodeon(Personaje aPeleadorNickelodeon) {
        peleadorNickelodeon = aPeleadorNickelodeon;
    }

    /**
     * @return the peleadorCN
     */
    public static Personaje getPeleadorCN() {
        return peleadorCN;
    }

    /**
     * @param aPeleadorCN the peleadorCN to set
     */
    public static void setPeleadorCN(Personaje aPeleadorCN) {
        peleadorCN = aPeleadorCN;
    }

    /**
     * @return the cantidadCiclos
     */
    public static int getCantidadCiclos() {
        return cantidadCiclos;
    }

    /**
     * @param aCantidadCiclos the cantidadCiclos to set
     */
    public static void setCantidadCiclos(int aCantidadCiclos) {
        cantidadCiclos = aCantidadCiclos;
    }

    /**
     * @return the duracionSimulacion
     */
    public static double getDuracionSimulacion() {
        return duracionSimulacion;
    }

    /**
     * @param aDuracionSimulacion the duracionSimulacion to set
     */
    public static void setDuracionSimulacion(double aDuracionSimulacion) {
        duracionSimulacion = aDuracionSimulacion;
    }

    /**
     * @return the mutex2
     */
    public static Semaphore getMutex2() {
        return mutex2;
    }

    /**
     * @param aMutex2 the mutex2 to set
     */
    public static void setMutex2(Semaphore aMutex2) {
        mutex2 = aMutex2;
    }
}
