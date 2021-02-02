package NewRPGAttempt.Enemy;

public class Enemy {
    public enum EnemyNames {ANGMAR, BALROG, GOLLUM, TROLL, ORCH, SARUMAN, SAURON, SHELOB, URUKHAI, NAZGUL, GOBLIN}

    private int Damage;
    private int Hp;
    private String Name;
    private int Xp;
    private String desc;


    public Enemy(EnemyNames type, String name, int damage, int hp, int xp) {
        this.Name = name;
        this.Damage = damage;
        this.Hp = hp;
        this.Xp = xp;
        this.desc = getEnemyDescription(name);
    }

    public String getEnemyDescription(String name) {
        String tempDesc = "";
        switch (name) {
            case "Saruman" -> tempDesc = "A wizard who joins forces with Sauron. A former friend of Gandalf, Saruman has been tempted by evil and has allied with Sauron. At his mighty tower, Orthanc, he creates countless Uruk-hai, monsters that terrorize Middle-earth. ";
            case "Uruk-Hai" -> tempDesc = "Uruk-hai (for short, Uruks) were brutal warriors of Middle-earth, and the strongest Orcs, who dwelt in Mordor and Isengard." +
                    "\nIn The Lord of the Rings, the term Uruk-hai refers chiefly to those bred in Isengard, and in one context are alternatively called Isengarders, while Uruks from Mordor are called Black Uruks or Uruks of Mordor. ";
            case "Nazgul" -> tempDesc = "The Nazgûl (B. S.; \"The Ringwraiths\") or Úlairi (Q.[2]), also known as the Black Riders or simply The Nine, were the dreaded ring-servants of the Dark Lord Sauron in Middle-earth throughout the Second and Third Ages, who in the later years of the Third Age dwelt in Minas Morgul and Dol Guldur.";
            case "Goblin" -> tempDesc = "A wretched swamp creature who covets the ring. Before becoming obsessed with the ring, Gollum was a hobbit named Sméagol. His transformation into the disgusting, raw-fish-eating Gollum serves as a cautionary tale about the evil effects of the ring. Both Gollum and Sméagol are vastly different from Frodo. Gollum is a living reminder of a possible alternate life for Frodo, and, while Frodo is incorruptible, Sméagol is weak-willed and criminal. From the moment he first laid eyes on the ring, Sméagol was obsessed with it, and years later it is still Gollum’s sole reason for living. Gollum leads Frodo and Sam to Mordor, and his intentions are constantly suspect. Usually he seems to be waiting for an opportunity to steal the ring, but at times he appears to be a faithful servant, won over by Frodo’s generous spirit. His desire for the ring eventually wins out, and this desire ultimately leads to the destruction of the ring and his own death at Mount Doom. As is Sauron’s, Gollum’s identity is tied up with the ring. Whereas Sauron is pure evil, however, Gollum is pure weakness. He is always the ring’s victim.";
            case "Orch" -> tempDesc = "Orcs were the primary foot soldiers of the Dark Lords' armies and sometimes the weakest (but most numerous) of their servants. They were created by the first Dark Lord, Morgoth, before the First Age and served him and later his successor in their quest to dominate Middle-earth. Before Oromë first found the Elves at Cuiviénen, Melkor kidnapped some of them and cruelly tortured them, twisting them into the first Orcs.";
            case "Gollum" -> tempDesc = "A wretched swamp creature who covets the ring. Before becoming obsessed with the ring, Gollum was a hobbit named Sméagol. His transformation into the disgusting, raw-fish-eating Gollum serves as a cautionary tale about the evil effects of the ring. Both Gollum and Sméagol are vastly different from Frodo. Gollum is a living reminder of a possible alternate life for Frodo, and, while Frodo is incorruptible, Sméagol is weak-willed and criminal. From the moment he first laid eyes on the ring, Sméagol was obsessed with it, and years later it is still Gollum’s sole reason for living. Gollum leads Frodo and Sam to Mordor, and his intentions are constantly suspect. Usually he seems to be waiting for an opportunity to steal the ring, but at times he appears to be a faithful servant, won over by Frodo’s generous spirit. His desire for the ring eventually wins out, and this desire ultimately leads to the destruction of the ring and his own death at Mount Doom. As is Sauron’s, Gollum’s identity is tied up with the ring. Whereas Sauron is pure evil, however, Gollum is pure weakness. He is always the ring’s victim.";
            case "Troll" -> tempDesc = "Stone-trolls tended to be dumb and ill-tempered. Stone-trolls ate things such as wild fowl, wild pigs/boars, dwarves, hobbits, and fish (if they could actually catch them). They hunted simply by chasing or ambushing the animals, then hitting them with a weapon such as an axe or a club. ";
            case "Angmar" -> tempDesc = "One of Sauron’s most feared warriors. Unable to be killed by men, the witch-king is eventually felled by Éowyn, a woman, with the help of Merry, a hobbit. ";
            case "Balrog" -> tempDesc = " \"Strife and Hate\") was the Lord of Balrogs during the First Age, and the greatest Balrog ever to walk Middle-earth. As the High Captain of Angband, his only equal in rank was Sauron. He fought many battles in the name of his master Morgoth, and was personally responsible for killing two of the High Kings of the Ñoldor." +
                    "\nGothmog, like the rest of his kind, carried a fiery whip into battle, but was also known for wielding a great black axe, feared by elves across the continent of Beleriand. ";
            case "Sauron" -> tempDesc = "\"The Abhorred\"), or the eponymous Lord of the Rings, was a fallen Maia, creator of the One Ring, a gifted student of Vala Aulë the Smith and lieutenant of Melkor (Morgoth). After his master's defeat by the Valar, Sauron became the second Dark Lord and sought to conquer Arda by creating the Rings of Power." +
                    "\nIn the Second Age, he was defeated in the War of the Last Alliance of Elves and Men united under kings Gil-galad and Elendil. In the final battle, Isildur managed to cut the One Ring from Sauron's finger, dismantling the Dark Lord's corporeal form and power. After centuries lying dormant, rebuilding his strength, Sauron returned to power late in the Third Age, but was permanently crippled in the War of the Ring after destruction of the One Ring in the fires of Mount Doom by a hobbit Frodo Baggins. ";
            case "Shelob" -> tempDesc = "Shelob was a great Spider and the greatest offspring of Ungoliant, the primordial spider. In the Third Age she lived in Mordor and was known to feed indiscriminately, preying on the inhabitants. She was encountered by Frodo Baggins and Samwise Gamgee in their quest to destroy the One Ring. ";
        }
        return tempDesc;
    }


    public String getName() {
        return Name;
    }

    public int getDamage() {
        return Damage;
    }

    public int getHp() {
        return Hp;
    }
//    public int getXp() {
//        return xp;
//    }

    public void setHp(int hp) {
        Hp = hp;
    }
}
