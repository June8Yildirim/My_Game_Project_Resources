package LordOfTheRingsGame;

import LordOfTheRingsGame.Heros.Heros;
import LordOfTheRingsGame.Heros.HerosSpecialities;
import LordOfTheRingsGame.Places.Place;
import LordOfTheRingsGame.Villains.Villain;
import LordOfTheRingsGame.Villains.VilliansSpecialities;
import LordOfTheRingsGame.Weapon.Weapon;

import java.util.Scanner;

public class Game {
    HerosSpecialities playerSpec;
    Heros currentPlayer;
    Heros aragorn = new Heros();
    Place Moria = new Place(Place.placeOfMiddleEarthEnums.MORIA_BRIDGE);
    Place Shire = new Place(Place.placeOfMiddleEarthEnums.SHIRE);
    Place HelmsDeep = new Place(Place.placeOfMiddleEarthEnums.HELMS_DEEP);
    Place Isengard = new Place(Place.placeOfMiddleEarthEnums.ISENGARD);
    Place Minastrith = new Place(Place.placeOfMiddleEarthEnums.MINASTRITH);
    Place currentLocation = null;
    Villain gollum = new Villain(Villain.VillainNameEnums.GOLLUM);
    Weapon currentWeapon = null;
    VilliansSpecialities villainSpec = null;
    Scanner scanner = new Scanner(System.in);


    public void startGame() {
        currentLocation = Shire;
        villainSpec =
        int decision;
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
//                    attackEnemy();
                    break;
                case 2:
//                    chageWeapon();
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
                    break;
                default:
                    System.out.println("Invalid Entry!!");
                    break;
            }
        } while (decision != 15);
    }

    public void showMenu() {
        System.out.println("===================================" +
                "\n=0. Show menus.                   =" +
                "\n=1. Attack to your enemy.         =" +
                "\n=2. Change your weapon.           =" +
                "\n=3. Pick up new weapon.           =" +
                "\n=4. Put down your weapon.         =" +
                "\n=5. Describe the Place.           =" +
                "\n=6. Describe the Villain.         =" +
                "\n=7. Describe the Weapon.          =" +
                "\n=8. Describe the Hero.            =" +
                "\n=9. Next place on your location.  =" +
                "\n=10. Move next location.          =" +
                "\n=11. Hero's status.               =" +
                "\n=12. Villain's status.            =" +
                "\n=13. Draw a map.                  =" +
                "\n===================================");

    }

    public void describePlace() {
        System.out.println(currentLocation.getDescription());
    }

    public void describeWeapon() {
        System.out.println(currentWeapon.getDescription());
    } // there is a problem

    public void describeHero() {
        System.out.println(HerosSpecialities.heroDescription(playerSpec.getPlayerName()));
    }

    public void describeVillain() {
        System.out.println(VilliansSpecialities.getVillainDescription(villainSpec.getVillainName()));
    }

    public void getConnection() {

    }

    public void getHeroInfo() {
        playerSpec = new HerosSpecialities();

    }

    public void villainStatus() {
        System.out.println(currentVillain.toString());
    }

    public void moveNextLocation() {
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
                    } else if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.ISENGARD) {
                        HelmsDeep = currentLocation;
                        currentLocation = Isengard;
                        System.out.println("You are moving at " + currentLocation.getName());
                    }
                    break;
                case MINASTRITH:
                    Minastrith = currentLocation;
                    currentLocation = HelmsDeep;
                    System.out.println("You are moving at " + currentLocation.getName());
                    break;
                case ISENGARD:
                    if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.SHIRE) {
                        Isengard = currentLocation;
                        currentLocation = Shire;
                        System.out.println("You are moving at " + currentLocation.getName());
                    } else if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.ISENGARD) {
                        Isengard = currentLocation;
                        currentLocation = Moria;
                        System.out.println("You are moving at " + currentLocation.getName());
                    }
                    break;
                case MORIA_BRIDGE:
                    if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.SHIRE) {
                        Moria = currentLocation;
                        currentLocation = Shire;
                        System.out.println("You are moving at " + currentLocation.getName());
                    } else if (currentLocation.getGetConnected()[placeToMove] == Place.placeOfMiddleEarthEnums.ISENGARD) {
                        Moria = currentLocation;
                        currentLocation = Isengard;
                        System.out.println("You are moving at " + currentLocation.getName());
                    } else {
                        Moria = currentLocation;
                        currentLocation = HelmsDeep;
                        System.out.println("You are moving at " + currentLocation.getName());
                    }
                    break;
                case SHIRE:
                    Shire = currentLocation;
                    currentLocation = Moria;
                    System.out.println("You are moving at " + currentLocation.getName());
                    break;
                default:
                    System.out.println("You are moving at default location.");
            }

        }


    }

    public void putDownWeapon() {
        Weapon placeWeapon = currentLocation.getWeaponList();
        if (placeWeapon.getListlength() > 0) {
            for (int i = 0; i < placeWeapon.getListlength(); i++) {
                System.out.println(i + 1 + ". Weapon is " + placeWeapon.getWeaponAtPosition(i));
            }
            System.out.println("Enter if the listing number want to grab weapon, or enter 0 to exit.");
            int numberOfWeapon = scanner.nextInt() - 1;
            if (numberOfWeapon != -1) {
                currentPlayer.handOverWeapon(placeWeapon.getWeaponAtPosition(numberOfWeapon));
                currentLocation.addWeaponToPlace(placeWeapon.getWeaponAtPosition(numberOfWeapon));
            }
        } else {
            System.out.println("Nore more Items here.");
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
                currentLocation.removeWeaponFromPlace(placeWeapon.getWeaponAtPosition(numberOfWeapon));
            }
        } else {
            System.out.println("Nore more Items here.");
        }
    }
//
//    public void attackEnemy() {
//
//    }

    public void getPlayer() {
        int choice;
        String name = null;
        System.out.println("Choice your Hero's.(##Enter only your hero's number##)" +
                "\n1. Aragorn." +
                "\n2. Legolas." +
                "\n3. Gimli." +
                "\n4. Frodo." +
                "\n5. Gandalf the Gray.");
        choice = scanner.nextInt();
        playerSpec = new HerosSpecialities();
        currentPlayer = new Heros();
        switch (choice) {
            case 1:
                name = "Aragorn";
                break;
            case 2:
                name = "Legolas";
                break;
            case 3:
                name = "Gimli";
                break;
            case 4:
                name = "Frodo";
                break;
            case 5:
                name = "Gandalf the Gray";
                break;
            default:
                name = "invalid entry";
                break;
        }
        currentPlayer = currentPlayer.setUpHeros(name);

    }

    public void showGameStory() {
        System.out.println("Explain the game brief story.");
    }
}
