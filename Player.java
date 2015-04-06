package br.usp.icmc.ssc01032015;

/**
 * Trabalho 1 de POO
 *
 * Ariella Yamada Brambila			|	NUSP: 8937034
 * Carlos Alberto Schneider Junior	|	NUSP: 9167910
 * Márcio de Souza Campos			|	NUSP: 8937462
 */
public class Player implements Competitor, Comparable <Player> {
    // Vetor que vai ser usado para controlar as estrat�gias
    public static int[] weight = {0, 0, 0, 0, 0};
    public static int giver = 0, receptor = 0;

    // Vari�vel que recebe o valor a ser doado
    public double donation;

    // Vari�vel que aramazena a quantidade de dinheiro arrecadada
    public double cash;

    // Armazena o valor padr�o de doa��o
    public double defaultDonation;

    // Armazena o nome do tipo da classe
    public char type;

    public Player() {
        cash = 0.0;
        donation = 0.0;
        defaultDonation = 0.0;
        type = 'F';
    }

    public double declareDonationTo(Competitor c) {
        this.donation =  3;     // salva a valor que deve ser doado � c
        return this.donation;   // Retorna o valor que deve ser doado � c
    }

    public void informDonationFrom(Competitor c, double donation) {
        // Passa o valor doado de c para o objeto
        this.addCash(donation);
    }

    public void addCash(double amount) {
        this.cash += 10 - this.donation + (2 * amount);
    }

    public double getTotalCash() {
        return this.cash;
    }

    public char getType() {
        return type;
    }

    public void updateControl(int i) {
        if (weight[i] > weight[giver])
            Player.giver = i;
        if (weight[i] < weight[receptor])
            receptor = i;
    }

    public int compareTo (Player x){
        if (this.cash < x.cash) return 1;
        else if (this.cash > x.cash) return -1;
        else return 0;
    }
}
