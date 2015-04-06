package br.usp.icmc.ssc01032015;

/**
 * Trabalho 1 de POO
 *
 * Ariella Yamada Brambila			|	NUSP: 8937034
 * Carlos Alberto Schneider Junior	|	NUSP: 9167910
 * Márcio de Souza Campos			|	NUSP: 8937462
 */
public class CompetitorC extends Player {
    public CompetitorC() {
        this.cash = 0.0;
        this.donation = 0.0;
        this.defaultDonation = 5.6666;
        this.type = 'C';
    }

    public double declareDonationTo(Competitor c) {
        if (receptor == 2)
            this.donation = 0.0;
        else if (giver == 2)
            this.donation = 10.0;
        else this.donation = this.defaultDonation;

        weight[2]++;
        updateControl(2);

        return this.donation;   // Retorna o valor que deve ser doado � c
    }
}
