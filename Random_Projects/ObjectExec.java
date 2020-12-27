package Random_Projects;

public class ObjectExec {
    public static void main(String[] args) {
        System.out.println(checkEquality(new Integer(1), new Boolean(true)));
        System.out.println(checkEquality(new Integer(1), new Integer(1)));
        System.out.println(checkEquality(new Integer(0), "0"));
        System.out.println(checkEquality(null, false));

    }

    public static boolean checkEquality(Object a, Object b) {
        if(a==null || b==null){
            return false;
        }
        return a.equals(b);
    }
}
