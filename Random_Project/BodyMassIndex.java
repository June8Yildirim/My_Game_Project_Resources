import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        bmi();
    }

    public static void bmi() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("Enter your weight as a pound.");
        double weight = sc.nextDouble();
        System.out.println("Enter your height(like 510)");
        double height = sc.nextDouble();
        int inch = (int) height % 100;
        int feet = (int) height/10;
        height = (feet * 30.48) + (inch * 2.54); // converting feet to cm
        weight = weight * 0.453592;     //converting lbs to kg
        System.out.println("Your body mass is "+df.format(weight / (height * 100)));

    }
}
