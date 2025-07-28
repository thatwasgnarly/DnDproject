package Inventory;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> items;

    public Bag() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " was added to your bag.");
    }

    public void useItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getName().equalsIgnoreCase(itemName)) {
                // Placeholder: You'd call player.heal or apply effect here
                System.out.println("You used " + item.getName() + " (" + item.getType() + ")");
                items.remove(i);
                return;
            }
        }
        System.out.println("You don't have that item.");
    }

    public void printInventory() {
        if (items.isEmpty()) {
            System.out.println("Your bag is empty.");
        } else {
            System.out.println("=== Inventory ===");
            for (Item item : items) {
                System.out.println("- " + item);
            }
        }
    }

    public boolean hasItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
}
