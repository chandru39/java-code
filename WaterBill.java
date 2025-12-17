import java.util.*;
public class WaterBill{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int bill=0;
if(l>1000&&l<=3000) bill=(l-1000)/1000*5;
else if(l>3000) bill=2*5+(l-3000)/1000*10;
System.out.println(bill);
}
}
