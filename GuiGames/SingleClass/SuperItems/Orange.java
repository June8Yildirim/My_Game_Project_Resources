package GuiGames.SingleClass.SuperItems;

public class Orange extends SuperItems {
    private String name;
    private int healingValue;
    public Orange() {
       this.name = "Orange";
        this.healingValue = -2;
    }

    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}

