package TextBasedGameAttempt1;

public class Places {
    private String name;
    private Items holds;
    private placeOfMiddleEarth[] connecting;
    private String description;
    private placeOfMiddleEarth type;

    enum placeOfMiddleEarth {
        CARADRAS_PASSAGEWAY, MORIA_BRIDGE, HELMS_DEEP, MINASTRITH, ROHAN, ISENGARD, SHIRE
    }

    public Places(placeOfMiddleEarth type) {
        this.name = nameSetUp(type);
        this.holds = placeSetup(type);
        this.connecting = connectionSetup(type);
        this.description = getPlaceDescription(type);
        this.type = type;
    }

    public String getPlaceName() {
        return name;
    }

    public String getPlaceDescription() {
        return description;
    }

    public placeOfMiddleEarth[] getPlaceConnections() {
        return connecting;
    }

    public placeOfMiddleEarth getPlaceType() {
        return type;
    }

    public Items getItemList() {return holds;}

    public void removeItemFromPlace(Items.Item itemToRemove) {
        holds.removeItem(itemToRemove);
    }

    public void addItemToPlace(Items.Item itemToAdd) {
        holds.addItem(itemToAdd);
    }


    private String nameSetUp(placeOfMiddleEarth type) {
        String tempName = "";
        switch (type) {
            case SHIRE:
                tempName = "Shire";
                break;
            case MORIA_BRIDGE:
                tempName = "Moria Bridge";
                break;
            case HELMS_DEEP:
                tempName = "Helms Deep";
                break;
            case CARADRAS_PASSAGEWAY:
                tempName = "Caradras Passageway";
                break;
            case ROHAN:
                tempName = "Rohan";
                break;
            case ISENGARD:
                tempName = "Isengard";
                break;
            case MINASTRITH:
                tempName = "Minas Trith";
                break;
        }
        return tempName;
    }


    private Items placeSetup(placeOfMiddleEarth type) {
        Items tempHolds = new Items();
        switch (type) {
            case SHIRE:
                tempHolds.addItem(Items.Item.STAFF);
                break;
            case MORIA_BRIDGE:
                tempHolds.addItem(Items.Item.AXE);
                tempHolds.addItem(Items.Item.WHITEGANDALFSTAF);
                break;
            case HELMS_DEEP:
                tempHolds.addItem(Items.Item.HAMMER);
                tempHolds.addItem(Items.Item.GLAMDRING);
                ;
                break;
            case CARADRAS_PASSAGEWAY:
                tempHolds.addItem(Items.Item.AXE);
                tempHolds.addItem(Items.Item.HAMMER);
                break;

            case MINASTRITH:
                tempHolds.addItem(Items.Item.ANDURIL);
                tempHolds.addItem(Items.Item.NARSIL);
            case ISENGARD:
                tempHolds.addItem(Items.Item.STING);
            case ROHAN:
                tempHolds.addItem(Items.Item.ORCRIST);
        }
        return tempHolds;
    }

    private placeOfMiddleEarth[] connectionSetup(placeOfMiddleEarth type) {
        placeOfMiddleEarth[] tempConnections = null;

        switch (type) {
            case SHIRE:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.MORIA_BRIDGE, placeOfMiddleEarth.CARADRAS_PASSAGEWAY};
                break;
            case MORIA_BRIDGE:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.ROHAN, placeOfMiddleEarth.CARADRAS_PASSAGEWAY};
                break;
            case CARADRAS_PASSAGEWAY:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.MORIA_BRIDGE};
                break;
            case HELMS_DEEP:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.ROHAN, placeOfMiddleEarth.ISENGARD};
                break;
            case ROHAN:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.ISENGARD, placeOfMiddleEarth.MINASTRITH, placeOfMiddleEarth.HELMS_DEEP, placeOfMiddleEarth.MORIA_BRIDGE};
                break;
            case ISENGARD:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.ROHAN, placeOfMiddleEarth.HELMS_DEEP};
                break;
            case MINASTRITH:
                tempConnections = new placeOfMiddleEarth[]{placeOfMiddleEarth.ROHAN};
        }
        return tempConnections;
    }


    private String getPlaceDescription(placeOfMiddleEarth type) {
        String tempDescription = "";

        switch (type) {
            case MORIA_BRIDGE:
                tempDescription = "Drawfs famous cities under the mountain,\nbut you can fall moria bridge while fight with BALROG";
                break;
            case CARADRAS_PASSAGEWAY:
                tempDescription = "Top of the Moria,\nSaruman can attack to yoo, or you can fall edge of the mountain while you walking on the snow";
                break;
            case HELMS_DEEP:
                tempDescription = "Rohan's most secure castle,\nbut Uruk-Hai's will attack to you";
                break;
            case MINASTRITH:
                tempDescription = "City of Kings\nbut nowadays rule by a madness Steward";
                break;
            case ISENGARD:
                tempDescription = "Old hero and new villian's place that Saruman will betrayal to you!";
                break;
            case ROHAN:
                tempDescription = "Grima tells lie for everything and Saruman enchant the King of Rohan. He doesn't seem to be ally";
                break;
            case SHIRE:
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
        }
        return tempDescription;

    }


}