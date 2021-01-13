package LordOfTheRingsGame.Places;

import LordOfTheRingsGame.Weapon.Weapon;

public class Place {
    //How can I access when I made a private.
    public enum placeOfMiddleEarthEnums {MORIA_BRIDGE, HELMS_DEEP, MINASTRITH, ISENGARD, SHIRE, CARADRAS_PASSAGEWAY}

    private Weapon.WEAPONS[] weapons;
    private Weapon holdingWeapon;
    private String name;
    private int difficulties;
    private String description;
    private placeOfMiddleEarthEnums[] getConnected;
    private placeOfMiddleEarthEnums type;


    public Place(placeOfMiddleEarthEnums type) {
//        this.weapons = placeSetUp(type);
        this.holdingWeapon = placeSetUp(type);
        this.name = setupName(type);
        this.difficulties = setUpDifficulties(type);
        this.description = getPlaceDescription(type);
        this.getConnected = findConnected(type);
        this.type = type;
    }

    public Weapon.WEAPONS[] getWeapons() {
        return weapons;
    }

    public String getName() {
        return name;
    }

    public int getDifficulties() {
        return difficulties;
    }

    public String getDescription() {
        return description;
    }

    public placeOfMiddleEarthEnums[] getGetConnected() {
        return getConnected;
    }

    public placeOfMiddleEarthEnums getPlaceType() {
        return type;
    }

    public placeOfMiddleEarthEnums getType() {
        return type;
    }

    public Weapon getWeaponList() {
        return holdingWeapon;
    }

    public void addWeaponToPlace(Weapon.WEAPONS weaponToAdd) {
        holdingWeapon.addWeapon(weaponToAdd);
    }

    public void removeWeaponFromPlace(Weapon.WEAPONS weaponToRemove) {
        holdingWeapon.removeWeapon(weaponToRemove);
    }

    public Weapon placeSetUp(placeOfMiddleEarthEnums type) {
        Weapon tempWeapon = new Weapon();
        switch (type) {
            case SHIRE:
                tempWeapon.addWeapon(Weapon.WEAPONS.KNIFE);
                break;
            case ISENGARD:
                tempWeapon.addWeapon(Weapon.WEAPONS.GLAMDRING);
                tempWeapon.addWeapon(Weapon.WEAPONS.ELFBOW);
                break;
            case MINASTRITH:
                tempWeapon.addWeapon(Weapon.WEAPONS.NARSIL);
                tempWeapon.addWeapon(Weapon.WEAPONS.ORCHRIST);
                tempWeapon.addWeapon(Weapon.WEAPONS.ELFBOW);
                break;
            case MORIA_BRIDGE:
                tempWeapon.addWeapon(Weapon.WEAPONS.STING);
                tempWeapon.addWeapon(Weapon.WEAPONS.DWARFAXES);
                break;
            case HELMS_DEEP:
                tempWeapon.addWeapon(Weapon.WEAPONS.DWARFAXES);
                tempWeapon.addWeapon(Weapon.WEAPONS.ELFBOW);
                break;
        }
        return tempWeapon;
    }


    public placeOfMiddleEarthEnums[] findConnected(placeOfMiddleEarthEnums type) {
        placeOfMiddleEarthEnums[] tempPlace = null;
        switch (type) {
            case SHIRE:
                tempPlace = new placeOfMiddleEarthEnums[]{placeOfMiddleEarthEnums.MORIA_BRIDGE};
                break;
            case MORIA_BRIDGE:
                tempPlace = new placeOfMiddleEarthEnums[]{placeOfMiddleEarthEnums.ISENGARD, placeOfMiddleEarthEnums.SHIRE, placeOfMiddleEarthEnums.HELMS_DEEP};
                break;
            case ISENGARD:
                tempPlace = new placeOfMiddleEarthEnums[]{placeOfMiddleEarthEnums.HELMS_DEEP, placeOfMiddleEarthEnums.MORIA_BRIDGE};
                break;
            case HELMS_DEEP:
                tempPlace = new placeOfMiddleEarthEnums[]{placeOfMiddleEarthEnums.ISENGARD, placeOfMiddleEarthEnums.MINASTRITH};
                break;
            case MINASTRITH:
                tempPlace = new placeOfMiddleEarthEnums[]{placeOfMiddleEarthEnums.HELMS_DEEP};
                break;
            case CARADRAS_PASSAGEWAY:
                tempPlace = new placeOfMiddleEarthEnums[]{placeOfMiddleEarthEnums.SHIRE, placeOfMiddleEarthEnums.MORIA_BRIDGE};
        }

        return tempPlace;
    }

    public int setUpDifficulties(placeOfMiddleEarthEnums type) {
        int difficulties = 0;
        switch (type) {
            case SHIRE:
                difficulties = 1;
                break;
            case MORIA_BRIDGE:
                difficulties = 3;
                break;
            case HELMS_DEEP:
                difficulties = 4;
                break;
            case ISENGARD:
                difficulties = 2;
                break;
            case MINASTRITH:
                difficulties = 5;
                break;
        }
        return difficulties;

    }


    private String setupName(placeOfMiddleEarthEnums type) {
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
            case ISENGARD:
                tempName = "Isengard";
                break;
            case MINASTRITH:
                tempName = "Minas Trith";
                break;
        }
        return tempName;
    }

    public String getPlaceDescription(placeOfMiddleEarthEnums type) {
        String tempDescription = "";

        switch (type) {
            case MORIA_BRIDGE:
                tempDescription = "Drawfs famous cities under the mountain,\nbut you can fall moria bridge while fight with BALROG";
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
            case SHIRE:
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
        }
        return tempDescription;

    }
}
