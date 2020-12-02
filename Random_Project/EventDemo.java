<<<<<<< HEAD
import java.util.Scanner;

public class EventDemo {
    public static void selection() {
        event ev1 = new event();
        event ev2 = new event();
        event ev3 = new event();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many guests do you have for first event");
        ev1.setGuest(sc.nextInt());
        System.out.println("how many guests do you have for second event");
        ev2.setGuest(sc.nextInt());
        System.out.println("how many guests do you have for third event");
        ev3.setGuest(sc.nextInt());
        while (true) {
            if (ev1.getGuest() >= 5 || ev1.getGuest() <= 100) {
                if (ev2.getGuest() >= 5 || ev3.getGuest() <= 100) {
                    if (ev3.getGuest() >= 5 || ev3.getGuest() <= 100) {
                        if (ev1.getGuest() > ev2.getGuest()) {
                            if (ev1.getGuest() > ev3.getGuest()) {
                                System.out.println(ev1.getGuest());      // largest guest
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            } else {
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            }
                        } else {
                            if (ev2.getGuest() > ev3.getGuest()) {
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            } else {
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            }
                        }
                    } else {
                        System.out.println("how many guests do you have for third event");
                        ev3.setGuest(sc.nextInt());
                        ev3.setPhoneNumber();
                    }
                } else {
                    System.out.println("how many guests do you have for third event");
                    ev2.setGuest(sc.nextInt());
                    ev2.setPhoneNumber();
                }
            } else {
                System.out.println("how many guests do you have for third event");
                ev1.setGuest(sc.nextInt());
                ev1.setPhoneNumber();

            }
        }
for(int i=0; i<ev1.getGuest();i++){
    System.out.println("\nPlease come to my Event."+(i+1));
}
    }

}
class event {
    private String eventNumber;
    private int guest;
    private int priceForEvent;
    private int pricePerPerson;
    public final static int higerPerPersonPrice = 35;
    public final static int lowerPerPersonPrice = 32;
    public final static int largeguest = 50;
    private String phoneNumber;


    public event() {
        System.out.println("Your A000  event total price ise 0 CAD $");
    }

    public event(String eventNumber, int guest) {
        this.eventNumber = eventNumber;
        this.guest = guest;
        getPriceForEvent();
    }

    public String getPhoneNumber() {
        phoneNumber = "(" + phoneNumber.substring(0, 3) + ")" + " " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
        return phoneNumber;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getGuest() {
        return guest;
    }

    public int getPriceForEvent() {
        if (isLargeEvent()) {
            return lowerPerPersonPrice * guest;
        } else {
            return higerPerPersonPrice * guest;
        }
    }

    public int getPricePerPerson() {
        return pricePerPerson;
    }

    public void setEventNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in Event Number");
        this.eventNumber = sc.nextLine();
        while (isValidEventNumber(eventNumber) == false) {
            System.out.println("Type in Event Number");
            this.eventNumber = sc.nextLine();
        }
    }

    public void setPhoneNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your phone number");
        String phoneNumber = sc.nextLine();
        while (true) {
            if (phoneNumber.length() < 10) {
                System.out.println("your phone number is 0000000000");
//                System.out.println("you entered phone number is not correct please re-enter. ");
            } else {
                break;
            }
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) == ')') {
                phoneNumber = phoneNumber.replace(')', ' ');
            } else if (phoneNumber.charAt(i) == '(') {
                phoneNumber = phoneNumber.replace('(', ' ');
            } else if (phoneNumber.charAt(i) == '-') {
                phoneNumber = phoneNumber.replace('-', ' ');
            } else {
                phoneNumber = phoneNumber.replaceAll("\\s", "");
            }
        }
        System.out.println(phoneNumber);
    }

    public static boolean isValidEventNumber(String eventNumber) {
        if (eventNumber.length() < 5) return false;
        int charCount = 0;
        int intCount = 0;
        for (int i = 0; i < eventNumber.length(); i++) {
            char ch = eventNumber.charAt(i);
            if (ch >= '0' && ch <= '9') {
                ++intCount;
            } else if (Character.toUpperCase(ch) >= 'A' && Character.toUpperCase(ch) <= 'Z') {
                ++charCount;
            } else {
                return false;
            }
        }
        return (intCount == 3 && charCount == 1);
    }

    public void setGuest(int guest1) {
        this.guest = guest1;
    }

    public boolean isLargeEvent() {
        if (guest >= 50) {
            return true;
        } else {
            return false;
        }
    }
}

//\w = Anything that is a word character
//
//        \W = Anything that isn't a word character (including punctuation etc)
//
//        \s = Anything that is a space character (including space, tab characters etc)
//
//        \S = Anything that isn't a space character (including both letters and numbers, as well as punctuation etc)
=======
import java.util.Scanner;

public class EventDemo {
    public static void selection() {
        event ev1 = new event();
        event ev2 = new event();
        event ev3 = new event();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many guests do you have for first event");
        ev1.setGuest(sc.nextInt());
        System.out.println("how many guests do you have for second event");
        ev2.setGuest(sc.nextInt());
        System.out.println("how many guests do you have for third event");
        ev3.setGuest(sc.nextInt());
        while (true) {
            if (ev1.getGuest() >= 5 || ev1.getGuest() <= 100) {
                if (ev2.getGuest() >= 5 || ev3.getGuest() <= 100) {
                    if (ev3.getGuest() >= 5 || ev3.getGuest() <= 100) {
                        if (ev1.getGuest() > ev2.getGuest()) {
                            if (ev1.getGuest() > ev3.getGuest()) {
                                System.out.println(ev1.getGuest());      // largest guest
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            } else {
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            }
                        } else {
                            if (ev2.getGuest() > ev3.getGuest()) {
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            } else {
                                System.out.println("first event price "+ev1.getPriceForEvent());
                                ev1.setPhoneNumber();
                                System.out.println("second event price "+ev2.getPriceForEvent());
                                ev2.setPhoneNumber();
                                System.out.println("third event price "+ev3.getPriceForEvent());
                                ev3.setPhoneNumber();
                                break;
                            }
                        }
                    } else {
                        System.out.println("how many guests do you have for third event");
                        ev3.setGuest(sc.nextInt());
                        ev3.setPhoneNumber();
                    }
                } else {
                    System.out.println("how many guests do you have for third event");
                    ev2.setGuest(sc.nextInt());
                    ev2.setPhoneNumber();
                }
            } else {
                System.out.println("how many guests do you have for third event");
                ev1.setGuest(sc.nextInt());
                ev1.setPhoneNumber();

            }
        }
for(int i=0; i<ev1.getGuest();i++){
    System.out.println("\nPlease come to my Event."+(i+1));
}
    }

}
>>>>>>> Add files via upload
