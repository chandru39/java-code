import java.util.*;
public class LastDigitDiv3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int last=n%10;
if(last%3==0) System.out.println("Yes");
else System.out.println("No");
}
}
