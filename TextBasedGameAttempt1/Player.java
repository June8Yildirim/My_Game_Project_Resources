package TextBasedGameAttempt1;

import TextBasedGameAttempt1.Items;

public class Player {

    private String name;
    private int age;
    private Items inventory = new Items();

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Items getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void pickItemUp(Items.Item itemToPickUp) {
        inventory.addItem(itemToPickUp);
    }

    public void putItemDown(Items.Item itemToDown) {
        inventory.removeItem(itemToDown);
    }


}