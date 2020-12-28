package GoFish;

public class tests {
    public static void main(String[] args) {
//        System.out.println(countTQ("T123 Q bqy tt") );
//        System.out.println(countTQ("abcde  fghijklm nopqrs TuvwxyZ"));
//        System.out.println(countTQ("ZERO to see here") );
//        System.out.println(getQuality(123));
//        System.out.println(getQuality(1));
//        System.out.println(getQuality(51));
        int[] y1 = {1, 2, 3};
        int[] x1 = {3, 6, 9};
        int[] x2 = {6, 15, 12, 21};
        int[] y2 = {2, 5, 4, 7};
        int[] y3 = {1, 3, 2};
        int[] x3=  {3,6,9};
        int[] y4 = {1, 2, 3, 4};
        int[] x4 = {3, 6, 9};

        int[] y = {1, 2 };
        int[] x = {3, 6, 9};

        System.out.println(isThreeTimes(x1, y1)); //true
        System.out.println(isThreeTimes(x2, y2)); //true
        System.out.println(isThreeTimes(x3, y3)); //false
        System.out.println(isThreeTimes(x4, y4)); //false
        System.out.println(isThreeTimes(x, y)); // false

    }


    public static boolean isThreeTimes(int[] x, int[] y) {
        boolean confirmation = true;
        if (x.length != y.length) {
            confirmation = false;
        }
        else {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != 3 * y[i]) {
                    confirmation = false;
                }
            }
        }
        return confirmation;
    }
//public static char getQuality(int qualityNumber ){
//        char qaulityLetter;
//        if (qualityNumber>= 100 && qualityNumber<= 150){
//            qaulityLetter ='A';
//        } else  if (qualityNumber>= 50 && qualityNumber<= 90){
//            qaulityLetter ='B';
//        } else  if (qualityNumber>= 20 && qualityNumber<= 40){
//            qaulityLetter ='C';
//        } else{
//            qaulityLetter='U';
//        }
//        return qaulityLetter;
//}


//    public static int countTQ(String word) {
//        int count=0;
//        for (int i=0; i<word.length();i++){
//            if (word.charAt(i)=='T' || word.charAt(i)=='t'|| word.charAt(i)=='Q'|| word.charAt(i)=='q'){
//                count++;
//            }
//        }
//        return count;
//    }


//        int x=8;
//        int y=0;
//        int c=1;
//        boolean dobe= false;
//        while (!dobe){
//            dobe = (x > y)? false:true;
//            System.out.println("step"+c);c++;
//            System.out.println(x +" "+ y);
//            x--;
//            y +=2;
//
//        }


//        int[] arr = {2,1,0};
//        int f=3;
//        fun2(arr,f);
//        System.out.println(arr[1]*f);


}
//    public static int fun2(int[] a, int f){
//        for (int i=0;i< a.length;i++){
//            a[i]= a[i]+f;
//        }
//        f=0;
//        return f;
//    }
//        int x = 3;
//        int y = 2;
//        int t = fun(x, y);
//        int z = x + t;
//        System.out.println(z);
//    }
//    public static int fun(int a, int b) {
//        a = b * 2;
//        return a;
//    }


//        String s= "afs sfs fasd";
//        System.out.println(s.charAt(s.length()));
//        int a = 3;
//        double b = 2.0;
//        char c = 'g';
//
//        boolean chec = (a < 5) || (a / b >= 1) && !(c > 'd');
//        System.out.println(chec);
//        int c=0;
//        for (int i=5; i<=15;i++){
//            System.out.println("hava");
//            System.out.println( "sdfs"+c);
//            c++;

//        }
//int n=-5;
//        System.out.println(n<11 && n>0 ? "fd" :"dfdf");
//        int[] a = {4,3,1,2,5};
//        System.out.println(a[-1]);
//        System.out.println(a[a[3]]);
//        System.out.println(a.length);
//
//        int n=100;
//        if ((n>10 && n<30)){
//            System.out.println("3");
//        }else {
//            System.out.println("r");
//        }
//String foo ="java is great";
//        System.out.println((char) (foo.charAt(5)+3));

//      String [] f = new  String[] {"w","e","r"};
//      String[] d= f;
//      d[0]="890808";
//        System.out.println(f[0]);


//}


