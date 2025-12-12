public class MangoDiscount{
public static void main(String[] args){
int price=50;
int quantity=7;
int free=quantity/3;
int payable=quantity-free;
int total=payable*price;
System.out.println("Total Amount="+total);
}
}
