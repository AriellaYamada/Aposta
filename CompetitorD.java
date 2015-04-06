package br.usp.icmc.ssc01032015;

/**
 * Trabalho 1 de POO
 *
 * Ariella Yamada Brambila			|	NUSP: 8937034
 * Carlos Alberto Schneider Junior	|	NUSP: 9167910
 * Márcio de Souza Campos			|	NUSP: 8937462
 */
public class CompetitorD extends Player{
    public CompetitorD() {
        this.cash = 0.0;
        this.donation = 0.0;
        this.defaultDonation = 7.8888;
        this.type = 'D';
    }

    public double declareDonationTo(Competitor c) {
        if (receptor == 3)
            this.donation = 0.0;
        else if (giver == 3)
            this.donation = 10.0;
        else this.donation = this.defaultDonation;

        weight[3]++;
        updateControl(3);

        return this.donation;   // Retorna o valor que deve ser doado � c
    }
}
