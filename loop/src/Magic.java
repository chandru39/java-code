import java.util.*;
public class Magic{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>9){
int s=0;
while(n!=0){s+=n%10;n/=10;}
n=s;
}
if(n==1) System.out.println("Magic");
else System.out.println("Not Magic");
}
}
