package br.usp.icmc.ssc01032015;

public class Ranking {

    public void swap(Competitor[] c, int a, int b) {
        Competitor aux = c[a];
        System.out.println("Aux :" + aux.getTotalCash());
        c[a] = c[b];
        c[b] = c[a];
    }

    public int partition(Competitor[] c, int left, int right) {
        int j, i = left;

        for (j = i + 1; j <= right; j++) {	// n-1
            if (c[j].getTotalCash() < c[left].getTotalCash()) {  // c
                i++;
                swap(c, i, j);
            }
        }
        swap(c, left, i);

        return i;
    }

    void quicksort(Competitor[] c, int left, int right) {
        int pivo;

        if (left < right) {
            pivo = partition(c, left, right);
            quicksort(c, left, pivo - 1);
            quicksort(c, pivo + 1, right);
        }
    }
    
    List rank (Competitor[] c, int total) {
        int i;
        List r = new List();
        for (i = 0; i < total; i++) {
            r.addInOrder(c[i], i);
        }
        return r;
    }
    
    void print_results (Competitor[] c, int total) {
        int i;
        List rank = rank(c, total);
        Node n;
        for (i = 0; i < total; i++) {
            n = rank.popEnd();
            System.out.println("Competitor: " + n.num + " Total Amount: " + n.competitor.getTotalCash() + "\n");
        }
    }

}
