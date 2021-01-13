package LordOfTheRingsGame.Heros;

import LordOfTheRingsGame.Weapon.Weapon;

import java.util.ArrayList;

public class Heros {
//    public enum HerosNameEnum {ARAGORN, ELROND, LEGOLAS, GIMLI, FRODO, GALADRIEL, MITHRANDIR, GANDALF_THE_GRAY}

    public static final int LENGTH = 11;
    private Weapon grabbedWeapon = new Weapon();
    public static ArrayList<Weapon> takenWeapon= new ArrayList<>();
    public static HerosSpecialities heroList;


    public void setUpHeros(String name) {

        switch (name) {
            case "aragorn":
                heroList = new HerosSpecialities("Aragorn", 15, 100, 1);
                break;
            case "elrond":
                heroList = new HerosSpecialities("Elrond",  20, 100, 1);
                break;
            case "legolas":
                heroList = new HerosSpecialities("Legolas",  10, 100, 1);
                break;
            case "gimli":
                heroList = new HerosSpecialities("Gimli",  12, 100, 1);
                break;
            case "frodo":
                heroList = new HerosSpecialities("Frodo",  5, 100, 1);
                break;

        }
        System.out.println("You selected as a hero : " + name);
    }


    public Weapon getGrabbedWeapon() {
        return grabbedWeapon;
    }


    public void grabWeapon(Weapon.WEAPONS weapon) {
        grabbedWeapon.addWeapon(weapon);
    }

    public void handOverWeapon(Weapon.WEAPONS weapon) {
        grabbedWeapon.removeWeapon(weapon);
    }

    public String getPlayerNameString() {return heroList.getHeroName();
    }

//    public static void getPlayerName() {
//        System.out.println("Your hero's name is " + heroList.getHeroName());
//    }

//    public static void getPlayerDamage() {
//        System.out.println("Your hero's damage is : " + heroList.getMakeDamage());
//    }

    public int getPlayerDamageInt() {
        return heroList.getMakeDamage();
    }

    public int getPlayerPowerInt() {
        return heroList.getPower();
    }

    public static void getPlayerMaxPower() {
        System.out.println("Your hero's max power is : " + heroList.getMaxPower());
    }

    public void setPlayerPower(int newPower){
        heroList.setPower(newPower);
    }

    public String heroDescription(String playerName) {

        String descriptionOfHeros = "";
        if ("Aragorn".equals(playerName)) {
            descriptionOfHeros = "Aragorn : I'm the king ";
        } else if ("Legolas".equals(playerName)) {
            descriptionOfHeros = "Legolas :";
        } else if ("Frodo".equals(playerName)) {
            descriptionOfHeros = "Frodo :";
        } else if ("Gandlalf".equals(playerName)) {
            descriptionOfHeros = "Gandalf: ";
        } else if ("Gimli".equals(playerName)) {
            descriptionOfHeros = "Gimli :";
        }
        return descriptionOfHeros;
    }

    public String heroInfo() {
        return "Hero Specialities\n" +
                "Hero's Name      = " + heroList.getHeroName() + "\n" +
                "Hero's Damage    = " + heroList.getMakeDamage() + "\n" +
                "Hero's Level     = " + heroList.getLevel() + "\n" +
                "Hero's power     = " + heroList.getPower() + "\n" +
                "Hero's max power = " + heroList.getMaxPower();
    }

}

