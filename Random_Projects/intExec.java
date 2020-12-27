package Random_Projects;

import java.text.DecimalFormat;

public class intExec {

    public static void main(String[] args) {
//        System.out.println(programmers(11, 5, 9));
//        System.out.println(lastDigit(12, 15, 10));
//        System.out.println(solveForxp(4, 1024));
//        System.out.println(nSidedShape(5));
//        System.out.println(fac(7, 3, "+"));
//        System.out.println(totalDistance(0.2, 0.4, 100.0));
//        System.out.println(triangle(215));
//        System.out.println(countOnes(999));
//        System.out.println(largestSwap(43));
//        System.out.println(largestSwap(14));
//        System.out.println(largestSwap(27));
//        System.out.println(Arrays.toString(amplify(25)));
//        System.out.println(digitalClock(5025));
//        System.out.println(returnTheEndOfNumber(511));
//        System.out.println(Fibonacci(8));
//        System.out.println(Arrays.toString(findEvenNums(9)));
//        System.out.println(PrimeNumberInRange(10, 12));
//        System.out.println(isPrimenum(1));
//        System.out.println(fib(8));
//        System.out.println(isSymmetrical(7227));
//        System.out.println(binary(100));
//        System.out.println(mean(666));
//        System.out.println(factorGroup(19));
//        System.out.println(gcd(32, 8));
//        System.out.println(boxSeq(99));
//        System.out.println(halveCount(8845, 4));
//        System.out.println(formatNum(12948));
        System.out.println(powerOfTwo(32));
    }


    //    -------------------------------------------------------------------


    public static boolean powerOfTwo(int num) {
        boolean res=false;
        for (int i=0;i<num;i++){
            if (num==(double) Math.pow(2,i)){
                res= true;
                break;
            }
        }
        return res;
    }


    public static String formatNum(int num) {
        DecimalFormat dc = new DecimalFormat("#,###");
        return  dc.format(num);

        }



    public static int halveCount(int a, int b) {
        int count = 0;
        double d = a;
        while (d / 2 > b) {
            d /= 2;
            count++;
        }
        return count;
    }


    public static int boxSeq(int step) {
        if (step % 2 == 0) {
            return step;
        } else {
            return step + 2;
        }

//        int res = 0;
//        int s = 0;
//        if (step == 0) {
//            return 0;
//        } else {
//            while (step>=1) {
//                if (step % 2 == 1) {
//                    res += 3;
//                    step--;
////
//                } else {
//                    res -= 1;
//                    step--;
//                }
//            }
//        }
//        return res;
    }


    public static int gcd(int n1, int n2) {
//        return (n2 == 0) ? n1 : gcd(n2, n1 % n2);
        int min = Math.min(n1, n2);
        int res = 0;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                res = i;
            }
        }
        return res;
    }


    public static String factorGroup(int num) {             //CONSIDERABLE
        boolean b = (int) Math.sqrt(num) == Math.sqrt(num);
        if (b) {
            return "odd";
        }
        return "even";
    }


    public static int mean(int a) {
        int i = 0;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
            i++;
        }
        return sum / i;

    }


    public static String binary(int decimal) {
        return Integer.toBinaryString(decimal);
//        String s = "";
//        int d = 0;
//        String reverse = "";
//        if (decimal==0){
//            reverse ="0";
//        }
//        else{
//            while (decimal > 0) {
//                s += decimal % 2;
//                decimal /= 2;
//            }
//            for (int i = s.length() - 1; i >= 0; --i) {
//                reverse += s.charAt(i);
//            }
//        }
//        return reverse;
    }


    public static boolean isSymmetrical(int num) {
        //Look at this code it must works
////        String s = String.valueOf(num);
////        StringBuilder st = new StringBuilder();
////        return st.reverse().toString().equals(s);

        int reverse = 0;
        int n = num;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        if (n != reverse) {
            return false;
        }
        return true;
    }


    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 0; i < (n - 1); i++) {
            c = b + a;
            a = b;
            b = c;
        }
        return c;
    }


    public static boolean PrimeNumberInRange(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        else if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimenum(int num) {
        boolean res = true;
        if (num == 1) {
            res = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    res = false;
                }
            }
        }
        return res;
    }

    public static int[] findEvenNums(int num) {
        int[] list = new int[num / 2];
        int j = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                list[j] = i;
                j += 1;
            }
        }
        return list;
    }

    public static int Fibonacci(int a) {
//        int b = 0, c = 1, d = 1;
//        for (int i = 0; i < a; i++) {
//            d = b + c;
//            b = c;
//            c = d;
//        }
//        return d;
        if (a <= 1) {
            return 1;
        }
        return Fibonacci(a - 2) + Fibonacci(a - 1);

    }


    public static String returnTheEndOfNumber(int num) {
        int lastSecondDigit = num % 100;
        int lastDigit = lastSecondDigit % 10;
        if (lastDigit == 1) {
            if (lastSecondDigit == 11) {
                return num + "-TH";
            }
            return num + "-ST";
        }
        if (lastDigit == 2) {
            if (lastSecondDigit == 12) {
                return num + "-TH";
            }
            return num + "-ND";
        }
        if (lastDigit == 3) {
            if (lastSecondDigit == 13) {
                return num + "-TH";
            }
            return num + "-RD";
        } else {
            return num + "-TH";
        }
    }


    public static String digitalClock(int seconds) {
        int min, hour;
        String s = "";
        min = (seconds / 60) % 60;
        hour = seconds / 3600;
        seconds = seconds % 60;
        if (hour > 23) {
            hour = (seconds / 3600) % 24;
        }
        return (String.format("%02d", hour) +
                ":" + String.format("%02d", min) +
                ":" + String.format("%02d", seconds));
    }

    public static int[] countdown(int start) {
        int[] list = new int[start + 1];
        for (int i = start; i >= 0; --i) {
            list[start - i] = i;
        }
        return list;
    }


    public static int[] amplify(int num) {
        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            res[i] = i + 1;

        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] % 4 == 0) {
                res[i] = (1 + i) * 10;
            }
        }
        return res;
    }

    public static boolean largestSwap(int num) {
        String swap = "";
        boolean res = true;
        String snum = String.valueOf(num);
        int s = Integer.parseInt(Character.toString(snum.charAt(1)) + Character.toString(snum.charAt(0)));
        if (num < s) {
            res = false;
        }
        return res;

//        String number = String.valueOf(num);
//        int i = number.charAt(0);
//        int j = number.charAt(1);
//        if (j > i){
//            return false;
//        }
//        else{
//            return true;
//        }
//
//        int dig1 = num%10;
//        int dig2 = num/10;
//        return dig2>=dig1;

    }

    public static int countOnes(int n) {
        int sum = 0;
        int res = 0;
        for (int i = n; i > 0; --i) {
            sum += (n % 2);
            n /= 2;
        }
        return sum;
    }


    public static int triangle(int num) {
        int dot = 0;
        for (int i = 1; i <= num; ++i) {
            dot += i;
        }
        return dot;
    }


    public static double totalDistance(double height, double length, double tower) {
        double dist = (tower / height);
        dist = (height * dist) + (length * dist);
        return dist;
    }

    public static int fac(int num1, int num2, String ope) {
        switch (ope) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
        }
        return -1;
    }


    public static String nSidedShape(int n) {
        String[] list = new String[]
                {"circle", "semi-circle", "triangle", "square", "pentagon", "hexagon",
                        "heptagon", "octagon", "nonagon", "decagon"};
        return list[n - 1];

    }


    public static int solveForxp(int a, int b) {
        int res = 0;
        int p = 0;
//        Long lb = Long.valueOf(b);
        while (true) {
            if (Math.pow(a, p) == b) {
                res = p;
                break;
            }
            p++;
        }
        return res;
    }

    public static boolean lastDigit(int a, int b, int c) {
        a %= 10;
        b %= 10;
        c %= 10;
        int dgt = 0;
        dgt = (b * a) % 10;
        if (c == dgt) {
            return true;
        }
        return false;
    }

    public static int programmers(int one, int two, int three) {
        int max = Math.max(one, two);
        int min = Math.min(one, two);
        if (three > max) {
            max = three;
        }
        if (three < min) {
            min = three;
        }
        return max - min;
    }
}
