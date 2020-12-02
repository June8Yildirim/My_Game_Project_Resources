import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class regexExamples {
    //    public class DemoForQuantifiers {
    public static void main(String[] args) {


        String input3 = "I have a cat, dog, mat,cas and rat.";
        Pattern p11 = Pattern.compile("(c|d|r|m)[a][ts]");
        Matcher m11 = p11.matcher(input3);
        List<String> animal2 = new ArrayList<>();
        while (m11.find()) {
            System.out.println("Found a " + m11.group() + ".");
            animal2.add(m11.group());
        }
        System.out.println("------------------------------------------");

        String input2 = "User userId=23421. Some more userId=33432. This is userNum=100";
        Pattern p10 = Pattern.compile("(userId=)(\\d+)");
        Matcher m10 = p10.matcher(input2);
        StringBuffer result = new StringBuffer();
        while (m10.find()) {
            System.out.println("Masking: " + m10.group(2));
            m10.appendReplacement(result, m10.group(1) +  "***masked***");
        }
        m10.appendTail(result);
        System.out.println(result);

        System.out.println("------------------------------------------");

        String input1 = "I have a wolf, but I like to read book better.";
        Pattern p9 = Pattern.compile("(kindle|read|book|wolf|bear|human)");
        Matcher m9 = p9.matcher(input1);
        List<String> animals = new ArrayList<>();
        while (m9.find()) {
            System.out.println("Found a " + m9.group() + ".");
            animals.add(m9.group());
        }


        System.out.println("------------------------------------------");
        /////////////////////////////////////////////////////////////
        String text9 = "John writes about this, and John writes about that, and John writes about everything. ";
        String patternString1 = "(John)"; // Find the group John
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text9);
        while (matcher.find()) {
            System.out.println("found: " + matcher.group(1));
        }

        System.out.println("------------------------------------------");

        ///////////////////////////////////////////////////////////////////
        List<String> input = new ArrayList<>();
        input.add("123-45-6789");
        input.add("9876-5-4321");
        input.add("987-65-4321 (attack)");
        input.add("987-65-4321 ");
        input.add("192-83-7465");
        String patternString = "^(\\d{3}-?\\d{2}-?\\d{4})$";
        for (String ssn : input) {
            if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
                System.out.println("Found good SSN: " + ssn);
            }
        }// 􀀀 This is the match’s method of the string class.It can be used for simple validations
        Pattern pattern1 = Pattern.compile(patternString);
        for (String ssn : input) {
            Matcher m = pattern1.matcher(ssn);
            if (m.matches()) {System.out.println("Found good SSN:" + ssn);
            }
        } //This is the code using the Pattern and Matcher methods of the regex class .

        System.out.println("------------------------------------------");

/////////////////////////////////////////////////////////////////////////////////////

    String regex = "a?"; //--> to match a in abaa once or not at all
    String regex1 = "a*"; // to match a in abaa zero or more times
    String regex2 = "a+"; // greedy quantifier to match a in abaa one or more times
    String regex3 = "a{2}"; // greedy quantifier to match every aa sequence in aababbaaaab
    String regex4 = "a{2,}"; // greedy quantifier to match two or more consecutive as in aababbaaaab
    String regex5 = "a{1,3}"; // greedy quantifier to match every a, aa, or aaa in aababbaaaab
    String regex6 = "a+?"; // reluctant quantifier to match a in abaa one or more times
    String regex7 = ".*+end"; // uses a possessive quantifier to match all characters followed by end in This is the end zero or more times
    String text = "abaa";
    String text1 = "abaa";
    String text2 = "abaa";
    String text3 = "aababbaaaab";
    String text4 = "aababbaaaab";
    String text5 = "aababbaaaab";
    String text6 = "abaa";
    String text7 = "This is the end";
    Pattern p1 = Pattern.compile(regex);
    Pattern p2 = Pattern.compile(regex1);
    Pattern p3 = Pattern.compile(regex2);
    Pattern p4 = Pattern.compile(regex3);
    Pattern p5 = Pattern.compile(regex4);
    Pattern p6 = Pattern.compile(regex5);
    Pattern p7 = Pattern.compile(regex6);
    Pattern p8 = Pattern.compile(regex7);
    Matcher m1 = p1.matcher(text);
    Matcher m2 = p2.matcher(text1);
    Matcher m3 = p3.matcher(text2);
    Matcher m4 = p4.matcher(text3);
    Matcher m5 = p5.matcher(text4);
    Matcher m6 = p6.matcher(text5);
    Matcher m7 = p7.matcher(text6);
    Matcher m8 = p8.matcher(text7);
        while(m1.find())

    {
        System.out.println("Start index--> " + m1.start() + " End index--> " + m1.end());
    }
        System.out.println("-----------------------------------------------");
        while(m2.find())

    {
        System.out.println("Start index--> " + m2.start() + " End index--> " + m2.end());
    }
        System.out.println("-----------------------------------------------");
        while(m3.find())

    {
        System.out.println("Start index--> " + m3.start() + " End index--> " + m3.end());
    }
        System.out.println("-----------------------------------------------");
        while(m4.find())

    {
        System.out.println("Start index--> " + m4.start() + " End index--> " + m4.end());
    }
        System.out.println("-----------------------------------------------");
        while(m5.find())

    {
        System.out.println("Start index--> " + m5.start() + " End index--> " + m5.end());
    }
        System.out.println("-----------------------------------------------");
        while(m6.find())

    {
        System.out.println("Start index--> " + m6.start() + " End index--> " + m6.end());
    }
        System.out.println("-----------------------------------------------");
        while(m7.find())

    {
        System.out.println("Start index-- > " + m7.start() + " End index--> " + m7.end());
    }
        System.out.println("-----------------------------------------------");
        while(m8.find())

    {
        System.out.println("Start index--  > " + m8.start() + " End index--> " + m8.end());
    }
}
}


