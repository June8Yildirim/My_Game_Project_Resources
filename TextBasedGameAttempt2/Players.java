package TextBasedGameAttempt2;

import java.util.Scanner;

class Player {
    enum heros {ARAGORN, FRODO, GIMLI, LEGOLAS, GANDALF}

    public static PlayerSpec playerSpec;
    public Scanner scanner = new Scanner(System.in);

    public static void playerSetUpName(String name) {
        switch (name) {
            case "aragorn" -> {
                playerSpec = new PlayerSpec("Aragorn", 60, 30);
            }
            case "frodo" -> {
                playerSpec = new PlayerSpec("Frodo", 30, 10);
            }
            case "gimli" -> {
                playerSpec = new PlayerSpec("Gimli", 45, 25);
            }
            case "legolas" -> {
                playerSpec = new PlayerSpec("Legolas", 50, 30);
            }
            case "gandalf" -> {
                playerSpec = new PlayerSpec("Gandalf", 80, 40);
            }
        }

    }

    public static String getplayerName() {
        return playerSpec.getName();
    }

    public static int getplayerXp(String name) {
        return playerSpec.getXp();
    }

    public static int getplayerDamage() {
        return playerSpec.getDamage();
    }

    public void turnPlayer() {
        System.out.println("How many player will play?");
        int playerNumber = scanner.nextInt();
        for (int i = 0; i < playerNumber; i++) {
            PlayerSpec players = new PlayerSpec();
        }
        playerSpec = new PlayerSpec();
    }
}
