package GuiGames.MultipleClass;

public class VisibilityManager {
    UI ui;

    public VisibilityManager(UI userInterFace) {
        ui = userInterFace;
    }

    public void showTitleScreen() {
        //Show title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //Hide game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        ui.imagePanel.setVisible(false);
        ui.healthBarPanel.setVisible(false);

    }

    public void titleToTown() {
        //Hide the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //show game screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
        ui.imagePanel.setVisible(true);
        ui.healthBarPanel.setVisible(true);
    }
    public void hideInventory(){
        //hide screen
        ui.inventoryPanel.setVisible(true);
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.item1.setText(ui.playerItems[0].getName());
        ui.item2.setText(ui.playerItems[1].getName());
        ui.item3.setText(ui.playerItems[2].getName());
        ui.item4.setText(ui.playerItems[3].getName());
        ui.invStatus ="open";
    }
    public void showInventory(){
        //show screen
        ui.inventoryPanel.setVisible(false);
        ui.choice1.setVisible(true);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.invStatus ="close";
    }

}
