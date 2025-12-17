import java.util.*;
public class CountDigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),c=0;
do{c++;n/=10;}while(n!=0);
System.out.println(c);
}
}
