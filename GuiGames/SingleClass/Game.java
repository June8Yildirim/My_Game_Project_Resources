package GuiGames.SingleClass;

import GuiGames.SingleClass.SuperItems.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.util.Random;

public class Game {
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, imagePanel, healthBarPanel, inventoryPanel;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel, imageLabel;
    JButton startButton, choice1, choice2, choice3, choice4, choice5,choice6, item1,item2,item3,item4, continueButton, exitButton;
    JTextArea mainTextArea;
    ImageIcon image;
    JProgressBar healthBar;
    Font titleFont = new Font("Tahoma", Font.PLAIN, 80);
    Font buttonFont = new Font("Tahoma", Font.PLAIN, 30);
    Font mainFont = new Font("Tahoma", Font.PLAIN, 20);
    int playerHp, monsterHp, silverRing, soundCue, index=0;
    String weapon, position, invStatus, text;


    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler csHandler = new ChoiceHandler();
    DamageHandler damageHandler = new DamageHandler();
    InventoryHandler inventoryHandler = new InventoryHandler();
    SoundEffect se = new SoundEffect();
    SuperItems[] playerItems = new SuperItems[5];

    Potion potion = new Potion();
    Orange orange = new Orange();
    Empty empty = new Empty();


    public Game() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.darkGray);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();



        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 100);
        titleNamePanel.setBackground(Color.DARK_GRAY);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.LIGHT_GRAY);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 130);
        startButtonPanel.setBackground(Color.LIGHT_GRAY);

        startButton = new JButton("START");
        startButton.setBackground(Color.DARK_GRAY);
        startButton.setForeground(Color.LIGHT_GRAY);
        startButton.setFont(buttonFont);
        startButton.addActionListener(tsHandler);
        startButton.setActionCommand("start");
        startButton.setBorder(null);
        startButton.setFocusPainted(false);

        continueButton = new JButton("CONTINUE");
        continueButton.setBackground(Color.DARK_GRAY);
        continueButton.setForeground(Color.LIGHT_GRAY);
        continueButton.setFont(buttonFont);
        continueButton.addActionListener(tsHandler);
        continueButton.setActionCommand("continue");
        continueButton.setFocusPainted(false);
        continueButton.setBorder(null);

        exitButton = new JButton("QUIT");
        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setForeground(Color.LIGHT_GRAY);
        exitButton.setFont(buttonFont);
        exitButton.addActionListener(tsHandler);
        exitButton.setActionCommand("quit");
        exitButton.setBorder(null);
        exitButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        startButtonPanel.add(continueButton);
        startButtonPanel.add(exitButton);



//        timer.start();
        con.add(startButtonPanel);
        con.add(titleNamePanel);

    }

//    Timer timer  = new Timer(1000, new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e){
//            char[] c = text.toCharArray();
//            int arrayNumber =c.length;
//            String addedCharacter ="";
//            String blank="";
//            addedCharacter =blank +c[index];
//            mainTextArea.append(addedCharacter);
//
//            index++;
//            soundCue++;
//            if (soundCue==2){
//                URL typeSoundURL = getClass().getResource(".//GuiGames//SingleClass//res//type.wav");
//                se.setURL(typeSoundURL);
//                se.play();
//                soundCue=0;
//
//            }
//            if (index == arrayNumber){
//                index=0;
//                timer.stop();
//            }
//
//        }
//    });
//    public void prepareText(){
//        index =0;
//        mainTextArea.setText("");
//        timer.start();
//    }


    public void createGameScreen(String status) {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50, 350, 430, 250);
        mainTextPanel.setBackground(Color.DARK_GRAY);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(50, 350, 430, 250);
        mainTextArea.setBackground(Color.DARK_GRAY);
        mainTextArea.setForeground(Color.LIGHT_GRAY);
        mainTextArea.setFont(mainFont);
        mainTextArea.setLineWrap(true);

        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(500, 110, 250, 200);
        choiceButtonPanel.setBackground(Color.DARK_GRAY);
        choiceButtonPanel.setLayout(new GridLayout(6, 1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.LIGHT_GRAY);
        choice1.setForeground(Color.white);
        choice1.setFont(mainFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(csHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.LIGHT_GRAY);
        choice2.setForeground(Color.white);
        choice2.setFont(mainFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(csHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.LIGHT_GRAY);
        choice3.setForeground(Color.white);
        choice3.setFont(mainFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(csHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.LIGHT_GRAY);
        choice4.setForeground(Color.white);
        choice4.setFont(mainFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(csHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        choice5 = new JButton("INVENTORY");
        choice5.setBackground(Color.DARK_GRAY);
        choice5.setForeground(Color.white);
        choice5.setFont(mainFont);
        choice5.setFocusPainted(false);
        choice5.addActionListener(inventoryHandler);
        choice5.setActionCommand("c5");
        choiceButtonPanel.add(choice5);

//        choice6 = new JButton("Choice 6");
//        choice6.setBackground(Color.LIGHT_GRAY);
//        choice6.setForeground(Color.white);
//        choice6.setFont(mainFont);
//        choice6.setFocusPainted(false);
//        choice6.addActionListener(csHandler);
//        choice6.setActionCommand("c6");
//        choiceButtonPanel.add(choice6);

        playerPanel = new JPanel();
        playerPanel.setBounds(500, 20, 270, 50);
        playerPanel.setBackground(Color.DARK_GRAY);
        playerPanel.setLayout(new GridLayout(2, 2));
        con.add(playerPanel);
        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(mainFont);
        hpLabel.setForeground(Color.LIGHT_GRAY);
        playerPanel.add(hpLabel);

        hpNumberLabel = new JLabel();
        hpNumberLabel.setFont(mainFont);
        hpNumberLabel.setForeground(Color.LIGHT_GRAY);
        playerPanel.add(hpNumberLabel);


        weaponLabel = new JLabel("WEAPON: ");
        weaponLabel.setFont(mainFont);
        weaponLabel.setForeground(Color.LIGHT_GRAY);
        playerPanel.add(weaponLabel);

        weaponNameLabel = new JLabel();
        weaponNameLabel.setFont(mainFont);
        weaponNameLabel.setForeground(Color.LIGHT_GRAY);
        playerPanel.add(weaponNameLabel);


        imagePanel = new JPanel();
        imagePanel.setBounds(50, 20, 410, 260);
        imagePanel.setBackground(Color.BLACK);

        imageLabel = new JLabel();

        image = new ImageIcon(".//GuiGames//SingleClass//res//gate.png");
        imageLabel.setIcon(image);

        imagePanel.add(imageLabel);


        healthBarPanel = new JPanel();
        healthBarPanel.setBounds(500,70,250,30);
        healthBarPanel.setBackground(Color.DARK_GRAY);

        healthBar = new JProgressBar(0,15);
        healthBar.setPreferredSize(new Dimension(200,30));
        healthBar.setBackground(Color.RED);
        healthBar.setForeground(Color.GREEN);

        healthBarPanel.add(healthBar);




        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(500,350,250,160);
        inventoryPanel.setBackground(Color.DARK_GRAY);
        inventoryPanel.setLayout(new GridLayout(4,1));

        item1 = new JButton();
        item1.setBackground(Color.DARK_GRAY);
        item1.setForeground(Color.WHITE);
        item1.setFont(mainFont);
        item1.setFocusPainted(false);
        item1.addActionListener(inventoryHandler);
        item1.setActionCommand("item1");
        inventoryPanel.add(item1);

        item2 = new JButton();
        item2.setBackground(Color.DARK_GRAY);
        item2.setForeground(Color.WHITE);
        item2.setFont(mainFont);
        item2.setFocusPainted(false);
        item2.addActionListener(inventoryHandler);
        item2.setActionCommand("item2");
        inventoryPanel.add(item2);

        item3 = new JButton();
        item3.setBackground(Color.DARK_GRAY);
        item3.setForeground(Color.WHITE);
        item3.setFont(mainFont);
        item3.setFocusPainted(false);
        item3.addActionListener(inventoryHandler);
        item3.setActionCommand("item3");
        inventoryPanel.add(item3);

        item4 = new JButton();
        item4.setBackground(Color.DARK_GRAY);
        item4.setForeground(Color.WHITE);
        item4.setFont(mainFont);
        item4.setFocusPainted(false);
        item4.addActionListener(inventoryHandler);
        item4.setActionCommand("item4");
        inventoryPanel.add(item4);

        inventoryPanel.setVisible(false);

        con.add(inventoryPanel);
        con.add(healthBarPanel);
        con.add(imagePanel);

        if (status.equals("start")){
            playerSetUp();
        }else if (status.equals("continue")){
            loadGame();
        }

    }




    public void playerSetUp() {
        playerHp = 15;
        monsterHp = 20;
        weapon = "Knife";
        weaponNameLabel.setText(weapon);
        hpNumberLabel.setText(playerHp + "");
        healthBar.setValue(playerHp);
        playerItems[0]=potion;
        playerItems[1]=orange;
        playerItems[2]=empty;
        playerItems[3]=empty;
        invStatus ="close";
        townGate();
    }

    public void loadGame(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(".//GuiGames//SingleClass//res//saveFile.txt"));
            playerHp=Integer.parseInt(br.readLine());
            weapon = br.readLine();
            monsterHp=Integer.parseInt(br.readLine());


            br.close();
        }catch (Exception e){

        }
        hpNumberLabel.setText(""+playerHp);
        weaponNameLabel.setText(weapon);
        healthBar.setValue(playerHp);
        townGate();
    }

    public void saveGame(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(".//GuiGames//SingleClass//res//saveFile.txt"));
               bw.write(""+ playerHp);
               bw.newLine();
               bw.write(weapon);
               bw.newLine();
               bw.write(monsterHp+"");

               bw.close();
        }catch (Exception e){

        }
        hpNumberLabel.setText(""+playerHp);
        weaponNameLabel.setText(weapon);
        healthBar.setValue(playerHp);
        townGate();
    }

    public void townGate() {
        image = new ImageIcon(".//GuiGames//SingleClass//res/gate.png");
        imageLabel.setIcon(image);

        position = "townGate";
        mainTextArea.setText("You are at the gate of the town. \nA guard standing in front of you. \n\nWhat do you want to do?");
//        text="You are at the gate of the town. \\nA guard standing in front of you. \\n\\nWhat do you want to do?";
//        prepareText();

        choice1.setText("Talk to the guard");
        choice2.setText("Attack to the guard");
        choice3.setText("Talk a Woman");
        choice4.setText("Leave");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void talkGuard() {
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello stranger. I have never seen your face.\nI'm sorry but we cannot let a stranger enter our town.");
//        text = "Guard: Hello stranger. I have never seen your face.\nI'm sorry but we cannot let a stranger enter our town.";
//        prepareText();
        choice1.setText("Return to the town gate");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void attackGuard() {
        position = "attackGuard";
        mainTextArea.setText("Guard: Hey don't be stupid\n\nThe guard fought back and hit you hard. You receive 3 damage.");
//        text ="Guard: Hey don't be stupid\n\nThe guard fought back and hit you hard. You receive 3 damage.";
//        prepareText();
        playerHp -=3;
        hpNumberLabel.setText("" + playerHp);
        healthBar.setValue(playerHp);
        choice1.setText("Return to the town gate");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void crossRoad() {
        image = new ImageIcon(".//GuiGames//SingleClass//res//crossRoad.jpg");
        imageLabel.setIcon(image);

        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad\n\nIf you go south you will back to the town.");
//        text ="You are at a crossroad\n\nIf you go south you will back to the town.";
//        prepareText();
        choice1.setText("Go South");
        choice2.setText("Go North");
        choice3.setText("Go West");
        choice4.setText("Go East");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void west() {
        image = new ImageIcon(".//GuiGames//SingleClass//res/monster.jpg");
        imageLabel.setIcon(image);
        position = "west";
        mainTextArea.setText("You encounter a goblin.");
//        text="You encountered a goblin.";
//        prepareText();
        hpNumberLabel.setText("" + playerHp);
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void east() {
        position = "east";
        mainTextArea.setText("There walked into a forest and found a Long Sword\n\nYou obtained Long Sword.");
//        text="There walked into a forest and found a Long Sword\\n\\nYou obtained Long Sword.";
//        prepareText();
        weapon = "Long Sword";
        weaponNameLabel.setText(weapon);
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void north() {
        position = "north";
        mainTextArea.setText("There is a river\nYou drink the water and rest at the riverside\n\nYour Hp is recovered by 2.");
//        text="There is a river\nYou drink the water and rest at the riverside\n\nYour Hp is recovered by 2.";
//        prepareText();
        playerHp = playerHp + 2;
        hpNumberLabel.setText("" + playerHp);
        choice1.setText("Go South");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void fight() {
        position = "fight";
        mainTextArea.setText("The monster Hp is " + monsterHp + "\nWhat do you want to do?");
//        text="The monster Hp is \" + monsterHp + \"\\nWhat do you want to do?";
//        prepareText();
        choice1.setText("Attack");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void attack() {
        position = "attack";
        int playerDamage = 0;
        if (weapon.equals("Knife")) {
            playerDamage = new Random().nextInt(3);
        } else if (weapon.equals("Long Sword")) {
            playerDamage = new Random().nextInt(7);
        }
        mainTextArea.setText("You attacked the monster and you gave " + playerDamage + " damage.");
//        text ="You attacked the monster and you gave " + playerDamage + " damage.";
//        prepareText();
        monsterHp = monsterHp - playerDamage;
        hpNumberLabel.setText("" + playerHp);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void monsterAttack() {
        position = "monsterAttack";
        int monsterDamage = 0;
        monsterDamage = new Random().nextInt(4);
        mainTextArea.setText("The monster attack to you and gave " + monsterDamage + " damage.");
//        text ="The monster attack to you and gave " + monsterDamage + " damage.";
        playerHp -=monsterDamage;
        if (playerHp < 1) {
            hpNumberLabel.setText("" + 0);
        } else {
            hpNumberLabel.setText("" + playerHp);
            healthBar.setValue(playerHp);
        }
        choice1.setText("Go West");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void win() {
        position = "win";
        mainTextArea.setText("You defeated the monster!\n\nYou obtained a Silver Ring.");
//        text ="You defeated the monster!\n\nYou obtained a Silver Ring.";
//        prepareText();
        silverRing = 1;
        choice1.setText("Go East");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
    }

    public void lose() {
        position = "lose";
//        mainTextArea.setText("You are DEAD!\n\n<<GAME OVER>>");
        text ="You are DEAD!\n\n<<GAME OVER>>";
//        prepareText();
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
//        choice6.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }


    public void ending() {
        mainTextArea.setText("Guard: Oh! you killed that Goblin\nYou are true hero\nWelcome to our town\n\n<<GAME OVER>>");
//        text="Guard: Oh! you killed that Goblin\nYou are true hero\nWelcome to our town\n\n<<GAME OVER>>";
//        prepareText();
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("INVENTORY");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void talkWoman(){
        position = "talkWoman";
        int slotNumber=0;
        while (playerItems[slotNumber]!=empty && slotNumber<4) {
            slotNumber++;
        }
            if (playerItems[slotNumber]==empty){
                mainTextArea.setText("Ohh! You seems to hungry, and you can take this orange");
                playerItems[slotNumber]=orange;
            }else if (playerItems[slotNumber] != empty){
                mainTextArea.setText("Your inventory seems full, so you cannot carry a new item.");
            }

        choice1.setText(">");
        choice2.setText("Save");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");

    }

    public class InventoryHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String yourChoice = event.getActionCommand();
            switch (yourChoice){
                case "c5":
                    if (invStatus.equals("close")){
                        choice1.setVisible(false);
                        choice2.setVisible(false);
                        choice3.setVisible(false);
                        choice4.setVisible(false);
                        inventoryPanel.setVisible(true);
                        item1.setText(playerItems[0].getName());
                        item2.setText(playerItems[1].getName());
                        item3.setText(playerItems[2].getName());
                        item4.setText(playerItems[3].getName());

                        invStatus="open";
                    }else if(invStatus.equals("open")){
                        choice1.setVisible(true);
                        choice2.setVisible(true);
                        choice3.setVisible(true);
                        choice4.setVisible(true);
                        inventoryPanel.setVisible(false);
                        invStatus="close";
                    }break;

                case "item1":
                    itemUsed(0);
                    break;
                case "item2":
                    itemUsed(1);
                    break;
                case "item3":
                    itemUsed(2);
                    break;
                case "item4":
                    itemUsed(3);
                    break;
            }
        }
    }

    public void itemUsed(int slotNumber){
        playerHp +=playerItems[slotNumber].getHealingValue();
        hpNumberLabel.setText(""+playerHp);
        healthBar.setValue(playerHp);

        playerItems[slotNumber]=empty;
        item1.setText(playerItems[0].getName());
        item1.setText(playerItems[1].getName());
        item1.setText(playerItems[2].getName());
        item1.setText(playerItems[3].getName());

    }

    public class DamageHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            monsterAttack();
        }
    }

    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            switch (yourChoice){
                case "start":
                    createGameScreen("start");
                    break;
                case "continue":
                    createGameScreen("continue");
                    break;
                case "quit":
                    System.exit(0);
                    break;
            }
        }
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            switch (position) {
                case "townGate":
                    switch (yourChoice) {
                        case "c1":
                            if (silverRing == 1) {
                                ending();
                            } else {
                                talkGuard();
                            }
                            break;
                        case "c2":
                            attackGuard();
                            break;
                        case "c3":
                            talkWoman();
                            break;
                        case "c4":
                            crossRoad();
                            break;

                    }
                    break;
                case "talkGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                        case "c2":
                        case "c3":
                        case "c4":
                            break;
                    }
                    break;
                case "talkWoman":
                    switch (yourChoice){
                        case "c1": townGate(); break;
                        case "c2": saveGame(); break;
                    }break;
                case "attackGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                        case "c2":
                            attackGuard();
                            break;
                        case "c3":
                        case "c4":
                    }
                    break;
                case "crossRoad":
                    switch (yourChoice) {
                        case "c1" -> townGate();
                        case "c2" -> north();
                        case "c3" -> west();
                        case "c4" -> east();
                    }
                    break;
                case "north":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                    }
                    break;
                case "east":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
                case "west":
                    switch (yourChoice) {
                        case "c1":
                            fight();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;
                case "fight":
                    switch (yourChoice) {
                        case "c1":
                            attack();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;
                case "attack":
                    switch (yourChoice) {
                        case "c1":
                            if (monsterHp < 1) {
                                win();
                            } else {
                                monsterAttack();
                            }
                            break;
                    }
                    break;
                case "monsterAttack":
                    switch (yourChoice) {
                        case "c1":
                            if (playerHp < 1) {
                                lose();
                            } else {
                                fight();
                            }
                            break;
                    }
                    break;

                case "win":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {

        new Game();
    }
}

