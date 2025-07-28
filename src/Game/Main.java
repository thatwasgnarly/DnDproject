package Game;

import Characters.PlayerCharacter;
import Characters.Stats;
import Characters.Trait;
import Characters.Enemy;
import Combat.Combat;
import Utils.Dice;
import Inventory.Bag;
import Inventory.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // === Character Creation ===
        System.out.print("Enter your character's name: ");
        String name = input.nextLine();

        System.out.println("Rolling your stats...");
        int hp = 40 + Dice.roll(10);
        int str = Dice.rollStat();
        int dex = Dice.rollStat();
        int intel = Dice.rollStat();

        Stats rolledStats = new Stats(hp, str, dex, intel);
        rolledStats.printStats();

        System.out.println("Choose a trait:\n1. Tough\n2. Clever\n3. Fast");
        int traitChoice = input.nextInt();
        input.nextLine(); // flush newline

        Trait trait = Trait.getTraitByChoice(traitChoice);
        PlayerCharacter player = new PlayerCharacter(name, rolledStats, trait);

        System.out.println("Character created!");
        player.printCharacterInfo();

        // === Inventory Setup ===
        Bag bag = new Bag();
        Item potion = new Item("Healing Potion", "Restores 10 HP", "potion", 10);
        bag.addItem(potion);
        player.setBag(bag);

        // === Enemy ===
        Enemy goblin = new Enemy("Goblin", 35, 4, 2);

        // === Combat Start ===
        Combat.startCombat(player, goblin);
    }
}
