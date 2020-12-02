public class booleanExec {
    public static void main(String[] args) {
        System.out.println(countTrue(new boolean[]{true, true, false, true, false}));
    }

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            String str = Boolean.toString(arr[i]);
            if (str.equals("true")) {
                count += 1;
            }
        }
        return count;
    }

}
