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

        boolean playing = true;
        while (playing) {


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

            System.out.println("Choose a class:\n1. Warrior\n2. Wizard\n3. Rogue");
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
            Enemy[] enemies = {
                new Enemy("Goblin", 35, 5, 8),
                new Enemy("Orc", 55, 15, 5),
                new Enemy("Skeleton", 30, 4, 4)
            };
            Enemy enemy = enemies[Dice.roll(enemies.length) -1]; //Random enemy each time
            // === Combat Start ===
            Combat.startCombat(player, enemy);

            System.out.println("\nDo you want to play again? (yes/no)");
            String again = input.nextLine().trim().toLowerCase();
            if(!again.equals("yes")){
                playing = false;
                System.out.println("Thanks for playing!");
            }
        }

    }
}
