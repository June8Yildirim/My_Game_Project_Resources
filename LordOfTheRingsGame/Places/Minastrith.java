package LordOfTheRingsGame.Places;

public class Minastrith extends Place {


    public Minastrith(placeOfMiddleEarthEnums type) {
        super(type);
    }

    @Override
    public String getDescription() {
        return "Minastrith is also name Gondor, " +
                "\nas the greatest realm of Men in the west of Middle-earth at the end of the Third Age." +
                "\n Gondor was founded by the brothers Isildur and Anárion, exiles from the downfallen island kingdom of Númenor. " +
                "\nAlong with Arnor in the north, Gondor, the South-kingdom, served as a last stronghold of the Men of the West. " +
                "\nAfter an early period of growth, Gondor gradually declined as the Third Age progressed, " +
                "\nbeing continually weakened by internal strife and conflict with the allies of the Dark Lord Sauron. " +
                "\nThe kingdom's ascendancy was restored only with Sauron's final defeat and the crowning of Aragorn";
    }
}
