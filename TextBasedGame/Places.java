package TextBasedGame;

public class Places {
    private String name;
    private Items holds;
    private roomType[] connecting;
    private String description;
    private roomType type;

    enum roomType {
        BEDROOM, LOUNGE, KITCHEN
    }

    public Places(roomType type) {
        this.name = nameSetUp(type);
        this.holds = roomSetup(type);
        this.connecting = connectionSetup(type);
        this.description = getRoomDescription(type);
        this.type=type;
    }

    public String getRoomName() {
        return name;
    }

    public Items getItemList() {
        return holds;
    }

    public roomType[] getConnecting() {
        return connecting;
    }

    public String getRoomDescription() {
        return description;
    }

    public roomType[] getRoomConnections() {
        return connecting;
    }

    public void removeItemFromRoom(Items.Item itemToRomove) {
        holds.removeItem(itemToRomove);
    }

    public void addItemToRoom(Items.Item itemToAdd) {
        holds.addItem(itemToAdd);
    }

    public roomType getRoomType() {
        return type;
    }


    private String nameSetUp(roomType type) {
        String tempName = "";
        switch (type) {
            case LOUNGE:
                tempName = "Lounge Room";
                break;
            case KITCHEN:
                tempName = "Kitchen";
                break;
            case BEDROOM:
                tempName = "Bedroom";
                break;
        }
        return tempName;
    }


    private Items roomSetup(roomType type) {
        Items tempHolds = new Items();
        switch (type) {
            case LOUNGE:
                tempHolds.addItem(Items.Item.TV);
                tempHolds.addItem(Items.Item.PHONE);
                break;
            case KITCHEN:
                tempHolds.addItem(Items.Item.CUP);
                tempHolds.addItem(Items.Item.KNIFE);
                ;
                break;
            case BEDROOM:
                tempHolds.addItem(Items.Item.TV);
                tempHolds.addItem(Items.Item.BOOK);
                break;
        }
        return tempHolds;
    }

    private roomType[] connectionSetup(roomType type) {
        roomType[] tempConnections = null;

        switch (type) {
            case LOUNGE:
                tempConnections = new roomType[]{roomType.KITCHEN, roomType.BEDROOM};
                break;
            case BEDROOM:
                tempConnections = new roomType[]{roomType.LOUNGE};
                break;
            case KITCHEN:
                tempConnections = new roomType[]{roomType.LOUNGE};
                break;
        }
        return tempConnections;
    }


    private String getRoomDescription(roomType type) {
        String tempDescription = "";
        switch (type) {
            case LOUNGE:
                tempDescription = "A small lounge room. Has an uncomfortable couch.";
                break;
            case BEDROOM:
                tempDescription = "A fairly clean Bedroom";
                break;
            case KITCHEN:
                tempDescription = "A small yet well equipped kitchen";
                break;
        }
        return tempDescription;

    }


}