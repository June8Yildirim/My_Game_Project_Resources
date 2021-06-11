package GuiGames.MultipleClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    UI ui = new UI();
    ChoiceHandler cHandler = new ChoiceHandler();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4,nextPosition5,nextPosition6;

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        ui.createUI(cHandler);
        story.defaultSetUp();
        vm.showTitleScreen();


    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            switch (yourChoice) {
                case "start": vm.titleToTown();  story.townGate();      break;
                case "continue": vm.titleToTown(); story.loadGame();  break;
                case "quit": System.exit(0);
                case "c1":  story.selectNextPosition(nextPosition1); break;
                case "c2":  story.selectNextPosition(nextPosition2); break;
                case "c3":  story.selectNextPosition(nextPosition3);  break;
                case "c4":  story.selectNextPosition(nextPosition4); break;
                case "c5":
                    if (ui.invStatus.equals("close")) {
                        //hide screen
                        vm.hideInventory();
                    } else if (ui.invStatus.equals("open")) {
                        //show screen
                        vm.showInventory();
                    }

                case "item1":   story.itemUsed(0); break;
                case "item2":   story.itemUsed(1); break;
                case "item3":   story.itemUsed(2); break;
                case "item4":   story.itemUsed(3); break;

//                case "c6" : story.selectNextPosition(nextPosition4);break;
//                case "item1":   ui.item1.setText(ui.playerItems[0].getName()); break;
//                case "item2":   ui.item2.setText(ui.playerItems[1].getName()); break;
//                case "item3":   ui.item3.setText(ui.playerItems[2].getName()); break;
//                case "item4":   ui.item4.setText(ui.playerItems[3].getName()); break;
            }
        }
    }
}
