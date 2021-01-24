package TextRpg;

public class Enemy extends Character {
    int playerXp;
    public Enemy(String name, int playerXp) {
        super(name, (int) (Math.random()*playerXp+playerXp/3+5), (int) (Math.random()*(playerXp/4+2)+1));
        // assinging new variable
        this.playerXp=playerXp;
    }
    //Enemy specific attack and defence calculations method
    @Override
    public int attack() {
        return (int)(Math.random()*(playerXp/4+1)+xp/4+3);
    }

    @Override
    public int defend() {
        return (int)(Math.random()*(playerXp/4+1)+xp/4+3);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
