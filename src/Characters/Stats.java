package Characters;

public class Stats {
    private int hp, strength, dexterity, intelligence;

    public Stats(int hp, int strength, int dexterity, int intelligence) {
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void printStats() {
        System.out.println("=== Character Stats ===");
        System.out.println("HP: " + hp);
        System.out.println("STR: " + strength);
        System.out.println("DEX: " + dexterity);
        System.out.println("INT: " + intelligence);
    }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getStrength() { return strength; }
    public int getDexterity() { return dexterity; }
    public int getIntelligence() { return intelligence; }

    public void setStrength(int strength) { this.strength = strength; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
}
