import java.util.*;
public class EvenOddDiff{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int e=0,o=0;
while(n!=0){
int d=n%10;
if(d%2==0) e+=d;
else o+=d;
n/=10;
}
System.out.println(e-o);
}
}
