package pl.edu.zse.monopoly;


import java.util.Random;

public class Dice {

    private final static Dice instance = new Dice();
    private Dice() {}

    private final Random random = new Random();

     DiceResult roll(){
        return new DiceResult(this.random.nextInt(6)+1, this.random.nextInt(6)+1);
    }

    public static Dice getInstance(){
        return instance;
    }
}
