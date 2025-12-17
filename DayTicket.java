import java.util.*;
public class DayTicket{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String d=sc.next();
if(d.equals("Saturday")||d.equals("Sunday")) System.out.println("Weekend Price");
else System.out.println("Weekday Price");
}
}
