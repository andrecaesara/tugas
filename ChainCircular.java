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
import javafx.scene.Node;

public class ChainCircular implements LinearList{
    
    protected ChainNodeCircular firstNode;
    protected Node last;
    protected int size;
    
    public ChainCircular(int initialcapacity){
        
    }
    public ChainCircular(){
        this(0);
    }
     
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
 
    @Override
    public int size() {
        return size;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(
            "index = "+ index + " size = "+size);
        }
    }
    
    @Override
    public Object get(int index) {
        checkIndex(index);
        
        ChainNodeCircular currentNode = firstNode;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    
    @Override
    public int indexOf(Object theElement) {
        ChainNodeCircular currentNode = firstNode;
        int index = 0;
        while(currentNode != null && !currentNode.element.equals(theElement)){
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode == null){
            return -1;
        }
        else{
            return index;
        }
    }

    
    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement;
        if(index == 0){
            removedElement = firstNode.element;
            firstNode = firstNode.next;
        }
        else{
            ChainNodeCircular q = firstNode;
            for(int i = 0; i<index-1; i++){
                q = q.next;
            }
            removedElement = q.next.element;
            q.next = q.next.next;
        }
        size--;
        return removedElement;
    }
    
    @Override
    public void add(int index, Object theElement) {
        if (index < 0 ||index > size){
            throw new IndexOutOfBoundsException("index = "+ index+" size = "+size);
        }
        if(index == 0){
            ChainNodeCircular p = firstNode;
            firstNode = new ChainNodeCircular(theElement, firstNode);
            //p.last = p.next;
        }
        else{
            ChainNodeCircular p = firstNode;
            for(int i = 0; i < index - 1; i++){
                p = p.next;
            }
            p.next = new ChainNodeCircular(theElement, p.next);
            p.last = p.next;
        }
        size++;
    }
    
    
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        
        ChainNodeCircular currentNode = firstNode;
        while(currentNode != null){
            if(currentNode.element == null){
                s.append("null, ");
            }
            else{
                s.append(currentNode.element.toString()+", ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        
        return new String(s);
    }

}
