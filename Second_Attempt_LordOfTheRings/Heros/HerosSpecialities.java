package Second_Attempt_LordOfTheRings.Heros;

public class HerosSpecialities{
    private String heroName;
    private int makeDamage;
    private int power;
    private int maxPower;
    private int level;


    public HerosSpecialities(String aHeroName, int aMmakeDamage, int aPower, int aLevel) {
        this.heroName = aHeroName;
        this.makeDamage=aMmakeDamage;
        this.power = aPower;
        this.maxPower = (aPower+20);
        this.level = aLevel;
    }

    public HerosSpecialities( ) {
        this.heroName = heroName;
        this.makeDamage=makeDamage;
        this.power = power;
        this.maxPower = (power+20);
        this.level = level;
    }
    public String getHeroName() { return heroName; }

    public int getMakeDamage() { return makeDamage; }

    public int getPower() {
        return power;
    }

    public int getMaxPower() {
        return power+10;
    }

    public int getLevel() {
        return level;
    }

    public void setPower(int power) { this.power = power; }

    public void setLevel(int level) {this.level = level; }

}
