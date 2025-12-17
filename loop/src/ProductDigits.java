import java.util.*;
public class ProductDigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),p=1;
while(n!=0){p*=n%10;n/=10;}
System.out.println(p);
}
}
