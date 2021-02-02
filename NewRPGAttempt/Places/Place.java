package NewRPGAttempt.Places;

public class Place {
    private String desc;
    private placeName type;
    private int difficulties;
    private String Name;
    private placeName[] GetConnected;

    public enum placeName {MORIA, HELMSDEEP, ISENGARD, RIVENDELL, MINASTRITH, SHIRE}


    public Place(placeName type,String name, int difficulties) {
        this.desc = getPlaceDescription(name);
        this.difficulties = difficulties;
        this.GetConnected = moveConnected(type);
        this.Name = name;
        this.type = type;
    }
    public Place(placeName type) {

    }

    public placeName getType() {
        return type;
    }

    public String getName() {
        return Name;
    }


    public int getDifficulties() {
        return difficulties;
    }

    public placeName[] findConnection() {
        return GetConnected;
    }

    public placeName[] moveConnected(placeName type) {
        placeName[] tempPlace = null;
        switch (type) {
            case SHIRE:
                tempPlace = new placeName[]{placeName.MORIA};
                break;
            case MORIA:
                tempPlace = new placeName[]{placeName.ISENGARD, placeName.SHIRE, placeName.HELMSDEEP};
                break;
            case ISENGARD:
                tempPlace = new Place.placeName[]{placeName.HELMSDEEP, placeName.MORIA};
                break;
            case HELMSDEEP:
                tempPlace = new placeName[]{placeName.ISENGARD, placeName.MINASTRITH};
                break;
            case MINASTRITH:
                tempPlace = new placeName[]{placeName.HELMSDEEP};
                break;
        }

        return tempPlace;
    }

    public  String getPlaceDescription(String name) {
        String tempPlaceDesc = "";
        switch (name) {
            case "Minastrith" -> tempPlaceDesc = "The Southern counterpart to Arnor. Gondor was ruled by Elendil and his two sons until the War of the Last Alliance, when Elendil and Anarion were killed and Isildur became the high king of both kingdoms. The kingship lasted until the year 2050 of the Third Age, when the last king rode out to meet the challenge of the Witch-King of Angmar and was never seen again. After this stewards ruled until Aragorn took back the kingship of both Arnor and Gondor. Gondor had three main cities and several smaller ones. The main cities were Minas Anor (Minas Tirith), Minas Ithil (Minas Morgul), and Osgiliath.";
            case "Rivendell" -> tempPlaceDesc = "Imladris, known to men as Rivendell, is Elrond Halfelven's refuge in the western reaches of the Misty Mountains. Bilbo Baggins visits during the Quest of Erebor (2941), and later takes up residence there. In 3018 Frodo Baggins reaches Rivendell with the One Ring and the council of Elrond creates the Fellowship of the Ring.";
            case "Isengard" -> tempPlaceDesc = "An extremely defensible fortress in Rohan built by the Númenoreans ages before the War of the Ring takes place. Saruman took up residence there at the invitation of the king of Rohan. He fortified it further and built an army of orcs. From Orthanc, Isengard's 500-foot-tall tower of unbreakable stone, Saruman seeks the One Ring for himself.";
            case "Moria" -> tempPlaceDesc = "Khazad-dûm lies deep in the center of the Misty Mountains and was the stronghold of Durin, eldest of the Seven Fathers of the Dwarves. After the destruction of Beleriand many dwarves emigrated to Khazad-dûm, making it the greatest of dwarven cities. The dwarves of Khazad-dûm found enthusiastic trading partners and fellow craftspeople in the elven smiths of Eregion, and they shared the longest peaceful relationship between the two races. Khazad-dûm was also the only place where the rare metal mithril could be found, but in mining mithril, the dwarves accidentally freed the balrog. The dwarves fled Khazad-dûm and hence forth it was known as Moria, the \"Black Chasm.\"";
            case "Shire" -> tempPlaceDesc = "Located in the northwest of Middle-earth, the Shire is a loosely organized territory in which most of Middle-earth's hobbits live. It is a bucolic, agricultural land that has seen little of the evil growing to the east. The Baggins family home of Bag End is in Hobbiton, a large town in the western farthing, or district, of the Shire.";
            case "HelmsDeep" -> tempPlaceDesc = "When he learns of Saruman's intentions of destroying Rohan, King Théoden decides to evacuate Edoras and move his people to Helm's Deep. While on the move, a pack of Wargs attack, but are driven off. At Helm's Deep, Théoden finds that many of his men are too old or too young, but he is still confident that the hold cannot be overrun since it has never fallen. Hopes are bolstered by the arrival of Haldir and a force of Elves." +
                    "\nSoon, a huge force of Saruman's Uruk-hai arrive and surround the hold. The attack begins and the hold stands until a hole is blasted in the Deeping Wall. Outlying positions are overrun and Haldir is killed. King Théoden orders that they fall back into the fortress itself. He begins to despair, but Aragorn suggests one last charge out of the Hornburg. As they charge out, Gandalf arrives with Éomer and a force of Rohirrim.";
        }
        return tempPlaceDesc;
    }
}
