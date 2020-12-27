package RockPaperScissors;

public class rockpapersc {
    public static void main(String[]args) {
        System.out.println("Hello! We're going to play a classic Rock, Paper, Scisor game.\n" +
                "You have 3 rounds, and if you win, you get 2 point, or if you get tie, you get 1 point. if the game ties you have\n" +
                "an additional round");
         new game();

    }

}
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//        //player one
//        player pl1= new player();
//        //player two
//        player pl2 = new player();
//
////Players  choice.
//        String comp = "", c = "";
////Players scores and total round.
//        int count = 1, compScore = 0, pOneScore = 0;
//// The game plays on three round.
//        while (count < 4) {
//            int r = rand.nextInt(3);
//            if (r == 1) {
//                comp = "r";
//            } else if (r == 2) {
//                comp = "p";
//            } else {
//                comp = "s";
//            }
//            //validating misstyping error.
//            do {
//                System.out.println("Choice for Rock (r), for  Scisor (s), for Paper (p) ");
//                c = sc.nextLine().toLowerCase();
//            } while (!c.equals("r") && !c.equals("p") && !c.equals("s"));
//
////The Computer wins option. The computer gets 2 points.
//            if (c.equals("r") && comp.equals("p") || c.equals("p") && comp.equals("s") || c.equals("p") && comp.equals("r")) {
//                System.out.println("Computer won round " + count);
//                compScore = +2;
//            }
//
////The Player one wins option . The player gets 2 points.
//            else if (c.equals("r") && comp.equals("s") || c.equals("s") && comp.equals("p") || c.equals("s") && comp.equals("r")) {
//                System.out.println("Player won round " + count);
//                pOneScore = +2;
//            }
//            //The tie game option. Each players earns 1 point and extra playing round
//            else {
//                System.out.println("Tie game ");
//                compScore++;
//                pOneScore++;
//                count--;
//            }
//            count++;
//        }
//
//// Checking who is the winner.
//        if (pOneScore > compScore) {
//            System.out.println("Player one won and his score is " + pOneScore);
//        } else if (pOneScore < compScore) {
//            System.out.println("Player two won and his score is " + compScore);
//        } else if (pOneScore > compScore) {
//            System.out.println("Player tie and score is " + pOneScore);
//        }
////    }
//}


