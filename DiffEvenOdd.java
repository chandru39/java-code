import java.util.*;
public class DiffEvenOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int d=a-b;
if(d%2==0) System.out.println("Even");
else System.out.println("Odd");
}
}
