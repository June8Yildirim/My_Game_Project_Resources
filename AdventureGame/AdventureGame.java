package AdventureGame;

import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionsHealAmount = 30;
        int healthPotionsDropChance = 50;
        boolean running = true;
        System.out.println("Welcome to Dungeon");
        Game:
        while (running) {
            System.out.println("-----------------------");
            int enemyHealth = rd.nextInt(maxEnemyHealth);
            String enemy = enemies[rd.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");
            while (enemyHealth > 0) {
                System.out.println("\tYour HP " + health);
                System.out.println("\t" + enemy + "s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = sc.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rd.nextInt(attackDamage);
                    int damageTaken = rd.nextInt(enemyAttackDamage);
                    enemyHealth -= damageDealt;
                    health -= damageTaken;
                    System.out.println("\t> Your strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation");
                    if (health < 1) {
                        System.out.println("\t> You have to taken to much damage, you are too weak to go on");
                        break;
                    }
                } else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotionsHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionsHealAmount + "." +
                                "\n\t> You noew have " + health + " HP."
                                + "\n\t You have " + numHealthPotions + " healt potions left.\n");
                    } else {
                        System.out.println("\t> You have no health potions left! Defeat enemies for a chance.");
                    }
                } else if (input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue Game;
                } else {
                    System.out.println("Invalid Command");
                }

            }
            if (health < 1) {
                System.out.println("You limp out of the dungeon, weak from battle");
                break;
            }
            System.out.println("=======================================");
            System.out.println("#" + enemy + " was defeated!  #");
            System.out.println("#  You have "+ health+ " HP left. #");
            if (rd.nextInt(100)>healthPotionsDropChance){
                numHealthPotions++;
                System.out.println("# The "+enemy+ " dropped a health potion!  #");
                System.out.println("# You now have "+ numHealthPotions+" health potion(s). #");
            }
            System.out.println("=======================================");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon.");
            String input = sc.nextLine();
            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Invallid command");
                input = sc.nextLine();
            }
            if (input.equals("1")){
                System.out.println("You continue on your adventure!");
            }else if (input.equals("2")){
                System.out.println("You exit dungeons, succesesful from your adventures.");
                break;
            }
        }
        System.out.println("######################");
        System.out.println("# THANKS YOU PLAYING #");
        System.out.println("######################");
    }
}
