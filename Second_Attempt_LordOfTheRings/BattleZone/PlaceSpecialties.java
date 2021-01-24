package Second_Attempt_LordOfTheRings.BattleZone;

import Second_Attempt_LordOfTheRings.Weapon.Weapon;

public class PlaceSpecialties {
    private String name;
    private String[] weaponName;
    private String[] connectedPlace;
    private String[] holdingWeapon;

    public PlaceSpecialties(String name, Weapon weaponName, String[] connectedPlace, String[] holdingWeapon) {
        this.name = name;
        this.connectedPlace = connectedPlace;
        this.holdingWeapon = holdingWeapon;
    }
    public PlaceSpecialties(String name) {
        if (this.name.equals("Shire")) {
            this.weaponName = new String[]{"Knife"};
            this.connectedPlace =new String[] {"Moria"};
        }else if(this.name.equals("Moria")){
            this.weaponName = new String[]{"Dwarfwxes","Sting"};
            this.connectedPlace =new String[] {"Shire","Helms Deep","Isengard"};
        }else if(this.name.equals("Helms Deep")){
            this.weaponName = new String[]{"Orchrist","Dwarfwxes"};
            this.connectedPlace =new String[] {"Moria", "Isengard",""};
        }else if(this.name.equals("Isengard")){
            this.weaponName = new String[]{"Glamdring","Elf Bow"};
            this.connectedPlace =new String[] {"Moria","Helms Deep"};
        }else if(this.name.equals("Ministrith")){
            this.weaponName = new String[]{"Narsil","Elf Bow"};
            this.connectedPlace =new String[] {"Helms Deep"};
        }

    }
}