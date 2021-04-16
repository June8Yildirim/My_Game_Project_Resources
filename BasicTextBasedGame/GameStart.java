package BasicTextBasedGame;

import java.util.Arrays;
import java.util.Scanner;

public class GameStart {
    public static Scanner sc = new Scanner(System.in);
    public static Player player1 = new Player();
    public static Player player2 = new Player();
    public static Player currentPlayer = new Player();
    public static Word word = new Word();


    public void gameStart() {
        String tempWord = "";
        String turningPlayer = "";
        String secretWord = "";
        char guessingLetter = ' ';
        int playerChance;

        currentPlayer = player2;
        int secretWordLength;
        String name;
        char[] dashed;
        setPlayerName();


        dashed = new char[word.getWord().length()];
        currentPlayer.setChance(word.getWord().length()-1);


        secretWord = word.getWord();
        secretWordLength = secretWord.length();
        System.out.println(secretWord);


        for (int i = 0; i < secretWordLength; i++) {
            dashed[i] = '#';
        }
        playerChance = currentPlayer.getChance();
        while (playerChance >= 0) {
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            System.out.println("Current player is " + currentPlayer.getName());
            System.out.println(Arrays.toString(dashed));

            System.out.println("Type a letter..");
            guessingLetter = sc.next().charAt(0);
            int playerLevel=0;
            for (int i = 0; i < secretWordLength; i++) {
                if (guessingLetter == secretWord.charAt(i)) {
                    dashed[i] = guessingLetter;
                    currentPlayer.setXp(++playerLevel);
                }
            }
            System.out.println(Arrays.toString(dashed));
            System.out.println("Current xp of "+currentPlayer.getName()+" "+currentPlayer.getXp());
            System.out.println("Did you find secret word.(y)es or (n)o");
            char answer = sc.next().charAt(0);
            if (answer == 'y') {
                System.out.println("Type your guessing word.");
                tempWord = sc.next();
                if (tempWord.equals(secretWord)) {
                    System.out.println("Your guess is correct.");
                    currentPlayer.setLevel(++playerLevel);
                    break;
                }
            }


            playerChance--;
        }
    }


    public static void setPlayerName() {
        String playerName;
        int playerNumber = 0;
        System.out.println("How many player do you player.");
        playerNumber = Integer.parseInt(sc.nextLine());

        while (playerNumber > 0) {
            if (playerNumber < 2) {
                System.out.println("enter player name");
                playerName = sc.nextLine();
                player1.setName(playerName);
                playerNumber--;
            } else {
                System.out.println("Enter Player 1 name;");
                playerName = sc.nextLine();
                player1.setName(playerName);
                System.out.println("Enter Player 2 name;");
                playerName = sc.nextLine();
                player2.setName(playerName);
                playerNumber = 0;
            }

        }
    }
}

