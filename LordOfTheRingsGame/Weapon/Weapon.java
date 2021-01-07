package LordOfTheRingsGame.Weapon;

import java.util.ArrayList;

public class Weapon {
    public enum WEAPONS {DWARFAXES, ELFBOW, GLAMDRING, KNIFE, NARSIL, ORCHRIST, STING}

    private String description;

    public Weapon(WEAPONS type) {
        this.description = getWeaponDescription(type);
//        Holding = holding;
    }
    public Weapon( ) {

//        Holding = holding;
    }

    private ArrayList<Weapon.WEAPONS> Holding = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void addWeapon(Weapon.WEAPONS weapon) {
        Holding.add(weapon);
    }

    public void removeWeapon(Weapon.WEAPONS weapon) {
        Holding.remove(weapon);
    }

    public int getListlength() {
        return Holding.size();
    }

    public Weapon.WEAPONS getWeaponAtPosition(int pos) {
        return Holding.get(pos);
    }

    public String getWeaponDescription(Weapon.WEAPONS weapon) {
        String tempDescription = "";
        switch (weapon) {
            case DWARFAXES:
                tempDescription = "Drawfs famous cities under the mountain,\nbut you can fall moria bridge while fight with BALROG";
                break;
            case ELFBOW:
                tempDescription = "Rohan's most secure castle,\nbut Uruk-Hai's will attack to you";
                break;
            case GLAMDRING:
                tempDescription = "City of Kings\nbut nowadays rule by a madness Steward";
                break;
            case KNIFE:
                tempDescription = "Old hero and new villian's place that Saruman will betrayal to you!";
                break;
            case NARSIL:
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
            case ORCHRIST:
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
            case STING:
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
        }
        return tempDescription;
    }

    public void setWeapon() {
        ArrayList<WeaponSpecialities> weaponList = new ArrayList<>();
        weaponList.add(new WeaponSpecialities("Dwarfs Axes", 20));
        weaponList.add(new WeaponSpecialities("Elf's Bow", 20));
        weaponList.add(new WeaponSpecialities("Glamdring", 20));
        weaponList.add(new WeaponSpecialities("Orchrist", 20));
        weaponList.add(new WeaponSpecialities("Sting", 20));
        weaponList.add(new WeaponSpecialities("Narsil", 20));
        weaponList.add(new WeaponSpecialities("Knife", 20));


        //it will add selecting weapon condition inside the loop.
        for (WeaponSpecialities weapons : weaponList) {
            System.out.println(toString());
        }
    }
}
