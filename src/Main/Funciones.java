/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Personaje.Personaje;

/**
 *
 * @author Diego
 */
public class Funciones {
    private String[] nombresPersonajesNickelodeon = {
        "Aang", "Katara", "Sokka", "Toph", "Zuko", "Azula", "Iroh", "Appa", "Momo", "Suki", "Ty Lee", 
        "Haru", "Mai", "Jet", "Long Feng", "Ozai", "Yue", "Bumi", "Pakku", "Zhao"
    };
    private String[] nombresPersonajesCartoonNetwork = {
        "Mordecai", "Rigby", "Musculoso", "Benson", "Skips", "Papaleta", "Starla", "Margarita", 
        "Fantasmin", "Mr Maellard", "CJ", "Roxy", "Low Five Ghost", "Buttonwillow", "Mr Murphy", 
        "Dr Henry", "Gary", "Gopher", "Glenn", "Thomas"
    };
    
    //Este metodo crea los 20 personajes iniciales de cada empresa y los mete en sus respectivas colas
    public void crearPersonajes(){
        for (int i = 0; i < 20; i++) {
            this.crearPersonajeNickelodeon();//Primero creamos 20 de nickelodeon
            this.crearPersonajeCN();//ahora creamos 20 de Cartoon network
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
    }
    
    //Este metodo retornara un nombre aleatorio del array de nombres de la empresa respectiva
    public String nombrePersonajeAleatorio(String compania){
        String respuesta = "";
        int indice = (int)(Math.random() * (19));
        if(compania == "Nickelodeon"){
            respuesta = this.nombresPersonajesNickelodeon[indice];
        }else if(compania == "Cartoon Network"){
            respuesta = this.nombresPersonajesCartoonNetwork[indice];
        }
        return respuesta;
    }
    
    public void crearPersonajeNickelodeon(){
        Global.setContador_id(Global.getContador_id() + 1);
        String nombre = this.nombrePersonajeAleatorio("Nickelodeon");
        Personaje p = new Personaje(Global.getContador_id(),"Nickelodeon",nombre);
        if(p.getNivel() == 1){
            Global.getPrioridad_1_nk().encolar(p);
        }
        if(p.getNivel() == 2){
            Global.getPrioridad_2_nk().encolar(p);
        }
        if(p.getNivel() == 3){
            Global.getPrioridad_3_nk().encolar(p);
        }
        Global.getPersonajes_nk().insertFinal(p);// lo anadimos a la lista de personajes
        //System.out.println(p.isHabilidades() +" " + p.isPuntosVida() + " " + p.isFuerza() + " " + p.isAgilidad() + " "+ p.getNivel()+"\n");
        
    }
    //este metodo crea un personaje de cartoon network
    public void crearPersonajeCN(){
        Global.setContador_id(Global.getContador_id() + 1);
        String nombre = this.nombrePersonajeAleatorio("Cartoon Network");
        Personaje p = new Personaje(Global.getContador_id(),"Cartoon Network",nombre);
        if(p.getNivel() == 1){
            Global.getPrioridad_1_cn().encolar(p);
        }
        if(p.getNivel() == 2){
            Global.getPrioridad_2_cn().encolar(p);
        }
        if(p.getNivel() == 3){
            Global.getPrioridad_3_cn().encolar(p);
        }
        Global.getPersonajes_cn().insertFinal(p);
            //System.out.println(p.isHabilidades() +" " + p.isPuntosVida() + " " + p.isFuerza() + " " + p.isAgilidad() + " "+ p.getNivel()+"\n");
    }
}
