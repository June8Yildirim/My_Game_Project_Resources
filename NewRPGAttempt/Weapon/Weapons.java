package NewRPGAttempt.Weapon;

public class Weapons {
    private String Name;
    private int Damage;
    private String desc;

    public enum WeaponName {NARSIL, STING, KNIFE, ORCRIST, ELFBOW, AXE, GLAMDRING, GANDALFSTAFF, ONERING, ELRONDSRING,}



    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getName() {
        return Name;
    }

    public Weapons(WeaponName type, String name, int damage) {
        this.Damage = damage;
        this.desc = getWeaponDesc(name);
        this.Name=name;
    }

    public  String getWeaponDesc(String name) {
        String tempWeaponDesc = "";
        switch (name) {
            case "Axe" -> tempWeaponDesc = "";
            case "Knife" -> tempWeaponDesc = "";
            case "Sting" -> tempWeaponDesc = "";
            case "Elfbow" -> tempWeaponDesc = "";
            case "Narsil" -> tempWeaponDesc = "";
            case "Onering" -> tempWeaponDesc = "";
            case "Orchrist"-> tempWeaponDesc = "";
            case "Glamdring" -> tempWeaponDesc = "";
            case "EldondsRing" -> tempWeaponDesc = "";
            case "GandalgsStaff" -> tempWeaponDesc = "";
        }
        return tempWeaponDesc;
    }
}
