package AnotherRPGAttempt;

import AnotherRPGAttempt.Enemies.NPC;
import AnotherRPGAttempt.Enemies.Troll;

import java.util.ArrayList;
import java.util.List;

public class GameObjects {
    static Player pc = new Player();
     static ArrayList<Room> room = new ArrayList<Room>();


      static List<Object> NPCDatabase= new ArrayList<Object>();

    public static void initializeNPCArray(){
        NPCDatabase.add(new NPC());
        NPCDatabase.add(new Troll());
    }


}
