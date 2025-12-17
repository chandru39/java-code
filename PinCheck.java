import java.util.*;
public class PinCheck{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int pin=sc.nextInt();
int actual=1234;
if(pin==actual) System.out.println("Access Granted");
else System.out.println("Wrong PIN");
}
}
