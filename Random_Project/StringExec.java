import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
// nameShuffle is  swaping word order in the sentence;
//wordcounting is for vowels counting
//reversed is for reverse existing string
// firstvowel is for finding first vowel in the string

public class StringExec {


    public static void main(String[] args) {
//        System.out.println(nameShuffle("Donald Trump"));
//        System.out.println(reversed("Think different."));
//        System.out.println(wordCounting("Think different."));
//        System.out.println(doublechar("donald"));
//        System.out.println(firstVowel("hello"));
//        System.out.println(hashPlusCount("++####++++"));
//        System.out.println(doubleLetters("yummy"));
//        System.out.println(leftDigit("TrAdE2W1n95!"));
//        System.out.println(removeVowels("This election is a total sham and a travesty. We are not a democracy!"));
//        System.out.println(isValid("59001"));
//        System.out.println(sameCase("hello"));
//        System.out.println(canAlternate("0001111"));
//        System.out.println(calculateScores("CAABBBCC"));
//        System.out.println(getDecimalPlaces("400"));
//        System.out.println(indexShuffle("abcdefg"));
//        System.out.println(spaceMeOut("space"));
//        System.out.println(joinPath("1h1gRAxu/", "/apQtQYgl"));
//        System.out.println(findNemo("Is it Nemos, Nemona, Nemoor or Garfield?"));
//        System.out.println(sayHelloBye("jose", 1));
//        System.out.println(formatDate("11/12/2020"));
//        System.out.println(checkPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
//        System.out.println(getWord("maga", "zine"));
//        System.out.println(replaceVowels("the aardvark", '#'));
//        System.out.println(hammingDistance("strong","strung5"));
//        System.out.println(repeat("mice", 5));
//        System.out.println(preventDistraction("Ben Seni dinledim"));
//        System.out.println(isBetween("ostracize", "ostrich", "open"));
//        System.out.println(lettersOnly("R!=:~0o0./c&}9k`60=y"));
//        System.out.println(retrievePatch("6.11.19"));
//        System.out.println(getMiddle("inhabitant"));
//        System.out.println(validatePIN("u236"));
//        System.out.println(greaterThanOne("7/2"));
//        System.out.println(howManyTimes("abde"));
//        System.out.println(isValidPhoneNumber("(123) 456-7890"));
//        System.out.println(convertBinary("aZDT"));
//        System.out.println(maskify("tBy>L/cMe+?<j:6n;C~H"));
//        System.out.println(isPrefix("automation", "auto-"));
//        System.out.println(isSuffix("arachnophobia", "-phobia"));
//        System.out.println(countVowels("cheesecake"));
//        System.out.println(AlphabetSoup("hello"));
//        System.out.println(unstretch("ppoeemm"));
//        System.out.println(isIsogram("Algorism"));
//        System.out.println(removeSpecialCharacters("h-d+=rf[]_{}<>.,`~!@#$%^&*(|)"));
//        System.out.println(capToFront("hApPy"));
//        System.out.println(variableValid("2houn2t_spaces"));
//        System.out.println(isPallindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
//        System.out.println(isStrangePair("sparkling", "groups"));
//        System.out.println(reverse("Hello World"));
//        System.out.println(grabCity("[Last Day!] Beer Festival [Munich]"));
//        System.out.println(clearFog("troegfe"));
//        System.out.println(correctSpacing("  She  did   her      best     to   help him. "));
//        System.out.println(sameAscii("apple", "play"));
//        System.out.println(countUnique("sore", "zebra"));
//        System.out.println(split("What's the time?"));
//        System.out.println(isValidHexCode("#EAECEE"));
//        System.out.println(insertWhitespace("SheWalksToTheBeach"));
        System.out.println(firstNVowels("sharpening skills", 3));
    }

    //----------------------------------------------------------------------------


    public static String firstNVowels(String str, int n) {
        String s = str.replaceAll("(?i)[^aeiou]", "");
        System.out.print("Find "+n+"th vowels in the given string and result is --> ");
        return (n > s.length()) ? "invalid" : s.substring(0, n);
    }

    public static String insertWhitespace(String str) {
        System.out.print("Found uppercase letter in the given string and put whitespace\n" +
                "before the uppercase and result is --> ");
        return str.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
    }

    public static boolean isValidHexCode(String str) {
        return str.matches("#[a-fA-F0-9]{6}");
    }

    public static String split(String str) {
        String v = "";
        String c = "";
        v = v.concat(str.replaceAll("[aeuoiAEOUI]", ""));
        c = c.concat(str.replaceAll("[^aeuoiAEOUI]", ""));
        System.out.print("Find and move at the beginning vowels in the given string and result is --> ");
        return c.concat(v);

//        String s = "aeiuo";
//        String s1 = ""; String s2="";
//        for (int i = 0; i < str.length(); i++) {
////            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == s.charAt(i)){
//                    s1 +=str.charAt(i);
//                }else{
//                    s2 +=str.charAt(i);
//                }
////            }
//        }
//        return s1+s2;
    }


    public static int countUnique(String s1, String s2) {
        int res = 0;
        HashSet<String> set = new HashSet();
        for (int i = 0; i < s1.length(); i++) {
            set.add(Character.toString(s1.charAt(i)));
        }
        for (int i = 0; i < s2.length(); i++) {
            set.add(Character.toString(s2.charAt(i)));
        }
        for (String sr : set) {
            res++;
        }
        System.out.print("Finding unique letter between two different string = " + s1 + " & " + s2 + " and result is --> ");
        return res;
    }


    public static boolean sameAscii(String a, String b) {
        int s1 = 0;
        int s2 = 0;
        boolean res = true;
        for (int i = 0; i < a.length(); i++) {
            s1 += a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            s2 += b.charAt(i);
        }
        System.out.println(s1 + " " + s2);
        if (s1 == s2) {
            res = true;
        } else {
            res = false;
        }
        System.out.print("Each string's sum of ascii value is same or not and result is --> ");
        return res;
    }


    public static String correctSpacing(String sentence) {
        System.out.print("Remove white space from given string and result is --> ");
        return sentence.replaceAll("[\\s]+", " ").trim();

    }

    public static String clearFog(String str) {
        System.out.print("Remove the 'f' & 'o' & 'g' letter from given string and result is --> ");
        if (str.contains("f") && str.contains("o") && str.contains("g")) {
            return str.toLowerCase().replaceAll("[fog]", "");
        } else {
            return "It's a clear day!";
        }

    }


    public static String grabCity(String str) {
        System.out.print("Find city name in the given String = " + str + " and result is --> ");
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '[') {
                s = str.substring((i + 1), (str.length() - 1));
                break;
            }
        }
        return s;
//        return str.substring(str.lastIndexOf('[')+1, str.lastIndexOf(']'));
    }

    public static String reverse(String text) {
        String s = "";
        for (int i = (text.length() - 1); i >= 0; i--) {
            if (Character.isUpperCase(text.charAt(i))) {
                s += text.toLowerCase().charAt(i);
            } else {
                s += text.toUpperCase().charAt(i);
            }
        }
        return s;
    }

    public static boolean isStrangePair(String s1, String s2) {
        boolean res = true;
        System.out.print("Given first str's first letter is equal to second str's last letter\n" +
                "and second str's first letter is equal to first str's last letter first str = " + s1 + "\n" +
                "second str =" + s2 + " and result is --> ");
        if (s1.length() > 0 && s2.length() > 0) {
            return (s1.charAt(0) == s2.charAt(s2.length() - 1) && s2.charAt(0) == s1.charAt(s1.length() - 1));
        } else if (s1.length() != 0 || s2.length() != 0) {
            res = false;
        }
        return res;
    }


    public static boolean isPallindrome(String str) {
        String reverse = "";
        boolean res = false;
        str = str.toLowerCase().replaceAll("\\W", "");
        for (int j = str.length() - 1; j >= 0; j--) {
            reverse += str.toLowerCase().charAt(j);
        }
        if (reverse.equals(str)) {
            res = true;
        }
        return res;
    }

    public static boolean variableValid(String variable) {
        boolean res = true;
        for (int i = 0; i < variable.length(); i++) {
            if (Character.isDigit(variable.charAt(0))) {
                res = false;
            } else if (variable.charAt(i) == ' ') {
                res = false;
            }
        }
        System.out.print("Check first letter don't be number and don't\n " +
                "contain white space given string is= " + variable + " result is--> ");
        return res;
//        System.out.print("Check first letter don't be number and don't\n " +
//                "contain white space given string is= "+variable+" result is--> ");
//        return variable.matches("[a-zA-z][0-9a-zA-z]*");
    }

    public static String capToFront(String str) {
//        return str.replaceAll("[a-z]", "") + str.replaceAll("[A-Z]", ""); //shortcut

        String tUp = "";
        String tLo = "";
        for (int j = 0; j < str.length(); j++) {
            if (Character.isUpperCase(str.charAt(j))) {
                tUp += str.charAt(j);
            } else {
                tLo += str.charAt(j);
            }
        }
        return tUp + tLo;
    }

    public static String removeSpecialCharacters(String s) {
        System.out.print("Remove punctuation letter from given string(except -_) = " + s + " result is -> ");
        return s.replaceAll("[^\\w\\s-]", "");
//        return s.replaceAll("[^-_a-zA-Z0-9\\s]", "");
//        return s.replaceAll("[^a-zA-Z0-9\\-_ ]", "");
//        return s.replaceAll("[:@&?=<{}>`#|{[]}()]^+,.!/~*'%$]", "").replaceAll("\\[","");
//-------------------------REMOVE UNWANTED CHARACTER FROM GIVEN STRING WITH THEIR ASCII CODES-----------
//            String output = "";
//            for (int i = 0; i < s.length(); i++) {
//                char c = s.charAt(i);
//                boolean add = false;
//                if (c == 32 || c == 45 || c == 95)
//                    add = true;
//                else if (c >= 48 && c <= 57)
//                    add = true;
//                else if (c >= 65 && c <= 90)
//                    add = true;
//                else if (c >= 97 && c <= 122)
//                    add = true;
//
//                if (add)
//                    output = output + c;
//            }
//            return output;
//

    }

    public static boolean isIsogram(String str) {
        boolean res = true;
        char c = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
                    res = false;
                    break;
                }
            }
        }
        System.out.print("String has no repeating letters, consecutive or nonconsecutive = " + str + " result is -> ");
        return res;


        //        boolean res =true;
//        char c=str.charAt(0);
//        for (int i = 1; i < str.length(); i++) {
//            if (str.toLowerCase().charAt(i-1)==str.toLowerCase().charAt(i)){
//                res=false;
//                break;
//            }
//        }
//        System.out.print("String has no repeating letters, consecutive = "+str+" result is -> ");
//        return res;
    }

    public static String unstretch(String word) {
        char c = word.charAt(0);
        String res = "" + c;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                continue;
            } else {
                c = word.charAt(i);
                res += c;
            }
        }
        System.out.print("Remove recursive double letter given string " + word + " result is -> ");
        return res;

        //REMOVE ALL DOUBLE LETTER IN THE GIVEN STRING
//        int idx = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            idx = word.indexOf(c, i + 1);
//            if (idx==-1){
//                sb.append(c);
//            }
//        }
//        return String.valueOf(sb);


    }

    public static String AlphabetSoup(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (Character.toLowerCase(c[j]) < Character.toLowerCase(c[i])) {
                    char t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        return new String(chars);
        System.out.print("Display alphebetical order given string " + s + " turned to -> ");
        return String.valueOf(c);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.print("Count vowel in the given string " + str + " counted -> ");
        return count;
    }

    public static boolean isPrefix(String word, String prefix) {
//        prefix = prefix.replaceAll("-", "");
        System.out.print("Found given string " + word + " is contain " + prefix + " -> ");
        return word.startsWith(prefix.replaceAll("-", ""));
    }

    public static boolean isSuffix(String word, String suffix) {
        System.out.print("Found given string " + word + " is contain " + suffix + " -> ");

        return word.endsWith(suffix.replaceAll("-", ""));
    }


    public static String maskify(String s) {
//        return s.replaceAll(".(?=.{4})", "#");

        String str = "";
        String s1 = "";
        if (s.length() > 4) {
            s1 = s.substring(s.length() - 4);
            str = s.substring(0, (s.length() - 4));
        } else {
            return s;
        }
        s = str.replaceAll(".(?=.)", "#") + s1;
        System.out.print("Hashing given string only last 4 character -> ");
        return s;
    }


    public static String convertBinary(String str) {
        str = str.replaceAll("[n-zN-Z]]*", "1");
        str = str.replaceAll("[a-zA-M]]*", "0");

//        return str.replaceAll("[a-mA-M]", "0").replaceAll("[n-zN-Z]", "1");
        System.out.print("Convert string to binary " + str + " turned to -> ");
        return str;
    }


    public static boolean isValidPhoneNumber(String s) {
//        if (s.charAt(0)=='(' && s.charAt(4)==')'&& s.charAt(5)==' '&& s.charAt(9)=='-'&& s.length()==14) return true;
//        else return false;
        System.out.print("Given string has proper pattern on not " + s + " -> ");
        return s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    }


    public static int howManyTimes(String msg) {
        int res = 0;
        for (int i = 0; i < msg.length(); i++) {
            if (Character.isUpperCase(msg.charAt(i))) {
                res = (res - 64) + msg.charAt(i);
            } else if (Character.isLowerCase(msg.charAt(i))) {
                res = (res - 96) + msg.charAt(i);

            }
        }
        System.out.print("Given string sum ascii value " + msg + " and result is -> ");
        return res;
    }

    public static boolean greaterThanOne(String frac) {

        int numerator = Integer.parseInt(frac.substring(0, frac.indexOf("/")));
        int denominator = Integer.parseInt(frac.substring(frac.indexOf("/") + 1));
        if (numerator > denominator)
            return true;
        else
            System.out.print("Given fraction string greater than 1 or not " + frac + " result is -> ");
        return false;

//        double res=0.0;
//        if (frac.contains("/")) {
//            String[] rat = frac.split("/");
//            res =Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
//        } else {
//            res =Double.parseDouble(frac);
//        }
////        System.out.println(res);
//        return res < 1;
    }


    public static boolean validatePIN(String s) {
        boolean res = false;
        if (s.length() == 4 || s.length() == 6) {
            if (s.replaceAll("(?i)[^0-9]", "") == s) {
                res = true;
            } else {
                return res;
            }
        }
        System.out.print("Given string number is valid number or not " + s + " and result is -> ");
        return res;
    }


    public static String getMiddle(String word) {
        if (word.length() == 1) {
            return word;
        } else if (word.length() % 2 == 0) {
            word = word.substring((((word.length() - 2) / 2)), (((word.length() - 2) / 2)) + 2);
        } else {
            word = word.substring(((((word.length() - 2) / 2)) + 1), (((word.length() - 2) / 2)) + 2);
        }
        System.out.print("Given string found middle character " + word + " and result is -> ");
        return word;
    }


    public static String retrieveMajor(String semver) {
        return semver.split("\\.")[0];
    }

    public static String retrieveMinor(String semver) {
        return semver.split("\\.")[1];
    }

    public static String retrievePatch(String semver) {
        return semver.split("\\.")[2];
    }

    public static String lettersOnly(String str) {
//        return str.replaceAll("(?i)[^a-z]", ""); //short way below the code
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                res += str.charAt(i);
            }
        }
        return res;
    }


    public static boolean isBetween(String first, String last, String word) {
        System.out.print("Given word is there between other strings " + first + " " + last + " " + word + " and result is -> ");
        return first.compareTo(word) < 0 && last.compareTo(word) > 0;
//        int a= first.compareTo(word);
//        int b=last.compareTo(word);
//        boolean res = false;
//        if (a<0 && b>0) res=true;
//            return res;
    }


    public static String preventDistraction(String arr) {
        String[] list = {"anime", "meme", "vines", "roasts", "Danny DeVito"};
        for (int i = 0; i < arr.length(); i++) {
            for (int j = 0; j < list.length; j++) {
                if (arr.contains(list[j])) {
                    return "NO!";
                }
            }
            Arrays.toString(list);

        }
        System.out.print("The movie save or not check the precise word " + arr + " and result is -> ");
        return "Safe for watching!";

//        if (args.contains("anime")) {
//            return "NO!";
//        }
//        if (args.contains("meme")) {
//            return "NO!";
//        }
//        if (args.contains("vines")) {
//            return "NO!";
//        }
//        if (args.contains("roasts")) {
//            return "NO!";
//        }
//        if (args.contains("Danny DeVito")) {
//            return "NO!";
//        }
//        else {
//            return "Safe watching!";
//        }
    }


    public static String repeat(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                s += str.charAt(i);
            }
        }
        System.out.print("Repeat each letter with the " + n + " times = " + str + " and result is -> ");
        return s;
    }


    public static String hammingDistance(String str1, String str2) {
        int max = 0;
        int count = 0;
        System.out.print("" + str1 + " " + str2 + " and result is -> ");
        return str1.substring(0, 2) + "/" + str1.substring(2, 6);
//        if (str1.length() > str2.length()) {
//            return max = str1.length();
//        } else {
//            max = str2.length();
//        }
//
//        System.out.println(max);
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) != str2.charAt(i)) {
//                count += 1;
//            }
//        }
//        return count;
    }


    public static String replaceVowels(String str, char ch) {
        String vowels = "aeiouAEUIO";
        for (int i = 0; i < vowels.length(); ++i) {
            for (int j = 0; j < str.length(); j++) {
                if (vowels.charAt(i) == str.charAt(j)) {
                    str = str.replaceAll(String.valueOf(vowels.charAt(i)), Character.toString(ch));
                }
            }
        }
        System.out.print("Replace vowels with the #= " + str + " and result is -> ");
        return str;
    }


    public static String getWord(String left, String right) {
        String str = left + right;
        String s = "";
        s = s + (char) (str.charAt(0) - 32);
        str = s + str.substring(1, str.length());
        System.out.print("Merge two word in the one word= " + left + " " + right + " and result is -> ");
        return str;

    }

    public static boolean checkEnding(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
//        System.out.println(str1.substring((len1 - 2), (len1)));
//        System.out.println(str2.substring((len2 - 2), (len2)));
        if (str1.length() > 1 && str2.length() > 1) {
            if (str1.substring((len1 - 2), (len1)).equals(str2.substring((len2 - 2), (len2)))) {
                return true;
            }
        }
        System.out.print("" + str1 + " " + str2);
        return false;
    }


    public static boolean checkPalindrome(String str) {
        String reverse = "";
        boolean res = false;
        for (int i = str.length() - 1; i >= 0; --i) {
            reverse += str.charAt(i);
        }
        if (reverse.equals(str)) {
            res = true;
        }
        System.out.print("Check the given letter palindrome or not= " + str + " and result is -> ");
        return res;
    }

    public static int countWords(String s) {
        String[] words = s.split(" ");
        System.out.print("Count letter in the given string= " + s + " and result is -> ");
        return words.length;
    }

    public static String formatDate(String date) {

//        date= date.toUpperCase();
//        String reverse="";
//        for(int i=date.length()-1;i>=0;--i){
//            reverse += date.charAt(i);
//        }
//        return reverse;

        date = date.toUpperCase();
        for (int i = 0; i < date.length(); ++i) {
            if (date.charAt(i) == '/') {
                date = date.replace("/", "");
            }
        }
        System.out.print("Date is rearrange to format or not " + date + " and result is -> ");
        return date.substring(4, 8) + date.substring(2, 4) + date.substring(0, 2);
    }

    public static String sayHelloBye(String name, int num) {
        String res = "";
        if (num == 0) {
            res = "Bye " + (name.substring(0, 1).toUpperCase() + name.substring(1, name.length()));
        } else if (num == 1) {
            res = "Hello " + (name.substring(0, 1).toUpperCase() + name.substring(1, name.length()));
        }
        System.out.print("Greatings string with num " + name + " " + num + " and result is -> ");
        return res;
    }

    public static String findNemo(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Nemo")) {
                System.out.print("Given string has contain 'Nemo' and string " + sentence + " and result is -> ");
                return "I found Nemo at " + (i + 1) + "!";
            }
        }
        System.out.print("Given string has contain 'Nemo' and string " + sentence + " and result is -> ");
        return "I can't find Nemo :(";
    }


    public static String joinPath(String portion1, String portion2) {
        if (portion1.contains("/") || portion2.contains("/")) {
            portion1 = portion1.replace("/", "");
            portion2 = portion2.replace("/", "");
        }
        System.out.print("Put / between in the given strings " + portion1 + ", " + portion2 + " and result is -> ");
        return portion1 + "/" + portion2;
    }

    public static String spaceMeOut(String str) {
        String s = "", b = " ";
        for (int i = 1; i < str.length(); i++) {
            s += b + str.charAt(i);
        }
        System.out.print("Make s space between each letter given string " + str + " and result is -> ");
        return str.charAt(0) + s;
    }


    public static String indexShuffle(String str) {

        String o = "", e = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                e += str.charAt(i);   //String.valueOf(str.charAt(i));
            } else {
                o += str.charAt(i);   //String.valueOf(str.charAt(i));
            }
        }
        System.out.print("Sum, odd and even index in the given string " + str + " and result is -> ");
        return e + o;
    }


    public static boolean canAlternate(String str) {
        int cone = 0, czero = 0;
        boolean res = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '1') {
                cone += 1;
            } else if (c == '0') {
                czero += 1;
            }
        }
        if (str.length() % 2 == 1) {
            if (cone + 1 == czero || czero + 1 == cone) {
                res = true;
            }
        } else {
            if (cone == czero) {
                res = true;
            }
        }
        System.out.print("Count 1 and 0 in the given string " + str + " and result is -> ");
        return res;
    }


    public static int getDecimalPlaces(String num) {
        if (num.lastIndexOf('.') < 0) return 0;
        System.out.print("Given string has contain decimal number =" + num + " and result is -> ");
        return num.length() - num.lastIndexOf('.') - 1;
    }


//        int s=0, res=0;
//        for (int i = 0; i < num.length(); i++) {
//            if (num.charAt(i)=='.'){
//                s= i;
//                res=num.length()-1-s;
//            }
//        }
//        if (s==0){  res=0; }
//        System.out.println(s);
//        return res;
//    }

    public static boolean sameCase(String str) {
        if (str.matches("[A-Z]*")) {
            return true;
        } else if (str.matches("[a-z]*")) {
            return true;
        }
        System.out.print("All letter in the given string lowercase or uppercase " + str + " and result is -> ");
        return false;

    }


    public static int[] calculateScores(String str) {
        int[] res = new int[3];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                res[0] += 1;
            } else if (str.charAt(i) == 'B') {
                res[1] += 1;
            } else if (str.charAt(i) == 'C') {
                res[2] += 1;
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.print("Count precise letter in the given string " + str + " and result is -> ");
        return res;
    }


    public static boolean isValid(String zip) {
        boolean res = false;
        for (int i = 0; i < zip.length(); i++) {
            char c = zip.charAt(i);
            if (zip.length() > 5 || zip.contains(" ") || !Character.isDigit(c)) {
                res = false;
                break;
            } else {
                res = true;
            }
        }
        System.out.print("Given string zip is valid or not " + zip + " and result is -> ");
        return res;
    }

    public static String removeVowels(String s) {
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); ++i) {
            for (int j = 0; j < s.length(); j++) {
                if (vowels.charAt(i) == s.charAt(j)) {
                    s = s.replaceAll(String.valueOf(vowels.charAt(i)), "");
                }
            }
        }
        System.out.print("Remove vowels in the given string " + s + " and result is -> ");
        return s;
    }


    public static int leftDigit(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                index = Integer.parseInt(String.valueOf(c));
                break;
            }
        }
        System.out.print("What is the first digit in the given string " + str + " and result is -> ");
        return index;
    }

    public static boolean doubleLetters(String word) {
        for (int i = 1; i < word.length(); ++i) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                System.out.print("is there doubled letter in the given string " + word + " and result is -> ");
                return true;
            }
        }
        System.out.print("Is there doubled letter in the given string " + word + " and result is -> ");
        return false;
    }


    public static int[] hashPlusCount(String s) {
        int[] count = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                count[0] += 1;
            } else if (s.charAt(i) == '+') {
                count[1] += 1;
            }
        }
        System.out.print("Count hashing given string " + s + " and result is -> ");
        return count;
    }

    public static int firstVowel(String str) {
        String vowels = "aeiou";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1)
                return i;
            System.out.print("Return first vowels index in the given string " + str + " and result is -> ");

        }
        System.out.print("Return first vowels index in the given string " + str + " and result is -> ");
        return 0;

//        int vowelsindex = 0;
////        String vowels = "aeiouAEIOU";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                vowelsindex = i + 1;
//                break;
//            }
//        }
//        return vowelsindex;
    }

    public static String doublechar(String s) {
        String as = "";
        for (int i = 0; i < s.length(); ++i) {
            as = as + s.charAt(i) + s.charAt(i);
//            as += s.charAt(i);
//            as += s.charAt(i);
        }
        System.out.print("Doubled each letter in the given string " + s + " and result is -> ");
        return as;

//        String db = "";
//        for (char n : s.toCharArray()) {
//            db += n;
//            db += n;
//
//        }
//        return db;
    }


    public static int wordCounting(String str) {
        int vowelsCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j < vowels.length(); ++j) {
                if (c == vowels.charAt(j)) {
                    vowelsCount += 1;
                }
            }
        }
        System.out.print("Count vowels in the given string " + str + " and result is -> ");
        return vowelsCount;
    }

    public static String reversed(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            reverse += str.charAt(i);
        }
        System.out.print("Swap letter in reversed order the given string " + str + " and result is -> ");
        return reverse;
    }

    public static String nameShuffle(String str) {
        String[] str1 = str.split(" ");
        String temp = str1[0];
        str1[0] = str1[1];
        str1[1] = temp;
        System.out.print("Swap word in the given string " + str + " and result is -> ");
        return str = String.join(" ", str1);
    }
}
