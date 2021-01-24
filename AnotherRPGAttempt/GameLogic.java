//package AnotherRPGAttempt;
//
//import AnotherRPGAttempt.Enemies.NPC;
//
//import java.util.Scanner;
//
//public class GameLogic {
//    static Scanner sc = new Scanner(System.in);
//
//    public GameLogic() {
//        GameObjects.room.add(new Room(1));
//        GameObjects.room.get(0).name = "Floating in Space";
//        GameObjects.room.get(0).desc.add("Desc Line 1");
//        GameObjects.room.get(0).desc.add("Desc Line 2");
//        GameObjects.room.get(0).desc.add("Desc Line 3");
//        GameObjects.room.get(0).desc.add("Desc Line 4");
//        GameObjects.room.get(0).exits.add("North 2");
//        GameObjects.room.get(0).exits.add("South 3");
//
//
//    }
//
//    public void waitForCommand() {
//        if (GameObjects.pc.inRoom == 0) {
//            createCharacter();
//        }
//        System.out.println("What do?");
//
//        String com = sc.nextLine();
////parse the command by the spaces
//        //read each word into an array value String s="This is a sample sentence.";
//
//        String[] words = com.split(" ");
//        processCommand(words);
//    }
//
//    public void processCommand(String[] x) {
//        if (x[0].equals("look")) {
//            look(x);
//        }
//        if (x[0].equals("summon")) {
//            summon(x);
//        }
//    }
//
//    public void summon(String[] x) {
//        if (x.length == 1) {
//            System.out.println("Summon What exactly");
//        }
//        if (x.length == 2) {
//            for (int i = 0; i < GameObjects.NPCDatabase.size(); i++) {
//                NPC localNpc = (NPC) GameObjects.NPCDatabase.get(i);
//                if (localNpc.id.equalsIgnoreCase(x[1])) {
//                    for (int j = 0; j < GameObjects.room.size(); j++) {
//                        if (GameObjects.room.get(j).number == GameObjects.pc.inRoom) {
//                            try {
//                                GameObjects.room.get(j).npc.add((NPC) Class.forName(localNpc.id).newInstance());
//                                System.out.println("You Summon a " + GameObjects.room.get(j).npc.get(GameObjects.room.get(j).npc.size() - 1));
//                            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public void look(String[] x) {
//        if (x.length == 1) {
//            for (int i = 0; i < GameObjects.room.size(); i++) {
//                if (GameObjects.room.get(i).number == GameObjects.pc.inRoom) {
//                    System.out.println(GameObjects.room.get(i).name);
//                    for (int j = 0; j < GameObjects.room.get(i).desc.size(); j++) {
//                        System.out.println(GameObjects.room.get(i).desc.get(j));
//                    }
//                    System.out.println("Exits:");
//                    for (int j = 0; j < GameObjects.room.get(i).exits.size(); j++) {
//                        String exitNameFull = GameObjects.room.get(i).exits.get(j);
//                        String[] exitName = exitNameFull.split(" ");
//                        System.out.println(exitName[0]);
//                    }
//                    for (int j=0; j<GameObjects.room.get(i).npc.size();i++){
//                        System.out.println(GameObjects.room.get(i).npc.get(j).desc);
//                    }
//                }
//            }
//        }
//        if (x.length == 2) {
//            if (x[1].equals("self")) {
//                GameObjects.pc.look();
//            }
//            for (int i=0;i<GameObjects.room.size();i++){
//                if (GameObjects.room.get(i).number == GameObjects.pc.inRoom){
//                    for (int j=0;j<GameObjects.room.size();j++){
//                        if (x[1].equalsIgnoreCase(GameObjects.room.get(i).npc.get(j).id)){
//                            GameObjects.room.get(i).npc.get(j).look();
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//
//    public void createCharacter() {
//        System.out.println("Welcome to the Game. What is your name?");
//        GameObjects.pc.name = sc.next();
//        System.out.println("For the sake of simplicity, the kings are going to give 100hp and 75 accuracy to the start.");
//        GameObjects.pc.hp = 100;
//        GameObjects.pc.accuracy = 75;
//        GameObjects.pc.inRoom = 1;
//
//    }
//
//}
