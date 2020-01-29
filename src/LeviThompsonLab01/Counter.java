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

public class Counter {
    Scanner scan = new Scanner(System.in);
    /* method to keep track of how many times each number is rolled*/
    public void timesRolled(int c) {
        Roller r = new Roller();
        int theRoll = r.nextRoll();
        int[] rollStored = new int[c];
        /* loop that would try to count based on index*/
        for (int i = 0; i < rollStored.length; i++) {
           rollStored[theRoll - 1]++;
           theRoll = r.nextRoll();
            
            
        }
        
        for (int i = 0; i < rollStored.length; i++) {
            System.out.println(rollStored[i]);
        }
        
    }
}
