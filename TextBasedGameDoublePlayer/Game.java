package TextBasedGameDoublePlayer;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static Player currentPlayer;
    static Enemy currentEnemy;
    static Player firstPlayer;
    static Player secondPlayer;
    boolean isFighting = true;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public int readInt(int userChoice) {
        int input;
        do {
            System.out.print("---> ");
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.print("Please enter an integer!");
            }
        } while (input < 1 || input > userChoice);
        return input;
    }

    public void createPlayer() {
        int min = 6;
        int max = 20;
        String heroName;
        System.out.println("Create Your Player");
        System.out.println("How many hero do you want to create?");
        int playerNumbers = scanner.nextInt();
        switch (playerNumbers) {
            case 1 -> {
                System.out.println("What is your hero's name");
                heroName = scanner.next();
                firstPlayer = new Player(heroName);
            }
            case 2 -> {
                System.out.println("What is first hero's name");
                heroName = scanner.next();
                firstPlayer = new Player(heroName);
                currentPlayer=firstPlayer;
                System.out.println("What is second hero's name");
                heroName = scanner.next();
                secondPlayer = new Player(heroName);

            }
            case 3, 4 -> {
                System.out.println("Sorry we can not available another hero.");
                createPlayer();
            }
            default -> System.out.println("Invalid Entry!");
        }
        System.out.println("Your hero's name is " + currentPlayer.getName());
    }

    public static void createEnemy() {
        currentEnemy = new Enemy();
        System.out.println("You encountered enemy's name " + currentEnemy.getName());
    }

    public void changePlayer() {
        if (currentPlayer.equals(firstPlayer)) {
            currentPlayer = secondPlayer;
        } else {
            currentPlayer = firstPlayer;
        }
    }

    public void startGame() {
        showMenu();
        System.out.println("Enter Your decision!");
        int userDecision = readInt(6);
        switch (userDecision) {
            case 0:
                showMenu();
                break;
            case 1:
                fighting();
                break;
            case 2:
                move();
                break;
            case 3:
                currentPlayer.herosStatus();
                break;
            case 4:
                currentEnemy.enemyStatus();
                break;
            case 5:
//                drawMap();
                break;
            default:
                System.out.println("Invalid Entry!");
        }

    }

    public void showMenu() {
        System.out.println("===================================" +
                "\n=0. Show menus.                   =" +//+
                "\n=1. Attack to your enemy.         =" +
                "\n=2. Move next location.          =" +
                "\n=3. Hero's status.               =" +//+
                "\n=4. Villain's status.            =" +//+
                "\n=5. Draw a map.                  =" +
                "\n===================================");
    }

    public void fighting() {
        createEnemy();
        System.out.println("Your Enemy is too powerful, and you need another hero helping into your fight.\n" +
                "You will attack your enemy one by one");
        boolean isBattle = true;
        while (isBattle) {
            if (currentEnemy.getHp() <= 0 || currentPlayer.getHp() <= 0) {
                isBattle = false;
            } else {
                currentEnemy.setHp(currentEnemy.getHp() - currentPlayer.getDamage());
                System.out.println(currentEnemy.getName()+" was taken damage is "+currentPlayer.getDamage()+", and his hp is "+currentEnemy.getHp());
                currentPlayer.setHp(currentPlayer.getHp() - currentEnemy.getDamage());
                System.out.println(currentPlayer.getName()+" was taken damage is "+currentEnemy.getDamage()+", and his hp is "+currentPlayer.getHp());
                changePlayer();
                currentEnemy.setHp(currentEnemy.getHp() - currentPlayer.getDamage());
                System.out.println(currentEnemy.getName()+" was taken damage is "+currentPlayer.getDamage()+", and his hp is "+currentEnemy.getHp());
                currentPlayer.setHp(currentPlayer.getHp() - currentEnemy.getDamage());
                System.out.println(currentPlayer.getName()+" was taken damage is "+currentEnemy.getDamage()+", and his hp is "+currentPlayer.getHp());

            }
        }
    }

    public void move() {
        System.out.println("I am moving!");
    }

    public void gameLooping() {
        createPlayer();
        while (isFighting) {
            startGame();
        }
    }
}
