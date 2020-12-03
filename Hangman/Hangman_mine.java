import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman_mine {
    public static void main(String[] args) {
        hangman();
    }

    public static void hangman() {
        Scanner sc = new Scanner(System.in);
// selecting word list
        String[] guessList = {"mental", "strengths", "were", "quite", "different", "as", "he", "revealed", "to", "his",
                "colleague", "jacques", "hadamard"};
        Random rd = new Random();
        int rdnumer = rd.nextInt(guessList.length);
        String selectedWord = guessList[rdnumer];
        System.out.println(selectedWord);
//        dashed list letter
        char[] dash = new char[selectedWord.length()];
        int length = selectedWord.length();
// disappear letter with #
        for (int i = 0; i < length; i++) {
            dash[i] = '#';
            if (selectedWord.charAt(i) == ' ') {
                dash[i] = ' ';
            }
        }
//        int i = 0;
        System.out.println(Arrays.toString(dash));
        while (length - 3 > 0) {
            System.out.println("Type any letter");
            char guessingLetter = sc.next().toLowerCase().charAt(0);
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == guessingLetter) {
                    dash[i] = guessingLetter;
                }
            }
            System.out.println("Do you want to guess the word and finish the game. if yes type 'y");
            char answer = sc.next().charAt(0);
            if (answer == 'y') {
                System.out.println("Type the word");
                String answerWord = sc.next();
                if (answerWord.equals(selectedWord)) {
                    System.out.println("your answer is correct");
                    length = 0;
                } else {
                    System.out.println("Your answer is wrong keep guess the letter.");
                }
            }
            length--;
            System.out.println(Arrays.toString(dash));
        }
    }
}
