package LordOfTheRingsGame.Heros;

import LordOfTheRingsGame.Weapon.Weapon;

import java.util.ArrayList;

public class Heros {
    public enum HerosNameEnum {ARAGORN, ELROND, LEGOLAS, GIMLI, FRODO, GALADRIEL, MITHRANDIR, GANDALF_THE_GRAY}

    public static final int LENGTH = 11;
    private Weapon grabbedWeapon = new Weapon();

  public static   HerosSpecialities heroList = new HerosSpecialities();


    public static Heros setUpHeros(String name) {
//        HerosSpecialities aragorn = new HerosSpecialities("Aragorn", 80, 90, 100, 120, 1);
//        HerosSpecialities elrond = new HerosSpecialities("legolas", 60, 90, 100, 120, 1);
//        HerosSpecialities legolas = new HerosSpecialities("legolas", 60, 90, 100, 120, 1);
//        HerosSpecialities gimli = new HerosSpecialities("gimli", 50, 90, 100, 120, 1);
//        HerosSpecialities frodo = new HerosSpecialities("frodo", 20, 90, 100, 120, 1);
//        HerosSpecialities galadriel = new HerosSpecialities("galadriel", 100, 90, 100, 120, 1);
//        HerosSpecialities mithrandir = new HerosSpecialities("mithrandir", 85, 90, 100, 120, 1);
//        HerosSpecialities gandalf_the_gray = new HerosSpecialities("gandalf the gray", 80, 90, 100, 120, 1);
//        HerosSpecialities gandalf_the_white = new HerosSpecialities("gandalf the white", 95, 90, 100, 120, 1);
        switch (name) {
            case "aragorn":
                HerosSpecialities aragorn = new HerosSpecialities("aragorn", 80, 90, 100, 120, 1);
                break;
            case "elrond":
                HerosSpecialities elrond = new HerosSpecialities("elrond", 90, 90, 100, 120, 1);
                break;
            case "legolas":
                HerosSpecialities legolas = new HerosSpecialities("legolas", 60, 90, 100, 120, 1);
                break;
            case "gimli":
                HerosSpecialities gimli = new HerosSpecialities("gimli", 50, 90, 100, 120, 1);
                break;
            case "frodo":
                HerosSpecialities frodo = new HerosSpecialities("frodo", 20, 90, 100, 120, 1);
                break;

        }
        System.out.println("You selected as a hero is: "+name);
    }
//        HerosSpecialities galadriel = new HerosSpecialities("galadriel", 100, 90, 100, 120, 1);
//        HerosSpecialities mithrandir = new HerosSpecialities("mithrandir", 85, 90, 100, 120, 1);
//        HerosSpecialities gandalf_the_gray = new HerosSpecialities("gandalf the gray", 80, 90, 100, 120, 1);
//        HerosSpecialities gandalf_the_white = new HerosSpecialities("gandalf the white", 95, 90, 100, 120, 1);




//    public String getPlayerName(String name) {
//        for (HerosSpecialities heros : heroList) {
//            if (heros.getPlayerName().equals(name)) {
//                return name;
//            }
//        }
//        return name;
//    }
//
//    public static void heroStatus() {
//        for (int i = 0; i < LENGTH; i++) {
//            if (heroList.)
//        }
//    }


    public Weapon getGrabbedWeapon() {
        return grabbedWeapon;
    }


    public void grabWeapon(Weapon.WEAPONS weapon) {
        grabbedWeapon.addWeapon(weapon);
    }

    public void handOverWeapon(Weapon.WEAPONS weapon) {
        grabbedWeapon.removeWeapon(weapon);
    }

}
//    public static ArrayList<Heros> heroList = new ArrayList<>();
//    public static ArrayList<HerosSpecialities> heroList = new ArrayList<>();

//    public static void getHeroStatus(HerosNameEnum name) {
//        for (HerosSpecialities heros : heroList) {
//            if (heros.getPlayerName().equals(name)) {
//                System.out.println("Your hero's set up," +
//                        "\nYour Hero's Name : " + heros.getPlayerName() + "" +
//                        "\nHero's HP is : " + heros.getHp() + "" +
//                        "\nHero's Max HP is : " + heros.getMaxHp() + "" +
//                        "\nHero's power is : " + heros.getPower() + "" +
//                        "\nHero's Max power is : " + heros.getMaxPower() + "" +
//                        "\nHero's level is : " + heros.getLevel());
//
//            }
//        }
//    }


//        heroList.add(aragorn);
//        heroList.add(elrond);
//        heroList.add(legolas);
//        heroList.add(gimli);
//        heroList.add(frodo);
//        heroList.add(galadriel);
//        heroList.add(frodo);
//        heroList.add(galadriel);
//        heroList.add(gandalf_the_white);
//        heroList.add(gandalf_the_gray);
//        heroList.add(mithrandir);


//        heroList.add(new HerosSpecialities("aragorn", 80, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("elrond", 90, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("legolas", 60, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("gimli", 50, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("frodo", 20, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("galadriel", 100, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("mithrandir", 85, 90, 100, 120, 1));
////        heroList.add(new HerosSpecialities("gandalf the gray", 80, 90, 100, 120, 1));
//        heroList.add(new HerosSpecialities("gandalf the white", 95, 90, 100, 120, 1));