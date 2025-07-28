package Combat;

import Characters.PlayerCharacter;
import Characters.Enemy;
import Utils.Dice;
import java.util.Scanner;

public class Combat {
    public static void startCombat(PlayerCharacter player, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A wild " + enemy.getName() + " appears!");
        System.out.println(enemy);

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("Choose an action:\n1. Attack \n2. Use an item (TBD)");
            int choice = scanner.nextInt();

            if (choice == 1) {
                int damage = Dice.roll(1, 8) + player.getAttackModifier();
                enemy.takeDamage(damage);
                System.out.println("You hit the " + enemy.getName() + " for " + damage + " damage!");
                System.out.println(enemy); // Shows updated HP
            }

            if (enemy.isAlive()) {
                int damage = Dice.roll(1, 6) + enemy.getAttackModifier();
                player.takeDamage(damage);
                System.out.println("The " + enemy.getName() + " hits you for " + damage + " damage!");
            }
        }

        if (!player.isAlive()) {
            System.out.println("You were defeated...");
        } else {
            System.out.println("You defeated the " + enemy.getName() + "!");
        }
    }
}
