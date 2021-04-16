package BasicTextBasedGame;

public class Player {
    private String name;
    private int chance;
    private int level;
    private int xp;

    public Player(String name, int chance, int level, int xp) {
        this.name = name;
        this.chance = chance;
        this.level = level;
        this.xp=xp;
    }

    public Player() {
        this.name = name;
        this.chance = chance;
        this.level = chance + 20;
        this.xp = xp;
    }
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
