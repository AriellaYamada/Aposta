package br.usp.icmc.ssc01032015;

public class Ranking {

    public void swap(Competitor[] c, int a, int b) {
        Competitor aux = c[a];
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
    
    void print_results (Competitor[] c, int total) {
        int i;
        for (i = 0; i < total; i++) {
            System.out.println("Competitor: " + i + "Total Amount: " + c[i].getTotalCash() + "\n");
        }
    }

}
