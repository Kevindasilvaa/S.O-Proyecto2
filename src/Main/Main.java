/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Personaje.Personaje;

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
        int cantidad_1 = 0;
        int cantidad_2 = 0;
        int cantidad_3 = 0;
        int contador_id = 0;
        for (int i = 0; i < 15; i++) {
            contador_id += 1;
            Personaje p = new Personaje(contador_id,"Disney");
            if(p.getNivel() == 1){
                cantidad_1 += 1;
            }
            if(p.getNivel() == 2){
                cantidad_2 += 1;
            }
            if(p.getNivel() == 3){
                cantidad_3 += 1;
            }
            //System.out.println(p.isHabilidades() +" " + p.isPuntosVida() + " " + p.isFuerza() + " " + p.isAgilidad() + " "+ p.getNivel()+"\n");
        }
        System.out.println("cantidad 1: " + cantidad_1);
        System.out.println("cantidad 2: " + cantidad_2);
        System.out.println("cantidad 3: " + cantidad_3);
    }
    
}
