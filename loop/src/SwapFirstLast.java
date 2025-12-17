import java.util.*;
public class SwapFirstLast{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int last=n%10;
int temp=n;
int digits=0;
while(temp!=0){digits++;temp/=10;}
int first=n/(int)Math.pow(10,digits-1);
int mid=n%(int)Math.pow(10,digits-1);
mid/=10;
int result=last*(int)Math.pow(10,digits-1)+mid*10+first;
System.out.println(result);
}
}
