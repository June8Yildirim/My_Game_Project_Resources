package AnotherRPGAttempt;

public class Player {
    String name;
    int hp;
    int accuracy;
    int inRoom = 0;

    public void look() {
        System.out.println("HP : "+hp +"\nAccuracy :"+ accuracy);
    }

}
