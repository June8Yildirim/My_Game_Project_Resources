package TextBasedGameAttempt2;

class Player {
    //    PlayerSpec aragorn = new PlayerSpec(PlayerSpec.playerSpecEnums.ARAGORN);
//    PlayerSpec gimli = new PlayerSpec(PlayerSpec.playerSpecEnums.GIMLI);
//    PlayerSpec legolas = new PlayerSpec(PlayerSpec.playerSpecEnums.LEGOLAS);
//    PlayerSpec frodo = new PlayerSpec(PlayerSpec.playerSpecEnums.FRODO);
//    PlayerSpec gandalf = new PlayerSpec(PlayerSpec.playerSpecEnums.GANDALF);
    public static PlayerSpec playerSpec;

    public static void playerSetUpName(String name) {
        switch (name) {
            case "aragorn" -> {
                playerSpec = new PlayerSpec("aragorn", 60, 30);
                break;
            }
            case "frodo" -> {
               playerSpec = new PlayerSpec("frodo", 30, 10);
                break;
            }
            case "gimli" -> {
                 playerSpec = new PlayerSpec("gimli", 60, 25);
                break;
            }
            case "legolas" -> {
                 playerSpec = new PlayerSpec("legolas", 50, 30);
                break;
            }
            case "gandalf" -> {
                 playerSpec = new PlayerSpec("gandalf", 80, 40);
                break;
            }
        }

    }

    public static void getplayerName(String name) {
        switch (name) {
            case "aragorn" -> System.out.println(playerSpec.getName());
            case "frodo" -> System.out.println(playerSpec.getName());
            case "gandalf" -> System.out.println(playerSpec.getName());
            case "legolas" -> System.out.println(playerSpec.getName());
            case "gimli" -> System.out.println(playerSpec.getName());
        }
    }
    public static void getplayerXp(String name) {
        switch (name) {
            case "aragorn" -> System.out.println(playerSpec.getXp());
            case "frodo" -> System.out.println(playerSpec.getXp());
            case "gandalf" -> System.out.println(playerSpec.getXp());
            case "legolas" -> System.out.println(playerSpec.getXp());
            case "gimli" -> System.out.println(playerSpec.getXp());
        }
    }
    public static void getplayerDamage(String name) {
        switch (name) {
            case "aragorn" -> System.out.println(playerSpec.getDamage());
            case "frodo" -> System.out.println(playerSpec.getDamage());
            case "gandalf" -> System.out.println(playerSpec.getDamage());
            case "legolas" -> System.out.println(playerSpec.getDamage());
            case "gimli" -> System.out.println(playerSpec.getDamage());
        }
    }


//    public PlayerSpec setPlayerName(PlayerSpec.playerSpecEnums type) {
//        if (frodo.equals(type)) {
////            this.playerSpec = new PlayerSpec();
//            playerSpec.setName("Frodo");
//            playerSpec.setDamage(20);
//            playerSpec.setXp(10);
//        } else if (aragorn.equals(type)) {
//            playerSpec.setName("Aragorn");
//            playerSpec.setDamage(19);
//            playerSpec.setXp(60);
////                this.players = new PlayerSpec("aragorn",60,19);
//        }
//        return playerSpec;
//    }
//
//
//    public void getPlayerName(PlayerSpec.playerSpecEnums type) {
//        if (frodo.equals(type)) {
//            playerSpec.getName();
//        } else if (aragorn.equals(type)) {
//            playerSpec.getName();
//        }
//
//    }
//
//    public void getPlayerXp(String name) {
//        if (name.equals("aragorn")) {
//            aragorn.getXp();
//        } else if (name.equals("gimli")) {
//            gimli.getXp();
//        }
//    }

}
