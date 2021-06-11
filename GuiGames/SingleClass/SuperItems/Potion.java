package GuiGames.SingleClass.SuperItems;

public class Potion extends SuperItems {
    private String name;
    private int healingValue;
        public Potion() {
        this.name = "Potion";
        this.healingValue = 10;
    }


    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}