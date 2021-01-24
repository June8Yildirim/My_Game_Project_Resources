package NewRPGAttempt.Places;

public class Place {
    private String desc;
    private placeName type;
    private int difficulties;
    private String Name;
    private placeName[] GetConnected;

    public enum placeName {MORIA, HELMSDEEP, ISENGARD, RIVENDELL, MINASTRITH, SHIRE}


    public Place(placeName type,String name, int difficulties) {
        this.desc = getPlaceDesc(name);
        this.difficulties = difficulties;
        this.GetConnected = moveConnected(type);
        this.Name = name;
        this.type = type;
    }

    public placeName getType() {
        return type;
    }

    public String getName() {
        return Name;
    }

    public placeName[] getGetConnected() {
        return GetConnected;
    }



    public int getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(int difficulties) {
        this.difficulties = difficulties;
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

    public  String getPlaceDesc(String name) {
        String tempPlaceDesc = "";
        switch (name) {
            case "Minastrith" -> tempPlaceDesc = "";
            case "Rivendell" -> tempPlaceDesc = "";
            case "Isengard" -> tempPlaceDesc = "";
            case "Moria" -> tempPlaceDesc = "";
            case "Shire" -> tempPlaceDesc = "";
            case "HelmsDeep" -> tempPlaceDesc = "";
        }
        return tempPlaceDesc;
    }
}
