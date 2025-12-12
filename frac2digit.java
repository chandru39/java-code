import java.util.Scanner;
public class frac2digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fractional number: ");
        double num = sc.nextDouble();
        System.out.printf("Formatted: %.2f", num);
    }
}