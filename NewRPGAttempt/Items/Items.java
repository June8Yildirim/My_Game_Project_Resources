package NewRPGAttempt.Items;

import NewRPGAttempt.Heros.Heros;
import NewRPGAttempt.Places.Place;
import NewRPGAttempt.Weapon.Weapons;

public class Items {
    private Heros heros;
    private Place place;
    private Weapons[] Weapons;

    public Items(Heros heros,Place place, Weapons[] weapons) {
        this.place = place;
        Weapons = weapons;
        this.heros=heros;
    }


}
