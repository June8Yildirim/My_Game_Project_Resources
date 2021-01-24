package AnotherRPGAttempt.Enemies;

import AnotherRPGAttempt.AnotherRPGAttempt;

public class NPC {
    String name;
    String id="NPC";
    String desc;
    int hp;
    int accuracy;
    int inRoom;



    public void look(){
        System.out.println("Name :" +name+"\nAccuracy : "+accuracy+"\nHp : "+hp);
    }

}
