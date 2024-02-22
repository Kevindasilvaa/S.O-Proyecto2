/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Personaje.Personaje;

/**
 *
 * @author Kevin
 */
public class NodoCola {
    private NodoCola next;
    private Personaje element;

    public NodoCola(Personaje element) {
        this.next = null;
        this.element = element;
    }

    /**
     * @return the next
     */
    public NodoCola getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoCola next) {
        this.next = next;
    }

    /**
     * @return the element
     */
    public Personaje getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Personaje element) {
        this.element = element;
    }
    
    
}
