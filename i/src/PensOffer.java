import java.util.*;
public class PensOffer{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int price=sc.nextInt();
int pens=sc.nextInt();
int offerSets=pens/5;
int payablePens=offerSets*3+(pens%5);
int total=payablePens*price;
System.out.println(payablePens);
System.out.println(total);
}
}
