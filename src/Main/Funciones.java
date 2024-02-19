/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Personaje.Personaje;

/**
 *
 * @author Kevin
 */
public class Funciones {
    
    //Este metodo crea los 20 personajes iniciales de cada empresa y los mete en sus respectivas colas
    public void crearPersonajes(){
        //Primero creamos 20 de nickelodeon
        for (int i = 0; i < 20; i++) {
            Global.setContador_id(Global.getContador_id() + 1);
            Personaje p = new Personaje(Global.getContador_id(),"Nickelodeon");
            if(p.getNivel() == 1){
                Global.getPrioridad_1_nk().encolar(p);
            }
            if(p.getNivel() == 2){
                Global.getPrioridad_2_nk().encolar(p);
            }
            if(p.getNivel() == 3){
                Global.getPrioridad_3_nk().encolar(p);
            }
            Global.getRefuerzos_nk().encolar(p);// lo anadimos a la cola de refuerzos
            Global.getPersonajes_nk().insertFinal(p);// lo anadimos a la lista de personajes
            //System.out.println(p.isHabilidades() +" " + p.isPuntosVida() + " " + p.isFuerza() + " " + p.isAgilidad() + " "+ p.getNivel()+"\n");
        }
        
        //ahora creamos 20 de Cartoon network
        for (int i = 0; i < 20; i++) {
            Global.setContador_id(Global.getContador_id() + 1);
            Personaje p = new Personaje(Global.getContador_id(),"Cartoon Network");
            if(p.getNivel() == 1){
                Global.getPrioridad_1_cn().encolar(p);
            }
            if(p.getNivel() == 2){
                Global.getPrioridad_2_cn().encolar(p);
            }
            if(p.getNivel() == 3){
                Global.getPrioridad_3_cn().encolar(p);
            }
            Global.getRefuerzos_cn().encolar(p);
            Global.getPersonajes_cn().insertFinal(p);
            //System.out.println(p.isHabilidades() +" " + p.isPuntosVida() + " " + p.isFuerza() + " " + p.isAgilidad() + " "+ p.getNivel()+"\n");
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
}
