
package br.usp.icmc.ssc01032015;

public class CompetitorLegal implements Competitor {
    
   public int type;
   private double total_amount;
   private List competitors = new List();
   //private double donation;
   
   public double declareDonationTo(Competitor c) {
       double donation = 0;
       
       switch (type) {
           case 1:
               Type1 a = new Type1();
               donation = a.donation(c);
               break;
           case 2:
               Type2 b = new Type2();
               donation = b.donation(c);
               break;
           case 3:
               Type3 cc = new Type3();
               donation = cc.donation(c);
               break;
           case 4:
               Type4 d = new Type4();
               donation = d.donation(c);
               break;
           case 5:
               Type5 e = new Type5();
               donation = e.donation(c);
               break;
               
       }
       
       return donation;
 
   }
   
   public void informDonationFrom(Competitor c, double donation) {
       
       
       competitors.push(c, donation);
       
   }
   
   public void addCash (double amount) {
       total_amount += amount;
   }
   
   public double getTotalCash() {
       return total_amount;
       
   }   
   
   public void copyCompetitor(CompetitorLegal c) {
       type = c.type;
       total_amount = c.getTotalCash();
   }
}
