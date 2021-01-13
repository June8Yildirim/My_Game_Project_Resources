package TextBasedGameAttempt2;

public class test {
    public static void main(String[] args) {
        Player player = new Player();
        Player.playerSetUpName("aragorn");
        Player.getplayerName("aragorn");
        Player currentPlayer = player;
        String name = "aragorn";
        currentPlayer.getplayerDamage(name);
        currentPlayer.getplayerXp(name);
    }
}
