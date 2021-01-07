package LordOfTheRingsGame.Places;

public class Moria extends Place{

    public Moria(placeOfMiddleEarthEnums type) {
        super(type);
    }

    @Override
    public String getDescription() {
        return "Moria, also named Khazad-dum, comprising a vast labyrinthine network of tunnels, chambers," +
                "\n mines and halls under the Misty Mountains," +
                "\n with doors on both the western and the eastern sides of the mountain range." +
                "\nMoria was the greatest city of the Dwarves. The city's wealth was founded on its mines," +
                "\n which produced mithril, a fictional metal of great beauty and strength," +
                "\n suitable for armour. The Dwarves dug too deep, greedy for mithril," +
                "\n and disturbed a demon of great power:" +
                "\n a Balrog, which destroyed their kingdom. " +
                "\nBy the end of the Third Age, Moria had long been abandoned by the Dwarves," +
                "\n and was a place of evil repute. It was dark, in dangerous disrepair," +
                "\n and in its labyrinths lurked Orcs and the Balrog.  ";
    }
}
