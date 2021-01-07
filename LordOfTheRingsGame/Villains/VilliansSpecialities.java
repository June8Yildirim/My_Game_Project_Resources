package LordOfTheRingsGame.Villains;

public class VilliansSpecialities {
    public enum VillainNameEnums {ANGMAR, GOBLIN, GOLLUM, NAZGUL, ORCH, SARUMAN, SAURON, URUKHAI};
    private VillainNameEnums type;
    private String VillainName;
    private int VillainHp;
    private int VillainDamage;
    private int VillainLevel;

    public VilliansSpecialities(VillainNameEnums type) {
        this.VillainName = villainNameSetUp(type);
        this.VillainHp = villainHpSetUp(type);
        this.VillainDamage = villainDamageSetUp(type);
        this.VillainLevel = villainLevelSetUp(type);
        this.type=type;
    }

    public String getVillainName() {
        return VillainName;
    }

    public int getVillainHp() {
        return VillainHp;
    }

    public int getVillainDamage() {
        return VillainDamage;
    }

    public int getVillainLevel() {
        return VillainLevel;
    }

    public String villainNameSetUp(VillainNameEnums type) {
        String tempName="";
        switch (type){
            case GOLLUM -> tempName="Gollum";
            case ORCH -> tempName="Orch";
            case GOBLIN -> tempName="Goblin";
            case NAZGUL -> tempName="Nazgul";
            case URUKHAI -> tempName="Urukhai";
            case SARUMAN -> tempName="Saruman";

        }
        return tempName;
    }





    public String toString() {
        return "VilliansSpecialities{" +
                "VillainName='" + VillainName + '\'' +
                ", VillainHp=" + VillainHp +
                ", VillainDamage=" + VillainDamage +
                ", VillainLevel=" + VillainLevel +
                '}';
    }

    public String getVillainDescription(String nameOfVillain) {
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
