import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
//        System.out.println(find_bob(new String[]{"Jimmy", "Layla", "Mandy", "Bob"}));
//        System.out.println(canCapture(new String[]{"A8", "E8"}));
//        System.out.println(Arrays.toString(capMe(new String[]{"Mavis", "Senaida", "Letty"})));
//        System.out.println(capMe(new String[]{"samuel", "MABELLE", "letitia", "meridith"}));
//        System.out.println(firstLast(new String[]{"edabit", "13", "true"}));
//        System.out.println(Arrays.toString(getExtension(new String[]{"code.html", "hello.css"})));
//        System.out.println(societyName(new String[]{"Adam", "Sarah", "Malcolm"}));
//        System.out.println(Arrays.toString(isFourLetters(new String[]{"Tomt", "poor", "Patir"})));
        System.out.println(letterCheck(new String[]{"THE EYES", "they see"}));
    }


    //---------------------------------------------------------------------------

    public static boolean letterCheck(String[] s) {
        String a = s[0].toLowerCase();
        String b = s[1].toLowerCase();
        for (char c : b.toCharArray()) if (!a.contains(Character.toString(c))) return false;
        System.out.print("First string in the array can contain second string whole character and result is --> ");
        return true;}

    public static String[] isFourLetters(String[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {     //(String value : s) same as
            if (s[i].length() == 4) {
                count++;
            }
        }

        String[] four = new String[count];
        for (int i = 0, j = 0; i < s.length; i++) {
            if (s[i].length() == 4) {
                four[j] = s[i];
                j++;
            }
        }
        return four;
    }


    public static String societyName(String[] friends) {
        String[] res = new String[friends.length];
        for (int i = 0; i < friends.length; i++) {
            res[i] = Character.toString(friends[i].charAt(0));
        }
        Arrays.sort(res);
        String s = "";
        for (int i = 0; i < res.length; i++) {
            s += res[i];
        }
        return s;
    }

    public static String[] getExtension(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[j] = arr[j].substring(arr[j].indexOf(".") + 1, arr[j].length());
            }
        }
        return res;
    }


    public static String[] firstLast(String[] arr) {
        String[] list = new String[]{arr[0], arr[arr.length - 1]};
        return list;
    }


    public static String[] capMe(String[] s) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < s.length; j++) {
                String s1 = String.valueOf(s[j].charAt(0)).toUpperCase();
                s[j] = s[j].substring(1, s[j].length()).toLowerCase();
//                String s2 = s[j].substring(1, s[j].length());
                s[j] = s1 + s[j];// + s2;
            }
        }
        System.out.println(Arrays.toString(s));
        return s;
    }

    public static boolean canCapture(String[] rooks) {
        if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
//same code with the top one//  return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
            return true;
        }
        return false;
    }


    public static int find_bob(String[] names) {
        int res = -1;
        for (int i = 0; i < names.length; ++i) {
            if (names[i].equals("Bob")) {
                res = i;
            }
        }
        return res;
    }

}
