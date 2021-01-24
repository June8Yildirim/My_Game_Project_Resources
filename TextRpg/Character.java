package TextRpg;

public abstract class Character {
// Variables / Attributes all character have
    public String name;
    public static int maxHp, hp, xp;

    // Constructor
    public Character(String name, int maxHp, int xp){
        this.name=name;
        this.maxHp=maxHp;
        this.hp= maxHp;
        this.xp= xp;


    }

    public abstract int attack();
    public abstract int defend();

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                "Hp='"+hp+'\''+
                "Xp='"+xp+'\''+
                '}';
    }
}
