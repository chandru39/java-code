import java.util.*;
public class AscendingDigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean asc=true;
while(n>=10){
int a=n%10;
int b=(n/10)%10;
if(b>a){asc=false;break;}
n/=10;
}
if(asc) System.out.println("Yes");
else System.out.println("No");
}
}
