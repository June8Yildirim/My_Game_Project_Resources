package NewRPGAttempt.Heros;

public class Heros {
    private String Name;
    private int Hp;
    private int MaxHp;
    private int Damage;
    private String desc;

    public enum HerosName {ARAGORN, LEGOLAS, ELROND, GIMLI, GREYGANDALF, WHITEGANDALF, FRODO, MITHRANDIR, STRIDER, GALADRIEL,}

    public Heros(HerosName type, String name, int hp, int damage) {
        this.Hp = hp;
        this.Name = name;
        this.MaxHp = hp + 15;
        this.Damage = damage;
        this.desc = getHeroDescription(name);
    }


    public String getHeroDescription(String name) {
        String tempDesc = "";
        switch (name) {
            case "Legolas" -> tempDesc = "";
            case "Aragorn" -> tempDesc = "";
            case "Gimli" -> tempDesc = "";
            case "Frodo" -> tempDesc = "";
            case "Elrond" -> tempDesc = "";
            case "Strider" -> tempDesc = "";
            case "Galadriel" -> tempDesc = "";
            case "Mithrandir" -> tempDesc = "";
            case "Gandalf the Gray" -> tempDesc = "";
            case "Gandalf the White" -> tempDesc = "";
        }
        return tempDesc;
    }


    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMaxHp() {
        return MaxHp;
    }


    public String getName() {
        return Name;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
}
