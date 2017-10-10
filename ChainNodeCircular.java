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
public class ChainNodeCircular {
    Object element;
    ChainNodeCircular next;
    ChainNodeCircular last;
    
    ChainNodeCircular(){
        
    }
    ChainNodeCircular(Object Element){
        this.element = element;
    }

    public ChainNodeCircular(Object element, ChainNodeCircular next) {
        this.element = element;
        this.next = next;
    }

    public void setLast(ChainNodeCircular last) {
        this.last = last;
    }
}
