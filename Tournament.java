package br.usp.icmc.ssc01032015;

import java.util.Arrays;

/**
 * Created by M�rcio on 01/04/2015.
 */
public class Tournament{
    public void playTournament(Player competitor[], int rounds) {
        for (int i = 0; i < rounds; i++) {
            playRound(competitor);
        }
    }

    private static void playRound (Player competitor[]) {
        double donationA, donationB;
        for (int i = 0; i < competitor.length; i++ ) {
            for (int j = i + 1; j < competitor.length; j++) {
                donationA = competitor[i].declareDonationTo(competitor[j]);
                donationB = competitor[j].declareDonationTo(competitor[i]);
                competitor[i].informDonationFrom(competitor[j], donationB);
                competitor[j].informDonationFrom(competitor[i], donationA);
            }
        }
    }

    public void showWinner (Player[] player) {
        Arrays.sort(player);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %f\n", player[i].getClass().getName(), player[i].getTotalCash());
        }
    }
}
