package pl.edu.zse.monopoly.fields;

public class Player {
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPause() {
        return pause;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }

    private Color color;
    private int money = 1500;
    private boolean active = true;
    private int position = 0;
    private int pause = 0;
    //TODO: owned fields

    public enum Color {
        BLUE,
        GREEN,
        RED,
        YELLOW,
        BLACK,
        ORANGE
    }
}
