import java.util.*;
public class ElectricityBill{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int u=sc.nextInt();
int bill=0;
if(u>100&&u<=300) bill=(u-100)*5;
else if(u>300) bill=200*5+(u-300)*10;
if(u>500) bill+=bill*10/100;
System.out.println(bill);
}
}
