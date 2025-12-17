import java.util.*;
public class FirstNPrimes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),c=0,i=2;
while(c<n){
int f=0;
for(int j=1;j<=i;j++) if(i%j==0) f++;
if(f==2){System.out.print(i+" ");c++;}
i++;
}
}
}
