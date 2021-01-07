package LordOfTheRingsGame.Places;

public class Shire extends Place {

    public Shire(placeOfMiddleEarthEnums type) {
        super(type);
    }

    @Override
    public String getDescription() {
        return "The Shire was the homeland of the majority of the hobbits in Middle-earth. " +
                "\nIt was located in the northwestern portion of Middle-earth, " +
                "\nin the northern region of Eriador, within the remains of the Kingdom of Arnor." +
                "\nThe Shire was a part of Arthedain and as such a part of Arnor. " +
                "\nThe hobbits were granted official permission from King Argeleb II at Norbury to settle in the Shire, " +
                "\nwhich was not populated at the time, and was seen as the King's hunting grounds. " +
                "\nThe hobbits considered themselves to be subjects of the King, and sent some support " +
                "\ntroops to the great battles Arnor fought against The Witch-king of Angmar.";
    }
}
