/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personaje;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class Personaje {
    private int id;
    private int nivel;
    private int contador = 0;
    private String compania;
    private String nombre;
    
    //atributos del personaje
    //false = no es de calidad
    //true = es de calidad
    private boolean habilidades;
    private boolean puntosVida;
    private boolean fuerza;
    private boolean agilidad;

    public Personaje(int id, String compania,String nombre) {
        this.id = id;
        this.compania = compania;
        this.nombre = nombre;
        this.determinarNivel();
    }
    
    
    public void determinarNivel() {
        this.determinarAtributosDePersonaje();
        
        int numero =  this.CantidadDeAtributosDeCalidad();
        Random random = new Random();
        int resultado = 0;
        
        switch (numero) {
            case 0:
                resultado = 3;
                break;
            case 1:
                resultado = 3; 
                break;
            case 2:
                resultado = 2;
                break;
            case 3:
                resultado = 1;
                break;
            case 4:
                resultado = 1;
                break;
        }

        this.setNivel(resultado);
    }
    
    //este metodo retorna la cantidad de atributos de calidad que tiene el personaje
    public int CantidadDeAtributosDeCalidad(){
        int respuesta = 0;
        if(this.habilidades == true){
            respuesta += 1;
        }
        if(this.puntosVida == true){
            respuesta += 1;
        }
        if(this.fuerza == true){
            respuesta += 1;
        }
        if(this.agilidad == true){
            respuesta += 1;
        }
        return respuesta;
    }
    
    //este metodo determinara si los atributos del personaje son de calidad o no
    public void determinarAtributosDePersonaje(){
        //el metodo devolvera 1 si cayo en el 60% de la primera opcion
        if(obtenerOpcion(60,40) == 1){
            this.setHabilidades(true);
        }else{
            this.setHabilidades(false);
        }
        
        if(obtenerOpcion(70,30) == 1){
            this.setPuntosVida(true);
        }else{
            this.setPuntosVida(false);
        }
        
        if(obtenerOpcion(50,50) == 1){
            this.setFuerza(true);
        }else{
            this.setFuerza(false);
        }
        
        if(obtenerOpcion(40,60) == 1){
            this.setAgilidad(true);
        }else{
            this.setAgilidad(false);
        }
        //System.out.println(this.isHabilidades() +" " + this.isPuntosVida() + " " + this.isFuerza() + " " + this.isAgilidad());
        
    }
    
    //dadas 2 opciones
    //este metodo recibe el porcentaje de probabilidad que tiene cada opcion y elige una al azar segun ese porcentaje
    public int obtenerOpcion(int x, int y) {
        // Asignar valores a las opciones
        int opcion1 = x;
        int opcion2 = y;

        // Calcular la suma de los valores asignados a las opciones
        int sumaValores = opcion1 + opcion2;

        // Generar un número aleatorio entre 1 y la suma de los valores
        Random random = new Random();
        int numeroAleatorio = random.nextInt(sumaValores) + 1;

        // Seleccionar la opción correspondiente al número aleatorio generado
        if (numeroAleatorio <= opcion1) {
            return 1;
        } else{
            return 2;
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the compania
     */
    public String getCompania() {
        return compania;
    }

    /**
     * @param compania the compania to set
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * @return the habilidades
     */
    public boolean isHabilidades() {
        return habilidades;
    }

    /**
     * @param habilidades the habilidades to set
     */
    public void setHabilidades(boolean habilidades) {
        this.habilidades = habilidades;
    }

    /**
     * @return the puntosVida
     */
    public boolean isPuntosVida() {
        return puntosVida;
    }

    /**
     * @param puntosVida the puntosVida to set
     */
    public void setPuntosVida(boolean puntosVida) {
        this.puntosVida = puntosVida;
    }

    /**
     * @return the fuerza
     */
    public boolean isFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(boolean fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the agilidad
     */
    public boolean isAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(boolean agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
