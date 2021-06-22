package LordOfTheRingsNewConceptGame.SuperHeros.Heroes;

import LordOfTheRingsNewConceptGame.SuperHeros.SuperHeroes;

import java.util.Random;

public class Fili_Kili extends SuperHeroes {

    Random random = new Random();
    int numberDamage = 12;
    public Fili_Kili() {
        super.setName("Frodo");
        super.setMakeDamage(random.nextInt(numberDamage));
        super.setHp(12);
        super.setXp(2);
        super.setMoney(100);
        super.setSkills("brave");
    }
}
