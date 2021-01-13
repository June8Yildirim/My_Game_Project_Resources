package TextBasedGameAttempt1;


import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    Places Moria_Bridge = new Places(Places.placeOfMiddleEarth.MORIA_BRIDGE);
    Places Helms_Deep = new Places(Places.placeOfMiddleEarth.HELMS_DEEP);
    Places Caradras_Passageway = new Places(Places.placeOfMiddleEarth.CARADRAS_PASSAGEWAY);
    Places Isengard = new Places(Places.placeOfMiddleEarth.ISENGARD);
    Places Rohan = new Places(Places.placeOfMiddleEarth.ROHAN);
    Places Minas_Trith = new Places(Places.placeOfMiddleEarth.MINASTRITH);
    Places Shire = new Places(Places.placeOfMiddleEarth.SHIRE);
    public static Places currentPlace;

    Player player;

    public void startGame() {
        char choice = ' ';
        playerSetUp();
        showStory();
        currentPlace = Shire;
        do {
            System.out.print("Enter command(h for help)");
            choice = sc.next().toLowerCase().charAt(0);
            System.out.println();
            switch (choice) {
                case 'h':
                    showHelpMenu();
                    System.out.println();
                    break;
                case 'p':
                    pickUp();
                    System.out.println();
                    break;
                case 'd':
                    putDown();
                    System.out.println();
                    break;
                case 'w':
                    move();
                    System.out.println();
                    break;
                case 'i':
                    showInventory();
                    System.out.println();
                    break;
                case 'l':
                    look();
                    System.out.println();
                    break;
                case 's':
                    System.out.println("You are currently at " + currentPlace.getPlaceName());
                case 'q':
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }

        } while (choice != 'q');


    }

    public void look() {
        Items PlaceItems = currentPlace.getItemList();

        if (PlaceItems.getListLength() > 0) {
            for (int i = 0; i < PlaceItems.getListLength(); i++) {
                System.out.println(i + 1 + ". " + PlaceItems.getItemAtPosition(i));
            }
            System.out.print("Enter Position to describe, or enter 0 to exit");
            int posToDesc = sc.nextInt() - 1;
            if (posToDesc != -1) {
                System.out.println(PlaceItems.getItemDescription(PlaceItems.getItemAtPosition(posToDesc)));
            }
        } else {
            System.out.println("No more items in this place.");
        }
    }

    public Places move() {
        for (int i = 0; i < currentPlace.getPlaceConnections().length; i++) {
            System.out.println(i + 1 + ". " + currentPlace.getPlaceConnections()[i]);
            System.out.println(currentPlace.getPlaceConnections()[i]);
        }
        System.out.println("Enter place number to move to, or enter 0 to exit");
        int PlaceToMoveTo = sc.nextInt() - 1;
        if (PlaceToMoveTo != -1) {
            Places.placeOfMiddleEarth type = currentPlace.getPlaceType();
            System.out.println(type);
            switch (type) {
                case SHIRE:
                    Shire = currentPlace;
                    currentPlace = Moria_Bridge;
                    System.out.println(currentPlace.getPlaceDescription());
                    break;
                case CARADRAS_PASSAGEWAY:
                    if (currentPlace.getPlaceConnections()[PlaceToMoveTo] == Places.placeOfMiddleEarth.SHIRE) {
                        Caradras_Passageway = currentPlace;
                        currentPlace = Shire;
                        System.out.println(currentPlace.getPlaceDescription());
                    } else {
                        if (currentPlace.getPlaceConnections()[PlaceToMoveTo] == Places.placeOfMiddleEarth.MORIA_BRIDGE) {
                            Caradras_Passageway = currentPlace;
                            currentPlace = Shire;
                            System.out.println(currentPlace.getPlaceDescription());
                        }
                    }
                    break;
                case MORIA_BRIDGE:
                    Moria_Bridge = currentPlace;
                    currentPlace = Caradras_Passageway;
                    System.out.println(currentPlace.getPlaceDescription());
                    break;
                case HELMS_DEEP:
                    if (currentPlace.getPlaceConnections()[PlaceToMoveTo] == Places.placeOfMiddleEarth.ISENGARD) {
                        Helms_Deep = currentPlace;
                        currentPlace = Isengard;
                        System.out.println(currentPlace.getPlaceDescription());
                    } else {
                        Helms_Deep = currentPlace;
                        currentPlace = Rohan;
                        System.out.println(currentPlace.getPlaceDescription());
                    }
                    break;
                case ROHAN:
                    if (currentPlace.getPlaceConnections()[PlaceToMoveTo] == Places.placeOfMiddleEarth.ISENGARD) {
                        Rohan = currentPlace;
                        currentPlace = Isengard;
                        System.out.println(currentPlace.getPlaceDescription());
                    } else if (currentPlace.getPlaceConnections()[PlaceToMoveTo] == Places.placeOfMiddleEarth.HELMS_DEEP) {
                        Rohan = currentPlace;
                        currentPlace = Helms_Deep;
                        System.out.println(currentPlace.getPlaceDescription());
                    } else {
                        Rohan = currentPlace;
                        currentPlace = Rohan;
                        System.out.println(currentPlace.getPlaceDescription());
                    }
                    break;
                case ISENGARD:
                    if (currentPlace.getPlaceConnections()[PlaceToMoveTo] == Places.placeOfMiddleEarth.ROHAN) {
                        Isengard = currentPlace;
                        currentPlace = Rohan;
                        System.out.println(currentPlace.getPlaceDescription());
                    } else {
                        Isengard = currentPlace;
                        currentPlace = Helms_Deep;
                        System.out.println(currentPlace.getPlaceDescription());
                    }
                    break;
                case MINASTRITH:
                    Minas_Trith = currentPlace;
                    currentPlace = Rohan;
                    System.out.println(currentPlace.getPlaceDescription());
                    break;
                default:
                    System.out.println("There is no place ");
            }
        } else {
            System.out.println("there no place");
        }
        return currentPlace;
    }

    public void showInventory() {
        Items inventoryItems = player.getInventory();
        if (inventoryItems.getListLength() > 0) {

            for (int i = 0; i < inventoryItems.getListLength(); i++) {
                System.out.println(i + 1 + ". " + inventoryItems.getItemAtPosition(i));
            }
            System.out.println("Enter number to describe, or enter 0 to exit");
            int posToDesc = sc.nextInt() - 1;
            if (posToDesc != -1) {
                System.out.println(inventoryItems.getItemDescription(inventoryItems.getItemAtPosition(posToDesc)));
            }
        } else {
            System.out.println("No items in inventory.");
        }
    }

    public void putDown() {
        Items inventoryItems = player.getInventory();
        if (inventoryItems.getListLength() > 0) {
            for (int i = 0; i < inventoryItems.getListLength(); i++) {
                System.out.println(i + 1 + ". " + inventoryItems.getItemAtPosition(i));
            }
            System.out.print("Enter Position to add");
            int posToDrop = sc.nextInt() - 1;
            if (posToDrop != -1) {
                currentPlace.addItemToPlace(inventoryItems.getItemAtPosition(posToDrop));
                player.putItemDown(inventoryItems.getItemAtPosition(posToDrop));
            }
        } else {
            System.out.println("No more items in inventory");
        }
    }


    public void pickUp() {
        Items PlaceItems = currentPlace.getItemList();
        if (PlaceItems.getListLength() > 0) {
            for (int i = 0; i < PlaceItems.getListLength(); i++) {
                System.out.println(i + 1 + ". " + PlaceItems.getItemAtPosition(i));
            }
            System.out.print("Enter Position to add, or enter 0 to exit");
            int posToAdd = sc.nextInt() - 1;
            if (posToAdd != -1) {
                player.pickItemUp(PlaceItems.getItemAtPosition(posToAdd));
                currentPlace.removeItemFromPlace(PlaceItems.getItemAtPosition(posToAdd));
            }
        } else {
            System.out.println("No more items in this place.");
        }
    }


    public void showHelpMenu() {
        System.out.println("");
        System.out.println("(h)elp");
        System.out.println("(p)ick up");
        System.out.println("put (d)own");
        System.out.println("(w)alk To");
        System.out.println("(i)nventory");
        System.out.println("(l)ook");
        System.out.println("(s)how current place");
        System.out.println("(q)uit");
        System.out.println("");
    }

    public void playerSetUp() {
        String name;
        int age;
        System.out.println("Enter player name.");
        name = sc.nextLine();
        System.out.println("Enter player age.");
        age = sc.nextInt();

        player = new Player(name, age);
    }

    public void showStory() {
        System.out.println("Description of game");
    }

}
