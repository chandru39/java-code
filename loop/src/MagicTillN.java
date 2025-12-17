import java.util.*;
public class MagicTillN{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
int x=i;
while(x>9){
int s=0;
while(x!=0){s+=x%10;x/=10;}
x=s;
}
if(x==1) System.out.print(i+" ");
}
}
}
