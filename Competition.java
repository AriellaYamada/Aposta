/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.icmc.ssc01032015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ariellayamada
 */
public class Competition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n_rounds, i, total = 0;
        int[] n_Competitors = new int[5];
        
        
        InputStreamReader inputStr = new InputStreamReader(System.in);  
          
        BufferedReader buf = new BufferedReader(inputStr); 

        try {  
            System.out.println("Nº de jogadas:\n");  
            n_rounds = Integer.parseInt(buf.readLine()); 
            for (i = 0; i < 5; i++)
            {
                System.out.println("Jogador : " + (i + 1) + "\n");  
                n_Competitors[i] = Integer.parseInt(buf.readLine());
                total += n_Competitors[i];
            }
        } catch (IOException e) {             
            System.out.println(e.getMessage());  
        } 
        
    }
    
}
