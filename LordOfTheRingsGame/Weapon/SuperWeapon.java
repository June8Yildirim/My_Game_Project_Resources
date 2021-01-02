package LordOfTheRingsGame.Weapon;

public class SuperWeapon {
    private String name;
    private int damage;

    public SuperWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public String currentWeapon(){
        return "Your weapon's name is : " +name +"\nand damage potential is : "+damage;
    }
}
