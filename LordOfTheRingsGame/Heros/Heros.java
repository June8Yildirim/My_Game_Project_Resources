package LordOfTheRingsGame.Heros;

public class Heros extends HerosSpecialities {
    private String playerName;
    private int hp;
    private int maxHp;
    private int power;
    private int maxPpwer;
    private int level;

    public Heros(String playerName, int hp,int power, int level) {
        super();
    }

    public String getHeroesSpecialities() {
        return "Your hero's name : "+playerName+"\nYour hero's HP : "+hp+"\nYour hero's power : "+power+"\nYour current level : "+level;
    }
}
