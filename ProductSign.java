import java.util.*;
public class ProductSign{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int p=a*b;
if(p>0) System.out.println("Positive");
else if(p<0) System.out.println("Negative");
else System.out.println("Zero");
}
}
