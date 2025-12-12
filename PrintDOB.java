import java.util.Scanner;

public class PrintDOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        System.out.println(dd + "/" + mm + "/" + yyyy);
    }
}
