/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab01;

import java.util.Random;

/**
 *
 * @author levi.thompson
 */
public class Die {
    /* attribute for die*/
    int side;
    /* constructor to give die a default number of sides*/
    public Die() {
        this.side = 6;
    }
    /* constructor to allow an assignable number of sides*/
    public Die(int s) {
        this.side = s;
    }
    /* method that allow the dice to be rolled*/
    public int roll() {
        //creates the random
        Random rand = new Random();
        //actually uses the random
        int randomSide = rand.nextInt(side) + 1;
        
        return randomSide;
    }
}
