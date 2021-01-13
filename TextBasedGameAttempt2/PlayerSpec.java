package TextBasedGameAttempt2;

public class PlayerSpec {
    enum playerSpecEnums {ARAGORN, GIMLI, LEGOLAS, FRODO, GANDALF}

    private String name;
    private int xp;
    private int damage;
    private playerSpecEnums type;



//
//    public PlayerSpec(playerSpecEnums type) {
//        this.name =name;
//        this.xp = xp;
//        this.damage = damage;
//        this.type = type;
//    }

    public PlayerSpec(String name, int xp, int damage) {
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
