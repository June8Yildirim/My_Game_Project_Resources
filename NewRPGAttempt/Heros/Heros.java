package NewRPGAttempt.Heros;

import NewRPGAttempt.Items.Items;
import NewRPGAttempt.Weapon.Weapons;

public class Heros {
    private String Name;
    private int Hp;
    private int MaxHp;
    private int Damage;
    private String desc;
    private static Weapons.WeaponName[] herosInventory = new Weapons.WeaponName[5];
    public enum HerosName {ARAGORN, LEGOLAS, ELROND, GIMLI, GREYGANDALF, WHITEGANDALF, FRODO, MITHRANDIR, STRIDER, GALADRIEL,}

    public Heros(HerosName type, String name, int hp, int damage) {
        this.Hp = hp;
        this.Name = name;
        this.MaxHp = hp + 15;
        this.Damage = damage;
        this.desc = getHeroDescription(name);
    }

    public Weapons.WeaponName[] getHerosInventory(){
        return herosInventory;
    }

//    public static void setHerosInventory(Weapons.WeaponName[] herosInventory) {
//        herosInventory = herosInventory;
//    }

    public void addItemToInventory(Weapons.WeaponName weapons) {

        for (int i = 0; i < herosInventory.length; i++) {
//            if (herosInventory[i] == null) {
                herosInventory[i] = weapons;
//            }
        }
        herosInventory[0]= Weapons.WeaponName.KNIFE;
    }


    public String getHeroDescription(String name) {
        String tempDesc = "";
        switch (name) {
            case "Legolas" -> tempDesc = "A boyish elf. Thanks to Legolas’s skill with a bow and arrow, his kill number is consistently higher than Gimli’s. Like his dwarf friend, he is a brave and loyal member of the fellowship of the ring. ";
            case "Aragorn" -> tempDesc = "The heir to the throne of Gondor. Though Aragorn is the rightful king of Gondor, he travels under an assumed identity at the beginning of the trilogy: he is a ranger, known as Strider. The fact that he is not upon the throne reveals the weak state of the kingdoms of men. As the trilogy proceeds, Aragorn shows himself to be a noble leader with a pure heart. He is relatively unaffected by desire for the ring and routinely throws himself in harm’s way to ensure the fellowship’s survival. In love with the elf princess Arwen, he fights for her survival and for the successful return of the ring to Mordor. He becomes increasingly comfortable asserting his royal identity, but only when he addresses the men of the mountain in The Return of the King does he actually declare himself king of Gondor. By the time he is crowned king at the end of the final film, he has proven himself to be a worthy leader.";
            case "Gimli" -> tempDesc = "A bearded, ax-wielding warrior dwarf. Gimli is a brave and loyal member of the fellowship of the ring. ";
            case "Frodo" -> tempDesc = "The ring-bearer and protagonist of the trilogy. A young hobbit, Frodo is chosen by the wizard Gandalf to return the ring to Mordor. The ring offers terrible temptation to anyone who comes near it, and though Frodo on occasion succumbs to its power, he generally shows remarkable strength before its siren call. However, when it comes time to drop the ring into Mount Doom, he is unable to simply let the ring go. Only because the ring is torn loose in Frodo’s struggle with Gollum does it fall into the fiery pit of lava below, which suggests that Frodo is a very fallible hero. Unlike the three other hobbits, Sam, Merry, and Pippin, Frodo is unable to readjust to life in the Shire upon his return. In this way, he resembles his uncle Bilbo, a former owner of the ring who is forever restless. The ring has a great effect on Frodo, changing him from an ordinary hobbit of exceptional qualities into someone extraordinary. He becomes a legend and eventually leaves the land of living mortals for immortal life with the elves. Despite Frodo’s success in returning the ring to Mordor, in some ways he is the least memorable character in the trilogy. In three epic films full of battles, he is a reserved, physically small, and ineffective fighter.";
            case "Elrond" -> tempDesc = "Ruler of the Rivendell elves and Arwen’s father. Though Elrond is sympathetic to the goals of the fellowship, his primary concern is the safety of his elf subjects. The elves face a choice: they can leave Middle-earth for immortal life, or they can delay their departure and contribute to the fight against Sauron. Elrond has a low opinion of men, as he was with Isildur when the king failed to destroy the ring of power. For this reason and because of his concerns about Arwen’s life, he is reluctant to aid in the fight against Sauron. Eventually, he commits himself to the ancient alliance of men and elves, sends an army to defend Rohan, and reforges Isildur’s sword for Aragorn. ";
            case "Strider" -> tempDesc = "Strider is a name that Aragorn uses as a Ranger to keep doing his work in Arnor (the fallen North Kingdom, including the Shire, Bree, and the road from the Sea to Rivendell, which passes through both of them). The name was given to him by local men, Breelanders or similar, because of his long legs and fast and purposeful way of walking. Aragorn kept his lineage secret, as Sauron was trying to hunt him down and kill him. So he took secret names, or accepted names given to him. Strider in the North, Thorongil (Eagle-Star) as a knight-errant for Rohan and Gondor, including attacks on the Haradrim, and others.\n" +
                    "\nWhen Aragorn is crowned king, he takes the name Strider and translates it to Elvish, Telcontar, and it becomes the name of his royal house.";
            case "Galadriel" -> tempDesc = "An elf queen known as the Lady of the Woods. Galadriel is the leader of the Sylvan elves. She offers spiritual aid to Frodo, giving counsel and encouraging him during the dark moments of his quest. She gives him a star of light that proves essential to Frodo when he is betrayed by Gollum and trapped in the spider Shelob’s webs.";
            case "Mithrandir" -> tempDesc = "Gandalf is also known as Mithrandir (i.e. \"grey wanderer\") and Olyrin, a name given to him in Valinor. In \"The Silmarillion\" wisest of the Maiar was Olyrin who dwelt in Lyrien. His ways took him often to the house of Nienna, and of her he learned pity and compassion. This gives grounds to believe that Gandalf and Olyrin was one and the same person.";
            case "Gandalf the Gray" -> tempDesc = "A grandfatherly wizard. Gandalf is the first to understand the dangers that Bilbo’s ring poses, and his knowledge sets the whole trilogy in motion. Gandalf selects quiet Frodo to carry the ring and the bumbling Sam to be Frodo’s protector, and these hobbits seem unlikely choices for such a dangerous mission. Here and elsewhere, Gandalf exhibits a remarkable wisdom and insight into hobbits and men alike, and he seems to see potential and ability where others do not. Gandalf is affable, slow, and deliberate, but he is also a skilled fighter. His battles with Saruman and in the mines of Moria are heroic, and the Moria fight in particular provides the others in the fellowship with a model for the sacrifice their quest may require of them. The others assume Gandalf has died in this battle, but he returns, transformed from a gray wizard into a white one. Gandalf is often playful, but he is also deeply concerned about the fate of Middle-earth and always prepared to fight for its safety. At the end of the trilogy, he leaves with Bilbo, Frodo, and the elves for immortal life. Though this wizard seems human, he has always been a little different and a little better than any man could possibly be. ";
            case "Gandalf the White" -> tempDesc = "Gandalf the gray was named fighting after the BALROG, Gandalf the white, and he became master of the wizards council. ";
        }
        return tempDesc;
    }


    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMaxHp() {
        return MaxHp;
    }

    public String getName() {
        return Name;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
}
