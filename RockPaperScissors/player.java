package RockPaperScissors;

import java.util.Scanner;

public class player {
    private String decision;
    private int win;
    private int score;

    public player() {
        this.decision = "";
        this.win = 0;
        this.score=0;
    }

    public int getWin() {
        return this.win;
    }

    public void setWin(int win) {
        this.win = this.win + win;
    }

    public String getDecision() {
        return this.decision;
    }

    public String setDecision(String decision) {
//        do {
//            System.out.println("Ple");
//        } while (!this.decision.equals("r") && !this.decision.equals("p") && !this.decision.equals("s"));
        return this.decision = decision;
    }
}
