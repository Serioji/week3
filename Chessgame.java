import com.sun.deploy.security.SelectableSecurityManager;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class Chessgame {
    static final int PLAYER_Black_ID     = 1;
    static final int PLAYER_white_ID   = 2;

    public static void main(String[] args) {
        boolean isGameOver    = false;
        boolean isGameRunning = true;
        Scanner whosnext = new Scanner(System.in);
        System.out.println("1 = Black 2 = White");
        int PlayerId = whosnext.nextInt();

        

        String[][] gameboard = {{"wDw","|", "+", "|","wD", "|","+", "|","wQ","|", "+","|", "wK", "|","+", "|","wM","|", "+","|", "wDw","|", "+","|", "A"},
                {"X","|", "X","|", "X","|", "X","|", "X","|", "X","|", "B"},
                {"X","|", "X", "|","X","|", "X","|", "X","|", "X","|", "C"},
                {"X", "|","X", "|","X", "|","X", "|","X", "|","X", "|","D"},
                {"X", "|","X", "|","X", "|","X", "|","X","|", "X","|", "E"},
                {"wDw", "|","+","|", "wD","|", "+", "|","wQ","|", "+","|", "wK", "|","+", "|","wM","|", "+", "|","wDw", "|","+", "|","F"},
                {"A","|","B","|","C","|","D","|","E","|","F"}


        };
        getActivePlayerId(PlayerId);
        printGameboard(gameboard);



    }
    public static void printGameboard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (String S : row) {
                System.out.print(S);
            }
            System.out.println();
        }
    }

//sandbox mod
    public static int getActivePlayerId(int currentId) {
        if (currentId == PLAYER_Black_ID) {
            System.out.println("its Black Player turn");
        } else
            System.out.println("Its White player turn");

        return (currentId == PLAYER_Black_ID) ? PLAYER_white_ID :
                PLAYER_Black_ID;
    }
        public static int getPiecePositionIndex(int rowPosition, int colPosition) {

       int colOffset                = 6;
       final int ARRAY_INDEX_OFFSET = 1;
       int rowOffsetFormula         = (rowPosition - ARRAY_INDEX_OFFSET) * colOffset;

        return (colPosition + rowOffsetFormula) - ARRAY_INDEX_OFFSET;
    }
    







}








