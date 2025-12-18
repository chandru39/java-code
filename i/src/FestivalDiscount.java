import java.util.*;
public class FestivalDiscount{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int price=sc.nextInt();
int discount=sc.nextInt();
int discountAmount=price*discount/100;
int finalPrice=price-discountAmount;
System.out.println(discountAmount);
System.out.println(finalPrice);
}
}
