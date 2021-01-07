package LordOfTheRingsGame.Weapon;

public class WeaponSpecialities {
    private String name;
    private double damage;

    public WeaponSpecialities(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    public String toString() {
        return "WeaponSpecialities{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
