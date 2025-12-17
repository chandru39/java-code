import java.util.*;
public class BinaryCount{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int z=0,o=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='0') z++;
else if(s.charAt(i)=='1') o++;
}
System.out.println("0s="+z);
System.out.println("1s="+o);
}
}
