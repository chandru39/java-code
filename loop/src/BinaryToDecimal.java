import java.util.*;
public class BinaryToDecimal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int d=0;
for(int i=0;i<s.length();i++){
d=d*2+(s.charAt(i)-'0');
}
System.out.println(d);
}
}
