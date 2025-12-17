import java.util.*;
public class FirstDigitOddEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=Math.abs(sc.nextInt());
while(n>=10) n/=10;
if(n%2==0) System.out.println("Even");
else System.out.println("Odd");
}
}
