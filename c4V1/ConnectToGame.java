package c4V1;

import java.util.Random;
import java.util.Scanner;

public class ConnectToGame {
    private Board board;
    private String color1;
    private String color2;


    private boolean is1playing;

    public ConnectToGame(String color1, String color2) {
        this.board = board;
        this.color1 = color1;
        this.color2 = color2;
        this.is1playing = (new Random().nextBoolean());
    }

    public boolean checkForWinners(int column) {

        String winningColor = is1playing ? color1 : color2;

        return board.checkForWinner(column, winningColor);
    }

    public void startGame() {
        boolean running = true;
        while (running) {
            board.printBoard();
            String color;
            if (is1playing) {
                color = color1;
                System.out.println("Player 1 turn");
            } else {
                color = color2;
                System.out.println("Player 2 turn ");
            }

            System.out.println("Please select which column you want to put your piece in.");
            System.out.println("choose between 1 and " + board.getColumns() + " :");
            Scanner scanner = new Scanner(System.in);
            int column = scanner.nextInt() - 1;

            boolean success = board.addPiece(column, color);
            if (success) {
                if (checkForWinners(column)) {
                    running = false;
                    if (is1playing) {
                        System.out.println("Player 1 won");
                    } else {
                        System.out.println("Player 2 won");
                    }
                }
                is1playing = !is1playing;
            }

        }


    }
}
