package LordOfTheRingsGame.Villains;

import java.util.ArrayList;

public class Villain {

//    private ArrayList<VILLAINS> VillainsList = new ArrayList<>();

    public static Villain setVillains(String name) {

        switch (name){
            case "angmar":
                VilliansSpecialities angmar =new VilliansSpecialities("angmar",100,50,1);
                break;
            case "goblin":
                VilliansSpecialities goblin  =new VilliansSpecialities("goblin",100,50,1);
                break;
            case "gollum":
                VilliansSpecialities gollum  =new VilliansSpecialities("gollum",100,50,1);
                break;
            case "nazgul":
                VilliansSpecialities nazgul =new VilliansSpecialities("nazgul",100,50,1);
                break;
            case "orch":
                VilliansSpecialities orch =new VilliansSpecialities("orch",100,50,1);
                break;
            case "sauron":
                VilliansSpecialities sauron =new VilliansSpecialities("sauron",100,50,1);
                break;
            case "saruman":
                VilliansSpecialities saruman  =new VilliansSpecialities("saruman",100,50,1);
                break;
            case "urukhai":
                VilliansSpecialities urukhai =new VilliansSpecialities("urukhai",100,50,1);
                break;
        }
//        ArrayList<VilliansSpecialities> villiansSpecialities = new ArrayList<>();
//        villiansSpecialities.add(new VilliansSpecialities("angmar",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("goblin",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("gollum",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("nazgul",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("orch",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("saruman",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("sauron",100,50,1));
//        villiansSpecialities.add(new VilliansSpecialities("urukhai",100,50,1));


    }

}
