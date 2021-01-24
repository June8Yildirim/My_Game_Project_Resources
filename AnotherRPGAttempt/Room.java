package AnotherRPGAttempt;

import AnotherRPGAttempt.Enemies.NPC;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int number;
    String name;

    List<String> desc = new ArrayList<String>();
    List<String> exits = new ArrayList<String>();
    List<NPC> npc = new ArrayList<NPC>();

    public Room(int x) {
        this.number = x;
    }

}
