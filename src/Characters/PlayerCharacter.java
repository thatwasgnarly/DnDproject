package Characters;

import Inventory.Bag;

public class PlayerCharacter {
    private String name;
    private Trait trait;
    private Stats stats;
    private Bag bag;

    public PlayerCharacter(String name, Stats stats, Trait trait) {
        this.name = name;
        this.trait = trait;
        this.stats = stats;
        applyTraitBonus();
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    private void applyTraitBonus() {
        switch (trait.getBonusType()) {
            case "hp": stats.setHp(stats.getHp() + 5); break;
            case "intelligence": stats.setIntelligence(stats.getIntelligence() + 1); break;
            case "dexterity": stats.setDexterity(stats.getDexterity() + 1); break;
        }
    }

    public Trait getTrait() {
        return trait;
    }

    public String getName() {
        return name;
    }

    public int getAttackModifier() {
        return stats.getStrength() / 2;
    }

    public boolean isAlive() {
        return stats.getHp() > 0;
    }

    public void takeDamage(int damage) {
        stats.setHp(stats.getHp() - damage);
        System.out.println(name + " takes " + damage + " damage! Current HP: " + stats.getHp());
    }

    public void printCharacterInfo() {
        System.out.println("Character created!");
        System.out.println("Name: " + name);
        System.out.println("Trait: " + trait.getName() + " - " + trait.getDescription());
        stats.printStats();
    }
}
