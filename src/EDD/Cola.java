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
public class Cola {
    private NodoCola head, tail;
    private int size;

    public Cola() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public NodoCola getHead() {
        return head;
    }

    public void setHead(NodoCola head) {
        this.head = head;
    }

    public NodoCola getTail() {
        return tail;
    }

    public void setTail(NodoCola tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean isEmpty(){
        return head == null;
    }
    
    
    public NodoCola encolar(Personaje data){
        NodoCola node = new NodoCola(data);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            NodoCola pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        }
        size++;
        return node;
    }
    
   
    public NodoCola despachar(){
        if (!isEmpty()){
            NodoCola pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
            return pointer;
        }
        return null;
    }
    

    public void desencolar(){
        if (!isEmpty()){
            NodoCola pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
        }
    }
    
    public void printQueue(){
        NodoCola pointer = getHead();
        while (pointer != null) {
            System.out.println(pointer.getElement().getId());
            pointer = pointer.getNext();
        }
    }
}
