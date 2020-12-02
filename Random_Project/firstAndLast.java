import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstLast(new String[]{"edabit", "13", "true"})));
        System.out.println(firstLast(new String[]{"edabit", "13", "true"}));

    }

    public static String[] firstLast(String[] arr) {
    String[] list = new String[]{arr[0],arr[arr.length-1]};
        return list;
    }
}
