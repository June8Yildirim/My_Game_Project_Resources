package LordOfTheRingsNewConceptGame.SuperHeros;

import GuiGames.MultipleClass.Weapons.SuperWeapons;

public class SuperHeroes {

    private String name;
    private double makeDamage;
    private int hp;
    private double xp;
    private String[] skills = new String[5];
    private double money;
    private SuperWeapons[] weapons = new SuperWeapons[3];
    private int skillIndex = 0;
    private int weaponIndex= 0;

    public SuperHeroes() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMakeDamage(double makeDamage) {
        this.makeDamage = makeDamage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public void setSkills(String skills) {
        this.skills[skillIndex] = skills;
        skillIndex++;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setWeapons(SuperWeapons weapons) {
        this.weapons[weaponIndex] = weapons;
        weaponIndex++;
    }

    public String getName() {
        return name;
    }

    public double getMakeDamage() {
        return makeDamage;
    }

    public int getHp() {
        return hp;
    }

    public double getXp() {
        return xp;
    }

    public String[] getSkills() {
        return skills;
    }

    public double getMoney() {
        return money;
    }

    public SuperWeapons[] getWeapons() {
        return weapons;
    }
}
