package TextBasedGameAttempt1;

import java.util.ArrayList;

public class Items {
    enum Item {
        HAMMER, GLAMDRING, ANDURIL, ORCRIST, AXE, NARSIL,STING, WHITEGANDALFSTAF, STAFF
    }

    private ArrayList<Items.Item> Holds = new ArrayList<Items.Item>();

    public void addItem(Items.Item item) {
        Holds.add(item);
    }

    public void removeItem(Items.Item item) {
        Holds.remove(item);
    }

    public void clear() {
        Holds.clear();
    }

    public String getItemDescription(Items.Item item) {
        String description="";
        switch (item) {
            case STAFF:
                description="This is a basic stuff,\nand you must find a weapon if you want to fight";
                break;
            case HAMMER:
                description="You are using drawf's hammer\nBe careful! It can be too heavy for you."; break;
            case GLAMDRING:
                description="This is Gandalf Sword's and more powerful than other swords.\nBut you can take only when you are enough power or HP"; break;
            case ANDURIL:
                description ="This is the King's Sword,\nand most powerfull sword in the middle earth"; break;
            case ORCRIST:
                description ="This is Turin's Sword,\n and made by ancient elves"; break;
            case AXE:
                description="This is Gimli's Axe"; break;
            case NARSIL:
                description="This is Elendil's Sword,\nand Sauron was damaged by this sword";
                break;
            case STING:
                description= "This is Sting\n and turns to blue if you surrendered by Orches or Goblins";
                break;
            case WHITEGANDALFSTAF:
                description="This is White Gandalf magical stuff, only chosen one can carry this stuff.";
                break;
        }
        return description;
    }

    public int getListLength(){
        return Holds.size();
    }

    public Items.Item getItemAtPosition(int pos){
        return Holds.get(pos);
    }

}
