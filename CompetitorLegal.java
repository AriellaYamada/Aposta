/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.icmc.ssc01032015;

public class CompetitorLegal implements Competitor {

   private double total_amount;
   private double donation;
   
   public CompetitorLegal ()
   {
       total_amount = 10;
       donation = 5;
   }
   
   public double declareDonationTo(Competitor c) {
       total_amount-=5;
       return 5;
       
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
