package br.usp.icmc.ssc01032015;

/**
 * Trabalho 1 de POO
 *
 * Ariella Yamada Brambila			|	NUSP: 8937034
 * Carlos Alberto Schneider Junior	|	NUSP: 9167910
 * Márcio de Souza Campos			|	NUSP: 8937462
 */
public class CompetitorB extends Player {
    public CompetitorB() {
        this.cash = 0.0;
        this.donation = 0.0;
        this.defaultDonation = 3.4444;
        this.type = 'B';
    }

    public double declareDonationTo(Competitor c) {
        if (receptor == 1)
            this.donation = 0.0;
        else if (giver == 1)
            this.donation = 10.0;
        else this.donation = this.defaultDonation;

        weight[1]++;
        updateControl(1);

        return this.donation;   // Retorna o valor que deve ser doado � c
    }
}
