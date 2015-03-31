package br.usp.icmc.ssc01032015;

public class Bet1 extends CompetitorLegal implements Competitor {
    
    public double declareDonationTo(Competitor c) {
     
       
   }
   
   public void informDonationFrom(Competitor c, double donation) {
       
       
   }
   
   public void addCash (double amount) {
       total_amount += (2 * amount);
   }
   
   public double getTotalCash() {
       return total_amount;
   }
    
    
    
}
