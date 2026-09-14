import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tictactoe = new String[3][3];
        int x1 = -1;
        int x2 = -1;
        int o1 = -1;
        int o2 = -1;
        boolean cross = false;
        while (!false){
            while(x1 < 0 || x1 > 3 || x2 < 0 || x2 > 3 || !(tictactoe[x1][x2] == null)) {
                System.out.print("Enter X coordinate: ");
                x1 = sc.nextInt();
                System.out.print("Enter Y coordinate [x]: ");
                x2 = sc.nextInt();
            }
            tictactoe[x1][x2] = "X";

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tictactoe[i][j] + " ");
                }
                System.out.println();
            }
            while(o1 < 0 || o1 > 3 || o2 < 0 || o2 > 3 || tictactoe[o1][o2] != null){
                System.out.print("Enter X coordinate  [o]: ");
                o1 = sc.nextInt();
                System.out.print("Enter Y coordinate [o]: ");
                o2 = sc.nextInt();
            }
            tictactoe[o1][o2] = "o";
        }

    }
}