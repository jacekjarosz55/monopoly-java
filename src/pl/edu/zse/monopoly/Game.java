package pl.edu.zse.monopoly;

import pl.edu.zse.monopoly.fields.Player;

public class Game {

    private static final int JAIL_FIELD_INDEX = 10;

    private static int nextPlayer(int currentPlayer){
       return ( currentPlayer + 1 ) % GameState.getInstance().getPlayers().size();
    }
    public static void start()
    {
        int playerTurn = 0;
        int doubleCounter = 0;
        while(true) {
            Player player = GameState.getInstance().getPlayers().get(playerTurn);

            if(player.getPause() > 0) {
                player.setPause(player.getPause() - 1);
                playerTurn = nextPlayer(playerTurn);
                continue;
            }



            DiceResult diceResult = Dice.getInstance().roll();
            player.setPosition(
                    player.getPosition()
                            + diceResult.getValue1()
                            + diceResult.getValue2());
            if(player.getPosition() > GameState.getInstance().getFields().size() - 1) {
                player.setPosition(player.getPosition() % GameState.getInstance().getFields().size());
                player.setMoney(player.getMoney() + 200);
            }

            if(!diceResult.isDouble()) {
                playerTurn = nextPlayer(playerTurn);
                doubleCounter = 0;
            }
            else
            {
                doubleCounter++;
                if(doubleCounter == 3) {
                    player.setPosition(JAIL_FIELD_INDEX);
                    player.setPause(2);
                    playerTurn = nextPlayer(playerTurn);
                    doubleCounter = 0;
                }

            }

            GUI.getInstance().printPlayer(playerTurn,player);
            GUI.getInstance().printRoll(diceResult);
            GUI.getInstance().printField(GameState.getInstance().getFields().get(player.getPosition()));



        }
    }
}
