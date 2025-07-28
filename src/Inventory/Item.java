package Inventory;

public class Item {
    private String name;
    private String description;
    private String type; // e.g., "potion", "key", etc.
    private int effectValue; // healing amount or other effect

    public Item(String name, String description, String type, int effectValue) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.effectValue = effectValue;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getEffectValue() {
        return effectValue;
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }
}
