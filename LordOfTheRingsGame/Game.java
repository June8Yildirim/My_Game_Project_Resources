package LordOfTheRingsGame;

import LordOfTheRingsGame.Heros.Heros;
import LordOfTheRingsGame.Heros.HerosSpecialities;
import LordOfTheRingsGame.Places.Place;
import LordOfTheRingsGame.Villains.Villain;
import LordOfTheRingsGame.Villains.VilliansSpecialities;
import LordOfTheRingsGame.Weapon.Weapon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    HerosSpecialities playerSpec;
    Heros currentPlayer;

    Weapon.WEAPONS Knife = Weapon.WEAPONS.KNIFE;
    Place Moria = new Place(Place.placeOfMiddleEarthEnums.MORIA_BRIDGE);
    Place Shire = new Place(Place.placeOfMiddleEarthEnums.SHIRE);
    Place HelmsDeep = new Place(Place.placeOfMiddleEarthEnums.HELMS_DEEP);
    Place Isengard = new Place(Place.placeOfMiddleEarthEnums.ISENGARD);
    Place Minastrith = new Place(Place.placeOfMiddleEarthEnums.MINASTRITH);
    Place currentLocation = null;
    public static ArrayList<Weapon.WEAPONS> weaponInventory = new ArrayList<>();
    public Weapon currentWeapon=new Weapon();
    public static Villain currentVillain;
    VilliansSpecialities villainSpec = null;
    Scanner scanner = new Scanner(System.in);
    public static int decision;


    public void startGame() {
        currentLocation = Shire;
//        int decision;
        showGameStory();
        getPlayer();


        do {
            showMenu();
            System.out.println("Enter your decision!");
            decision = scanner.nextInt();
            System.out.println();
            switch (decision) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    attackEnemy();
                    break;
                case 2:
                    changeWeapon();
                    break;
                case 3:
                    pickUpWeapon();
                    break;
                case 4:
                    putDownWeapon();
                    break;
                case 5:
                    describePlace();
                    break;
                case 6:
                    describeVillain();
                    break;
                case 7:
                    describeWeapon();
                    break;
                case 8:
                    describeHero();
                    break;
                case 9:
                    getConnection();
                    break;
                case 10:
                    moveNextLocation();
                    break;
                case 11:
                    getHeroInfo();
                    break;
                case 12:
                    villainStatus();
                    break;
                case 15:
                    quitting(15);
                    break;
                default:
                    System.out.println("Invalid Entry!!");
                    break;
            }
        } while (decision != 15);
    }

    public int quitting(int quitNumber) {
        return 15;
    }

    public void showMenu() {
        System.out.println("===================================" +
                "\n=0. Show menus.                   =" +//+
                "\n=1. Attack to your enemy.         =" +
                "\n=2. Change your weapon.           =" +
                "\n=3. Pick up new weapon.           =" +//+
                "\n=4. Put down your weapon.         =" +//+
                "\n=5. Describe the Place.           =" +//+
                "\n=6. Describe the Villain.         =" +//+
                "\n=7. Describe the Weapon.          =" +//+
                "\n=8. Describe the Hero.            =" +//+
                "\n=9. Next place on your location.  =" +
                "\n=10. Move next location.          =" +
                "\n=11. Hero's status.               =" +//+
                "\n=12. Villain's status.            =" +//+
                "\n=13. Draw a map.                  =" +
                "\n===================================");

    }

    public void describePlace() {
        System.out.println(currentLocation.getDescription());
    }

    public void describeWeapon() {// I must add if the hero doesn't select weapon yet.
        currentWeapon.setWeapon("Narsil");
        currentWeapon.getWeaponName();
        System.out.println(currentWeapon.getWeaponDescription(currentWeapon.getWeaponNameString()));
        System.out.println();
    }

    public void describeHero() {
        System.out.println(currentPlayer.heroDescription(currentPlayer.getPlayerNameString()));
        System.out.println();
    }

    public void describeVillain() { // I must add if there is no enemy appeared
//        if (currentVillain == null) {
//            System.out.println("There is  no Enemy appear yet. You are safe!");
//        } else {
        System.out.println(villainSpec.getVillainDescription(currentVillain.getVillainNameString()));
//        }
        System.out.println();
    }

    public void getConnection() {
        for (int i = 0; i < currentLocation.getGetConnected().length; i++) {
            System.out.println(i + 1 + ". possible location around of your location  " + currentLocation.getGetConnected()[i]);
            System.out.println();
        }
    }

    public void getHeroInfo() {
        System.out.println(currentPlayer.heroInfo());
        System.out.println();
    }

    public void villainStatus() {
        System.out.println(currentVillain.villainInfo());
        System.out.println();
    }

    public Place moveNextLocation() {
        for (int i = 0; i < currentLocation.getGetConnected().length; i++) {
            System.out.println(i + 1 + ". possible location to move " + currentLocation.getGetConnected()[i]);
        }
        System.out.println("Enter place number to move");
        int placeToMove = scanner.nextInt() - 1;
        if (placeToMove != -1) {
            Place.placeOfMiddleEarthEnums type = currentLocation.getPlaceType();
            switch (type) {
                case HELMS_DEEP:
                    if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.MORIA_BRIDGE) {
                        HelmsDeep = currentLocation;
                        currentLocation = Moria;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();

                    } else if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.ISENGARD) {
                        HelmsDeep = currentLocation;
                        currentLocation = Isengard;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();
                    }
                    break;
                case MINASTRITH:
                    Minastrith = currentLocation;
                    currentLocation = HelmsDeep;
                    System.out.println("You are moving at " + currentLocation.getName());
                    System.out.println();
                    break;
                case ISENGARD:
                    if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.SHIRE) {
                        Isengard = currentLocation;
                        currentLocation = Shire;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();
                    } else if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.ISENGARD) {
                        Isengard = currentLocation;
                        currentLocation = Moria;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();
                    }
                    break;
                case MORIA_BRIDGE:
                    if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.SHIRE) {
                        Moria = currentLocation;
                        currentLocation = Shire;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();
                    } else if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.ISENGARD) {
                        Moria = currentLocation;
                        currentLocation = Isengard;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();
                    } else {
                        Moria = currentLocation;
                        currentLocation = HelmsDeep;
                        System.out.println("You are moving at " + currentLocation.getName());
                        System.out.println();
                    }
                    break;
                case SHIRE:
                    Shire = currentLocation;
                    currentLocation = Moria;
                    System.out.println("You are moving at " + currentLocation.getName());
                    System.out.println();
                    break;
                default:
                    System.out.println("You are moving at default location.");
            }

        }
        return currentLocation;
    }

    public void putDownWeapon() {
        //I have a problem also here can not put down any weapon to current place.
        Weapon placeWeapon = currentLocation.getWeaponList();
        if (placeWeapon.getListlength() > 0) {
            for (int i = 0; i < placeWeapon.getListlength(); i++) {
                System.out.println(i + 1 + ". Weapon is " + placeWeapon.getWeaponAtPosition(i));
            }
            System.out.println("Enter if the listing number want to put down weapon, or enter 0 to exit.");
            int numberOfWeapon = scanner.nextInt() - 1;
            if (numberOfWeapon != -1) {
                currentPlayer.handOverWeapon(placeWeapon.getWeaponAtPosition(numberOfWeapon));
                currentLocation.addWeaponToPlace(placeWeapon.getWeaponAtPosition(numberOfWeapon));
                System.out.println();
            }
        } else {
            System.out.println("Nore more Items here.");
            System.out.println();
        }
    }

    public void pickUpWeapon() {
        Weapon placeWeapon = currentLocation.getWeaponList();
        if (placeWeapon.getListlength() > 0) {
            for (int i = 0; i < placeWeapon.getListlength(); i++) {
                System.out.println(i + 1 + ". Weapon is " + placeWeapon.getWeaponAtPosition(i));
            }
            System.out.println("Enter if the listing number want to grab weapon, or enter 0 to exit.");
            int numberOfWeapon = scanner.nextInt() - 1;
            if (numberOfWeapon != -1) {
                currentPlayer.grabWeapon(placeWeapon.getWeaponAtPosition(numberOfWeapon));
                 // there is a problem also I must add a statement if grabbed first item when it put down double 2nd weapon
                currentLocation.removeWeaponFromPlace(placeWeapon.getWeaponAtPosition(numberOfWeapon));
                System.out.println();
            }
        } else {
            System.out.println("Nore more Items here.");
            System.out.println();
        }
    }

    public void changeWeapon() {
        Weapon playerWeapon = currentPlayer.getGrabbedWeapon();
        if (playerWeapon.getListlength() > 0) {
            for (int i = 0; i < playerWeapon.getListlength(); i++) {
                System.out.println(i + 1 + ". Weapon is " + playerWeapon.getWeaponAtPosition(i));
                Weapon.WEAPONS weaponName = playerWeapon.getWeaponAtPosition(i);
            }
        }

    }

    public void createVillain() {
        currentVillain = new Villain();
        System.out.println("An enemy is appear in front of you. You must be wise for next decision.");
        Random random = new Random();
        int randNumber = random.nextInt(7) + 1;
        System.out.println(randNumber);
        switch (randNumber) {
            case 1:
                currentVillain.setVillains("angmar");
                break;
            case 2:
                currentVillain.setVillains("goblin");
                break;
            case 3:
                currentVillain.setVillains("gollum");
                break;
            case 4:
                currentVillain.setVillains("nazgul");
                break;
            case 5:
                currentVillain.setVillains("orch");
                break;
            case 6:
                currentVillain.setVillains("sauron");
                break;
            case 7:
                currentVillain.setVillains("saruman");
                break;
        }
    }


    public void heroFightingEnemy() {

        System.out.println("You are attacking an enemy");
        currentPlayer.setPlayerPower(currentPlayer.getPlayerPowerInt() + - currentVillain.getVillainDamageInt());
        System.out.println("after your attack to your enemy, your power is " + currentPlayer.getPlayerPowerInt());
        if (currentPlayer.getPlayerPowerInt() <= 0) {
            System.out.println("Your hero is dead");
            quitting(15);
        }
    }

    public void enemyFightingHero() {
        System.out.println("An enemy attacking to you.");
        currentVillain.setVillainPower(currentVillain.getVillainPower() - currentPlayer.getPlayerDamageInt());
        System.out.println("after enemy attack to your, enemy's power is " + currentVillain.getVillainPower());

    }

    public void attackEnemy() {
        createVillain();
        System.out.println(currentVillain.getVillainNameString());
        int villainSelection = 0;
        while (villainSelection != 6) {
            System.out.println("What do you want.\n" +
                    "1. Look the enemy status\n" +
                    "2. Look your status.\n" +
                    "3. Attack the enemy\n" +
                    "4. Change your weapon.\n" +
                    "5. Not heroic but you must consider to run away");
            villainSelection = scanner.nextInt();
            switch (villainSelection) {
                case 1:
                    villainStatus();
                    break;
                case 2:
                    getHeroInfo();
                    break;
                case 3:
                    heroFightingEnemy();
                    enemyFightingHero();
                    break;
                case 4:
                    changeWeapon();
                    break;
                case 5:
                    moveNextLocation();
                    break;
                default:
            }
        }

    }

    public void getPlayer() {
        int choice;
        String name = null;
        System.out.println("Choice your Hero's.(##Enter only your hero's number##)" +
                "\n1. Aragorn." +
                "\n2. Legolas." +
                "\n3. Gimli." +
                "\n4. Frodo." +
                "\n5. Elrond.");
        choice = scanner.nextInt();
        playerSpec = new HerosSpecialities();
        currentPlayer = new Heros();
        switch (choice) {
            case 1:
                name = "aragorn";
                break;
            case 2:
                name = "legolas";
                break;
            case 3:
                name = "gimli";
                break;
            case 4:
                name = "frodo";
                break;
            case 5:
                name = "elrond";
                break;
            default:
                name = "invalid entry";
                break;
        }
        currentPlayer.setUpHeros(name);

    }

    public void showGameStory() {
        System.out.println("Explain the game brief story.");
    }
}
