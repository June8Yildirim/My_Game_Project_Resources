package GuiGames.MultipleClass;

import GuiGames.MultipleClass.Monsters.Goblin;
import GuiGames.MultipleClass.Monsters.SuperMonsters;
import GuiGames.MultipleClass.Weapons.Knife;
import GuiGames.MultipleClass.Weapons.LongSword;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class Story {
    Game game;
    UI ui;
    VisibilityManager vm;
    Players player = new Players();
    SuperMonsters monsters;

    int silverRing;

    public Story(Game g, UI userInterface, VisibilityManager vManager) {
        ui = userInterface;
        game = g;
        vm = vManager;
    }

    public void defaultSetUp() {
        player.hP = 15;
        ui.hpLabelNumber.setText("" + player.hP);
        player.currentWeapon = new Knife();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        ui.healthBar.setValue(player.hP);
        silverRing = 0;
        ui.playerItems[0]= ui.potion;
        ui.playerItems[1]= ui.orange;
        ui.playerItems[2]= ui.empty;
        ui.playerItems[3]= ui.empty;
        ui.invStatus ="close";
    }

    public void selectNextPosition(String nextPosition) {
        switch (nextPosition) {
            case "townGate" -> townGate();
            case "talkGuard" -> talkGuard();
            case "attackGuard" -> attackGuard();
            case "crossRoad" -> crossRoad();
            case "north" -> north();
            case "east" -> east();
            case "west" -> west();
            case "fight" -> fight();
            case "attack" -> attack();
            case "monsterAttack" -> monsterAttack();
            case "win" -> win();
            case "lose" -> lose();
            case "ending" -> ending();
            case "toTitle" -> toTitle();
            case "talkWoman" -> talkWoman();
            case "continue" -> loadGame();
        }

    }

    public void townGate() {
        ui.image = new ImageIcon(".//GuiGames//MultipleClass//res/gate.png");
        ui.imageLabel.setIcon(ui.image);
        ui.mainTextArea.setText("You are at the gate of the town. \nA guard standing in front of you. \n\nWhat do you want to do?");
        ui.choice1.setText("Talk to the guard");
        ui.choice2.setText("Attack to the guard");
        ui.choice3.setText("Talk to a woman.");
        ui.choice4.setText("Leave");
        ui.choice5.setText("INVENTORY");


        game.nextPosition1 = "talkGuard";
        game.nextPosition2 = "attackGuard";
        game.nextPosition3 = "talkWoman";
        game.nextPosition4 = "crossRoad";

    }

    public void talkGuard() {
        if (silverRing == 0) {
            ui.mainTextArea.setText("Guard: Hello stranger. I have never seen your face.\nI'm sorry but we cannot let a stranger enter our town.");
            ui.choice1.setText("Return Gate");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");
            ui.choice5.setText("INVENTORY");

            game.nextPosition1 = "townGate";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
            game.nextPosition5 ="";
        } else if (silverRing >= 1) {
            ending();
        }
    }

    public void talkWoman(){
        int slotNumber=0;
        while (ui.playerItems[slotNumber]!=ui.empty && slotNumber<4) {
            slotNumber++;
        }
        if (ui.playerItems[slotNumber]==ui.empty){
            ui.mainTextArea.setText("Ohh! You seems to hungry, and you can take this orange");
            ui.playerItems[slotNumber]=ui.orange;
        }else if (ui.playerItems[slotNumber] != ui.empty){
            ui.mainTextArea.setText("Your inventory seems full, so you cannot carry a new item.");
        }
        ui.choice1.setText(">");
        ui.choice2.setText("Save");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 ="townGate";
        game.nextPosition2 ="saveGame";
        game.nextPosition3 ="";
        game.nextPosition4 ="";
        game.nextPosition5 ="";


    }
    public void attackGuard() {
        ui.mainTextArea.setText("Guard: Hey don't be stupid\n\nThe guard fought back and hit you hard. You receive 3 damage.");
        player.hP -= 3;
        ui.hpLabelNumber.setText("" + player.hP);
        ui.healthBar.setValue(player.hP);
        ui.choice1.setText("Return to the town gate");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "townGate";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void crossRoad() {
        ui.image = new ImageIcon(".//GuiGames//MultipleClass//res//crossRoad.jpg");
        ui.imageLabel.setIcon(ui.image);
        ui.mainTextArea.setText("You are at a crossroad\n\nIf you go south you will back to the town.");
        ui.choice1.setText("Go South");
        ui.choice2.setText("Go North");
        ui.choice3.setText("Go West");
        ui.choice4.setText("Go East");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "townGate";
        game.nextPosition2 = "north";
        game.nextPosition3 = "west";
        game.nextPosition4 = "east";
    }

    public void north() {
        ui.mainTextArea.setText("There is a river\nYou drink the water and rest at the riverside\n\nYour Hp is recovered by 2.");
        player.hP += 2;
        ui.hpLabelNumber.setText("" + player.hP);
        ui.choice1.setText("Go South");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void east() {
        ui.mainTextArea.setText("There walked into a forest and found a Long Sword\n\nYou obtained Long Sword.");
        player.currentWeapon = new LongSword();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        ui.choice1.setText("Go West");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void west() {
        ui.image = new ImageIcon(".//GuiGames//MultipleClass//res/monster.jpg");
        ui.imageLabel.setIcon(ui.image);

        monsters = new Goblin();
        ui.mainTextArea.setText("You encounter a " + monsters.name + "!");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void fight() {
        ui.mainTextArea.setText(monsters.name + ": " + monsters.hp + "\n\nWhat do you want to do?");
        ui.choice1.setText("Attack");
        ui.choice2.setText("Run");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "attack";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void attack() {
        int playerDamage = new Random().nextInt(player.currentWeapon.damage);
        ui.mainTextArea.setText("You attacked the " + monsters.name + ", and you gave " + playerDamage + " damage.");
        monsters.hp -= playerDamage;


        ui.choice1.setText("Attack");
        ui.choice2.setText("Run");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        if (monsters.hp > 0) {
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (monsters.hp < 1) {
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    public void monsterAttack() {
        int monsterDamage = new Random().nextInt(monsters.attack);
        player.hP -= monsterDamage;
        ui.hpLabelNumber.setText("" + player.hP);
        ui.healthBar.setValue(player.hP);

        ui.choice1.setText("Attack");
        ui.choice2.setText("Run");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        if (player.hP > 0) {
            game.nextPosition1 = "fight";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (player.hP < 1) {
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void win() {
        ui.mainTextArea.setText("You defeated the " + monsters.name + "!\nThe monster dropped a ring!\n\nYou obtained a Silver Ring.");
        silverRing += 1;

        ui.choice1.setText("Go East");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void lose() {
        ui.mainTextArea.setText("You are DEAD!\n\n<<GAME OVER>>");

        ui.choice1.setText("To the title screen");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("INVENTORY");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void ending() {
        ui.mainTextArea.setText("Guard: Oh! you killed that Goblin\nYou are true hero\nWelcome to our town\n\n<<GAME OVER>>");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }

    public void loadGame(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(".//GuiGames//MultipleClass//res//saveFile.txt"));
            player.hP=Integer.parseInt(br.readLine());
            player.currentWeapon.name = br.readLine();
            monsters.hp=Integer.parseInt(br.readLine());


            br.close();
        }catch (Exception e){

        }
        ui.hpLabelNumber.setText(""+player.hP);
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        ui.healthBar.setValue(player.hP);
        townGate();
    }
    public void itemUsed(int slotNumber){
        player.hP +=ui.playerItems[slotNumber].getHealingValue();
        ui.hpLabelNumber.setText(""+player.hP);
        ui.healthBar.setValue(player.hP);

        ui.playerItems[slotNumber]=ui.empty;
        ui.item1.setText(ui.playerItems[0].getName());
        ui.item2.setText(ui.playerItems[1].getName());
        ui.item3.setText(ui.playerItems[2].getName());
        ui.item4.setText(ui.playerItems[3].getName());

    }
    public void saveGame(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(".//GuiGames//MultipleClass//res//saveFile.txt"));
            bw.write(""+ player.hP);
            bw.newLine();
            bw.write(player.currentWeapon.name);
            bw.newLine();
            bw.write(monsters.hp+"");

            bw.close();
        }catch (Exception e){

        }
        ui.hpLabelNumber.setText(""+player.hP);
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        ui.healthBar.setValue(player.hP);
        townGate();
    }
    public void toTitle() {
        defaultSetUp();
//        vm.showTitleScreen();
    }
}
