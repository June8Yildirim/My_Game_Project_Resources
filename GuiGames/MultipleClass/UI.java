package GuiGames.MultipleClass;

import javax.swing.*;
import java.awt.*;
import GuiGames.MultipleClass.Game.ChoiceHandler;
import GuiGames.SingleClass.SuperItems.Empty;
import GuiGames.SingleClass.SuperItems.Orange;
import GuiGames.SingleClass.SuperItems.Potion;
import GuiGames.SingleClass.SuperItems.SuperItems;

public class UI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel , choiceButtonPanel, playerPanel,imagePanel, inventoryPanel, healthBarPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponNameLabel, imageLabel;
    JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6, item1, item2, item3, item4, continueButton,exitButton;
    JTextArea mainTextArea;
    JProgressBar healthBar;
    ImageIcon image;
    String invStatus, status;
    Font mainFont = new Font("Verdana", Font.PLAIN, 20);
    Font buttonFont = new Font("Verdana", Font.PLAIN, 20);
    Font titleFont = new Font("Verdana", Font.PLAIN, 80);



    SuperItems[] playerItems = new SuperItems[5];
    Potion potion = new Potion();
    Orange orange = new Orange();
    Empty empty = new Empty();

    public void createUI(ChoiceHandler chandler) {

        //Create Java window
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        //Create Java titles
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 100);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 130);
        startButtonPanel.setBackground(Color.BLACK);


        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.white);
        startButton.setFont(buttonFont);
        startButton.addActionListener(chandler);
        startButton.setActionCommand("start");
        startButton.setFocusPainted(false);
        startButton.setBorder(null);
        startButtonPanel.add(startButton);

        continueButton = new JButton("CONTINUE");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(buttonFont);
        continueButton.addActionListener(chandler);
        continueButton.setActionCommand("continue");
        continueButton.setFocusPainted(false);
        continueButton.setBorder(null);

        exitButton = new JButton("QUIT");
        exitButton.setBackground(Color.black);
        exitButton.setForeground(Color.white);
        exitButton.setFont(buttonFont);
        exitButton.addActionListener(chandler);
        exitButton.setActionCommand("quit");
        exitButton.setBorder(null);
        exitButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);

        startButtonPanel.add(startButton);
        startButtonPanel.add(continueButton);
        startButtonPanel.add(exitButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //Create Game Screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50,350,430,250);
        mainTextPanel.setBackground(Color.BLACK);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(50,350,430,250);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setFont(mainFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setEditable(false);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);


        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(500,110,250,200);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(6,1));
        window.add(choiceButtonPanel);


        choice1 = new JButton("choice1");
        choice1.setForeground(Color.white);
        choice1.setBackground(Color.BLACK);
        choice1.setFocusPainted(false);
        choice1.setFont(mainFont);
        choice1.addActionListener(chandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice2");
        choice2.setForeground(Color.white);
        choice2.setBackground(Color.BLACK);
        choice2.setFocusPainted(false);
        choice2.setFont(mainFont);
        choice2.addActionListener(chandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice3");
        choice3.setForeground(Color.white);
        choice3.setBackground(Color.BLACK);
        choice3.setFocusPainted(false);
        choice3.setFont(mainFont);
        choice3.addActionListener(chandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice4");
        choice4.setForeground(Color.white);
        choice4.setBackground(Color.BLACK);
        choice4.setFocusPainted(false);
        choice4.setFont(mainFont);
        choice4.addActionListener(chandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        choice5 = new JButton("INVENTORY");
        choice5.setBackground(Color.DARK_GRAY);
        choice5.setForeground(Color.white);
        choice5.setFont(mainFont);
        choice5.setFocusPainted(false);
        choice5.addActionListener(chandler);
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
        playerPanel.setBounds(500,20,270,50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setForeground(Color.white);
        playerPanel.setLayout(new GridLayout(2,2));
        window.add(playerPanel);

        hpLabel = new JLabel("HP");
        hpLabel.setFont(mainFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setForeground(Color.white);
        hpLabelNumber.setFont(mainFont);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("WEAPON");
        weaponLabel.setFont(mainFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);

        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(mainFont);
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

        healthBar = new JProgressBar(0, 15);
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
        item1.addActionListener(chandler);
        item1.setActionCommand("item1");
        inventoryPanel.add(item1);

        item2 = new JButton();
        item2.setBackground(Color.DARK_GRAY);
        item2.setForeground(Color.WHITE);
        item2.setFont(mainFont);
        item2.setFocusPainted(false);
        item2.addActionListener(chandler);
        item2.setActionCommand("item2");
        inventoryPanel.add(item2);

        item3 = new JButton();
        item3.setBackground(Color.DARK_GRAY);
        item3.setForeground(Color.WHITE);
        item3.setFont(mainFont);
        item3.setFocusPainted(false);
        item3.addActionListener(chandler);
        item3.setActionCommand("item3");
        inventoryPanel.add(item3);

        item4 = new JButton();
        item4.setBackground(Color.DARK_GRAY);
        item4.setForeground(Color.WHITE);
        item4.setFont(mainFont);
        item4.setFocusPainted(false);
        item4.addActionListener(chandler);
        item4.setActionCommand("item4");
        inventoryPanel.add(item4);

        inventoryPanel.setVisible(false);

        window.add(inventoryPanel);
        window.add(healthBarPanel);
        window.add(imagePanel);



        window.setVisible(true);

    }
}
