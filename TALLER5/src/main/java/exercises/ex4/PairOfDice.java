/*
    PairOfDice, JavaSE-11, 09/03/2021 
*/
package exercises.ex4;

import java.util.Random;

public class PairOfDice implements Dice{
    private Integer dice1;
    private Integer dice2;

    public PairOfDice(){
    }
        
    public Integer getDice1() {
        return dice1;
    }
        
    public Integer getDice2() {
        return dice2;
    }

    @Override
    public void roll(){
        Random azar = new Random();
        this.dice1 = azar.nextInt(6)+1; // Estos valores constantes se refieren a un intervalo [0,6]
        this.dice2 = azar.nextInt(6)+1; // Estos valores constantes se refieren a un intervalo [0,6]
    }
}
