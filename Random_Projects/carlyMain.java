package Random_Projects;

import java.util.Scanner;
public class carlyMain {
    public static void main(String[] args) {
//        carlysMotto.moto();
//        EventDemo.selection();
        event test = new event();
        test.setPhoneNumber();
        test.getPhoneNumber();
    }
}
class carlysMotto {
    public static void moto(){
        System.out.println("Our compan's motto is \"Carly’s makes the food that makes it party.\"");
    }
}
class carlyEvent {
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

