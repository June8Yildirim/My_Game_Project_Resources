package LordOfTheRingsNewConceptGame.SuperHeros.Heroes;

import LordOfTheRingsNewConceptGame.SuperHeros.SuperHeroes;

import java.util.Random;

public class GandalfWhite extends SuperHeroes {


    Random random = new Random();
    int numberDamage = 12;
    public GandalfWhite() {
        super.setName("Frodo");
        super.setMakeDamage(random.nextInt(numberDamage));
        super.setHp(12);
        super.setXp(2);
        super.setMoney(100);
        super.setSkills("brave");
    }
}
