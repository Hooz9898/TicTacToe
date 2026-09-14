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
            System.out.print("Enter X coordinate: ");
            x1 = sc.nextInt();
            System.out.print("Enter Y coordinate: ");
            x2 = sc.nextInt();
            tictactoe[x1][x2] = "X";

        }

    }
}