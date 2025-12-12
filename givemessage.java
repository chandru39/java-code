import java.util.Scanner;
public class givemessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any message: ");
        String msg = sc.nextLine();   
        System.out.println("You entered: " + msg);
    }
}
