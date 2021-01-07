package Employee;

import java.util.Scanner;

public class EasyScanner {
    public static int nextInt() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    public static double nextDouble() {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        return d;
    }

    public static char nextChar() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        return c;
    }

    public static String nextString() {
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.nextLine();
        return s;
    }
}
