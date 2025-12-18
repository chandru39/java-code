import java.util.*;
public class FirstDigitOddEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int first=n/100;
if(first%2==0) System.out.println("Even");
else System.out.println("Odd");
}
}
