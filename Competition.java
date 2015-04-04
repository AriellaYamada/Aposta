package br.usp.icmc.ssc01032015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Competition {

    public static void main(String[] args) {
        int n_rounds, i, j, k = 0, total = 0;
        int[] n_Competitors = new int[5];

        InputStreamReader inputStr = new InputStreamReader(System.in);

        BufferedReader buf = new BufferedReader(inputStr);

        try {
            System.out.println("Nº de jogadas:\n");
            n_rounds = Integer.parseInt(buf.readLine());
            for (i = 0; i < 5; i++) {
                System.out.println("Jogador : " + (i + 1) + "\n");
                n_Competitors[i] = Integer.parseInt(buf.readLine());
                total += n_Competitors[i];
            }
            System.out.println(total + "\n");
            //Cria um vetor de competidores de cada tipo
            //Podemos fazer um pra cada tipo, no caso,
            //CompetitorLegal seria só um teste de um competidor
            CompetitorLegal[] comp = new CompetitorLegal[total];
            System.out.println("teste");
            //Percorre todos os tipos de jogadores
            for (j = 0; j < 5; j++) {
                for (i = 0; i < n_Competitors[j]; i++) {
                    comp[k] = new CompetitorLegal();
                    comp[k].type = j + 1;
                    k++;

                }
            }
            System.out.println("teste2");

            //Percorre todas as rodadas
            for (i = 0; i < n_rounds; i++) {
                //Percorre todos os jogadores
                for (j = 0; j < total; j++) {
                    //Percorre todos os adversários
                    for (k = (j + 1); k < total; k++) {
                        System.out.println("teste round");
                       Bet b = new Bet();
                       b.round(comp[j], comp[k]);
                        
                    }
                }
            }
            System.out.println("teste3");
            Ranking results = new Ranking();
            //results.quicksort(comp, 0, (total - 1));
            results.print_results(comp, total);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
