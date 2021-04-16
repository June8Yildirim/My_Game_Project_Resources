package TextBasedGameDoublePlayer;

import java.util.Random;

public class Enemy {
    private String name;
    private int damage;
    private int hp;
    private int xp;

    public Enemy() {
        this.name = setName();
        this.damage = 5;
        this.hp = 100;
        this.xp = 1
        ;
    }


    public String getName() {
        return name;
    }

    public String setName() {
        String[] enemyNames= {"Sauron","Voldemorth","Megatron","Hannibal Lector"};
        Random random = new Random();
       return this.name= enemyNames[random.nextInt(4)];
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
    public void enemyStatus(){
        System.out.println("You encountered enemy's name is "+ this.name);
        System.out.println("You encountered enemy's xp is "+this.xp);
        System.out.println("You encountered enemy's damage capacity is "+ this.damage);
        System.out.println("Your encountered enemy's hp is "+this.hp);
    }
}
