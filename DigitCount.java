import java.util.*;
public class DigitCount{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=Math.abs(sc.nextInt());
if(n<10) System.out.println("Single Digit");
else if(n<100) System.out.println("Two Digit");
else if(n<1000) System.out.println("Three Digit");
else System.out.println("More Than Three Digit");
}
}
