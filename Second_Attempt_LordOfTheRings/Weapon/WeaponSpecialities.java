package Second_Attempt_LordOfTheRings.Weapon;

public class WeaponSpecialities {
    private String weaponName;
    private int weaponDamage;

    public WeaponSpecialities(String aWeaponName, int aWeaponDamage) {
        this.weaponName = aWeaponName;
        this.weaponDamage = aWeaponDamage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public String toString() {
        return "WeaponSpecialities{" +
                "name='" + weaponName + '\'' +
                ", damage=" + weaponDamage +
                '}';
    }
}
