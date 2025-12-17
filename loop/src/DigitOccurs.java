import java.util.*;
public class DigitOccurs{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();
boolean found=false;
while(n!=0){
if(n%10==d){found=true;break;}
n/=10;
}
if(found) System.out.println("Yes");
else System.out.println("No");
}
}
