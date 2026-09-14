import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tictactoe = new String[3][3];
        int x1 = -1;
        int x2 = -1;
        int o1 = -1;
        int o2 = -1;
        int xCounter = 0;
        int oCounter = 0;
        int winner = -1;
        boolean cross = false;
        while (!false){

            //Put X on the board
            while(x1 < 0 || x1 > 3 || x2 < 0 || x2 > 3 || !(tictactoe[x1][x2] == null)) {
                System.out.print("Enter X coordinate [x]: ");
                x1 = sc.nextInt();
                System.out.print("Enter Y coordinate [x]: ");
                x2 = sc.nextInt();
            }
            tictactoe[x1][x2] = "X";

            //print board after X
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tictactoe[i][j] + " ");
                }
                System.out.println();
            }

            //Put o on the board
            while(o1 > -1 && o1 < 3 && o2 > -1 && o2 < 3 && tictactoe[o1][o2] == null){
                System.out.print("Enter X coordinate  [o]: ");
                o1 = sc.nextInt();
                System.out.print("Enter Y coordinate [o]: ");
                o2 = sc.nextInt();
                tictactoe[o1][o2] = "o";
            }

            //print board after o
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tictactoe[i][j] + " ");
                }
                System.out.println();
            }

            //check if there is a winner horizontally
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tictactoe[i][j].equals("X")) {
                        xCounter++;
                        oCounter = 0;
                    }
                    if (tictactoe[i][j].equals("o")) {
                        xCounter = 0;
                        oCounter++;
                    }
                    if (xCounter == 3){
                        winner = 1;
                    }
                    if (oCounter == 3){
                        winner = 2;
                    }
                }
                xCounter = 0;
                oCounter = 0;
            }
            //check for winner vertically
            for (int c = 0; c < 3; c++) {
                for (int r = 0; r < 3; r++) {
                    if (tictactoe[c][r].equals("X")) {
                        xCounter++;
                        oCounter = 0;
                    }
                    if (tictactoe[c][r].equals("o")) {
                        xCounter = 0;
                        oCounter++;
                    }
                    if (xCounter == 3){
                        winner = 1;
                    }
                    if (oCounter == 3){
                        winner = 2;
                    }
                }
                xCounter = 0;
                oCounter = 0;
            }
        }

    }
}