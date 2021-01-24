package TextRpg;

public class Player extends Character {
    //integers to store of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    //additional player stats
    int gold, restLeft, pots;

    //Arrays to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};

    public Player(String name) {
        //calling constructor of superclass
        super(name, 100, 0);
// Setting # of upgrades to 0
        this.numDefUpgrades = 0;
        this.numAtkUpgrades = 0;
        //set additional stats
        this.gold=5;
        this.restLeft=1;
        this.pots=0;
        //let the playerchoice a trait when creating a new character
        choiceTrait();

    }


    public void choiceTrait() {
        GameLogic.clearConsole();
        GameLogic.printHeading("Choice Trait: ");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        // Get player choices
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();
        // Deal with the users choice's
        if (input == 1) {
            GameLogic.printHeading("You choice " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        } else {
            GameLogic.printHeading("You choice " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
    }


    //Player specific method
    @Override
    public int attack() {
        return (int)(Math.random()*(xp/4 + numAtkUpgrades*3+3)+xp/10+ numAtkUpgrades*2+ numDefUpgrades+1);
    }

    @Override
    public int defend() {
        return (int)(Math.random()*(xp/4 + numAtkUpgrades*3+3)+xp/10+ numAtkUpgrades*2+ numDefUpgrades+1);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
