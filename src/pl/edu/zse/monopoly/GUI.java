package pl.edu.zse.monopoly;

import pl.edu.zse.monopoly.fields.Field;
import pl.edu.zse.monopoly.fields.Player;

public class GUI {
    private final static GUI instance = new GUI();
    private GUI() {}


   public void printRoll(DiceResult diceResult) {
       System.out.println("Rzut:" + diceResult.getValue1() + ", " + diceResult.getValue2());
       if (diceResult.isDouble()) System.out.println("Dubel!");
   }

    public void printField(Field field) {
        System.out.println(field.getName());
    }
    public static GUI getInstance() {
        return instance;
    }

    public void printPlayer(int player_idx, Player player){
        System.out.println("Gracz " + player_idx);
        System.out.println("Kasa:" + player.getMoney());
    }




}
