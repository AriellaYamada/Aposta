package br.usp.icmc.ssc01032015;

public class List {

    public Node begin;
    public Node last;
    public int size;

    public boolean empty() {
        if (begin == null) {
            return true;
        }
        return false;
    }

    public void push(Competitor c, double donation) {
        Node n = new Node();
        n.competitor = c;
        n.donation = donation;

        if (size == 0) {
            begin = n;
        } else {
            last.next = n;
        }

        last = n;
        size++;
    }

    public Node popBegin() {

        Node aux = begin;
        begin = aux.next;

        size--;

        return aux;

    }
    
    public Node popEnd () {
        Node aux = last;
        last = aux.prev;
        
        size--;
        
        return aux;
    }

    public void addInOrder(Competitor c, int p) {
        Node aux, ant;
        aux = begin;
        ant = begin;
        Node n = new Node();
        n.competitor = c;
        n.num = p + 1;

        if (size == 0) {
            begin = n;
            last = n;
        } else {
            while (aux != last || aux.competitor.getTotalCash() < c.getTotalCash()) {
                ant = aux;
                aux = aux.next;
            }
            if (aux == begin) {
                n.next = begin;
                begin.prev = n;
                begin = n;
            } else if (aux == last) {
                if (last.competitor.getTotalCash() > c.getTotalCash()) {
                    n.next = aux;
                    ant.next = n;
                    n.prev = ant;
                    last.prev = n;
                } else {
                    last.next = n;
                    n.prev = last;
                    last = n;
                }
            } else {
                n.prev = ant;
                n.next = aux;
                ant.next = n;
            }
        }
        size++;
    }
}
