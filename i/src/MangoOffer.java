import java.util.*;
public class MangoOffer{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int price=sc.nextInt();
int purchased=sc.nextInt();
int free=purchased/3;
int totalMangoes=purchased+free;
int amount=price*purchased;
System.out.println(totalMangoes);
System.out.println(amount);
}
}
