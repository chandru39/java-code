import java.util.*;
public class Armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),t=n,s=0;
while(n!=0){int d=n%10;s+=d*d*d;n/=10;}
if(s==t) System.out.println("Armstrong");
else System.out.println("Not Armstrong");
}
}
