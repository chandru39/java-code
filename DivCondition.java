import java.util.*;
public class DivCondition{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0&&n%5==0&&n%8!=0) System.out.println("Yes");
else System.out.println("No");
}
}
