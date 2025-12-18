import java.util.*;
public class TrafficLight{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String c=sc.next();
if(c.equals("Red")) System.out.println("Stop");
else if(c.equals("Yellow")) System.out.println("Ready");
else if(c.equals("Green")) System.out.println("Go");
else System.out.println("Invalid");
}
}
