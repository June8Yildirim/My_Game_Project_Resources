import java.util.Arrays;

public class monopoly_board {
    public static void Board(){
        String[][] board =new String[8][8];
        board[0][0]="Go";
        board[0][1]="You are in the prison";



//        Arrays.toString(board);
        System.out.println(board[0][1]);
    }
}
