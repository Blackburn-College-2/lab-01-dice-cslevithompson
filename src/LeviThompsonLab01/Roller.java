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
public class Roller {

    Scanner scan = new Scanner(System.in);
    
    /* method to keep the die rolling*/
    public int nextRoll() {        
        Die d = new Die();
        int counter = 0;
        int rolls = 0;
        System.out.print("How often should I print? ");
        int howOften = scan.nextInt();

        System.out.print("How many dice am I rolling? ");
        int howMany = scan.nextInt();
        /* loop that would initially make the die continuously roll*/
        while (counter <= howOften) {
            rolls = d.roll();
            counter++;
        }
        return rolls;
    }
}
