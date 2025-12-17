import java.util.*;
public class StrongNumber{
static int fact(int n){
int f=1;
for(int i=1;i<=n;i++) f*=i;
return f;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),t=n,s=0;
while(n!=0){s+=fact(n%10);n/=10;}
if(s==t) System.out.println("Strong");
else System.out.println("Not Strong");
}
}
