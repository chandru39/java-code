import java.util.*;
public class ZigZag{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<3;i++){
for(int j=0;j<n;j++){
if((i+j)%4==0||(i==1&&j%2==0)) System.out.print("* ");
else System.out.print("  ");
}
System.out.println();
}
}
}
