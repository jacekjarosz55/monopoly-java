package pl.edu.zse.monopoly.fields;

public class PropertyField extends Field {

    protected Player owner = null;

    public PropertyField(Family family, String name){
            this.family = family;
            this.name = name;
    }
}
