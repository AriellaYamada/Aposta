package br.usp.icmc.ssc01032015;

import java.util.Locale;

public class Ranking {

    public void swap(CompetitorLegal[] c, int a, int b) {
        CompetitorLegal aux = new CompetitorLegal();
        aux.copyCompetitor(c[a]);
        
        //System.out.println("Aux :" + aux.getTotalCash());
        c[a].copyCompetitor(c[b]);
        c[b].copyCompetitor(aux);
    }

    public int partition(CompetitorLegal[] c, int left, int right) {
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

    void quicksort(CompetitorLegal[] c, int left, int right) {
        int pivo;

        if (left < right) {
            pivo = partition(c, left, right);
            quicksort(c, left, pivo - 1);
            quicksort(c, pivo + 1, right);
        }
    }
    
    List rank (CompetitorLegal[] c, int total) {
        int i;
        List r = new List();
        for (i = 0; i < total; i++) {
            r.addInOrder(c[i], i);
        }
        return r;
    }
    
    void print_results (CompetitorLegal[] c, int total) {
        int i;
  
        for (i = total; i > 0; i--) {
            System.out.println("Type: " + c[i - 1].type + " Total Amount: " + Double.valueOf(String.format(Locale.US, "%.2f", c[i - 1].getTotalCash())) + "\n");
        }
    }

}
