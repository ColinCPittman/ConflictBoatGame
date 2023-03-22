import java.util.Scanner;
public class Player {
    public String name;
    public void main(String[] args) {

  }
    public String getName () {
        return name;
    }
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter name for player: ");
        name = sc.nextLine();
    }
}
