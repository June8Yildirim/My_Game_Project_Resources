package Random_Projects;

import java.util.Random;
import java.util.Scanner;

public class guessingNumberMain {
    public static void main(String[] args) {
        guessingNumber gs = new guessingNumber();
        gs.Guess();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again(True=T or t; False=F or f )");
        String choice = sc.nextLine();
        choice= choice.toUpperCase();
        if (choice.equals("T")) {
            System.out.println("We are starting again. Make a new guess.");
            gs.Guess();
        } else {
            System.out.println("Thank you see you next time");
        }
    }
}
class guessingNumber {
    public void Guess() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guessingNumber;
        int randomNumber;
        int limit = 100;
        randomNumber = rand.nextInt(limit) + 1;
        int guesslimit = 1;
        System.out.println("Computer pick a number, between 0 and 100." +
                "\nDo you want to guess.");
        System.out.println(randomNumber);
        while (guesslimit <= 10) {
            guessingNumber = sc.nextInt();
            if (guessingNumber == randomNumber) {
                System.out.println("your guess is correct.");
                break;
            } else {
                if (guesslimit<10) {
                    System.out.println("Make a "+ (guesslimit+1)+" guess ");
                    System.out.println("Your guess is incorrect.");
                }else{
                    System.out.println("Today isn't lucky day for you.");

                }
            }
            guesslimit += 1;
        }


    }
}
class Player {
    int number =0;
    public void guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("guess any number between 0 and 9..");
        number = sc.nextInt();
//        number = (int)(Math.random()*10);
        System.out.println("I'm guessing "+ number);
    }
}
