//public class triangle {
// triangle   double area;
//    int height;
//    int length;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public static void main(String[] args) {
//        int x = 0;
//        triangle[] ta = new triangle[4];
//        while (x < 4) {
//            ta[x] = new triangle();
//            ta[x].height = (x + 1) * 2;
//            ta[x].length = x + 4;
//            ta[x].setArea();
//            System.out.print("triangle " + x + ", area");
//            System.out.println(" = " + ta[x].area);
//            x += 1;
//        }
//        int y = x;
//        x = 27;
//        triangle t5 = ta[2];
//        ta[2].area = 343;
//        System.out.print("y = " + y);
//        System.out.println(", t5 area = " + t5.area);
//    }
//
//    void setArea() {
//        area = (height * length) / 2;
//    }
//}
public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 19) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " "
                + m4a[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 1) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
