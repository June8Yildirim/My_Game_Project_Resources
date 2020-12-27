package RockPaperScissors;

import java.util.Scanner;

public class game {
    private final player player;
    private final player opponent;

    public game() {
        final int maxScore =5;
        player = new player();
        opponent = new player();
        gameAction(maxScore);
        displayResults(player.getWin(), opponent.getWin());
    }

    public void gameAction( int maxScore) {
        while (player.getWin() < maxScore && opponent.getWin() < maxScore) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Player choice for Rock (r), for  Scisor (s), for Paper (p) ");
            player.setDecision(sc.nextLine());
            System.out.println("Opponent choice for Rock (r), for  Scisor (s), for Paper (p) ");
            opponent.setDecision(sc.nextLine());
            if (opponent.getDecision().equals("r") && player.getDecision().equals("p") || opponent.getDecision().equals("p") && player.getDecision().equals("s") || opponent.getDecision().equals("p") && player.getDecision().equals("r")) {
                player.setWin(2);
                System.out.println("player won this round, and got " + player.getWin()+" points");
            } else if (opponent.getDecision().equals("r") && player.getDecision().equals("s") || opponent.getDecision().equals("s") && player.getDecision().equals("p") || opponent.getDecision().equals("s") && player.getDecision().equals("r")) {
                opponent.setWin(2);
                System.out.println("opponent  won this round got " + opponent.getWin()+" points");
            } else {
                System.out.println("Tie game ");
                player.setWin(1);
                opponent.setWin(1);
            }
        }
    }

    public void displayResults(int userWin, int compWin) {
        System.out.println("Results.....:");
        System.out.println("User win " + userWin);
        System.out.println("comp win " + compWin);
        System.out.println("tied ");
        if (userWin > compWin) {
            System.out.println("You have beaten your opponent");
        } else if (userWin < compWin) {
            System.out.println("Opponent has won");
        } else {
            System.out.println("Tied");
        }
    }
}
