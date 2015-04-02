
package br.usp.icmc.ssc01032015;

public class List {
    
    public Node begin;
    
    public Node last;
    public int size;
    
    public void add (List l, Node n) {
        Node aux = l.begin, ant = l.begin;
        if (size == 0) {
            l.begin = n;
            l.last = n;
        } else {
            while (aux.donation < n.donation || aux != null) {
                ant = aux;
                aux = aux.next;
            }
            ant.next = n;
            n.next = aux; 
            if (aux == null) {
                l.last = n;
            }
        }
        l.size++;
    }
}
