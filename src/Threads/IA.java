/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import EDD.ListaDoble;
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
    String ganadores = "";
    @Override
    public void run() {
        while (true) {
            try {
                //Sincronizamos los semaforos
                try {
                    Global.getMutex2().release();
                    Global.getMutex1().acquire();
                    Global.getMutex3().acquire();
                } catch (InterruptedException ex) {
                    Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("soy la IA");
                Global.getInterfaz().actualizarPeleadores("");
                Global.getInterfaz().cambiarEstadoBatalla("");
                Global.getInterfaz().cambiarEstadoIA("SELECCIONANDO");
                sleep((long) (Global.getSimSpeed())); //duerme 1 segundo
                
                if (Global.getPeleadorNickelodeon() != null && Global.getPeleadorCN() != null) {//si los 2 peleadores son diferentes de null entrara aqui
                    //actualizar peleadores
                    String peleadores = "N"+Global.getPeleadorNickelodeon().getId()+"-"+Global.getPeleadorNickelodeon().getNombre() + "    vs    "+"C"+Global.getPeleadorCN().getId()+"-"+Global.getPeleadorCN().getNombre();
                    Global.getInterfaz().actualizarPeleadores(peleadores);
                    Global.getInterfaz().cambiarEstadoIA("DECIDIENDO");
                    
                    sleep((long) (Global.getDuracionSimulacion())/2);//duerme 5 segundos
                    
                    int randNum = (int) (Math.random() * 100);
                    System.out.println("Numero random: " + randNum);
                    
                    
                    if (randNum < 40) {//40% de probabilidades de ganar
                        int numeroRandom = (int) (Math.random() * 100);
                        if(numeroRandom < 50){
                            //Ganador nickelodeon
                            String ganadorNK = "N"+Global.getPeleadorNickelodeon().getId()+"-"+Global.getPeleadorNickelodeon().getNombre();
                            Global.getInterfaz().cambiarEstadoBatalla("GANADOR:"+ganadorNK);
                            ganadores += ganadorNK + "\n";
                            int countNK = Global.getContador_ganadoresNK()+1;
                            Global.setContador_ganadoresNK(countNK);
                            Global.getInterfaz().aumentoGanadorNK(countNK);
                            Global.getInterfaz().actualizarListaGanadores(ganadores);
                        }else{
                            String ganadorCN = "C"+Global.getPeleadorCN().getId()+"-"+Global.getPeleadorCN().getNombre();
                            Global.getInterfaz().cambiarEstadoBatalla("GANADOR:"+ganadorCN);
                            ganadores += ganadorCN + "\n";
                            int countCN = Global.getContador_ganadoresCN()+1;
                            Global.setContador_ganadoresCN(countCN);
                            Global.getInterfaz().aumentoGanadorCN(countCN);
                            Global.getInterfaz().actualizarListaGanadores(ganadores);
                        }
                    } else if (randNum < 67) {//%27 de probabilidades empatar
                        Global.getPrioridad_1_nk().encolar(Global.getPeleadorNickelodeon());
                        Global.getPrioridad_1_cn().encolar(Global.getPeleadorCN());
                        Global.getInterfaz().ActualizarColaCN_1();
                        Global.getInterfaz().ActualizarColaNK_1();
                        Global.getInterfaz().cambiarEstadoBatalla("         EMPATE");
                    } else {//33% de que no haya combate
                        Global.getRefuerzos_nk().encolar(Global.getPeleadorNickelodeon());
                        Global.getRefuerzos_cn().encolar(Global.getPeleadorCN());
                        Global.getInterfaz().ActualizarColaNK_Refuerzos();
                        Global.getInterfaz().ActualizarColaCN_Refuerzos();
                        Global.getInterfaz().cambiarEstadoBatalla("NO PUDO LLEVARSE A CABO");
                    }
                    Global.getInterfaz().cambiarEstadoIA("ANUNCIANDO RESULTADO");
                    sleep((long) (Global.getNextSim())); //duerme 4 segundos
                    
                } else {
                    Global.getInterfaz().cambiarEstadoIA("No hay personajes");
                    System.out.println("no hay personaje");
                }
                Global.setPeleadorCN(null);
                Global.setPeleadorNickelodeon(null);
                Global.getMutex3().release();
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                    
    }
}
