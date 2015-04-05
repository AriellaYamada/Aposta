package br.usp.icmc.ssc01032015;

/**
 * Created by Márcio on 01/04/2015.
 */
public class CompetitorE extends Player {
    public CompetitorE() {
        this.cash = 0.0;
        this.donation = 0.0;
        this.defaultDonation = 9.1111;
        this.type = 'E';
    }

    public double declareDonationTo(Competitor c) {
        if (receptor == 4)
            this.donation = 0.0;
        else if (giver == 4)
            this.donation = 10.0;
        else this.donation = this.defaultDonation;

        weight[4]++;
        updateControl(4);

        return this.donation;   // Retorna o valor que deve ser doado à c
    }
}
