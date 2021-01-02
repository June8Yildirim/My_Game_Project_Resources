package TextBasedGame;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    Places lounge = new Places(Places.roomType.LOUNGE);
    Places kitchen = new Places(Places.roomType.KITCHEN);
    Places bedroom = new Places(Places.roomType.BEDROOM);

    Places currentRoom;

    Player player;

    public void startGame() {
        char choice = ' ';
        playerSetUp();
        showStory();
        currentRoom = bedroom;
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
                case 'q':
                    break;
            }

        } while (choice != 'q');


    }

    public void look(){
        Items roomItems = currentRoom.getItemList();

        if (roomItems.getListLength() > 0) {
            for (int i = 0; i < roomItems.getListLength(); i++) {
                System.out.println(i + 1 + ". " + roomItems.getItemAtPosition(i));
            }
            System.out.print("Enter Position to describe, or enter 0 to exit");
            int posToDesc = sc.nextInt() - 1;
            if (posToDesc != -1) {
                System.out.println(roomItems.getItemDescription(roomItems.getItemAtPosition(posToDesc)));
            }
        } else {
            System.out.println("No more items in this room.");
        }
    }

    public void move() {
        for (int i = 0; i < currentRoom.getRoomConnections().length; i++) {
            System.out.println(i + 1 + ". " + currentRoom.getRoomConnections()[i]);
        }
        System.out.println("Enter room number to move to, or enter 0 to exit");
        int roomToMoveTo = sc.nextInt()-1;
        if (roomToMoveTo != -1) {
            Places.roomType type = currentRoom.getRoomType();
            switch (type) {
                case BEDROOM:
                    bedroom = currentRoom;
                    currentRoom = lounge;
                    System.out.println(currentRoom.getRoomDescription());
                    break;
                case KITCHEN:
                    kitchen = currentRoom;
                    currentRoom = lounge;
                    System.out.println(currentRoom.getRoomDescription());
                    break;
                case LOUNGE:
                    if (currentRoom.getRoomConnections()[roomToMoveTo] == Places.roomType.KITCHEN) {
                        lounge = currentRoom;
                        currentRoom = kitchen;
                        System.out.println(currentRoom.getRoomDescription());
                    } else {
                        lounge = currentRoom;
                        currentRoom = bedroom;
                        System.out.println(currentRoom.getRoomDescription());
                    }
                    break;
            }
        } else {
            System.out.println("there no room");
        }

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
                currentRoom.addItemToRoom(inventoryItems.getItemAtPosition(posToDrop));
                player.putItemDown(inventoryItems.getItemAtPosition(posToDrop));
            }
        } else {
            System.out.println("No more items in inventory");
        }
    }


    public void pickUp() {
        Items roomItems = currentRoom.getItemList();
        if (roomItems.getListLength() > 0) {
            for (int i = 0; i < roomItems.getListLength(); i++) {
                System.out.println(i + 1 + ". " + roomItems.getItemAtPosition(i));
            }
            System.out.print("Enter Position to add, or enter 0 to exit");
            int posToAdd = sc.nextInt() - 1;
            if (posToAdd != -1) {
                player.pickItemUp(roomItems.getItemAtPosition(posToAdd));
                currentRoom.removeItemFromRoom(roomItems.getItemAtPosition(posToAdd));
            }
        } else {
            System.out.println("No more items in this room.");
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
