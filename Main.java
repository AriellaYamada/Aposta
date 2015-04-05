package br.usp.icmc.ssc01032015;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o numero de rodadas
        int rounds = scanner.nextInt();

        // Lê o número de jogadores de cada tipo
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int size = A + B + C + D + E;

        // Cria um vetor com todos os jogadores, respeitando o tipo de cada um
        Player player[] = new Player[size];
        for (int i = 0; i < player.length; i++) {
            if (i < A)
                player[i] = new CompetitorA();
            else if (i < A+B)
                player[i] = new CompetitorB();
            else if (i < A+B+C)
                player[i] = new CompetitorC();
            else if (i < A+B+C+D)
                player[i] = new CompetitorD();
            else player[i] = new CompetitorE();
        }

        Tournament tournament = new Tournament();
        tournament.playTournament(player, rounds);
        tournament.showWinner(player);
    }
}
