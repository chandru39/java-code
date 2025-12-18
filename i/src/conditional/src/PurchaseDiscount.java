import java.util.*;
public class PurchaseDiscount{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int amt=sc.nextInt();
int d;
if(amt>=5000) d=20;
else if(amt>=3000) d=15;
else if(amt>=1000) d=10;
else d=0;
int finalAmt=amt-(amt*d/100);
System.out.println(finalAmt);
}
}
