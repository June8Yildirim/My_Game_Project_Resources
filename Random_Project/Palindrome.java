import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your your word.");
        String palCheck = sc.nextLine();
        String reverse = "";
        String removeSpace = "";
        for (int i = 0; i < palCheck.length(); i++) {
            if (palCheck.charAt(i) == ',') {
                palCheck = palCheck.replace(",", "");
            }
        }
        for (int i = 0; i < palCheck.length(); i++) {
            if (palCheck.charAt(i) == ' ') {
                palCheck = palCheck.replace(" ", "");
            }
        }
        System.out.println(palCheck);
        for (int i = palCheck.length() - 1; i >= 0; --i) {
            reverse += palCheck.charAt(i);
        }
        System.out.println(reverse);
//        if (palCheck.equals(reverse)) {
        if (palCheck.equals(reverse)) {
            System.out.println("your word " + palCheck + " is a palindrome");
        } else {
            System.out.println("Your word " + palCheck + " is not a palindrome");
        }
    }
}

