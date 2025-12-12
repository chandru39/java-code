import java.util.Scanner;

public class inthexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        System.out.printf("Hexadecimal: %X", num);
    }
}
