import java.util.Scanner;
public class Player {
    public static String name;
    public static void main(String[] args) {

  }
    public String getName () {
        return name;
    }
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name for player: ");
        this.name = sc.nextLine();
    }

}
