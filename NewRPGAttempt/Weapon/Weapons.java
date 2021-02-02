package NewRPGAttempt.Weapon;

public class Weapons {
    private String Name;
    private int Damage;
    private String desc;

    public enum WeaponName {NARSIL, STING, KNIFE, ORCRIST, ELFBOW, AXE, GLAMDRING, GANDALFSTAFF, ONERING, ELRONDSRING,}



    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getName() {
        return Name;
    }

    public Weapons(WeaponName type, String name, int damage) {
        this.Damage = damage;
        this.desc = getWeaponDescription(name);
        this.Name=name;
    }
    public Weapons(WeaponName type ) {

    }
    public  String getWeaponDescription(String name) {
        String tempWeaponDesc = "";
        switch (name) {
            case "Axe" -> tempWeaponDesc = "In the books, Gimli is described as wielding a single axe, but in Peter Jackson’s films, Gimli wields several axes, including a bearded axe, throwing axes, and a double-bladed axe.\n" +
                    "\nHistory: Gimli obtained his large double-bladed axe while traveling through the Mines of Moria. It’s believed that the axe belonged to his father’s cousin, Balin. Gimli is very attached to his axes.";
            case "Knife" -> tempWeaponDesc = "";
            case "Sting" -> tempWeaponDesc = "Sting was an Elven short sword that glowed blue whenever Orcs or goblins were near. It is similar in make to Glamdring, Gandalf’s sword. After the Quest for Erebor, Bilbo had the sword engraved with the words, “Sting is my name; I am the spider's bane.\"\n" +
                    "\nHistory: Sting was found by Bilbo in the trolls’ cave along with Glamdring and Orcrist. Bilbo then gave his sword to his nephew, Frodo, to aid him in his quest to destroy the One Ring. Once Sauron was defeated, Frodo gave the sword to his good friend Sam.";
            case "Elfbow" -> tempWeaponDesc = " Legolas wielded two bows during the War of the Ring. The first was from his home of Mirkwood. The second was gifted to him by Galadriel and was longer and stouter than his first bow. It was six feet long and crafted with the silver-grey wood of a Mallorn tree. His second bow was also faster as its string had a strand of Galadriel’s hair entwined around it.\n" +
                    "\nHistory: In addition to taking down many Orcs, Goblins, and Uruk-hai, Legolas used his second bow to strike down one of the Fell Beasts as it flew over the River Anduin.";
            case "Narsil" -> tempWeaponDesc = " Reforged from the shards of Isildur’s sword, Narsil, Andúril bears the inscription, \"I am Andúril, who was Narsil, the sword of Elendil. Let the thralls of Mordor flee me.\"\n" +
                    "\nHistory: After Isildur used the broken Narsil to cut the Ring off Sauron’s finger, the sword’s shards were housed in Rivendell. They were reforged years later for Isildur’s heir, Aragorn, who repeatedly flashed the sword to establish his identity as the rightful king of Gondor.";
            case "Onering" -> tempWeaponDesc = "The Ring was a simple gold band which revealed the inscription “One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them” when cast into fire. Created by Sauron in the fires of Mount Doom, the One Ring enhanced the wielder's power and gave them control over all the other Rings of Power, with the exception of the Elven rings. While it was made by and for Sauron, it's believed that a powerful being like Gandalf or Galadriel could possibly use the ring. \n" +
                    "\nIf the bearer was mortal, they would turn invisible and enter the Wraith-world. Prolonged exposure to the Ring could cause its owner to become irritable, paranoid, and even evil, though some beings were less susceptible to the Ring's influence. If wielded by someone other than Sauron, it also had the power to turn the bearer into a wraith-like creature like the Ringwraiths.\n" +
                    "\nHistory: The One Ring was destroyed when Gollum bit the Ring off of Frodo’s finger, taking part of the Hobbit’s digit along with it. In his glee, Gollum fell off the cliff at the Crack of Mount Doom and he and the Ring were consumed by the fire.";
            case "Orchrist"-> tempWeaponDesc = " Made by the Elves of Gondolin, Orcrist was forged along with its sister blade, Glamdring. Like Glamdring and Sting, it would glow blue whenever enemies were near.\n" +
                    "\nHistory: Orcrist was a legendary sword, known to have slain hundreds of goblins in its time.";
            case "Glamdring" -> tempWeaponDesc = " Glamdring had a Rune inscription and would glow blue in the presence of Orcs.\n" +
                    "\nHistory: Made by the High Elves in the West, Gandalf found Glamdring in the trolls’ cave as he and Thorin’s company were making their way to the Misty Mountains.";
            case "EldondsRing" -> tempWeaponDesc = "Vilya was the strongest of the three Elven rings. Its exact powers are unknown, but it is believed that it gave its bearer healing powers and control over minor elements, such as water. Elrond’s ability to summon a torrent of water to chase off the Ringwraiths is thought to be in part powered by Vilya.  \n" +
                    "\nHistory: Just before the death of Gil-galad, the High King of the Ñoldor in Middle-Earth, the ring was given to Elrond.";
            case "GandalgsStaff" -> tempWeaponDesc = "Gandalf had two staffs. The first was made of gnarled wood and cradled a jewel at the top that would light up. His second staff was white with a slightly more geometric design.\n" +
                    "\nHistory: When he returned from the dead, Galadriel gave Gandalf a new white staff. In the films, his white staff was shattered by the Witch King in Minas Tirith.";
        }
        return tempWeaponDesc;
    }
}
