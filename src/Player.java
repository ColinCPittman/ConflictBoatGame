import java.util.Scanner;
public class Player {
    public String name;
    public String[][] board = new String[11][11];
    public Player() {
        int labels = 0;
        int labels2 = 65;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == 0) {
                    board[i][j] = Integer.toString(labels++);
                } else if (i == 0) {
                    board[i][j] = Character.toString((char) labels2++);
                } else {
                    board[i][j] = "0";
                }
            }
        }
    }
    public static void main(String[] args) {

    }

    public String getName () {
        return name;
    }
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name for player: ");
        this.name = sc.nextLine();
    }
    public void placeInitialShips() {
        System.out.println("Choose ");
    }

}
