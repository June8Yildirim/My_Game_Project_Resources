package LordOfTheRingsGame.Places;

public class HelmsDeep extends Place {

    public HelmsDeep(placeOfMiddleEarthEnums type) {
        super(type);
    }

    @Override
    public String getDescription() {
        return "Helm's Deep was a valley in the north-western White Mountains of Middle-earth." +
                "\n Helm's Deep, with its fortress the Hornburg," +
                "\n becomes the refuge of some of the army of Rohan, " +
                "\nthe Rohirrim, under King Théoden, from assault by the forces of Saruman. " +
                "\nAlthough Théoden says that 'the Hornburg has never fallen to assault,' " +
                "\nin the battle a massive army of Uruk-hai and Dunlendings sent " +
                "\nby Saruman almost overwhelms the defences.";
    }
}
