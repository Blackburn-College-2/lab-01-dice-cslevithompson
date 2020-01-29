/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab01;

import java.util.Scanner;

/**
 *
 * @author levi.thompson
 */
public class Runner {
    
    /**
     * @param args the command line arguments
     */
    /* this is main, where the rolling would be initialized*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("How many times am I rolling? ");
        int numOfRolls = scan.nextInt();
        Counter count = new Counter();
        count.timesRolled(numOfRolls);
        
    }

}

/* estimated time: 4 hours
   actual time used: around 5-6 hours*/