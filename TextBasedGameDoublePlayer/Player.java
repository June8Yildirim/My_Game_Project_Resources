package TextBasedGameDoublePlayer;

import java.util.Random;

public class Player {
    private String name;
    private int damage;
    private int hp;
    private int xp;
    Random random = new Random();
    static int min = 5;
    static int max = 20;

    public Player(String name) {
        this.name = name;
        this.damage = 5;
        this.hp = (min + random.nextInt(max - min));
        this.xp = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void herosStatus() {
        System.out.println("Your hero's name is " + this.name);
        System.out.println("Your hero's xp is " + this.xp);
        System.out.println("Your hero's damage capacity is " + this.damage);
        System.out.println("Your hero's hp is " + this.hp);
    }
}
