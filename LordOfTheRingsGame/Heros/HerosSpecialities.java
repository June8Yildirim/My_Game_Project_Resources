package LordOfTheRingsGame.Heros;

import LordOfTheRingsGame.Weapon.Weapon;

public class HerosSpecialities{


    private String playerName;
    private int hp;
    private int maxHp;
    private int power;
    private int maxPower;
    private int level;
    public HerosSpecialities(String playerName, int hp, int maxHp, int power, int maxPower, int level) {
        this.playerName = playerName;
        this.hp = hp;
        this.maxHp = maxHp;
        this.power = power;
        this.maxPower = maxPower;
        this.level = level;
    }
    public HerosSpecialities(){
        this.playerName = playerName;
        this.hp = hp;
        this.maxHp = maxHp;
        this.power = power;
        this.maxPower = maxPower;
        this.level = level;
    }
    public String getPlayerName() {
        return playerName;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return hp+10;
    }

    public int getPower() {
        return power;
    }

    public int getMaxPower() {
        return power+10;
    }

    public int getLevel() {
        return level;
    }


    public String toString() {
        return "HerosSpecialities{" +
                "playerName='" + playerName + '\'' +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", power=" + power +
                ", maxPower=" + maxPower +
                ", level=" + level +
                "} " + super.toString();
    }

    public static String heroDescription(String playerName) {

        String descriptionOfHeros = "";
        if ("aragorn".equals(playerName)) {
            descriptionOfHeros = "Aragorn :";
        } else if ("legolas".equals(playerName)) {
            descriptionOfHeros = "Legolas :";
        } else if ("frodo".equals(playerName)) {
            descriptionOfHeros = "Frodo :";
        } else if ("gandlalf".equals(playerName)) {
            descriptionOfHeros = "Gandalf: ";
        } else if ("gimli".equals(playerName)) {
            descriptionOfHeros = "Gimli :";
        }
        return descriptionOfHeros;
    }
}
