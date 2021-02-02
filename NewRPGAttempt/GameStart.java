package NewRPGAttempt;


import NewRPGAttempt.Enemy.Enemy;
import NewRPGAttempt.Heros.Heros;
import NewRPGAttempt.Items.Items;
import NewRPGAttempt.Places.Place;
import NewRPGAttempt.Weapon.Weapons;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameStart {
    public static Place Shire = new Place(Place.placeName.SHIRE,"Shire", 5);
    public static Place Moria = new Place(Place.placeName.MORIA, "Moria",10);
    public static Place HelmsDeep = new Place(Place.placeName.HELMSDEEP,"Helms Deep", 13);
    public static Place Isengard = new Place(Place.placeName.ISENGARD, "Isengard",8);
    public static Place Rivendel = new Place(Place.placeName.RIVENDELL, "Rivendel",6);
    public static Place Minastrith = new Place(Place.placeName.MINASTRITH, "Minastrith",15);
//    public static Weapons weaponObject;
    public static Heros currentHero;
    public static Weapons currentWeapon;
    public static Enemy currentEnemy;
    public static Place currentPlace;

    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static boolean isRunning = true;
    public static boolean isFighting = true;

    public static ArrayList<Enemy> enemyList = new ArrayList<>();
    public static ArrayList<Place> placesList = new ArrayList<>();
    public static ArrayList<Weapons> weaponList = new ArrayList<>();
    public static ArrayList<Heros> herosList = new ArrayList<>();
    public static ArrayList<Items> inventory = new ArrayList<>();





    //Creating random weapon
    public static void createWeapon() {
        int input = (random.nextInt(7) + 1);
        switch (input) {
            case 1:
                currentWeapon= new Weapons(Weapons.WeaponName.NARSIL, "Narsil", 20);
                break;
            case 2:
                currentWeapon = new Weapons(Weapons.WeaponName.AXE, "Axe", 11);
                break;
            case 3:
                currentWeapon = new Weapons(Weapons.WeaponName.ELFBOW, "Elfbow", 13);
                break;
            case 4:
                currentWeapon = new Weapons(Weapons.WeaponName.KNIFE, "Knife", 5);
            case 5:
                currentWeapon = new Weapons(Weapons.WeaponName.STING, "Sting", 10);
                break;
            case 6:
                currentWeapon = new Weapons(Weapons.WeaponName.ORCRIST, "Orchrist", 18);
                break;
            case 7:
                currentWeapon = new Weapons(Weapons.WeaponName.GLAMDRING, "Glamdring", 10);
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }

    //Creating an Hero
    public static void createHero(int input) {
        switch (input) {
            case 1:
                currentHero = new Heros(Heros.HerosName.GREYGANDALF, "Gandalf the Gray", 100, 20);
                break;
            case 2:
                currentHero = new Heros(Heros.HerosName.GIMLI, "Gimli", 70, 8);
                break;
            case 3:
                currentHero = new Heros(Heros.HerosName.LEGOLAS, "Legolas", 80, 12);
                break;
            case 4:
                currentHero = new Heros(Heros.HerosName.FRODO, "Frodo", 40, 5);
                break;
            case 5:
                currentHero = new Heros(Heros.HerosName.ARAGORN, "Aragorn", 90, 18);
            case 6:
                currentHero = new Heros(Heros.HerosName.STRIDER, "Strider", 80, 13);
                break;
            case 7:
                currentHero = new Heros(Heros.HerosName.MITHRANDIR, "Mithrandir", 90, 16);
                break;
            case 8:
                currentHero = new Heros(Heros.HerosName.WHITEGANDALF, "Gandalf the White", 110, 22);
                break;
            case 9:
                currentHero = new Heros(Heros.HerosName.GALADRIEL, "Galadriel", 120, 25);
                break;
            case 10:
                currentHero = new Heros(Heros.HerosName.ELROND, "Elrond", 115, 24);
                break;
            default:
                System.out.println("Invalid Entry");

        }

        System.out.println("Your hero's is " + currentHero.getName());
        GameStart.printSeparator(20);

    }

    //    Creating an enemy
    public static void createEnemy() {
        int input = (random.nextInt(10) + 1);
        switch (input) {
            case 1:
                currentEnemy = new Enemy(Enemy.EnemyNames.ORCH, "Orch", 8, 30, 1);
                break;
            case 2:
                currentEnemy = new Enemy(Enemy.EnemyNames.GOLLUM, "Gollum", 10, 40, 2);
                break;
            case 3:
                currentEnemy = new Enemy(Enemy.EnemyNames.TROLL, "Troll", 12, 50, 3);
                break;
            case 4:
                currentEnemy = new Enemy(Enemy.EnemyNames.SARUMAN, "Saruman", 20, 120, 7);
                break;
            case 5:
                currentEnemy = new Enemy(Enemy.EnemyNames.SAURON, "Sauron", 25, 140, 20);
                break;
            case 6:
                currentEnemy = new Enemy(Enemy.EnemyNames.GOBLIN, "Goblin", 11, 45, 2);
                break;
            case 7:
                currentEnemy = new Enemy(Enemy.EnemyNames.BALROG, "Balrog", 16, 80, 5);
                break;
            case 8:
                currentEnemy = new Enemy(Enemy.EnemyNames.ANGMAR, "Angmar", 23, 130, 12);
                break;
            case 9:
                currentEnemy = new Enemy(Enemy.EnemyNames.SHELOB, "Shelop", 13, 90, 7);
                break;
            case 10:
                currentEnemy = new Enemy(Enemy.EnemyNames.URUKHAI, "Uruk-Hai", 15, 85, 6);
                break;
            case 11:
                currentEnemy = new Enemy(Enemy.EnemyNames.NAZGUL, "Nazgul", 19, 100, 8);
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }

    //Creating place list
    public static void createPlace() {
        int input = (random.nextInt(5) + 1);
        switch (input) {
            case 1:
                currentPlace = new Place(Place.placeName.SHIRE, "Shire", 5);
                break;
            case 2:
                currentPlace = new Place(Place.placeName.MORIA, "Moria", 10);
                break;
            case 3:
                currentPlace = new Place(Place.placeName.HELMSDEEP, "Helms Deep", 13);
                break;
            case 4:
                currentPlace = new Place(Place.placeName.ISENGARD, "Isengard", 8);
                break;
            case 5:
                currentPlace = new Place(Place.placeName.RIVENDELL, "Rivendel", 6);
                break;
            case 6:
                currentPlace = new Place(Place.placeName.MINASTRITH, "Minastrith", 15);
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    public static void placeList() {
        placesList.add(new Place(Place.placeName.SHIRE, "Shire", 5));
        placesList.add(new Place(Place.placeName.MORIA, "Moria", 10));
        placesList.add(new Place(Place.placeName.HELMSDEEP, "Helms Deep", 13));
        placesList.add(new Place(Place.placeName.ISENGARD, "Isengard", 8));
        placesList.add(new Place(Place.placeName.RIVENDELL, "Rivendel", 6));
        placesList.add(new Place(Place.placeName.MINASTRITH, "Minastrith", 15));
    }


    //Creating weapon list
    public static void weaponList() {
        weaponList.add(new Weapons(Weapons.WeaponName.ORCRIST, "Orchrist", 18));
        weaponList.add(new Weapons(Weapons.WeaponName.NARSIL, "Narsil", 20));
        weaponList.add(new Weapons(Weapons.WeaponName.AXE, "Axe", 11));
        weaponList.add(new Weapons(Weapons.WeaponName.ELFBOW, "Elfbow", 13));
        weaponList.add(new Weapons(Weapons.WeaponName.KNIFE, "Knife", 5));
        weaponList.add(new Weapons(Weapons.WeaponName.STING, "Sting", 10));
        weaponList.add(new Weapons(Weapons.WeaponName.GLAMDRING, "Glamdring", 10));

    }
    //Creating hero list
    public static void heroList() {
        herosList.add(new Heros(Heros.HerosName.FRODO, "Frodo", 40, 5));
        herosList.add(new Heros(Heros.HerosName.GIMLI, "Gimli", 70, 8));
        herosList.add(new Heros(Heros.HerosName.LEGOLAS, "Legolas", 80, 12));
        herosList.add(new Heros(Heros.HerosName.STRIDER, "Strider", 80, 13));
        herosList.add(new Heros(Heros.HerosName.ARAGORN, "Aragorn", 90, 18));
        herosList.add(new Heros(Heros.HerosName.MITHRANDIR, "Mithrandir", 90, 16));
        herosList.add(new Heros(Heros.HerosName.GREYGANDALF, "Gandalf the Gray", 100, 20));
        herosList.add(new Heros(Heros.HerosName.WHITEGANDALF, "Gandalf the White", 110, 22));
        herosList.add(new Heros(Heros.HerosName.ELROND, "Elrond", 115, 24));
        herosList.add(new Heros(Heros.HerosName.GALADRIEL, "Galadriel", 120, 25));
    }

    //Creating enemy list
    public static void enemyList() {
        enemyList.add(new Enemy(Enemy.EnemyNames.ORCH, "Orch", 8, 30, 1));
        enemyList.add(new Enemy(Enemy.EnemyNames.GOLLUM, "Gollum", 10, 40, 2));
        enemyList.add(new Enemy(Enemy.EnemyNames.TROLL, "Troll", 12, 50, 3));
        enemyList.add(new Enemy(Enemy.EnemyNames.GOBLIN, "Goblin", 11, 45, 2));
        enemyList.add(new Enemy(Enemy.EnemyNames.BALROG, "Balrog", 16, 80, 5));
        enemyList.add(new Enemy(Enemy.EnemyNames.SHELOB, "Shelop", 13, 90, 7));
        enemyList.add(new Enemy(Enemy.EnemyNames.URUKHAI, "Uruk-Hai", 15, 85, 6));
        enemyList.add(new Enemy(Enemy.EnemyNames.NAZGUL, "Nazgul", 19, 100, 8));
        enemyList.add(new Enemy(Enemy.EnemyNames.SARUMAN, "Saruman", 20, 120, 9));
        enemyList.add(new Enemy(Enemy.EnemyNames.ANGMAR, "Angmar", 23, 130, 12));
        enemyList.add(new Enemy(Enemy.EnemyNames.SAURON, "Sauron", 25, 140, 20));

    }


    //Print necessary String
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
//        System.out.println(" ");
    }

    // method to print a separator with length
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //Getting information from the user
    public static int readInt(int userChoice) {
        int input;
        do {
            System.out.print("---> ");
            try {
                input = Integer.parseInt(sc.next());
            } catch (Exception e) {
                input = -1;
                System.out.print("Please enter an integer!");
            }
        } while (input < 1 || input > userChoice);
        return input;
    }

    public static void accessingHeros(){
                printSeparator(30);
        System.out.println("Choice your hero?" +
                "\n(1) Gandalf the Gray" +
                "\n(2) Gimli" +
                "\n(3) Legolas" +
                "\n(4) Frodo" +
                "\n(5) Aragorn" +
                "\n(6) Strider" +
                "\n(7) Mithrandir" +
                "\n(8) Gandalf the White" +
                "\n(9) Galadriel" +
                "\n(10) Elrond");
        int input = readInt(10);
        createHero(input);
    }

    public static void showMenu() {
        printSeparator(30);
        System.out.println("Menu" +
                "\n(0) Show menu" +
                "\n(1) Hero info" +
                "\n(2) Enemy info" +
                "\n(3) Weapon info" +
                "\n(4) Place Info" +
                "\n(5) Move next room" +
                "\n(6) Call another Hero for the help"+
                "\n(8) Exit");

    }

    public static void gameLoop() {
        while (isRunning) {
            showMenu();
            int input = readInt(6);
            switch (input) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    heroInfo();
                    break;
                case 2:
                    enemyInfo();
                    break;
                case 3:
                    weaponInfo();
                    break;
                case 4:
                    placeInfo();
                    break;
                case 5:
                    move();
                    break;
                case 6:
                    callAnotherHero();
                    break;
                case 8:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
            printHeading("Select the one of the option.");
        }
    }

    //Random encounter for the player and player take a decision
    public static void randomEncounter() {
        createEnemy();
        printHeading("What do you want about an enemy? Choice one of the following options.\n(1). Go to battle." +
                "\n(2). Take a rest.\n(3). Make a Shopping.\n(4). Look Hero's weapon inventory.");
//User will select one of the option for the next movement.
        int encounter = readInt(3);
        //calling respective methods
        switch (encounter) {
            case 1 -> battle();
            case 2 -> takeRest();
            case 3 -> shop();
            case 4 -> lookInventory();
        }
    }


    public static void lookInventory() {
        if (currentHero.getHerosInventory()[1]==null) {
            System.out.println("You only weapon is " + Weapons.WeaponName.KNIFE);
        }else{
            for (int i = 0; i < 5; i++) {
                    System.out.println(i + 1 + ". weapon " + currentHero.getHerosInventory()[i]);
            }
        }
    }

    public static void callAnotherHero(){
        System.out.println("Calling another hero for the help");
    }

    public static void shop() {
        printHeading("make a shopping.");
    }

    public static void takeRest() {
        printHeading("take a rest");
    }

    public static void battle() {
        while (isFighting) {
            printHeading("Your enemy is " + currentEnemy.getName() + "\nEnemy's hp: " + currentEnemy.getHp() + "\nEnemy's max damage capacity: " + currentEnemy.getDamage());
            printHeading("Your hero's name: " + currentHero.getName() + "\nYour hero's hp: " + currentHero.getHp() + "\nHero's max damage capacity: " + currentHero.getDamage());
            printHeading("Hero's current weapon is " + currentWeapon.getName() + "\nThe weapon damage capacity : " + currentWeapon.getDamage());
            printHeading("Your fighting location is :" + currentPlace.getName() + "\nThe place difficulty is : " + currentPlace.getDifficulties());
            printSeparator(20);
            System.out.println("What's your decision about this enemy." +
                    "\nWhile you were taking to decision, you must be wise and  careful." +
                    "\n(1) Fight,\n(2) Change weapon\n(3) Use Potion for healing,\n(3) Run away.");
            printSeparator(20);
            int battleDecision = readInt(3);
            switch (battleDecision) {
                case 1 -> fight();
                case 2 -> changeWeapon();
                case 3 -> usePotion();
                case 4 -> runAway();

            }
        }
    }


    // fighting for the current enemy.
    public static void fight() {

        //enemy's is to starting point Hp
        int enemyHP = currentEnemy.getHp();
        System.out.println("Do you want to change your current weapon?\n(1) Yes.\n(2) No.");
        int weaponChange = readInt(2);
        if (weaponChange != 2) {
            //Enemy taken damage by the Hero,and Hero's damage capacity, Hero's weapon and place difficulties this damage.
            int dmgTookEnemy = currentEnemy.getHp() - ((currentEnemy.getHp() + currentPlace.getDifficulties()) - (currentHero.getDamage() + currentWeapon.getDamage() + currentPlace.getDifficulties()));

            //Hero taken damage by the Enemy and, Enemy damage capacity and place difficulties this damage
            int dmgTookHero = currentHero.getHp() - ((currentHero.getHp() + currentPlace.getDifficulties()) - (currentEnemy.getDamage() + currentPlace.getDifficulties()));

            System.out.println("You took " + dmgTookHero + " damage by " + currentEnemy.getName());
            System.out.println("Enemy took " + dmgTookEnemy + " damage by " + currentHero.getName());

            //setting current enemy's Hp's
            currentEnemy.setHp(currentEnemy.getHp() - dmgTookEnemy);

            //Setting current an hero's Hp's
            currentHero.setHp(currentHero.getHp() - dmgTookHero);

            //If hero's Hp less than 0, hero is died.
            if (currentHero.getHp() <= 0) {
                playerDied();
            }//If enemy's HP is less than 0, Enemy was defeated.
            else if (currentEnemy.getHp() <= 0) {
                printHeading("You defeated " + currentEnemy.getName() + "!\nYou earned " + enemyHP / 10 + " XP from your defeated enemy.");
                currentHero.setHp(currentHero.getHp() + enemyHP / 10);
                //setting Hero's current Hp after fighting current enemy.
                if (currentHero.getHp() > currentHero.getMaxHp()) {
                    currentHero.setHp(currentHero.getMaxHp());
                }
                printHeading("Do you want to fight again.\nDon't forget! You need more Hp for a powerful enemy.");
                int isFightingAgain = readInt(2);
                if (isFightingAgain == 1) {
                    battle();
                } else {
                    //finishing battle loop.
                    isFighting = false;
                }
            }
        } else {
            changeWeapon();
        }
    }

    public static void changeWeapon() {
        System.out.println("Your current weapon is " + currentWeapon.getName());


    }

    //Hero choice to suing potion option for the healing himself will be using potion.
    public static void usePotion() {
        printHeading("Use potion for the healing himself!");

    }

    //If hero thinks cannot defeat this enemy, can use run away option, however while hero is trying to run away, might takes damage(s).
    public static void runAway() {
        int runAwayChance = random.nextInt(20) + 1;
        if (runAwayChance <= currentEnemy.getHp() / 10) {
            printHeading("You ran away from the " + currentEnemy.getName());
        } else {
            printHeading("You didn't manage to run away from the " + currentEnemy.getName());
            currentHero.setHp(currentHero.getHp() - runAwayChance);
            printHeading("You took" + runAwayChance + " damage(s) while you were trying to run away");
            if (currentHero.getHp() <= 0) {
                printHeading("After this attempt you took too much damage,\n");
                playerDied();
            }
        }

    }

    // if any condition player's dead, game will be exit.Game exiting point.
    public static void playerDied() {
        printHeading("You died!");
        printHeading("You had " + currentHero.getHp() + " on your journey. Try to earn more next time.");
        System.out.println("Thank you!!!");
        isRunning = false;
    }

    //Player moving on place to another
    public static void move() {
        System.out.println("Your current place is " + currentPlace.getName());
        //Before moving to the another location dealing an enemy.
        randomEncounter();
        //Displaying possible moving location
        for (int i = 0; i < currentPlace.findConnection().length; i++) {
            System.out.println(i + 1 + ". possible location to move " + currentPlace.findConnection()[i]);
        }
        System.out.println("Enter place to move");
        int placeToMove = readInt(6) - 1;
        Place.placeName type = currentPlace.getType();
        switch (type) {
            case SHIRE:
                if (currentPlace.findConnection()[placeToMove].equals(Place.placeName.MORIA)) {
                    Shire = currentPlace;
                    currentPlace = Moria;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case MORIA:
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.SHIRE) {
                    Moria = currentPlace;
                    currentPlace = Shire;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.ISENGARD) {
                    Moria = currentPlace;
                    currentPlace = Isengard;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.RIVENDELL) {
                    Moria = currentPlace;
                    currentPlace = Rivendel;
                }
                break;
            case HELMSDEEP:
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.RIVENDELL) {
                    HelmsDeep = currentPlace;
                    currentPlace = Rivendel;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.ISENGARD) {
                    HelmsDeep = currentPlace;
                    currentPlace = Isengard;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.MINASTRITH) {
                    HelmsDeep = currentPlace;
                    currentPlace = Minastrith;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case ISENGARD:
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.HELMSDEEP) {
                    Isengard = currentPlace;
                    currentPlace = HelmsDeep;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.MORIA) {
                    Isengard = currentPlace;
                    currentPlace = Moria;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case RIVENDELL:
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.HELMSDEEP) {
                    Rivendel = currentPlace;
                    currentPlace = HelmsDeep;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.MORIA) {
                    Rivendel = currentPlace;
                    currentPlace = Moria;
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case MINASTRITH:
                Minastrith = currentPlace;
                currentPlace = HelmsDeep;
                System.out.println("You are moving at " + currentPlace.getName());
                printSeparator(20);
                break;
        }

    }

    //Getting weapon's info
    public static void weaponInfo() {
        printSeparator(20);
        System.out.println("Name of weapon is : " + currentWeapon.getName() + "." +
                "\nWeapon damage is : " + currentWeapon.getDamage());
        System.out.println(currentWeapon.getWeaponDescription(currentWeapon.getName()));
        printSeparator(20);
    }

    //Getting hero's info
    public static void heroInfo() {
        printSeparator(30);
        System.out.println("Name of Hero: " + currentHero.getName() +
                "\nHero's Hp: " + currentHero.getHp() + "." +
                "\nHero's Max-Hp: " + currentHero.getMaxHp() + "." +
                "\nHero's make a damage : " + currentHero.getDamage() + ".");
        System.out.println(currentHero.getHeroDescription(currentHero.getName()));
        printSeparator(30);
    }

    //Getting enemy's info
    public static void enemyInfo() {
        printSeparator(30);
        System.out.println("Name of Enemy: " + currentEnemy.getName() +
                "\nHero's Hp: " + currentEnemy.getHp() + "." +
                "\nHero's make a damage : " + currentEnemy.getDamage() + ".");
        System.out.println(currentEnemy.getEnemyDescription(currentEnemy.getName()));
        printSeparator(30);
    }

    //Getting place info
    public static void placeInfo() {
        printSeparator(20);
        System.out.println("Name of place is : " + currentPlace.getName() + "." +
                "\nDifficulties is : " + currentPlace.getDifficulties());
        System.out.println(currentPlace.getPlaceDescription(currentPlace.getName()));
        printSeparator(20);
    }

    //the gaming starting point
    public static void gameStartingPoint() {
        printHeading("Hello we are starting a new game. This game basic RPG game. Please read info and follow the guidelines...");
        accessingHeros();
//        createEnemy();
       createWeapon();
        createPlace();
        gameLoop();
    }


}
