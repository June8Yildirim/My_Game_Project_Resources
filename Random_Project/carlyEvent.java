import java.util.Scanner;

public class carlyEvent {
    public static void carlyEventPrice(){
        Scanner sc = new Scanner(System.in);
        int perPersonPrice=35;
        System.out.println("Enter your number of guest.");
        int guest = sc.nextInt();
        int totalpr = guest*perPersonPrice;
        System.out.println("your total guest is "+ guest);
        System.out.println("Our per guest price is "+ perPersonPrice);
        System.out.println("Your total dept is "+ totalpr);
    }


}
