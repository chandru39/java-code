import java.util.*;
public class SameLastDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a%10==b%10) System.out.println("Same");
else System.out.println("Different");
}
}
