package Characters;

public class Enemy {
    private String name;
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;

    public Enemy(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getAttackModifier() { return attack / 2; }
    public boolean isAlive() { return health > 0; }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + "/" + maxHealth + ")";
    }
}
