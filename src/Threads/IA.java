/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import Main.Global;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class IA extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                //Sincronizamos los semaforos
                try {
                    Global.getMutex2().release();
                    Global.getMutex1().acquire();
                } catch (InterruptedException ex) {
                    Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("soy la IA");
                Global.getInterfaz().actualizarPeleadores("");
                Global.getInterfaz().cambiarEstadoIA("SELECCIONANDO");
                
                if (Global.getPeleadorNickelodeon() != null && Global.getPeleadorCN() != null) {//si los 2 peleadores son diferentes de null entrara aqui
                    //actualizar peleadores
                    String peleadores = "N"+Global.getPeleadorNickelodeon().getId()+"-"+Global.getPeleadorNickelodeon().getNombre() + "  vs  "+"C"+Global.getPeleadorCN().getId()+"-"+Global.getPeleadorCN().getNombre();
                    Global.getInterfaz().actualizarPeleadores(peleadores);
                    Global.getInterfaz().cambiarEstadoIA("DECIDIENDO");
                    
                    sleep((long) Global.getDuracionSimulacion());//duerme los 10 segundos
                    
                    int randNum = (int) (Math.random() * 100);
                    System.out.println("Numero random: " + randNum);
                    
                    
                    if (randNum < 40) {//40% de probabilidades de ganar
                        int numeroRandom = (int) (Math.random() * 100);
                        if(numeroRandom < 50){
                            Global.getInterfaz().cambiarEstadoIA("GANADOR: " +"N"+Global.getPeleadorNickelodeon().getId()+" - "+ Global.getPeleadorNickelodeon().getNombre());
                        }else{
                            Global.getInterfaz().cambiarEstadoIA("GANADOR: " +"C"+Global.getPeleadorCN().getId()+" - "+ Global.getPeleadorCN().getNombre());
                        }
                    } else if (randNum < 67) {//%27 de probabilidades empatar
                        Global.getInterfaz().cambiarEstadoIA("EMPATE");
                        Global.getPrioridad_1_nk().encolar(Global.getPeleadorNickelodeon());
                        Global.getPrioridad_1_cn().encolar(Global.getPeleadorCN());
                    } else {//33% de que no haya combate
                        Global.getInterfaz().cambiarEstadoIA("NO PUDO LLEVARSE ACABO EL COMBATE");
                        Global.getRefuerzos_nk().encolar(Global.getPeleadorNickelodeon());
                        Global.getRefuerzos_cn().encolar(Global.getPeleadorCN());
                    }
                } else {
                    Global.getInterfaz().cambiarEstadoIA("No hay personajes");
                    System.out.println("no hay personaje");
                }
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                    
    }
}
