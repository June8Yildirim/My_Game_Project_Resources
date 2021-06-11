package GuiGames.GuiAdventureGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game {
    JFrame window;
    Container container;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, picturePanel;
    JLabel titleNameLabel, hpLevel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Verdana", Font.BOLD, 40);
    Font normalText = new Font("Verdana", Font.PLAIN, 20);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHP, silverRing;
    int monsterHP;
    String weapon, position;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 400, 60);
        titleNamePanel.setBackground(Color.LIGHT_GRAY);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 80);
        startButtonPanel.setBackground(Color.DARK_GRAY);

        startButton = new JButton("START");
        startButton.setBackground(Color.ORANGE);
        startButton.setForeground(Color.white);
        startButton.setFont(normalText);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);


        container.add(titleNamePanel);
        container.add(startButtonPanel);


    }

    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.ORANGE);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.ORANGE);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalText);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.DARK_GRAY);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        container.add(choiceButtonPanel);


        choice1 = new JButton("choice 1");
        choice1.setBackground(Color.LIGHT_GRAY);
        choice1.setForeground(Color.white);
        choice1.setFont(normalText);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice 2");
        choice2.setBackground(Color.LIGHT_GRAY);
        choice2.setForeground(Color.white);
        choice2.setFont(normalText);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice 3");
        choice3.setBackground(Color.LIGHT_GRAY);
        choice3.setForeground(Color.white);
        choice3.setFont(normalText);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice 4");
        choice4.setBackground(Color.LIGHT_GRAY);
        choice4.setForeground(Color.white);
        choice4.setFont(normalText);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.CYAN);
        playerPanel.setLayout(new GridLayout(1, 4));
        container.add(playerPanel);

        hpLevel = new JLabel("HP :");
        hpLevel.setFont(normalText);
        hpLevel.setForeground(Color.white);
        playerPanel.add(hpLevel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalText);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon :");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(normalText);
        playerPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalText);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerSetup();
    }

    public void playerSetup() {
        playerHP = 15;
        monsterHP = 20;
        weapon = "Knife";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        townGate();
    }

    public void townGate() {
        position = "townGate";
        System.out.println("current " + position);
        mainTextArea.setText("You are at the gate of the town.\n" +
                "A guard is standing front of you.\n\n" +
                "What do you want to do?");

        choice1.setText("Talk to the guard");
        choice2.setText("Attack to the guard.");
        choice3.setText("Leave");
        choice4.setText("");

    }

    public void talkGuard() {
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello Stranger. I have seen you here.\n\n" +
                "I'm sorry but we cannot let a stranger enter our town");
        choice1.setText("Back");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }


    public void attackGuard() {
        position = "attackGuard";
        mainTextArea.setText("Hey don't be stupid\n\n" +
                "The guard fought back and hit you hard\n(you receive 3 damage");
        playerHP -= 3;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Back");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void crossRoad() {
        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad\nIf you go South, you will go back to the town");
        choice1.setText("Go South");
        choice2.setText("Go North");
        choice3.setText("Go East");
        choice4.setText("Go West");
    }

    public void north() {
        position = "north";
        mainTextArea.setText("There is a river. You drink the water at the riverside. (Your HP is recovered by:2)");
        playerHP += 2;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Go South");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void west() {
        position = "west";
        mainTextArea.setText("You encounter a goblin!");
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
    }

    public void east() {
        position = "east";
        mainTextArea.setText("You walked into a forest and found a Long Sword!\n(You obtained a Long Sword");
        weapon = "Long Sword";
        weaponLabelName.setText(weapon);
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void fight() {
        position = "fight";
        mainTextArea.setText("Monster HP :" + monsterHP + "\n\nWhat do yo do?");
        choice1.setText("Attack");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");

    }

    public void attack() {
        position = "attack";
        int playerDamage = 0;

        if (weapon.equals("Knife")) {
            playerDamage = new Random().nextInt(3);
        } else if (weapon.equals("Long Sword")) {
            playerDamage = new Random().nextInt(10);
        }
        mainTextArea.setText("You attacked the monster and gave " + playerDamage + " damage!");
        monsterHP -= playerDamage;
        choice1.setText("Monster attack");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void monsterAttack() {
        position = "monsterAttack";
        int monsterDamage = 0;
        monsterDamage = new Random().nextInt(6);
        mainTextArea.setText("Monster attacked to you and gave " + monsterDamage + " damage");
        playerHP -= monsterDamage;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Attack");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
    }

    public void win() {
        position = "win";
        mainTextArea.setText("You defeated monster\nYou obtained a Silver Ring.");
        silverRing++;
        choice1.setText("Go east");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void lose() {
        position = "lose";
        mainTextArea.setText("You are dead!\n ####GAME OVER####");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void ending(){
        position="ending";
        mainTextArea.setText("Guard: you killed that goblin!? wellcome to our town.");
    }

    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            System.out.println(yourChoice);
            System.out.println(position + " before");
            switch (position) {
                case "townGate":
                    System.out.println(position + " after");
                    System.out.println(yourChoice);
                    switch (yourChoice) {
                        case "c1" -> {
                            if (silverRing >1) {
                                ending();
                            }else {
                                talkGuard();
                            }
                        }

                        case "c2" -> attackGuard();
                        case "c3" -> crossRoad();
                    }
                    break;
                case "talkGuard":
                    switch (yourChoice) {
                        case "c1" -> townGate();
                    }
                    break;
                case "attackGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                    }
                    break;
                case "crossRoad":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                        case "c2":
                            north();
                            break;
                        case "c3":
                            east();
                            break;
                        case "c4":
                            west();
                            break;
                    }
                    break;
                case "north":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
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
                            if (monsterHP < 1) {
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
                            if (playerHP < 1) {
                                lose();
                            } else {
                                fight();
                            }
                            break;
                        case "c2":
                            townGate();
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
}