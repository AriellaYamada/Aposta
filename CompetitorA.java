package br.usp.icmc.ssc01032015;

/**
 * Trabalho 1 de POO
 *
 * Ariella Yamada Brambila			|	NUSP: 8937034
 * Carlos Alberto Schneider Junior	|	NUSP: 9167910
 * Márcio de Souza Campos			|	NUSP: 8937462
 */
public class CompetitorA extends Player {
    public CompetitorA() {
        this.cash = 0.0;
        this.donation = 0.0;
        this.defaultDonation = 1.2222;
        this.type = 'A';
    }

    public double declareDonationTo(Competitor c) {
        if (receptor == 0)
            this.donation = 0.0;
        else if (giver == 0)
            this.donation = 10.0;
        else this.donation = this.defaultDonation;

        weight[0]++;
        updateControl(0);

        return this.donation;   // Retorna o valor que deve ser doado � c
    }
}
