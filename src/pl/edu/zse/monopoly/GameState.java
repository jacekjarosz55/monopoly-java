package pl.edu.zse.monopoly;

import pl.edu.zse.monopoly.fields.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GameState {
    private static final GameState instance = new GameState();
    private GameState() {}
    public static GameState getInstance() { return instance; }


    List<Player> players = generatePlayers();
    List<Field> fields = generateFields();

    public List<Player> generatePlayers() {

        List<Player> players = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int playerNo = 0;
        try {
            System.out.println("Liczba graczy:");
            playerNo = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < playerNo; i++) {
            Player player = new Player();
            switch (i) {
                case 0:
                    player.setColor(Player.Color.BLUE);
                case 1:
                    player.setColor(Player.Color.RED);
                case 2:
                    player.setColor(Player.Color.GREEN);
                case 3:
                    player.setColor(Player.Color.YELLOW);
            }
            players.add(player);
        }
        return players;
    }


    public List<Field> generateFields() {
        List<Field> fields = new ArrayList<>();
        fields.add(new StartField());
        fields.add(new PropertyField(Field.Family.BROWN, "Brown 1"));
        fields.add(new CommunityChestField());
        fields.add(new PropertyField(Field.Family.BROWN, "Brown 2"));
        fields.add(new PaymentField(200,"Tax 1"));
        fields.add(new PropertyField(Field.Family.RAILROAD, "Railroad 1"));
        fields.add(new PropertyField(Field.Family.SKY_BLUE, "Sky 1"));
        fields.add(new ChanceField());
        fields.add(new PropertyField(Field.Family.SKY_BLUE, "Sky 2"));
        fields.add(new PropertyField(Field.Family.SKY_BLUE, "Sky 3"));
        fields.add(new JailVisitField());
        fields.add(new PropertyField(Field.Family.MAGENTA, "Magenta 1"));
        fields.add(new PropertyField(Field.Family.FACILITY, "Electricity"));
        fields.add(new PropertyField(Field.Family.MAGENTA, "Magenta 2"));
        fields.add(new PropertyField(Field.Family.MAGENTA, "Magenta 3"));
        fields.add(new PropertyField(Field.Family.RAILROAD, "Railroad 2"));
        fields.add(new PropertyField(Field.Family.RAILROAD, "Railroad 2"));
        fields.add(new PropertyField(Field.Family.ORANGE, "Orange 1"));
        fields.add(new CommunityChestField());
        fields.add(new PropertyField(Field.Family.ORANGE, "Orange 2"));
        fields.add(new PropertyField(Field.Family.ORANGE, "Orange 3"));
        fields.add(new PropertyField(Field.Family.RED, "Red 1"));
        fields.add(new ChanceField());
        fields.add(new PropertyField(Field.Family.RED, "Red 2"));
        fields.add(new PropertyField(Field.Family.RED, "Red 3"));
        fields.add(new PropertyField(Field.Family.RAILROAD, "Railroad 3"));
        fields.add(new PropertyField(Field.Family.YELLOW, "Yellow 1"));
        fields.add(new PropertyField(Field.Family.FACILITY, "Marvin"));
        fields.add(new PropertyField(Field.Family.YELLOW, "Yellow 2"));
        fields.add(new PropertyField(Field.Family.YELLOW, "Yellow 3"));
        fields.add(new JailField());
        fields.add(new PropertyField(Field.Family.GREEN, "Green 1"));
        fields.add(new PropertyField(Field.Family.GREEN, "Green 2"));
        fields.add(new CommunityChestField());
        fields.add(new PropertyField(Field.Family.GREEN, "Green 3"));
        fields.add(new PropertyField(Field.Family.RAILROAD, "Railroad 4"));
        fields.add(new ChanceField());
        fields.add(new PropertyField(Field.Family.BLUE, "Blue 1"));
        fields.add(new PaymentField(100,"Tax 2"));
        fields.add(new PropertyField(Field.Family.BLUE, "Blue 2"));
        return fields;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Field> getFields() {
        return fields;
    }
}


