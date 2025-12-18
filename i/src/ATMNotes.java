import java.util.*;
public class ATMNotes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int amount=sc.nextInt();
int n2000=amount/2000;
amount%=2000;
int n500=amount/500;
amount%=500;
int n100=amount/100;
System.out.println(n2000);
System.out.println(n500);
System.out.println(n100);
}
}
