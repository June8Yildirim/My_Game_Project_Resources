package TextBasedGame;

import java.util.ArrayList;

public class Items {
    enum Item {
        BOOK, KNIFE, CUP, PHONE, TV
    }

    private ArrayList<Item> Holds = new ArrayList<Item>();

    public void addItem(Item item) {
        Holds.add(item);
    }

    public void removeItem(Item item) {
        Holds.remove(item);
    }

    public void clear() {
        Holds.clear();
    }

    public String getItemDescription(Item item) {
        String description="";
        switch (item) {
            case BOOK:
                description="A Book, title reads \"Seth's guide to Java\". Seems insteresting"; break;
            case KNIFE:
                description="Just a regular old kitchen knife."; break;
            case CUP:
                description ="A dirty cup in need of a wash"; break;
            case PHONE:
                description ="An old fashion rotary phone"; break;
            case TV:
                description="Just a  normal TV"; break;
        }
        return description;
    }

    public int getListLength(){
        return Holds.size();
    }

    public Item getItemAtPosition(int pos){
        return Holds.get(pos);
    }

}
