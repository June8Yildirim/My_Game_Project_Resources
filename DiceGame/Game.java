package DiceGame;

public class Game {
    private Player player;
    private Player opponent;
    private static int numOfGames;
    private static int tied;

    public Game(int games) {
        player = new Player();
        opponent = new Player();
        numOfGames = games;
        tied = 0;
        play();
        displayResults(player.getWin(), opponent.getWin());
    }

    public void play() {
        for (int i = 0; i < numOfGames; i++) {
            player.roll();
            opponent.roll();
            if (player.getRoll() > opponent.getRoll()) {
                player.setWin();
            } else if (player.getRoll() < opponent.getRoll()) {
                opponent.setWin();
            } else {
                tied++;
            }
        }
    }

    public void displayResults(int userWin, int compWin) {
        System.out.println("Results.....:");
        System.out.println("User wint " + userWin);
        System.out.println("comp win " + compWin);
        System.out.println("tied " + tied);
        if (userWin > compWin) {
            System.out.println("You have beaten your opponent");
        } else if (userWin < compWin) {
            System.out.println("Computer has won");
        } else {
            System.out.println("Tied");
        }
    }
}
