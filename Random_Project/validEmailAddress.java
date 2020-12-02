import java.util.Scanner;

public class validEmailAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your valid address.");
        String email = sc.nextLine();
        if (email.endsWith(".")) {
            System.out.println("Your email address invalid");
        } else {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    System.out.println("your email address valid");
                    break;
                }
            }
        }

    }

}

