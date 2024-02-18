package EDD;

import Personaje.Personaje;





public class ListaDoble {
    private NodoListaDoble head;//cabeza
    private NodoListaDoble tail;//ultimo nodo
    private int size;

    public ListaDoble() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public NodoListaDoble getHead() {
        return head;
    }

    public void setHead(NodoListaDoble head) {
        this.head = head;
    }

    public NodoListaDoble getTail() {
        return tail;
    }

    public void setTail(NodoListaDoble tail) {
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
    
    public NodoListaDoble insertBegin(Personaje data) {
        NodoListaDoble node = new NodoListaDoble(data);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            node.setNext(getHead());
            getHead().setPrevious(node);
            setHead(node);
            NodoListaDoble pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            setTail(pointer);
        }
        size++;
        return node;
    }
    
    public NodoListaDoble insertFinal(Personaje data){
        NodoListaDoble node = new NodoListaDoble(data);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            NodoListaDoble pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setPrevious(pointer);
            setTail(node);
        }
        size++;
        return node;
    }
    
    public NodoListaDoble insertInIndex(int index, Personaje data) {
        NodoListaDoble node = new NodoListaDoble(data);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return insertFinal(data);
            } else {
                if (index > getSize() / 2) {
                    NodoListaDoble pointer = getTail();
                    int cont = 0;
                    while (cont < (getSize() - index) && pointer.getPrevious()!= null) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    //5 8 20 1 2 3 4 12
                    //cont 1 pointer 20
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(node);
                    pointer.setNext(node);
                } else {
                    NodoListaDoble pointer = getHead();
                    int cont = 0;
                    while (cont < (index-1) && pointer.getNext()!= null) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(pointer);
                    pointer.setNext(node);
                }
            }
        }
        size++;
        return node;
    }
    
    public NodoListaDoble deleteBegin(){
        if (!isEmpty()){
            if (getSize() == 1) {
                setTail(null);
            }
            NodoListaDoble pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
    
    public NodoListaDoble deleteFinal(){
        if (!isEmpty()){
            NodoListaDoble pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                pointer.getNext().setPrevious(null);
                NodoListaDoble nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setTail(pointer);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }
    
    public NodoListaDoble deleteInIndex(int index) {
        if (!isEmpty()){
            NodoListaDoble pointer = getHead();
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return deleteFinal();
            } else {
                
                if (index > getSize() / 2) {
                    pointer = getTail();
                    int cont = 0;
                    while (cont < (getSize() - index -1) && pointer.getPrevious()!= null) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    NodoListaDoble temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                    
                } else {
                    pointer = getHead();
                    int cont = 0;
                    while (cont < (index-1) && pointer.getNext()!= null) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    NodoListaDoble temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                }
            }
        }
        return null;
    }
    
    public void printList(){
        NodoListaDoble aux = head;
        for (int i = 0; i < getSize(); i++) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }
    
    public void printListInvers(){
        NodoListaDoble aux = tail;
        for (int i = 0; i < getSize(); i++) {
            System.out.println(aux.getElement());
            aux = aux.getPrevious();
        }
    }
    
    
}
