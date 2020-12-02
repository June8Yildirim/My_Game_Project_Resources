import java.util.Scanner;

public class Hangman_mine {
    public static void main(String[]args){
hangman();
    }
    public static void hangman(){
        Scanner sc = new Scanner(System.in);
//        int res = 0;
        String[] guessList = {"mental", "strengths", "were", "quite", "different", "as", "he", "revealed", "to", "his",
                "colleague", "Jacques", "Hadamard"};
//        Random rd = new Random();
        int rdnumer = (int) (Math.random() * 11);
        String word = guessList[rdnumer + 1];
        char[] dash = new char[word.length()];
        int n = word.length();
        int f = 0; [7-0987654321




    '']

        for (int i=0;i<n;i++){
            dash[i]='-';
            if (word.charAt(i)==' '){
                dash[i]=' ';
            }
        }
        System.out.println(dash);
    }

}
