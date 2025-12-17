import java.util.*;
public class Harshad{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),s=0,t=n;
while(n!=0){s+=n%10;n/=10;}
if(t%s==0) System.out.println("Harshad");
else System.out.println("Not Harshad");
}
}
