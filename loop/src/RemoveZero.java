import java.util.*;
public class RemoveZero{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=0,p=1;
while(n!=0){
int d=n%10;
if(d!=0){r+=d*p;p*=10;}
n/=10;
}
System.out.println(r);
}
}
