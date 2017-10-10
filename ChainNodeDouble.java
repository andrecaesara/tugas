/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Fiki L
 */
public class ChainNodeDouble {
    Object element;
    ChainNodeDouble next;
    ChainNodeDouble prev;
    
    ChainNodeDouble(){
        
    }
    ChainNodeDouble(Object Element){
        this.element = element;
    }

    public ChainNodeDouble(Object element, ChainNodeDouble next) {
        this.element = element;
        this.next = next;
    }
    public ChainNodeDouble(Object element, ChainNodeDouble next, ChainNodeDouble prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public ChainNodeDouble getNext() {
        return next;
    }

    public void setNext(ChainNodeDouble next) {
        this.next = next;
    }

    public ChainNodeDouble getPrev() {
        return prev;
    }

    public void setPrev(ChainNodeDouble prev) {
        this.prev = prev;
    }
    
    
}
