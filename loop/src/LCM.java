import java.util.*;
public class LCM{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt(),b=sc.nextInt(),x=a,y=b;
while(b!=0){int t=b;b=a%b;a=t;}
System.out.println(x*y/a);
}
}
