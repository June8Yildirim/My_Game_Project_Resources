package TextBasedGameAttempt2;

public class PlayerSpec {

    private String name;
    private int xp;
    private int damage;


    public PlayerSpec(String name, int xp, int damage) {
        this.name = name;
        this.xp = xp;
        this.damage = damage;
    }
    public PlayerSpec(){
        this.name = name;
        this.xp = xp;
        this.damage = damage;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }

    public int getXp() {
        return xp;
    }

    public int getDamage() {
        return damage;
    }




}
