
package Second_Attempt_LordOfTheRings.Weapon;


import java.util.ArrayList;

public class Weapon {
    public enum weaponEnums {DWARFAXES, ELFBOW, GLAMDRING, KNIFE, NARSIL, ORCHRIST, STING}

    public static WeaponSpecialities weaponSpecialities;

    public Weapon() {

    }

    private ArrayList<weaponEnums> Holding = new ArrayList<weaponEnums>();
//    private ArrayList<LordOfTheRingsAttempt2tempt2.Weapon.weaponEnums> Holding = new ArrayList<LordOfTheRingsAttempt2.Weapon.weaponEnums>();

    public void setWeapon(String name) {
        switch (name) {
            case "Dwarfs Axes":
                weaponSpecialities = new WeaponSpecialities("Dwarfs Axes", 10);
                break;
            case "Elf's Bow":
                weaponSpecialities = new WeaponSpecialities("Elf's Bow", 20);
                break;
            case "Glamdring":
                weaponSpecialities = new WeaponSpecialities("Glamdring", 30);
                break;
            case "Orchrist":
                weaponSpecialities = new WeaponSpecialities("Orchrist", 40);
                break;
            case "Sting":
                weaponSpecialities = new WeaponSpecialities("Sting", 20);
                break;
            case "Narsil":
                weaponSpecialities = new WeaponSpecialities("Narsil", 40);
                break;
            case "Knife":
                weaponSpecialities = new WeaponSpecialities("Knife", 2);
                break;
        }
    }

    public void addWeapon(Weapon.weaponEnums weapon) {
        Holding.add(weapon);
    }

    public void removeWeapon(String weapon) {
        Holding.remove(weapon);
    }

    public int getListlength() {
        return Holding.size();
    }

    public Weapon.weaponEnums getWeaponAtPosition(int pos) {
        return Holding.get(pos);
    }

    public void getWeaponName() {
        System.out.println("Your current weapon is " + weaponSpecialities.getWeaponName());
    }

    public String getWeaponNameString() {
        return weaponSpecialities.getWeaponName();
    }

    public int getWeaponDamage() {
        return weaponSpecialities.getWeaponDamage();
    }


    public String getWeaponDescription(String weapon) {
        String tempDescription = "";
        switch (weapon) {
            case "Dwarfs Axes":
                tempDescription = "Draws famous cities under the mountain,\nbut you can fall moria bridge while fight with BALROG";
                break;
            case "Elf's Bow":
                tempDescription = "Rohan's most secure castle,\nbut Uruk-Hai's will attack to you";
                break;
            case "Glamdring":
                tempDescription = "City of Kings\nbut nowadays rule by a madness Steward";
                break;
            case "Knife":
                tempDescription = "Old hero and new villian's place that Saruman will betrayal to you!";
                break;
            case "Narsil":
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
            case "Orchrist":
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
            case "Sting":
                tempDescription = "Your adventure's start from at this point,\nand you must leave right away from Shire;\nbecause, Nazguls are coming.";
                break;
        }
        return tempDescription;
    }


}