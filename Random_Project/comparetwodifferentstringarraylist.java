import java.util.Arrays;
// compare two different string array list
public class comparetwodifferentstringarraylist {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(correctStream((new String[]{"cat", "blue", "skt", "umbrells", "paddy"}), new String[]{"cat", "blue", "sky", "umbrella", "paddy"})));
//        System.out.println(correctStream((new String[]{"it", "is", "find"}), new String[]{"it", "is", "find"}));
    }

    public static int[] correctStream(String[] user, String[] correct) {
        int[] arr=new int[user.length];
        for(int i=0;i<user.length;i++){
            if (user[i]==correct[i])
                arr[i]=1;
            else
                arr[i]=-1;

        }
        return arr;
    }
}
