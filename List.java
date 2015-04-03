
package br.usp.icmc.ssc01032015;

public class List {
    
    public Node begin;
    public Node last;
    public int size;
    
    public boolean empty() {
        if (begin == null) return true;
        return false;
    }
    
    public void push (Competitor c, double donation) {
        Node n = new Node();
        n.competitor = c;
        n.donation = donation;
        
        if(size == 0) {
            begin = n;
        } else {
            last.next = n;
        }
        
        last = n;
        size++;
    }
    
    public Node pop () {
        
        Node aux = begin;
        begin = aux.next;
        
        size--;
        
        return aux;
        
    }
}
