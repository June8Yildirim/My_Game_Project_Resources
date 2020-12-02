import java.util.Arrays;

public class IntArrays {
    public static void main(String[] args) {
//         System.out.println("990 "+WeeklySalary(new int[]{10, 10, 10, 10, 10, 10, 10}));
//        System.out.println("0 "+WeeklySalary(new int[]{0, 0, 0, 0, 0, 0, 0}));

//        System.out.println("560 " + WeeklySalary(new int[]{8, 8, 8, 8, 8, 8, 0}));
//        System.out.println("720 " + WeeklySalary(new int[]{8, 8, 8, 8, 8, 8, 8}));
//        System.out.println(cons(new int[]{5, 1, 4, 3, 2}));
//        System.out.println(list1(new int[]{-70, 43, 34, 54, 22}));
//        System.out.println(isSpecialArray(new int[]{2, 7, 4, 9, 6, 1, 6, 3}));
//        System.out.println(changeEnough(new int[] { 0, 0, 20, 5 }, 0.75));
//        System.out.println(sevenBoom(new int[]{76, 48, 100, 66}));
//        System.out.println(minRemoval(new int[]{5, 3, 4, 4, 0}));          //1
//        System.out.println(hurdleJump(new int[]{1, 2, 3, 4, 5}, 5));
//        System.out.println(hurdleJump(new int[]{3, 3, 3}, 4));
//        System.out.println(hurdleJump(new int[]{4, 4}, 3));
//        System.out.println(hurdleJump(new int[]{}, 3));
//        System.out.println(nthSmallest(new int[]{5, 4}, 2));
//        System.out.println(minMax(new double[]{14, 35, 6, 1, 34, 54}));
//        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3, 0, 66, 2, -2, 2, 3, 4, 2, -47, 3, 3, 2})));
//        System.out.println(Arrays.toString(cumulativeSum(new int[]{})));
//        System.out.println(list(new int[]{47, 51, -17, -16, 91, 47, -85, -8, -16, -27}));
//        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(Arrays.toString(reverse(new int[]{5, -7, 8, 3})));
//        System.out.println(isOrthogonal(new int[]{7, 8}, new int[]{7, -6}));
//        System.out.println(isOrthogonal(new int[]{2, 4, 1}, new int[]{2, 1, -8}));
//        System.out.println(isOrthogonal(new int[]{2, 4, 1}, new int[]{2, 1, -8}));
//        System.out.println(Arrays.toString(concat(new int[]{1, 3, 5}, new int[]{2, 6, 8})));
//        System.out.println((maxTotal(new int[]{1, 1, 0, 1, 3, 10, 10, 10, 10, 1})));
//        System.out.println(factorChain(new int[]{1, 1, 1, 1, 1, 1}));
//        System.out.println(canNest(new int[]{1, 2, 3, 4}, new int[]{0, 6}));
        System.out.println(incrementToTop(new int[]{3, 10, 3}));
    }


    //-------------------------------------------------------------------------------------------


    public static int incrementToTop(int[] arr) {
        int count =0;
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            for (int j=i;j< arr.length;j++){
                if (arr[j-1]<arr[j]){
                    count +=arr[j]-arr[j-1];
                }
            }
        }
        return count;
    }

    public static boolean canNest(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.print("Second array can be nested with first array \n"+"First array is= "+Arrays.toString(arr1)+
                "\nSecond array is= "+Arrays.toString(arr2)+" result is --> ");
        return arr1[0]>arr2[0]&&arr1[arr1.length-1]<arr2[arr2.length-1];

//        boolean res = false;
//        Arrays.sort(arr2);
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr2[0] < arr1[j] && arr2[arr2.length-1]>arr1[j]) {
//                    res = true;
//                }else{
//                    res= false;
//                    break;
//                }
//            }
//        }
//        return res;
    }


    public static boolean factorChain(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] != 0) return false;
        }
        return true;
    }


    public static int maxTotal(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for (int i = 5; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.print("Sum max five digits =");
        return sum;
    }


    public static int[] concat(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
        return res;
    }

    public static boolean isOrthogonal(int[] arr1, int[] arr2) {
        boolean res = false;
        int sum = 0;
//        for (int j = 0; j < arr2.length; j++) {
        for (int i = 1; i < arr1.length + 1; i++) {
            sum += arr1[i - 1] * arr2[i - 1];
            if (sum == 0) {
                res = true;
                break;

//                if ((arr1[i - 1] * arr2[i - 1] + (arr1[i] * arr2[i]) == 0)) {
//                    res = true;
//                    break;
//                }
            }
        }
        return res;
    }


    public static int[] reverse(int[] arr) {
//        int[] out=new int[arr.length];
//        for (int i=0; i<arr.length; i++)
//            out[arr.length-i-1]=arr[i];
//        return out
//        int[] result = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
//        return result;
        int[] reverse = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
//            for (int j = arr.length-1; j >= 0; j--) {
            reverse[j] = arr[i];
//            }
            j += 1;
        }
        return reverse;
    }


    public static boolean isAvgWhole(int[] arr) {
        boolean res = false;
        double avg = 0.0;
        int sum = 0;
        for (Integer arrs : arr) {       // Array loop option
            sum += Double.valueOf(arrs);
        }
        avg = ((double) sum) / arr.length;
        if (avg % 1 == 0) {         // finding double value
            res = true;
        }
        return res;
    }

    public static int[] list(int[] nums) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }


    public static int[] cumulativeSum(int[] nums) {
        int[] sums = new int[nums.length];
        if (nums.length <= 0) {
            return sums;
        } else {
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[(i)] = sums[i - 1] + nums[i];
            }
        }
//        Arrays.toString(sums);
        return sums;
    }


    public static double[] minMax(double[] arr) {
        double[] list = new double[2];
        list[0] = Integer.MAX_VALUE;
        list[1] = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < list[0]) {
                    list[0] = arr[j];
                } else if (arr[j] > list[1]) {
                    list[1] = arr[j];
                }
            }
        }
//        System.out.println(Arrays.toString(list));;
        return list;
    }

    public static int nthSmallest(int[] arr, int n) {
        if (arr.length <= (n - 1)) {
            return -1;
        } else {
            for (int i : arr) {
                for (int j = (i + 1); j < arr.length; ++j) {
                    if (arr[(i)] > arr[j]) {
                        int temp = arr[(i)];
                        arr[i] = arr[j];
                        arr[(j)] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[(n - 1)];
    }

    public static boolean hurdleJump(int[] hurdles, int h) {
        //  int max = hurdles[0];
        if (hurdles.length == 0) {
            return true;
        } else {
            for (int i = 0; i < hurdles.length; i++) {
                if (h < hurdles[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int minRemoval(int[] arr) {
        int sum = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        if ((sum - min) % 2 == 0) {
            return 1;
        }
        return 0;
    }


    public static String sevenBoom(int[] arr) {
        return Arrays.toString(arr).contains("7") ? "Boom!" : "there is no 7 in the array";


//        String boom = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 10) {
//                if (arr[i] % 10 == 7 || arr[i] / 10 == 7) {
//                    boom = "Boom!";
//                    break;
//                } else {
//                    boom = "there is no 7 in the array";
//                }
//            } else {
//                if (arr[i] == 7) {
//                    boom = "Boom!";
//                    break;
//                } else {
//                    boom = "there is no 7 in the array";
//                }
//            }
//        }
//        return boom;
    }

    public static String formatPhoneNumber(int[] nums) {
        String str = "";
        for (int i = 0; i < nums.length; ++i) {
            str += nums[i];
        }
        str = "(" + str.substring(0, 3) + ")" + " " + str.substring(3, 6) + "-" + str.substring(6, 10);
        return str;
    }


    public static boolean changeEnough(int[] change, double amountDue) {
        double left = 0.0;
        double[] money = new double[]{0.25, 0.1, 0.5, 0.01};
        left = ((change[0] * money[0]) + (change[1] * money[1]) + (change[2] * money[2]) + (change[3] * money[3])) - amountDue;
        if (left < 0) {     //return !(left < 0); can be simplify
            return false;
        }
        return true;
    }


    public static boolean isSpecialArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (i % 2 != arr[i] % 2)
                return false;
        return true;


//        boolean res = true;
//        int[] even = new int[15];
//        int[] odd = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0 && arr[i] % 2 == 0 || i % 2 != 0 && arr[i] % 2 != 0) {
//                res = true;
//            }
//            else {
//                res = false;
//                break;
//            }
//        }
//        return res;
    }


    public static int list1(int[] arr) {
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 1] - arr[0];


    }


    public static boolean cons(int[] arr) {
//        Arrays.sort(arr);
//        int[] check = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(arr));
        boolean res = false;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        if ((max - min + 1) == arr.length) {
            res = true;
        }
//        for (int i = 1; i < ((arr.length+1)); ++i) {
////            System.out.print(arr[(i - 1)]);
////            System.out.println(( arr[i]));
//            if ((first+1) == (1 + arr[i])) {
////                res = true;
//            }
//        }
        return res;

    }

    public static int WeeklySalary(int[] hours) {
        int total = 0, normal = 10, extra = 5;
        for (int i = 0; i < 7; i++) {
            if (i > 4) {
                normal = 20;
                extra = 10;
            }
            total += normal * hours[i];
            if (hours[i] > 8) {
                total += extra * (hours[i] - 8);
            }
        }
        return total;

//        int sum = 0;
//        int overtime = 0;
//        for (int i = 0; i < 7; ++i) {
//            if (i > 4) {
//                if (hours[i] > 8) {
//                    overtime += 30 * (hours[i] - 8);
//                    sum += 20 * 8;
//                } else {
//                    sum += 20 * (hours[i]);
//                }
//            } else {
//                if (hours[i] > 8) {
//                    overtime += 15 * (hours[i] - 8);
//                    sum += 10 * 8;
//                } else {
//                    sum += 10 * (hours[i]);
//                }
//            }
//        }
//        System.out.println("sum= " + sum);
//        System.out.println("overtime=" + overtime);
//        return overtime + sum;
    }
}
