package NewRPGAttempt.Enemy;

public class Enemy {
    public enum EnemyNames {ANGMAR, BALROG, GOLLUM, TROLL, ORCH, SARUMAN, SAURON, SHELOB, URUKHAI, NAZGUL, GOBLIN}

    private int Damage;
    private int Hp;
    private String Name;
    private int xp;
    private String desc;


    public Enemy(EnemyNames type, String name, int damage, int hp, int xp) {
        this.Name = name;
        this.Damage = damage;
        this.Hp = hp;
        this.xp = xp;
        this.desc = getEnemyDescription(name);
    }

    public String getEnemyDescription(String name) {
        String tempDesc = "";
        switch (name) {
            case "Saruman" -> tempDesc = "";
            case "Uruk-Hai" -> tempDesc = "";
            case "Nazgul" -> tempDesc = "";
            case "Goblin" -> tempDesc = "";
            case "Orch" -> tempDesc = "";
            case "Gollum" -> tempDesc = "";
            case "Troll" -> tempDesc = "";
            case "Angmar" -> tempDesc = "";
            case "Balrog" -> tempDesc = "";
            case "Sauron" -> tempDesc = "";
            case "Shelob" -> tempDesc = "";
        }
        return tempDesc;
    }



    public String getName() {
        return Name;
    }

    public int getDamage() {
        return Damage;
    }

    public int getHp() {
        return Hp;
    }
//    public int getXp() {
//        return xp;
//    }

    public void setHp(int hp) {
        Hp = hp;
    }
}
