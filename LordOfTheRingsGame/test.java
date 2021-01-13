package LordOfTheRingsGame;


import LordOfTheRingsGame.Heros.Heros;
import LordOfTheRingsGame.Villains.Villain;
import LordOfTheRingsGame.Villains.VilliansSpecialities;
import LordOfTheRingsGame.Weapon.Weapon;

public class test {
   public static Villain villain = new Villain();
    public static void main(String[] args) {
        Heros heros = new Heros();
        Weapon weapon = new Weapon();
        heros.setUpHeros("aragorn");
        System.out.println(heros.heroDescription(heros.getPlayerNameString()));
        weapon.setWeapon("Narsil");
        System.out.println(weapon.getWeaponNameString());
        System.out.println(weapon.getWeaponDescription(weapon.getWeaponNameString()));
        System.out.println(weapon.getWeaponDamage());

    }

}
