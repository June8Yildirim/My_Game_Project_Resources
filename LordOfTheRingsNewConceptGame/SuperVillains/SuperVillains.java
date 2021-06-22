package LordOfTheRingsNewConceptGame.SuperVillains;

import GuiGames.MultipleClass.Weapons.SuperWeapons;

public class SuperVillains {
    private String name;
    private double makeDamage;
    private double hp;
    private double xp;
    private String[] skills = new String[8];
    private SuperWeapons[] weapons = new SuperWeapons[4];
    private int skillIndex = 0;
    private int weaponIndex= 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMakeDamage() {
        return makeDamage;
    }

    public void setMakeDamage(double makeDamage) {
        this.makeDamage = makeDamage;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills[skillIndex] = skills;
        skillIndex++;
    }

    public SuperWeapons[] getWeapons() {
        return weapons;
    }

    public void setWeapons(SuperWeapons weapons) {
        this.weapons[weaponIndex] = weapons;
        weaponIndex++;
    }
}
