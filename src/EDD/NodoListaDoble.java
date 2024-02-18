package EDD;

import Personaje.Personaje;




public class NodoListaDoble {
    private Personaje element;
    private NodoListaDoble next;
    private NodoListaDoble previous;

    public NodoListaDoble(Personaje element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    
    public Personaje getElement() {
        return element;
    }

    
    public void setElement(Personaje element) {
        this.element = element;
    }

    
    public NodoListaDoble getNext() {
        return next;
    }

    
    public void setNext(NodoListaDoble next) {
        this.next = next;
    }

    
    public NodoListaDoble getPrevious() {
        return previous;
    }

    
    public void setPrevious(NodoListaDoble previous) {
        this.previous = previous;
    }
    
    
}
