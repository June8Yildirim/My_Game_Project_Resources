import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Scanner sc = new Scanner(System.in);
//        int res = 0;
        String[] guessList = {"mental", "strengths", "were", "quite", "different", "as", "he", "revealed", "to", "his",
                "colleague", "Jacques", "Hadamard"};
//        Random rd = new Random();
        int rdnumer = (int) (Math.random() * 11);
        String word = guessList[rdnumer + 1];
        char[] filler = new char[word.length()];
        int n = word.length();
        int f = 0;
        ArrayList<Character> list = new ArrayList<>();
        while (f < word.length()) {
            filler[f] = '-';
            if (word.charAt(f) == ' ') filler[f] = ' ';
            f++;
        }

        System.out.println(filler);
        System.out.println("you have " + n + " life");
        while (n > 0) {
            System.out.println("Guess a letter");
            char gstr = sc.nextLine().charAt(0);
//            if (!Character.isLetter(gstr)) {
//                System.out.println("You entered no a letter.");
//            System.out.println("you still have " + n + " life");
//
//                n+=1;
//            } else
                {
                if (list.contains(gstr)) {
                    System.out.print("You already entered this letter");
                    System.out.println("you still have " + n + " life");
                    continue;
                }
                list.add(gstr);
                if (word.contains(gstr + "")) {
                    for (int i = 0; i < n; i++) {
                        if (word.charAt(i) == gstr) {
                            filler[i] = gstr;
                        }
                    }
                } else {
                    n -= 1;
                }
                if (word.equals(String.valueOf(filler))) {
                    System.out.println(filler);
                    System.out.println("You won!!!!!!");
                }
                System.out.println("Remaining " + n + " life");
                System.out.println(filler);
            }
            if (n == 0) {
                System.out.println("You lose");
                System.out.println(word);
            }
        }
    }
}
