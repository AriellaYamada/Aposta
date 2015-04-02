
package br.usp.icmc.ssc01032015;

public class CompetitorLegal implements Competitor {
    
   public int type;
   private double total_amount;
   private List competitors;
   //private double donation;
   
   public double declareDonationTo(Competitor c) {
       double donation = 0;
       
       switch (type) {
           case 1:
               Type1 b = new Type1();
               donation = b.donation(c);
               break;
           case 2:
               donation = Type2;
               break;
           case 3:
               donation = Type2;
               break;
           case 4:
               donation = Type2;
               break;
           case 5:
               donation = Type2;
               break;
               
       }
       
       return donation;
       
       
   }
   
   public void informDonationFrom(Competitor c, double donation) {
       
       Node n = new Node();
       n.c = c;
       n.donation = donation;
       
       competitors.add(competitors, n);
       
       
       
   }
   
   public void addCash (double amount) {
       total_amount += amount;
   }
   
   public double getTotalCash() {
       return total_amount;
       
   }   
}
