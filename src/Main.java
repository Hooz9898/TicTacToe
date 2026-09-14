import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tictactoe = new String[3][3];
        int x1;
        int x2;
        int o1;
        int o2;
        Boolean cross = false;
        while (!false){
            System.out.print("Enter X coordinate [X]: ");
            x1 = sc.nextInt();
            System.out.print("Enter Y coordinate [X]: ");
            x2 = sc.nextInt();
            tictactoe[x1][x2] = "X";

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tictactoe[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Enter X coordinate  [o]: ");
            o1 = sc.nextInt();
            System.out.print("Enter Y coordinate [o]: ");
            o2 = sc.nextInt();
            tictactoe[o1][o2] = "o";
        }

    }
}