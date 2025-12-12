public class PensDiscount{
public static void main(String[] args){
int price=10;
int quantity=12;
int offerSets=quantity/5;
int payablePens=offerSets*3+(quantity%5);
int total=payablePens*price;
System.out.println("Total Amount="+total);
}
}
