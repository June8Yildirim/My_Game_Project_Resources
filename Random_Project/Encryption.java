public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("javascript is cool"));
    }

    public static String encryption(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') str = str.replace(str.charAt(i), '4');
            if (str.charAt(i) == 'e') str = str.replace(str.charAt(i), '3');
            if (str.charAt(i) == 'i') str = str.replace(str.charAt(i), '1');
            if (str.charAt(i) == 'o') str = str.replace(str.charAt(i), '0');
            if (str.charAt(i) == 's') str = str.replace(str.charAt(i), '5');
        }
        return str;
    }
}
