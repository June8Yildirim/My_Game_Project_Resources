package GuiGames.MultipleClass.SuperItems;

public class Empty extends SuperItems {
    private String name;
    private int healingValue;
    public Empty(){
        this.name="";
        this.healingValue=0;
    }

    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}