package Second_Attempt_LordOfTheRings.Villain;

public class Villain {
    public static VilliansSpecialities villainList;

    public void setVillains(String name) {
        switch (name) {
            case "angmar":
                villainList = new VilliansSpecialities("Angmar", 110, 30, 1);
                break;
            case "goblin":
                villainList = new VilliansSpecialities("Goblin", 50, 12, 1);
                break;
            case "gollum":
                villainList = new VilliansSpecialities("Gollum", 60, 7, 1);
                break;
            case "nazgul":
                villainList = new VilliansSpecialities("Nazgul", 100, 40, 1);
                break;
            case "orch":
                villainList = new VilliansSpecialities("Orch", 30, 9, 1);
                break;
            case "sauron":
                villainList = new VilliansSpecialities("Sauron", 120, 50, 1);
                break;
            case "saruman":
                villainList = new VilliansSpecialities("Saruman", 110, 35, 1);
                break;
            case "urukhai":
                villainList = new VilliansSpecialities("Urukhai", 80, 15, 1);
                break;
        }
        System.out.println("A villain appear in front of you, and name is " + name);
    }

    public String getVillainNameString() {
        return villainList.getVillainName();
    }
    public  void getVillainName() { System.out.println("Your villain's name is " + villainList.getVillainName());}
    public int getVillainDamageInt() {
        return villainList.getVillainDamage();
    }
    public int getVillainLevelInt() {
        return villainList.getVillainLevel();
    }
    public int getVillainPower() {
        return villainList.getVillainPower();
    }
    public void setVillainPower(int newPower) { villainList.setVillainPower(newPower); }

    public static String VillainDescription(String playerName) {
        String descriptionOfVillains = "";
        if ("Aragorn".equals(playerName)) {
            descriptionOfVillains = "Aragorn :";
        } else if ("Legolas".equals(playerName)) {
            descriptionOfVillains = "Legolas :";
        } else if ("Frodo".equals(playerName)) {
            descriptionOfVillains = "Frodo :";
        } else if ("Gandlalf".equals(playerName)) {
            descriptionOfVillains = "Gandalf: ";
        } else if ("Gimli".equals(playerName)) {
            descriptionOfVillains = "Gimli :";
        }
        return descriptionOfVillains;
    }

    public String villainInfo() {
        return "Villians Specialities\n" +
                "Villain Name= " + villainList.getVillainName() + "\n" +
                "Villain Power= " + villainList.getVillainPower() + "\n" +
                "Villain Damage= " + villainList.getVillainDamage() + "\n" +
                "Villain Level= " + villainList.getVillainLevel();
    }

}
