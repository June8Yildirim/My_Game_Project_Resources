package TextBasedGameAttempt2;

public class test {
    public static void main(String[] args) {
        Player player = new Player();
        player.playerSetUpName("aragorn");
        System.out.println(player.getplayerName());
        Player currentPlayer = player;
        String name = Player.heros.LEGOLAS.toString();
        System.out.println(name);
        System.out.println(currentPlayer.getplayerDamage());
        System.out.println(currentPlayer.getplayerXp("gimli"));


    }
}
