package LordOfTheRingsGame.Villains;

public class VilliansSpecialities {
//    public enum VillainNameEnums {ANGMAR, GOBLIN, GOLLUM, NAZGUL, ORCH, SARUMAN, SAURON, URUKHAI}
    private String VillainName;
    private int VillainDamage;
    private int VillainPower;
    private int VillainLevel;



    public VilliansSpecialities(String aVillainName, int aVillainPower, int aVillainDamage, int aVillainLevel) {
        this.VillainName = aVillainName;
        this.VillainDamage = aVillainDamage;
        this.VillainPower= aVillainPower;
        this.VillainLevel = aVillainLevel;
    }

    public VilliansSpecialities( ) {
        this.VillainName = VillainName;
        this.VillainDamage = VillainDamage;
        this.VillainPower= VillainPower;
        this.VillainLevel = VillainLevel;
    }
    public String getVillainName() {
        return VillainName;
    }

    public int getVillainDamage() {
        return VillainDamage;
    }

    public int getVillainLevel() {
        return VillainLevel;
    }

    public void setVillainDamage(int villainDamage) {
        VillainDamage = villainDamage;
    }

    public int getVillainPower() {
        return VillainPower;
    }

    public void setVillainPower(int aVillainPower) {
        VillainPower = aVillainPower;
    }

    public void setVillainLevel(int aVillainLevel) {VillainLevel = aVillainLevel; }

    public  String getVillainDescription(String nameOfVillain) {
        String descriptionOfVillain = "";
        if ("goblin".equals(nameOfVillain)) {
            descriptionOfVillain="Goblin :";
        } else if ("gollum".equals(nameOfVillain)) {descriptionOfVillain="Gollum :";
        } else if ("orch".equals(nameOfVillain)) {descriptionOfVillain="Orch :";
        } else if ("urukhai".equals(nameOfVillain)) {descriptionOfVillain="Uruk-Hai : ";
        } else if ("sauron".equals(nameOfVillain)) {descriptionOfVillain="Sauron :";
        }
        return descriptionOfVillain;
    }
}
