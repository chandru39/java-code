import java.util.*;
public class ATMWithdraw{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int balance=sc.nextInt();
int amount=sc.nextInt();
if(amount<=balance&&amount%100==0) System.out.println("Withdrawal Allowed");
else System.out.println("Invalid Withdrawal");
}
}
