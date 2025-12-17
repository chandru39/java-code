import java.util.*;
public class DecimalToBinary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String b="";
while(n>0){b=n%2+b;n/=2;}
System.out.println(b);
}
}
