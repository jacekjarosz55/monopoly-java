package pl.edu.zse.monopoly.fields;

import pl.edu.zse.monopoly.Action;

import java.util.ArrayList;
import java.util.List;

public class Field {
    public List<Action> getActions() {
        return actions;
    }

    protected Family family = Family.NONE;

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    protected List<Action> actions = new ArrayList<>();
    protected String name;

   public String getName() {return name;}
    public enum Family {
        RAILROAD,
        FACILITY,
        BROWN,
        SKY_BLUE,
        MAGENTA,
        ORANGE,
        RED,
        YELLOW,
        GREEN,
        BLUE,
        NONE,
    }

}
