import java.util.*;
public class DescendingDigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean desc=true;
while(n>=10){
int a=n%10;
int b=(n/10)%10;
if(b<a){desc=false;break;}
n/=10;
}
if(desc) System.out.println("Yes");
else System.out.println("No");
}
}
