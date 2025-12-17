import java.util.*;
public class StrongTillN{
static int fact(int n){
int f=1;
for(int i=1;i<=n;i++) f*=i;
return f;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
int t=i,s=0;
while(t!=0){s+=fact(t%10);t/=10;}
if(s==i) System.out.print(i+" ");
}
}
}
