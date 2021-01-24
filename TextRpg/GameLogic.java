package TextRpg;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;
    // Story elements
    public static int place = 0, act = 1;

    // random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Battle", "Rest", "Rest"};

    public static String[] enemies = {"Ogre", "Ogre", "Goblin", "Goblin", "Stone Elemental"};

    public static String[] places = {"Everlasting Mountain", "Haunted Landlines", "Castle of the Evil Emperor", "Thorne Room"};

    //method to get user input from console
    public static int readInt(String prompt, int userChoice) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(sc.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoice);
        return input;
    }

    public static void clearConsole() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    // method to print a separator with length
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // method to print a heading
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //method to stop the game until user enters anything
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue");
    }

    //method to the start the game
    public static void startGame() {
        boolean nameSet = false;
        String name;
        //print title screen
        clearConsole();
        printSeparator(30);
        System.out.println("AGE OF THE EVIL EMPEROR");
        printSeparator(30);
        anythingToContinue();

//        getting the player name
        do {
            clearConsole();
            printHeading("What is your name");
            name = sc.next();
            clearConsole();
            printHeading("Your name is " + name + ".\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name");
            int input = readInt("-> ", 2);
            if (input == 1) {
                nameSet = true;
            }
        } while (!nameSet);

        //print story intro
        Story.printIntro();

        // Create an new player object with the name
        player = new Player(name);

        //setting isRunning to true, so the game loop can continue
        isRunning = true;

        // start main game loop
        gameLoop();
    }

    public static void checkAct() {
// change acts based on xp
        if (player.xp >= 10 && act == 1) {
            //increment act and place
            act = 2;
            place = 1;
            //story
            Story.printFirstActOutro();
            // let the player "level up"
            player.choiceTrait();
            //story
            Story.printFirstActIntro();
            //assing new values enemies
            enemies[0] = "Evil Mercenary";
            enemies[1] = "Evil Mercenary";
            enemies[2] = "Henchman of the Evil Emperor";
            enemies[3] = "Henchman of the Evil Emperor";
            enemies[4] = "Scary Stranger";
            // assign new values to encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Shop";

        } else if (player.xp >= 50 && act == 2) {
            //increment act and place
            act = 3;
            place = 2;
            //story
            Story.printFirstActOutro();
            // let the player "level up"
            player.choiceTrait();
            //story
            //assing new values enemies
            enemies[0] = "Evil Mercenary";
            enemies[1] = "Evil Mercenary";
            enemies[2] = "Henchman of the Evil Emperor";
            enemies[3] = "Henchman of the Evil Emperor";
            enemies[4] = "Scary Stranger";
            // assign new values to encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Shop";
            //fully heal player
            player.hp = player.maxHp;
        } else if (player.xp >= 100 && act == 3) {
            //increment act and place
            act = 4;
            place = 3;
            //story
            Story.printFirstActOutro();
            // let the player "level up"
            player.choiceTrait();
            //story
            //fully heal player
            player.hp = player.maxHp;
            //calling final battle
            finalBattle();
        }
    }

    public static void randomEncounter() {
        Random random = new Random();
        //random number between 0 and the length of encounter array
        int encounter = random.nextInt(encounters.length);
        //calling respective methods
        if (encounters[encounter].equals("Battle")) {
            randomBattle();
        } else if (encounters[encounter].equals("Rest")) {
            takeRest();
        } else {
            shop();
        }
    }


    public static void randomBattle() {
        clearConsole();
        printHeading("You encountered an evil minded creature. You'll have to fight it");
        anythingToContinue();
        //creating new enemy with random name
        battle(new Enemy(enemies[(int) (Math.random() * enemies.length)], player.xp));

    }

    //shopping / encountering a travelling trader
    public static void shop() {
        clearConsole();
        printHeading("You meet a mysterious stranger.\nHe offers you something.");
        int price = (int) (Math.random() * (10 + player.pots * 3) + 10 + player.pots);
        printSeparator(20);
        System.out.println("Do you want to buy one?\n(1) Yes!\n(2) No!");
        int input = readInt("->", 2);
        // check users decision
        if (input == 1) {
            printHeading("You bought a magical potion for " + price + " gold");
            player.pots++;
            player.gold -= price;
        } else {
            printHeading("You don't have enough gold to buy this ...");
            anythingToContinue();
        }
    }

    //taking rest
    public static void takeRest() {
        clearConsole();
        printHeading("Do you want to take a rest? (" + player.restLeft + " rest(s) left)");
        System.out.println("(1) Yes!\n(2) No not now!");
        int input = readInt("->", 2);
        if (input == 1) {
            //player actually takes rest
            clearConsole();
            if (player.hp < player.maxHp) {
                int hpRestored = (int) (Math.random() * (player.xp / 4 + 1) + 10);
                player.hp += hpRestored;
                if (player.hp >= player.maxHp) {
                    player.hp = player.maxHp;
                    System.out.println("You took a rest and restored up to " + hpRestored + " health.");
                    System.out.println("You're now at " + player.hp + "/" + player.maxHp + " health.");
                    player.restLeft--;
                }
            } else {
                System.out.println("You're at full health. You don't need to rest now.");
                anythingToContinue();
            }
        }


    }

    public static void battle(Enemy enemy) {
        //main battle loop
        while (true) {
            clearConsole();
            printHeading(enemy.name + "\nEnemy's Hp: " +enemy.hp + "\nEnemy's Max Hp: " + enemy.maxHp);
            printHeading(player.name + "\nPlayer's Hp: " +player.hp + "\nPlayer's Max Hp: " + player.maxHp);
            printSeparator(20);
            System.out.println("(1) Fight\n(2) Use Potion\n(3) Run Away");
            int input = readInt("-> ", 3);
            // react accordingly to player input
            if (input == 1) {
                //FIGHT
                //calculate dmg and dmgTook (dmg enemy deals to player
                int dmg = player.attack() - enemy.defend();
                int dmgTook = enemy.attack() - player.defend();
                //check dmgTook isn't negative
                if (dmgTook < 0) {
                    //add some dmg if player defends very well
                    dmg -= dmgTook / 2;
                    dmgTook = 0;
                }
                if (dmg < 0) {
                    dmg = 0;}
                //deals dmg to both parties
                player.hp -= dmgTook;
                enemy.hp -= dmg;
                //print tje info this battle round
                printHeading("BATTLE");
                System.out.println("You dealt " + dmg + " damage to the " + enemy.name);
                System.out.println("The " + enemy.name + " dealt " + dmgTook + " damage to you.");
                anythingToContinue();
                if (player.hp <= 0) {
                    playerDied();
                    break;
                } else if (enemy.hp <= 0) {
                    // tell the player won
                    clearConsole();
                    printHeading("You defeated the " + enemy.name + "!");
                    //increase player xp
                    player.xp += enemy.xp;
                    System.out.println("You earned " + enemy.xp + " XP!");
                    anythingToContinue();
                    break;
                }
            } else if (input == 2) {
                //use potions
                clearConsole();
                if (player.pots > 0 && player.hp < player.maxHp) {
                    //player can take a potions
                    // make sure player wants to drink the potion
                    printHeading("Do you want to drink a potion? (" + player.pots + " left)");
                    System.out.println("(1) Yes\n(2) No, maybe later.");
                    input = readInt("-->", 2);
                    if (enemy.hp <= 0) {
                        //tell the player he won
                        clearConsole();
                        printHeading("You're defeated the " + enemy.name + "!");
                        //increase player xp;
                        player.xp += enemy.xp;
                        System.out.println("You earned " + enemy.xp + " XP!");
                        // random drops
                        boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                        int goldEarned = (int) (Math.random() * enemy.xp);
                        if (addRest) {
                            player.restLeft++;
                            System.out.println("You earned the chance to get an additional rest!");
                        }
                        if (goldEarned > 0) {
                            player.gold++;
                            System.out.println("You collect " + goldEarned + " gold from the " + enemy.name + "'s corpse!");
                        }


                        anythingToContinue();
                        break;
                    }
                } else {
                    //player cannot take a potion
                    printHeading("You don't have any potions or you're at full health");

                }
            } else {
                // RUN AWAY
                clearConsole();
                if (act != 4) {
                    // chance of escape 35%
                    if (Math.random() * 10 + 1 <= 3.5) {
                        printHeading("You ran away from the " + enemy.name + "!");
                        anythingToContinue();
                        break;
                    } else {
                        printHeading("You didn't manage to run away");
                        //calculate damage the player takes
                        int dmgTook = enemy.attack();
                        System.out.println("In your hurry you took a " + dmgTook + " damage!");
                        anythingToContinue();
                        //check if player still alive
                        if (player.hp <= 0) {
                            playerDied();
                        }
                    }
                } else {
                    System.out.println("You cannot escape from the Evil Emperor.");
                    anythingToContinue();
                }
            }
        }
    }

    //method that gets called the when player is dead
    public static void playerDied() {
        clearConsole();
        printHeading("You Died....");
        printHeading("You earned " + player.xp + " XP on your journey. Try to earn more next time");
        System.out.println("Thank you");
        isRunning = false;
    }

    //printing out if the most important information about the player character.
    public static void characterInfo() {
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        //player xp and gold
        System.out.println("XP: " + player.xp + "\tGold : " + player.gold);
        printSeparator(20);
        //# of pots
        System.out.println("# of Potions: " + player.pots);
        printSeparator(20);
//        player.toString();


        // printing the chose traits
        if (player.numAtkUpgrades > 0) {
            System.out.println("Offensive trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Offensive trait: " + player.atkUpgrades[player.numDefUpgrades - 1]);
        }
    }

    //the final (last) battle of the entire game
    public static void finalBattle() {
        // creating the evil emperor and letting the player fight against him
        battle(new Enemy("The Evil Emperor", 300));
        //printing the proper ending
        Story.printEnd(player);
        isRunning = false;

    }

    //method to continue the journey
    public static void continueJourney() {
        //check if act must be increased
        checkAct();
        //check if game isn't in last act
        if (act != 4) {
            randomEncounter();
        }
    }

    //printing the Main menus
    public static void printMenu() {
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choice an action");
        printSeparator(20);
        System.out.println("(1) Continue on your journey.");
        System.out.println("(2) Character info");
        System.out.println("(3) Exit game");

    }

    public static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = readInt("-> ", 3);
            if (input == 1) {
                continueJourney();
            } else if (input == 2) {
                characterInfo();
            } else {
                isRunning = false;
            }
        }
    }
}
