package br.usp.icmc.ssc01032015;

public class Bet {

    public void round(CompetitorLegal a, CompetitorLegal b) {
        double da, db;
        //Declara a doação de cada competidor
        da = a.declareDonationTo(b);
        db = b.declareDonationTo(a);

        //Informa a doação de cada competidor
        a.informDonationFrom(b, da);
        b.informDonationFrom(a, db);

        //Recebe os valores 
        a.addCash((10 - da) + (2 * db));
        b.addCash((10 - db) + (2 * da));

    }

}
